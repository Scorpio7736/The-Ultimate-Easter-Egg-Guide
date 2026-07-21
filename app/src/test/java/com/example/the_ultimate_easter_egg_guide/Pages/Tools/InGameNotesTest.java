package com.example.the_ultimate_easter_egg_guide.Pages.Tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import android.widget.EditText;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ActivityScenario;

import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class InGameNotesTest {

    @Test
    public void testActivityLaunches() {
        try (ActivityScenario<InGameNotes_ToolPage> scenario = ActivityScenario.launch(InGameNotes_ToolPage.class)) {
            scenario.onActivity(activity -> {
                assertNotNull(activity);
                
                EditText editText = activity.findViewById(R.id.notes_edit_text);
                assertNotNull(editText);
                
                RecyclerView recyclerView = activity.findViewById(R.id.notes_recycler_view);
                assertNotNull(recyclerView);
                assertTrue(recyclerView.getLayoutManager() instanceof GridLayoutManager);
                assertEquals(3, ((GridLayoutManager) recyclerView.getLayoutManager()).getSpanCount());
            });
        }
    }

    @Test
    public void testSessionPersistence() {
        // Clear session first
        InGameNotes_ToolPage.clearSession();
        
        String testNote = "My secret code is 1234";
        
        try (ActivityScenario<InGameNotes_ToolPage> scenario = ActivityScenario.launch(InGameNotes_ToolPage.class)) {
            scenario.onActivity(activity -> {
                EditText editText = activity.findViewById(R.id.notes_edit_text);
                editText.setText(testNote);
            });
            
            // Recreate activity (simulating navigation away and back)
            scenario.recreate();
            
            scenario.onActivity(activity -> {
                EditText editText = activity.findViewById(R.id.notes_edit_text);
                // Note: onPause saves to static sessionNotes, recreate calls onCreate which restores it.
                assertEquals(testNote, editText.getText().toString());
            });
        }
    }
}
