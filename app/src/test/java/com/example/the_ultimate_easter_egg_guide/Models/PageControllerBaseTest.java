package com.example.the_ultimate_easter_egg_guide.Models;

import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class PageControllerBaseTest {

    @Test
    public void testEnableTestingIsFalse() {
        // This test ensures that ENABLE_TESTING is set to false.
        // It will fail if ENABLE_TESTING is true.
        PageController_BaseClass controller = new PageController_BaseClass() {};
        assertFalse("ENABLE_TESTING must be false.", controller.ENABLE_TESTING);
    }
}
