package com.jalasoft.calculator.pages;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;
import com.jalasoft.calculator.MainActivity;
import com.jalasoft.calculator.R;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class CalculatorPage {

    Map<String, ViewInteraction> buttons = new HashMap<String, androidx.test.espresso.ViewInteraction>();

    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);

    public void pressButton1() {
        onView(withId(R.id.button1)).perform(click());
    }

    public void pressButton2() {
        onView(withId(R.id.button2)).perform(click());
    }

    public void pressButton3() {
        onView(withId(R.id.button3)).perform(click());
    }

    public void pressButton4() {
        onView(withId(R.id.button4)).perform(click());
    }

    public void pressButton5() {
        onView(withId(R.id.button5)).perform(click());
    }

    public void pressButton6() {
        onView(withId(R.id.button6)).perform(click());
    }

    public void pressButton7() {
        onView(withId(R.id.button7)).perform(click());
    }

    public void pressButton8() {
        onView(withId(R.id.button8)).perform(click());
    }

    public void pressButton9() {
        onView(withId(R.id.button9)).perform(click());
    }

    public void pressButton0() {
        onView(withId(R.id.button0)).perform(click());
    }

    public void pressButtonC() {
        onView(withId(R.id.buttonC)).perform(click());
    }

    public void pressButtonAdd() {
        onView(withId(R.id.buttonadd)).perform(click());
    }

    public void pressButtonSubstraction() {
        onView(withId(R.id.buttonsub)).perform(click());
    }

    public void pressButtonDivision() {
        onView(withId(R.id.buttondiv)).perform(click());
    }

    public void pressButtonMultiplication() {
        onView(withId(R.id.buttonmul)).perform(click());
    }

    public void enterTextInScreen(String text) {
        onView(withId(R.id.edt1)).perform(typeText(text));
    }

    public void clearScreen() {
        onView(withId(R.id.edt1)).perform(clearText());
    }

    public void pressButtonEqual() {
        onView(withId(R.id.buttoneql)).perform(click());
    }

    public void pressButton(String button){
        buttons.put("1", onView(withId(R.id.button1)).perform(click()));
        buttons.put("2", onView(withId(R.id.button2)).perform(click()));
        buttons.put("3", onView(withId(R.id.button3)).perform(click()));
        buttons.put("4", onView(withId(R.id.button4)).perform(click()));
        buttons.put("5", onView(withId(R.id.button5)).perform(click()));
        buttons.put("6", onView(withId(R.id.button6)).perform(click()));
        buttons.put("7", onView(withId(R.id.button7)).perform(click()));
        buttons.put("8", onView(withId(R.id.button8)).perform(click()));
        buttons.put("9", onView(withId(R.id.button9)).perform(click()));
        buttons.put("0", onView(withId(R.id.button0)).perform(click()));
        buttons.get(button);
        }

    public void verifyNumberInTheScreen(String value){
        onView(ViewMatchers.withId(R.id.edt1)).check(matches(withText(value)));
    }
}
