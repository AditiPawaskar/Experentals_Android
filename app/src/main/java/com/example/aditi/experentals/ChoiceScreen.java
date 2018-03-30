package com.example.aditi.experentals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoiceScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Button button_give = findViewById(R.id.give_button);
        final Button button_take = findViewById(R.id.take_button);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_screen);

        button_give.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // code for linking to proper fragment : rent out
            }
        });

        button_take.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // code for linking to proper fragment : rent in
            }
        });

    }

}
