package com.example.the_ultimate_easter_egg_guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MapAdapter extends BaseAdapter {

    private Context context;
    private List<MapNames> mapList;

    public MapAdapter(Context context, List<MapNames> mapList) {
        this.context = context;
        this.mapList = mapList;
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
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.map_item_grid, parent, false);
        }

        MapNames currentMap = (MapNames) getItem(position);

        TextView mapNameText = convertView.findViewById(R.id.map_name_text);
        if (mapNameText != null) {
            mapNameText.setText(currentMap.mapName);
        }

        // Image handling (map_cover_image) would go here once images are available

        return convertView;
    }
}
