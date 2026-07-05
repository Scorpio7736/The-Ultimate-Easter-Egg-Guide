package com.example.the_ultimate_easter_egg_guide.Helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import android.content.Context;
import android.view.View;
import android.view.ContextThemeWrapper;
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

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class EggAdapterTest {

    private EggAdapter adapter;
    private List<EasterEgg> testEggs;

    @Before
    public void setUp() {
        testEggs = new ArrayList<>();
        EasterEgg egg = new EasterEgg("Test Egg", "Test Reward");
        egg.addStep(new EasterEggStep("Step 1"));
        testEggs.add(egg);

        adapter = new EggAdapter(testEggs, (egg1, position, isExpanding) -> {});
    }

    @Test
    public void testItemCount() {
        assertEquals(1, adapter.getItemCount());
    }

    @Test
    public void testOnCreateViewHolder() {
        Context context = new ContextThemeWrapper(ApplicationProvider.getApplicationContext(), R.style.Theme_The_Ultimate_Easter_Egg_Guide);
        LinearLayout parent = new LinearLayout(context);
        
        EggAdapter.EggViewHolder holder = adapter.onCreateViewHolder(parent, 0);
        assertNotNull(holder);
        assertNotNull(holder.eggName);
    }
}
