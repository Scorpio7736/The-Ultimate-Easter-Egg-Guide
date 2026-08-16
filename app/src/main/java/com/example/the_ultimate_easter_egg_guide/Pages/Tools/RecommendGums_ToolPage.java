package com.example.the_ultimate_easter_egg_guide.Pages.Tools;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Helper.GumSetAdapter;
import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums.GobbleGumSetTypes;
import com.example.the_ultimate_easter_egg_guide.R;
import com.example.the_ultimate_easter_egg_guide.ToolsData.PlayerGumSets;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecommendGums_ToolPage extends PageController_BaseClass {

    private GumSetAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommend_gums_tool_page);

        enableConstructionBlur();

        RecyclerView recyclerView = findViewById(R.id.gums_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new GumSetAdapter();
        recyclerView.setAdapter(adapter);

        setupFilter(R.id.set_type_spinner, GobbleGumSetTypes.class, null, null, selectedType -> {
            refreshGumList((GobbleGumSetTypes) selectedType);
        });
    }

    private void refreshGumList(GobbleGumSetTypes selectedType) {
        if (selectedType == null) return;

        List<PlayerGumSets> filteredSets = Arrays.stream(PlayerGumSets.values())
                .filter(set -> set.setType == selectedType)
                .collect(Collectors.toList());

        adapter.setGumSets(filteredSets);
    }
}
