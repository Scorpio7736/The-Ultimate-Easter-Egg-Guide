package com.example.the_ultimate_easter_egg_guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MapAdapter extends BaseAdapter {

    private final Context context;
    private final List<MapNames> mapList;
    private final boolean isGridView;

    public MapAdapter(Context context, List<MapNames> mapList, boolean isGridView) {
        this.context = context;
        this.mapList = mapList;
        this.isGridView = isGridView;
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
        // Since the layout changes completely between grid and list, 
        // it's safer to always inflate the correct layout if the view type doesn't match.
        // For simplicity in this implementation, we will reinflate.
        
        int layoutId = isGridView ? R.layout.map_item_grid : R.layout.map_item_list;
        convertView = LayoutInflater.from(context).inflate(layoutId, parent, false);

        MapNames currentMap = (MapNames) getItem(position);

        TextView mapNameText = convertView.findViewById(R.id.map_name_text);
        if (mapNameText != null) {
            mapNameText.setText(currentMap.mapName);
        }

        return convertView;
    }
}
