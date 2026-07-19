package com.example.the_ultimate_easter_egg_guide.Helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.ToolsData.Tools;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.List;

public class ToolAdapter extends RecyclerView.Adapter<ToolAdapter.ToolViewHolder> {

    private List<Tools> toolList;
    private final OnToolClickListener listener;

    public interface OnToolClickListener {
        void onToolClick(Tools tool);
    }

    public ToolAdapter(List<Tools> toolList, OnToolClickListener listener) {
        this.toolList = toolList;
        this.listener = listener;
    }

    public void updateData(List<Tools> newList) {
        this.toolList = newList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ToolViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tool_item_list, parent, false);
        return new ToolViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToolViewHolder holder, int position) {
        Tools currentTool = toolList.get(position);
        holder.nameText.setText(currentTool.toolName);
        holder.descriptionText.setText(currentTool.description);
        holder.iconImage.setImageResource(currentTool.icon);
        
        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onToolClick(currentTool);
            }
        });
    }

    @Override
    public int getItemCount() {
        return toolList != null ? toolList.size() : 0;
    }

    static class ToolViewHolder extends RecyclerView.ViewHolder {
        TextView nameText;
        TextView descriptionText;
        ImageView iconImage;

        public ToolViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.tool_name_text);
            descriptionText = itemView.findViewById(R.id.tool_description_text);
            iconImage = itemView.findViewById(R.id.tool_icon_image);
        }
    }
}
