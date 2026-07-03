package com.example.the_ultimate_easter_egg_guide.Helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Models.SlideshowItem;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.List;

public class SlideshowAdapter extends RecyclerView.Adapter<SlideshowAdapter.SlideshowViewHolder> {

    private final List<SlideshowItem> items;

    public SlideshowAdapter(List<SlideshowItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public SlideshowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slideshow_item, parent, false);
        return new SlideshowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SlideshowViewHolder holder, int position) {
        SlideshowItem item = items.get(position);
        holder.image.setImageResource(item.getImageResId());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class SlideshowViewHolder extends RecyclerView.ViewHolder {
        ImageView image;

        public SlideshowViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.slideshow_image);
        }
    }
}
