package com.example.the_ultimate_easter_egg_guide.Helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;

import androidx.test.core.app.ApplicationProvider;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class EggAdapterTest {

    private EggAdapter adapter;
    private List<EasterEgg> testEggs;
    private final AtomicInteger clickedPosition = new AtomicInteger(-1);
    private final AtomicBoolean wasExpanding = new AtomicBoolean(false);

    @Before
    public void setUp() {
        testEggs = new ArrayList<>();
        
        EasterEgg egg1 = new EasterEgg("Test Egg 1", "Reward 1");
        egg1.addStep(new EasterEggStep("Step 1.1"));
        testEggs.add(egg1);

        EasterEgg egg2 = new EasterEgg("Test Egg 2"); // No reward
        egg2.addStep(new EasterEggStep("Step 2.1"));
        testEggs.add(egg2);

        adapter = new EggAdapter(testEggs, (egg, position, isExpanding) -> {
            clickedPosition.set(position);
            wasExpanding.set(isExpanding);
        });
    }

    @Test
    public void testItemCount() {
        assertEquals(2, adapter.getItemCount());
    }

    @Test
    public void testOnCreateViewHolder() {
        Context context = new ContextThemeWrapper(ApplicationProvider.getApplicationContext(), R.style.Theme_The_Ultimate_Easter_Egg_Guide);
        LinearLayout parent = new LinearLayout(context);
        
        EggAdapter.EggViewHolder holder = adapter.onCreateViewHolder(parent, 0);
        assertNotNull(holder);
        assertNotNull(holder.eggName);
        assertNotNull(holder.dropdownContainer);
    }

    @Test
    public void testOnBindViewHolder_InitialState() {
        Context context = new ContextThemeWrapper(ApplicationProvider.getApplicationContext(), R.style.Theme_The_Ultimate_Easter_Egg_Guide);
        LinearLayout parent = new LinearLayout(context);
        EggAdapter.EggViewHolder holder = adapter.onCreateViewHolder(parent, 0);

        adapter.onBindViewHolder(holder, 0);

        assertEquals("Test Egg 1", holder.eggName.getText().toString());
        assertEquals(View.GONE, holder.dropdownContainer.getVisibility());
    }

    @Test
    public void testOnBindViewHolder_ExpandedState_WithReward() {
        Context context = new ContextThemeWrapper(ApplicationProvider.getApplicationContext(), R.style.Theme_The_Ultimate_Easter_Egg_Guide);
        LinearLayout parent = new LinearLayout(context);
        EggAdapter.EggViewHolder holder = adapter.onCreateViewHolder(parent, 0);

        // Bind first to attach the click listener
        adapter.onBindViewHolder(holder, 0);

        // Click to expand
        holder.headerCard.performClick();
        // Bind again to update UI with expanded state
        adapter.onBindViewHolder(holder, 0);

        assertEquals(View.VISIBLE, holder.dropdownContainer.getVisibility());
        assertEquals("Reward 1", holder.rewardText.getText().toString());
        assertEquals(0, clickedPosition.get());
        assertTrue(wasExpanding.get());
    }

    @Test
    public void testOnBindViewHolder_ExpandedState_NoReward() {
        Context context = new ContextThemeWrapper(ApplicationProvider.getApplicationContext(), R.style.Theme_The_Ultimate_Easter_Egg_Guide);
        LinearLayout parent = new LinearLayout(context);
        EggAdapter.EggViewHolder holder = adapter.onCreateViewHolder(parent, 1);

        // Bind first to attach the click listener
        adapter.onBindViewHolder(holder, 1);

        // Click to expand second item
        holder.headerCard.performClick();
        // Bind again
        adapter.onBindViewHolder(holder, 1);

        assertEquals(View.VISIBLE, holder.dropdownContainer.getVisibility());
        // Should show default bragging rights text
        assertEquals(context.getString(R.string.reward_bragging_rights), holder.rewardText.getText().toString());
    }

    @Test
    public void testToggleExpansion() {
        Context context = new ContextThemeWrapper(ApplicationProvider.getApplicationContext(), R.style.Theme_The_Ultimate_Easter_Egg_Guide);
        LinearLayout parent = new LinearLayout(context);
        EggAdapter.EggViewHolder holder = adapter.onCreateViewHolder(parent, 0);

        // Bind first to attach the click listener
        adapter.onBindViewHolder(holder, 0);

        // First click: expand
        holder.headerCard.performClick();
        adapter.onBindViewHolder(holder, 0);
        assertEquals(View.VISIBLE, holder.dropdownContainer.getVisibility());
        assertTrue(wasExpanding.get());

        // Second click: collapse
        holder.headerCard.performClick();
        adapter.onBindViewHolder(holder, 0);
        assertEquals(View.GONE, holder.dropdownContainer.getVisibility());
        assertFalse(wasExpanding.get());
    }
}
