package com.example.rpasr.chatbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import com.loopj.android.http.*;
import android.widget.ListView;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Constants  and UI
        final Button button =  findViewById(R.id.sendButton);
        final String SPACE = "";
       final EditText userInput = (EditText) (findViewById(R.id.messageInput));






        // TODO: SET up on click listner



        // set up on Click listner

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.d("Chat", " Button Clicked");
                // TODO: CLEAR SEND

                EditText answerBox = findViewById(R.id.messageInput);

                String text = userInput.getText().toString();

                ArrayList <String> userData = new ArrayList<String>();
                userData.add(text);

                ListView screen = findViewById(R.id.chat_list_view);
                // add Array Adapter

                ArrayAdapter adapter = new ArrayAdapter (getApplicationContext(),android.R.layout.simple_list_item_1,userData);



                // set adapter

                screen.setAdapter(adapter);









                answerBox.setText(SPACE);



                // currentContext.startActivity(activityChangeIntent);


            }
        });


    }

    public void sendMessage (EditText userInput){
        String input = userInput.getText().toString();
        // TODO  COMPLETE



    }


}
