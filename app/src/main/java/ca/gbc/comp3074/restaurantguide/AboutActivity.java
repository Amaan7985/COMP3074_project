package ca.gbc.comp3074.restaurantguide;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Set About Content
        TextView aboutTextView = findViewById(R.id.aboutTextView);
        aboutTextView.setText(
                "Personal Restaurant Guide\n" +
                        "Developed by:\n" +
                        "1. Abhishek Kamat    101422675\n\n" +
                        "2. Mohammad Amaan Vohra  101436093\n\n" +
                        "3. Tanmay Nikunjbhai Panchal   101435967\n\n" +
                        "The Restaurant Guide App is a simple and user-friendly mobile application that helps users explore various dining options in their area.");
        // Handle Back Button
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
    }
}
