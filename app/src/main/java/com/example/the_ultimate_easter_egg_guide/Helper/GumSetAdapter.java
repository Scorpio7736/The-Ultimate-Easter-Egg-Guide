package com.example.the_ultimate_easter_egg_guide.Helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
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

        bindGumToUnit(holder.gum1, set.gums.gum1);
        bindGumToUnit(holder.gum2, set.gums.gum2);
        bindGumToUnit(holder.gum3, set.gums.gum3);
        bindGumToUnit(holder.gum4, set.gums.gum4);
        bindGumToUnit(holder.gum5, set.gums.gum5);
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
        final View gum1, gum2, gum3, gum4, gum5;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            setName = itemView.findViewById(R.id.set_name_text);
            mapName = itemView.findViewById(R.id.map_name_text);
            
            View bar = itemView.findViewById(R.id.gum_set_bar);
            gum1 = bar.findViewById(R.id.gum_1);
            gum2 = bar.findViewById(R.id.gum_2);
            gum3 = bar.findViewById(R.id.gum_3);
            gum4 = bar.findViewById(R.id.gum_4);
            gum5 = bar.findViewById(R.id.gum_5);
        }
    }
}
