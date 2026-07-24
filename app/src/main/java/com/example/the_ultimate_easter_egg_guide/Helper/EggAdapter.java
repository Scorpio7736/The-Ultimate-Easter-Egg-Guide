package com.example.the_ultimate_easter_egg_guide.Helper;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.ProcedureStep;
import com.example.the_ultimate_easter_egg_guide.Models.Images.ImageID;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Dictionary;
import java.util.List;

public class EggAdapter extends RecyclerView.Adapter<EggAdapter.EggViewHolder> {

    private final List<Procedure> eggList;
    private final OnEggClickListener listener;
    private final String gameName;
    private int expandedPosition = -1;

    public interface OnEggClickListener {
        void onEggClick(Procedure egg, int position, boolean isExpanding);
    }

    public EggAdapter(List<Procedure> eggList, String gameName, OnEggClickListener listener) {
        this.eggList = eggList;
        this.gameName = gameName;
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
        Procedure egg = eggList.get(position);
        holder.eggName.setText(egg.name);

        boolean isExpanded = position == expandedPosition;
        holder.dropdownContainer.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
        holder.expandArrow.setRotation(isExpanded ? 180 : 0);

        if (isExpanded) {
            populateSteps(holder.stepsContainer, egg.steps, 0);
            
            if (egg.outcome != null && egg.outcome.description != null && !egg.outcome.description.isEmpty()) {
                holder.rewardText.setText(egg.outcome.description);
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

        holder.shareButton.setOnClickListener(v -> {
            String shareText = formatEggShareText(egg);
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, shareText);
            sendIntent.setType("text/plain");

            Intent shareIntent = Intent.createChooser(sendIntent, "Share Easter Egg Guide");
            holder.itemView.getContext().startActivity(shareIntent);
        });
    }

    private String formatEggShareText(Procedure egg) {
        StringBuilder sb = new StringBuilder();
        sb.append("You can find many more easter eggs for ").append(gameName).append(" on the app!\n");
        sb.append("https://play.google.com/store/apps/details?id=com.example.the_ultimate_easter_egg_guide\n\n");
        
        sb.append("[").append(egg.name).append("]\n");
        
        String reward = (egg.outcome != null && egg.outcome.description != null && !egg.outcome.description.isEmpty()) 
                ? egg.outcome.description 
                : "Bragging Rights";
        sb.append("Reward: ").append(reward).append("\n\n");
        
        appendStepsToString(sb, egg.steps, 0);
        
        return sb.toString();
    }

    private void appendStepsToString(StringBuilder sb, List<ProcedureStep> steps, int depth) {
        for (int i = 0; i < steps.size(); i++) {
            ProcedureStep step = steps.get(i);
            
            if (depth == 0) {
                sb.append("Step ").append(i + 1).append(": ").append(step.name).append("\n");
            } else {
                char letter = (char) ('A' + i);
                sb.append("  ").append(letter).append(": ").append(step.name).append("\n");
            }
            
            if (step.subSteps != null && !step.subSteps.isEmpty()) {
                appendStepsToString(sb, step.subSteps, depth + 1);
            }
            
            if (depth == 0) sb.append("\n");
        }
    }

    private void populateSteps(LinearLayout container, List<ProcedureStep> steps, int depth) {
        container.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(container.getContext());

        for (int i = 0; i < steps.size(); i++) {
            ProcedureStep step = steps.get(i);
            View stepView = inflater.inflate(R.layout.step_item, container, false);
            
            TextView stepNameText = stepView.findViewById(R.id.step_name_text);
            
            String prefix;
            if (depth == 0) {
                prefix = "Step " + (i + 1) + ":   ";
            } else {
                char letter = (char) ('A' + i);
                prefix = letter + ":   ";
            }
            
            stepNameText.setText(prefix + step.name);

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
        ImageButton shareButton;

        public EggViewHolder(@NonNull View itemView) {
            super(itemView);
            eggName = itemView.findViewById(R.id.egg_name_text);
            headerCard = itemView.findViewById(R.id.egg_header_card);
            dropdownContainer = itemView.findViewById(R.id.dropdown_container);
            stepsContainer = itemView.findViewById(R.id.steps_container);
            rewardText = itemView.findViewById(R.id.reward_text);
            expandArrow = itemView.findViewById(R.id.expand_arrow);
            shareButton = itemView.findViewById(R.id.share_egg_button);
        }
    }
}
