package com.example.the_ultimate_easter_egg_guide.Helper;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public class NoteImageAdapter extends RecyclerView.Adapter<NoteImageAdapter.ViewHolder> {

    private final List<String> imagePaths = new ArrayList<>();
    private final OnImageClickListener listener;

    public interface OnImageClickListener {
        void onImageClick(String path);
    }

    public NoteImageAdapter(OnImageClickListener listener) {
        this.listener = listener;
    }

    public void addImage(String path) {
        imagePaths.add(0, path); // Add to start
        notifyItemInserted(0);
    }

    public void setImagePaths(List<String> paths) {
        this.imagePaths.clear();
        this.imagePaths.addAll(paths);
        notifyDataSetChanged();
    }

    public List<String> getImagePaths() {
        return new ArrayList<>(imagePaths);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_image_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String path = imagePaths.get(position);
        
        // Load bitmap from path
        Bitmap bitmap = BitmapFactory.decodeFile(path);
        holder.imageView.setImageBitmap(bitmap);

        holder.itemView.setOnClickListener(v -> {
            if (listener != null) listener.onImageClick(path);
        });
    }

    @Override
    public int getItemCount() {
        return imagePaths.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(holderView(itemView));
            imageView = itemView.findViewById(R.id.note_image);
        }

        private static View holderView(View v) { return v; }
    }
}
