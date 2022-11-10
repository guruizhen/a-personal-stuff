package m.co.rh.id.a_personal_stuff.app;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.uiautomator.UiDevice;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestPractice {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void addItemAndDelete() {
        // 1. Click "Add Item" in the Home page.
        // 2. Enter "Cookie" in the "Name" field.
        // 3. Click "+1" next to the "Amount" field.
        // 4. Enter "10" in the "Price" field.
        // 5. Click "Expired date time" and select 31 January 2023 then click "OK".
        // 6. Click the "save" icon in the bottom right corner.
        // 7. Click the "menu" icon in the top left corner next to "Home".
        // 8. Click "Items".
        // 9. Assert the name of the item as "Cookie".
        // 10. Assert the Amount of the item as "1".
        // 11. Assert the Price of the item as "10".
        // 12. Click the "delete" button at the bottom of the item's view then click "OK".
        // 13. Use "press back" action to go back to home page.

        UiDevice device = UiDevice.getInstance(getInstrumentation());
    }

}
