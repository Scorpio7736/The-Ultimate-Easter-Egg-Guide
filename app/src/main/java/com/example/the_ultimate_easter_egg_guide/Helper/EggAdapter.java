package com.example.the_ultimate_easter_egg_guide.Helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.Models.Images.ImageID;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Dictionary;
import java.util.List;

public class EggAdapter extends RecyclerView.Adapter<EggAdapter.EggViewHolder> {

    private final List<EasterEgg> eggList;
    private final OnEggClickListener listener;
    private int expandedPosition = -1;

    public interface OnEggClickListener {
        void onEggClick(EasterEgg egg, int position, boolean isExpanding);
    }

    public EggAdapter(List<EasterEgg> eggList, OnEggClickListener listener) {
        this.eggList = eggList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public EggViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.egg_item_list, parent, false);
        return new EggViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EggViewHolder holder, int position) {
        EasterEgg egg = eggList.get(position);
        holder.eggName.setText(egg.easterEggName);

        boolean isExpanded = position == expandedPosition;
        holder.dropdownContainer.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
        holder.expandArrow.setRotation(isExpanded ? 180 : 0);

        if (isExpanded) {
            populateSteps(holder.stepsContainer, egg.easterEggSteps, 0);
            
            if (egg.easterEggReward != null && egg.easterEggReward.rewardDescription != null && !egg.easterEggReward.rewardDescription.isEmpty()) {
                holder.rewardText.setText(egg.easterEggReward.rewardDescription);
            } else {
                holder.rewardText.setText(holder.itemView.getContext().getString(R.string.reward_bragging_rights));
            }
        }

        holder.headerCard.setOnClickListener(v -> {
            int previousExpandedPosition = expandedPosition;
            boolean isExpanding = (expandedPosition != position);
            expandedPosition = isExpanding ? position : -1;
            
            notifyItemChanged(previousExpandedPosition);
            notifyItemChanged(position);
            
            listener.onEggClick(egg, position, isExpanding);
        });
    }

    private void populateSteps(LinearLayout container, List<EasterEggStep> steps, int depth) {
        container.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(container.getContext());

        for (int i = 0; i < steps.size(); i++) {
            EasterEggStep step = steps.get(i);
            View stepView = inflater.inflate(R.layout.step_item, container, false);
            
            TextView stepNameText = stepView.findViewById(R.id.step_name_text);
            
            String prefix;
            if (depth == 0) {
                prefix = "Step " + (i + 1) + ":   ";
            } else {
                char letter = (char) ('A' + i);
                prefix = letter + ":   ";
            }
            
            stepNameText.setText(prefix + step.stepName);

            // Populate Images
            LinearLayout imagesContainer = stepView.findViewById(R.id.step_images_container);
            View imagesScroll = stepView.findViewById(R.id.step_images_scroll);
            
            if (step.hasImages && !step.images.isEmpty()) {
                imagesScroll.setVisibility(View.VISIBLE);
                imagesContainer.removeAllViews();
                for (Dictionary<Integer, ImageID> dict : step.images) {
                    ImageID imgId = dict.get(0);
                    if (imgId != null) {
                        ImageView imageView = new ImageView(container.getContext());
                        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                                ViewGroup.LayoutParams.WRAP_CONTENT, 
                                ViewGroup.LayoutParams.MATCH_PARENT);
                        lp.setMargins(0, 0, 16, 0);
                        imageView.setLayoutParams(lp);
                        imageView.setAdjustViewBounds(true);
                        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        imageView.setImageResource(imgId.GetImageID());
                        imageView.setOnClickListener(v -> showFullScreenImage(container.getContext(), imgId.GetImageID()));
                        imagesContainer.addView(imageView);
                    }
                }
            } else {
                imagesScroll.setVisibility(View.GONE);
            }

            // Populate Substeps
            LinearLayout substepsContainer = stepView.findViewById(R.id.substeps_container);
            if (!step.subSteps.isEmpty()) {
                substepsContainer.setVisibility(View.VISIBLE);
                populateSteps(substepsContainer, step.subSteps, depth + 1);
            } else {
                substepsContainer.setVisibility(View.GONE);
            }

            container.addView(stepView);
        }
    }

    private void showFullScreenImage(android.content.Context context, int resId) {
        android.app.Dialog dialog = new android.app.Dialog(context, R.style.FullScreenDialog);
        dialog.setContentView(R.layout.dialog_full_image);

        if (dialog.getWindow() != null) {
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        }

        ImageView fullImageView = dialog.findViewById(R.id.full_image_view);
        fullImageView.setImageResource(resId);

        dialog.findViewById(R.id.close_full_image).setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }

    @Override
    public int getItemCount() {
        return eggList.size();
    }

    static class EggViewHolder extends RecyclerView.ViewHolder {
        TextView eggName;
        View headerCard;
        LinearLayout dropdownContainer;
        LinearLayout stepsContainer;
        TextView rewardText;
        ImageView expandArrow;

        public EggViewHolder(@NonNull View itemView) {
            super(itemView);
            eggName = itemView.findViewById(R.id.egg_name_text);
            headerCard = itemView.findViewById(R.id.egg_header_card);
            dropdownContainer = itemView.findViewById(R.id.dropdown_container);
            stepsContainer = itemView.findViewById(R.id.steps_container);
            rewardText = itemView.findViewById(R.id.reward_text);
            expandArrow = itemView.findViewById(R.id.expand_arrow);
        }
    }
}
