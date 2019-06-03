package com.tetrisroyale.tetrisroyale_android;

import com.apollographql.apollo.ApolloClient;

import okhttp3.OkHttpClient;

public class TApolloClient {
    private static final String BASE_URL = "";
    private static ApolloClient TApolloClient;

    public static ApolloClient getTApolloClient(){

        OkHttpClient okHttpClient = new OkHttpClient().Builder()
                .build();

        TApolloClient = ApolloClient.builder()
                .serverUrl(BASE_URL)
                .okHttpClient(okHttpClient)
                .build();


    }
}
