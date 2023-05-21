package com.example.lostandfound.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * AutocompleteEditText class which extends from AppCompatEditText.
 * This class overrides onTouchEvent to customize touch interactions.
 */
public class AutocompleteEditText extends androidx.appcompat.widget.AppCompatEditText {

    // Default constructor
    public AutocompleteEditText(Context context) {
        super(context);
    }

    // Constructor that accepts attribute sets
    public AutocompleteEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    // Method to handle touch event interactions
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // Call the superclass implementation first
        super.onTouchEvent(event);

        // Handle different actions for touch events
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: // On press
                // If action is down, return true
                return true;

            case MotionEvent.ACTION_UP: // On release
                // If action is up, perform click and return true
                performClick();
                return true;
        }
        // If none of the actions match, return false
        return false;
    }

    // Method to perform click. This gets called from onTouchEvent.
    @Override
    public boolean performClick() {
        // Call the superclass implementation first
        super.performClick();
        // Always returns true, indicating that the click was handled
        return true;
    }
}
