package com.tetrisroyale.tetrisroyale_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getID();
    }

    private void getID(){
        TApolloClient.getTApolloClient().query(
               IDqueryQuery.builder().build()).enqueue(new ApolloCall.Callback<IDqueryQuery.Data>() {
            @Override
            public void onResponse(@NotNull Response<IDqueryQuery.Data> response) {
                Log.e("ID-daten", response.data().toString());
            }

            @Override
            public void onFailure(@NotNull ApolloException e) {

            }
        });
    }
}
