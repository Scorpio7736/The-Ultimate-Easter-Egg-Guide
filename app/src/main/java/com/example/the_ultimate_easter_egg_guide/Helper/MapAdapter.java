package com.example.the_ultimate_easter_egg_guide.Helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.List;

public class MapAdapter extends BaseAdapter {

    private final Context context;
    private List<Maps> mapList;
    private final boolean isGridView;

    public MapAdapter(Context context, List<Maps> mapList, boolean isGridView) {
        this.context = context;
        this.mapList = mapList;
        this.isGridView = isGridView;
    }

    public void updateData(List<Maps> newList) {
        this.mapList = newList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mapList.size();
    }

    @Override
    public Object getItem(int position) {
        return mapList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        int layoutId = isGridView ? R.layout.map_item_grid : R.layout.map_item_list;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
            holder = new ViewHolder();
            holder.mapNameText = convertView.findViewById(R.id.map_name_text);
            holder.mapCoverImage = convertView.findViewById(R.id.map_cover_image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Maps currentMap = (Maps) getItem(position);

        if (holder.mapNameText != null) {
            holder.mapNameText.setText(currentMap.mapName);
        }

        if (holder.mapCoverImage != null) {
            holder.mapCoverImage.setImageResource(currentMap.mapCover);
        }

        return convertView;
    }

    private static class ViewHolder {
        TextView mapNameText;
        ImageView mapCoverImage;
    }
}
