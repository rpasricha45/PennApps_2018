package com.example.gdiwa.http;

import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;

import cz.msebera.android.httpclient.Header;

/**
 * Created by gdiwan on 9/9/2018.
 */

public class apiRequest {
    public void classificiation(String keyword){
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://chubbhackathon.azurewebsites.net/api/classification?keyword="+keyword, new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray success) {
                super.onSuccess(statusCode, headers, success);
                Log.d("reply",success.toString());

            }
            @Override
            public void onFailure(int statusCode, Header[] headers, String res, Throwable t) {
                Log.d("reply","Failed");
            }
        });
    }
    public void products(String classID, String stateID){
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://csb30.azurewebsites.net/api/product?classid="+classID+"&stateid="+stateID, new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray success) {
                super.onSuccess(statusCode, headers, success);
                Log.d("reply",success.toString());

            }
            @Override
            public void onFailure(int statusCode, Header[] headers, String res, Throwable t) {
                Log.d("reply","Failed");
            }
        });

    }
    public void questions(String classID, String productID){
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://chubbhackathon.azurewebsites.net/api/questions?classes="+classID+"&products="+productID, new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray success) {
                super.onSuccess(statusCode, headers, success);
                Log.d("reply",success.toString());


            }
            @Override
            public void onFailure(int statusCode, Header[] headers, String res, Throwable t) {
                Log.d("reply","Failed");
            }
        });

    }
}
