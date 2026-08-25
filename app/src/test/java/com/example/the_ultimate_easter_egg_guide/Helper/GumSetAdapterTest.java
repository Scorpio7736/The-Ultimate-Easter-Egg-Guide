package com.example.the_ultimate_easter_egg_guide.Helper;

import static org.junit.Assert.assertEquals;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;

import androidx.test.core.app.ApplicationProvider;

import com.example.the_ultimate_easter_egg_guide.R;
import com.example.the_ultimate_easter_egg_guide.ToolsData.PlayerGumSets;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.Collections;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class GumSetAdapterTest {

    private GumSetAdapter adapter;
    private Context context;

    @Before
    public void setUp() {
        adapter = new GumSetAdapter();
        // Use ContextThemeWrapper to avoid Material Component inflation errors
        context = new ContextThemeWrapper(ApplicationProvider.getApplicationContext(), R.style.Theme_The_Ultimate_Easter_Egg_Guide);
    }

    @Test
    public void testItemCount() {
        adapter.setGumSets(Collections.singletonList(PlayerGumSets.TEST_SET_1_PLAYER));
        assertEquals(1, adapter.getItemCount());
    }

    @Test
    public void testOnBindViewHolder_Solo() {
        LinearLayout parent = new LinearLayout(context);
        GumSetAdapter.ViewHolder holder = adapter.onCreateViewHolder(parent, 0);

        adapter.setGumSets(Collections.singletonList(PlayerGumSets.TEST_SET_1_PLAYER));
        adapter.onBindViewHolder(holder, 0);

        assertEquals("Test Set - 1 Player", holder.setName.getText().toString());
        // Verify one bar is added
        assertEquals(1, holder.gumBarsContainer.getChildCount());
    }

    @Test
    public void testOnBindViewHolder_MultiPlayer() {
        LinearLayout parent = new LinearLayout(context);
        GumSetAdapter.ViewHolder holder = adapter.onCreateViewHolder(parent, 0);

        adapter.setGumSets(Collections.singletonList(PlayerGumSets.TEST_SET_2_PLAYER));
        adapter.onBindViewHolder(holder, 0);

        assertEquals("Test Set - 2 Players", holder.setName.getText().toString());
        // Verify 2 bars + 2 labels = 4 children
        assertEquals(4, holder.gumBarsContainer.getChildCount());
    }
}
