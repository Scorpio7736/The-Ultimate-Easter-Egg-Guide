package com.example.the_ultimate_easter_egg_guide.Helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.List;

public class MapAdapter extends RecyclerView.Adapter<MapAdapter.MapViewHolder> {

    private List<Maps> mapList;
    private final boolean isGridView;
    private final OnMapClickListener listener;

    public interface OnMapClickListener {
        void onMapClick(Maps map);
    }

    public MapAdapter(List<Maps> mapList, boolean isGridView, OnMapClickListener listener) {
        this.mapList = mapList;
        this.isGridView = isGridView;
        this.listener = listener;
    }

    public void updateData(List<Maps> newList) {
        this.mapList = newList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layoutId = isGridView ? R.layout.map_item_grid : R.layout.map_item_list;
        View view = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);
        return new MapViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MapViewHolder holder, int position) {
        Maps currentMap = mapList.get(position);
        holder.mapNameText.setText(currentMap.mapName);
        holder.mapCoverImage.setImageResource(currentMap.mapCover);
        
        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onMapClick(currentMap);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mapList != null ? mapList.size() : 0;
    }

    static class MapViewHolder extends RecyclerView.ViewHolder {
        TextView mapNameText;
        ImageView mapCoverImage;

        public MapViewHolder(@NonNull View itemView) {
            super(itemView);
            mapNameText = itemView.findViewById(R.id.map_name_text);
            mapCoverImage = itemView.findViewById(R.id.map_cover_image);
        }
    }
}
