package com.example.the_ultimate_easter_egg_guide.Pages.Tools;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Helper.GumSetAdapter;
import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums.GobbleGumSetTypes;
import com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums.PlayerCount;
import com.example.the_ultimate_easter_egg_guide.R;
import com.example.the_ultimate_easter_egg_guide.ToolsData.PlayerGumSets;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecommendGums_ToolPage extends PageController_BaseClass {

    private GumSetAdapter adapter;
    private GobbleGumSetTypes currentSetType;
    private PlayerCount currentPlayerCount;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommend_gums_tool_page);

        //enableConstructionBlur();

        RecyclerView recyclerView = findViewById(R.id.gums_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new GumSetAdapter();
        recyclerView.setAdapter(adapter);

        setupFilter(R.id.set_type_spinner, GobbleGumSetTypes.class, null, null, selectedType -> {
            currentSetType = selectedType;
            refreshGumList();
        });

        setupFilter(R.id.player_count_spinner, PlayerCount.class, null, PlayerCount.SOLO, selectedCount -> {
            currentPlayerCount = selectedCount;
            refreshGumList();
        });
    }

    private void refreshGumList() {
        if (currentSetType == null || currentPlayerCount == null) return;

        List<PlayerGumSets> filteredSets = Arrays.stream(PlayerGumSets.values())
                .filter(set -> set.setType == currentSetType && set.playerCount == currentPlayerCount.count)
                .collect(Collectors.toList());

        adapter.setGumSets(filteredSets);
    }
}
