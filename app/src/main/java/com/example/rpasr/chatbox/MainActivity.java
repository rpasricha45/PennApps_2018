package com.example.rpasr.chatbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: SET up on click listner

        final Button button = (Button) findViewById(R.id.button);
        final String SPACE = "";

        // set up on Click listner

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.d("Chat", " Button Clicked");
                // TODO: CLEAR SEND

                EditText answerBox = findViewById(R.id.edittext_chatbox);

                answerBox.setText(SPACE);




                // currentContext.startActivity(activityChangeIntent);


            }
        });


    }
}
