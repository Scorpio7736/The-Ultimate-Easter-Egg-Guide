package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Helper.ToolAdapter;
import com.example.the_ultimate_easter_egg_guide.Models.NavPageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Models.Tools.ToolType;
import com.example.the_ultimate_easter_egg_guide.Pages.InGameNotes_ToolPage;
import com.example.the_ultimate_easter_egg_guide.Pages.QuickRefDisplay_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.RecommendGums_ToolPage;
import com.example.the_ultimate_easter_egg_guide.R;
import com.example.the_ultimate_easter_egg_guide.ToolsData.Tools;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tools_PAGE extends NavPageController_BaseClass implements ToolAdapter.OnToolClickListener
{

    private RecyclerView toolsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tools_page);

        setupBaseNavigation();

        toolsRecyclerView = findViewById(R.id.tools_recycler_view);
        toolsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        updateToolsList();
    }

    @Override
    public void onToolClick(Tools tool) {
        if (tool.toolType == ToolType.QUICK_REF)
        {
            Intent intent = new Intent(this, QuickRefDisplay_PAGE.class);
            intent.putExtra(QuickRefDisplay_PAGE.EXTRA_IMAGE_ID, tool.icon);
            startActivity(intent);
        }
        else if (tool == Tools.Recommended_GUMS)
        {
            Intent intent = new Intent(this, RecommendGums_ToolPage.class);
            startActivity(intent);
        }
        else if (tool == Tools.IN_GAME_NOTES)
        {
            Intent intent = new Intent(this, InGameNotes_ToolPage.class);
            startActivity(intent);
        }
    }

    private void updateToolsList() {
        // Filter tools based on ENABLE_TESTING flag

        List<Tools> visibleTools = new ArrayList<Tools>();

        visibleTools = Stream.of(Tools.values())
                .filter(tool -> ENABLE_TESTING == (tool.toolType == ToolType.TEST))
                .collect(Collectors.toList());

        ToolAdapter toolAdapter = new ToolAdapter(visibleTools, this);
        toolsRecyclerView.setAdapter(toolAdapter);
        toolsRecyclerView.scheduleLayoutAnimation();
    }

    @Override
    public void onToolsButtonClick(View view) {
        // Already on this page
    }
}
