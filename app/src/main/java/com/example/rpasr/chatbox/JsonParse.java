package com.example.rpasr.chatbox;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

public class JsonParse {
    private JSONObject data;
    private  JSONArray array;
    private HashMap < String , String> info = new HashMap<String , String>();
    public JsonParse(JSONObject response) {
        data = response;

        try{

            // first get the Array classes by  product
               array = response.getJSONArray("classebyproduct");




            // if that works use the array to get the


        }
        catch(JSONException e){
            e.printStackTrace();
        }
    }


    public JSONArray getArray ( ){
        return array;
    }


    public HashMap<String, String> addToHashMap ( ){
        // iterates through array , then the data to the has map
        int length = array.length();


        for ( int i = 0; i < length; i++ ){

            try {
                // go throught the Json Object AKa - a dictionary
                JSONObject dictionary = array.getJSONObject(i);

                Iterator<String> iter = dictionary.keys();
                while (iter.hasNext()){




                    info.put(iter.next(),dictionary.getString(iter.next()));
                }


            }
            catch(JSONException e){
               e.getStackTrace();
            }


        }

        return info;
    }




}

