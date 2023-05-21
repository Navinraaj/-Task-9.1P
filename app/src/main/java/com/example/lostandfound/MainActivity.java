package com.example.lostandfound;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.libraries.places.api.Places;

public class MainActivity extends AppCompatActivity {
    Button newAdvert; // Button to create a new advert
    Button showAll; // Button to show all items
    Button showOnMapBtn; // Button to show items on map

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind layout views to Java variables
        newAdvert = findViewById(R.id.newAdvert);
        showAll = findViewById(R.id.showAll);
        showOnMapBtn = findViewById(R.id.showOnMapBtn);

        // Initialize Google Places API if it's not already initialized
        if (!Places.isInitialized()) {
            Places.initialize(getApplicationContext(), getString(R.string.api_key_places));
        }

        // Set click listener for the new advert button
        newAdvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // On click, start NewAdvertActivity
                Intent intent = new Intent(MainActivity.this, NewAdvertActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for the show all button
        showAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // On click, start ShowAllActivity
                Intent intent1 = new Intent(MainActivity.this, ShowAllActivity.class);
                startActivity(intent1);
            }
        });

        // Set click listener for the show on map button
        showOnMapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // On click, start DisplayMap activity
                Intent intent2 = new Intent(MainActivity.this, DisplayMap.class);
                startActivity(intent2);
            }
        });
    }
}
