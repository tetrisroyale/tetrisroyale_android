package com.tetrisroyale.tetrisroyale_android;

import com.apollographql.apollo.ApolloClient;

import okhttp3.logging.HttpLoggingInterceptor;

import okhttp3.OkHttpClient;

public class TApolloClient {
    private static final String BASE_URL = "https://pharmaziegasse.at/api/graphql";
    private static ApolloClient TApolloClient;

    public static ApolloClient getTApolloClient(){

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();

        TApolloClient = ApolloClient.builder()
                .serverUrl(BASE_URL)
                .okHttpClient(okHttpClient)
                .build();

        return TApolloClient;

    }
}
