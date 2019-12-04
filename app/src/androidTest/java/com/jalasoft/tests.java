package com.jalasoft;

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
public class tests {

    Map<String, ViewInteraction> buttons = new HashMap<String, ViewInteraction>();

    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void homePage() {
        onView(ViewMatchers.withId(R.id.edt1)).check(matches(withText("")));
    }

    @Test
    public void addTwoNumbers() {

        onView(withId(R.id.edt1))
                .perform(clearText());

        onView(withId(R.id.button1))
                .perform(click());

        onView(withId(R.id.buttonadd))
                .perform(click());

        onView(withId(R.id.button2))
                .perform(click());

        onView(withId(R.id.buttoneql))
                .perform(click());

        onView(withId(R.id.edt1)).check(matches(withText("3.0")));
    }

    @Test
    public void substractionTwoNumbers() {

        onView(withId(R.id.edt1))
                .perform(clearText());

        onView(withId(R.id.button2))
                .perform(click());

        onView(withId(R.id.buttonsub))
                .perform(click());

        onView(withId(R.id.button1))
                .perform(click());

        onView(withId(R.id.buttoneql))
                .perform(click());

        onView(withId(R.id.edt1)).check(matches(withText("1.0")));
    }

    @Test
    public void multiplicationTwoNumbers() {

        onView(withId(R.id.edt1))
                .perform(clearText());

        onView(withId(R.id.button2))
                .perform(click());

        onView(withId(R.id.buttonmul))
                .perform(click());

        onView(withId(R.id.button1))
                .perform(click());

        onView(withId(R.id.buttoneql))
                .perform(click());

        onView(withId(R.id.edt1)).check(matches(withText("2.0")));
    }

    @Test
    public void divisionTwoNumbers() {

        onView(withId(R.id.edt1))
                .perform(clearText());

        onView(withId(R.id.button2))
                .perform(click());

        onView(withId(R.id.buttondiv))
                .perform(click());

        onView(withId(R.id.button1))
                .perform(click());

        onView(withId(R.id.buttoneql))
                .perform(click());

        onView(withId(R.id.edt1)).check(matches(withText("2.0")));
    }

    @Test
    public void decimalDivisionTwoNumbers() {

        onView(withId(R.id.edt1))
                .perform(clearText());

        onView(withId(R.id.button1))
                .perform(click());

        onView(withId(R.id.buttondiv))
                .perform(click());

        onView(withId(R.id.button3))
                .perform(click());

        onView(withId(R.id.buttoneql))
                .perform(click());

        onView(withId(R.id.edt1)).check(matches(withText("0.33333334")));
    }

    @Test
    public void ButtonClear() {

        onView(withId(R.id.edt1)).
                perform(typeText("356"));

        onView(withId(R.id.buttonC))
                .perform(click());

        onView(withId(R.id.edt1)).
                check(matches(withText("")));
    }
}