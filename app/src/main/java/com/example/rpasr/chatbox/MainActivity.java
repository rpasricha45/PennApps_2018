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
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    public static ArrayList <String> userData = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Constants  and UI
        final Button button =  findViewById(R.id.sendButton);
        final String SPACE = "";
       final EditText userInput = (EditText) (findViewById(R.id.messageInput));
       final String CHUBB = "Chubb";
       final String USERID = "You";







        // TODO: SET up on click listner



        // set up on Click listner

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.d("Chat", " Button Clicked");
                // TODO: CLEAR SEND


                EditText answerBox = findViewById(R.id.messageInput);

                String text = userInput.getText().toString();



                // Sending User information to API

                com.example.gdiwa.http.apiRequest request = new com.example.gdiwa.http.apiRequest();
                request.classificiation(text);

                // Debugg

                for (String e: userData)
                    Log.d("test",e);












                userData.add(USERID + ": "+ text);





                // Example of computer input


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

    public void addData (String data){
        // adds data to Array List from the API
        userData.add(data);

    }


}
