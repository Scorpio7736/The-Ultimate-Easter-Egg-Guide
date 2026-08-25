package com.example.the_ultimate_easter_egg_guide.Helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums.GobbleGumSet;
import com.example.the_ultimate_easter_egg_guide.R;
import com.example.the_ultimate_easter_egg_guide.ToolsData.GobbleGums;
import com.example.the_ultimate_easter_egg_guide.ToolsData.PlayerGumSets;

import java.util.ArrayList;
import java.util.List;

public class GumSetAdapter extends RecyclerView.Adapter<GumSetAdapter.ViewHolder> {

    private List<PlayerGumSets> gumSets = new ArrayList<>();

    public void setGumSets(List<PlayerGumSets> gumSets) {
        this.gumSets = gumSets;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gobble_gum_set, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PlayerGumSets set = gumSets.get(position);
        holder.setName.setText(set.setName);
        holder.mapName.setText(set.map != null ? set.map.mapName : "All Maps");

        holder.gumBarsContainer.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(holder.itemView.getContext());

        for (int i = 0; i < set.playerCount; i++) {
            // Add Player Label if more than 1 player
            if (set.playerCount > 1) {
                TextView playerLabel = new TextView(holder.itemView.getContext());
                playerLabel.setText(String.format(java.util.Locale.getDefault(), "Player %d", (i + 1)));
                playerLabel.setTextColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.text_secondary));
                playerLabel.setTextSize(12);
                playerLabel.setPadding(4, 8, 0, 4);
                holder.gumBarsContainer.addView(playerLabel);
            }

            // Inflate and populate the bar
            View barView = inflater.inflate(R.layout.gobble_gum_set_bar, holder.gumBarsContainer, false);
            
            // If we have specific gum sets for this player, use them. 
            // Otherwise, repeat the first set (graceful handling if gumSets.size < playerCount).
            GobbleGumSet playerGums = (i < set.gumSets.size()) ? set.gumSets.get(i) : set.gumSets.get(0);
            
            populateBar(barView, playerGums);
            holder.gumBarsContainer.addView(barView);
        }
    }

    private void populateBar(View barView, GobbleGumSet set) {
        bindGumToUnit(barView.findViewById(R.id.gum_1), set.gum1);
        bindGumToUnit(barView.findViewById(R.id.gum_2), set.gum2);
        bindGumToUnit(barView.findViewById(R.id.gum_3), set.gum3);
        bindGumToUnit(barView.findViewById(R.id.gum_4), set.gum4);
        bindGumToUnit(barView.findViewById(R.id.gum_5), set.gum5);
    }

    private void bindGumToUnit(View unitView, GobbleGums gum) {
        if (gum == null) return;
        ImageView icon = unitView.findViewById(R.id.gum_icon);
        TextView name = unitView.findViewById(R.id.gum_name);
        
        icon.setImageResource(gum.gumCover);
        name.setText(gum.gumName);
    }

    @Override
    public int getItemCount() {
        return gumSets.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView setName;
        final TextView mapName;
        final LinearLayout gumBarsContainer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            setName = itemView.findViewById(R.id.set_name_text);
            mapName = itemView.findViewById(R.id.map_name_text);
            gumBarsContainer = itemView.findViewById(R.id.gum_bars_container);
        }
    }
}
