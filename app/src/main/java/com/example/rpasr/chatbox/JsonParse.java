package com.example.rpasr.chatbox;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParse {
    private JSONObject data;

    public JsonParse(JSONObject response) {
        data = response;

        try{

            // first get the Array classes by  product
            JSONArray   array = response.getJSONArray("classebyproduct");




            // if that works use the array to get the


        }
        catch(JSONException e){
            e.printStackTrace();
        }
    }





}

