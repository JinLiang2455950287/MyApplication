package com.example.mylibrary.api;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jery on 2016/4/13.
 */
public class ApiManager {
    public static final String API_URL = "http://106.14.68.135:8084/czy/";//正式

    private static Retrofit retrofit;
    private static final long CONNECT_TIME_OUT = 10 * 1000;
    private static final long READ_TIME_OUT = 20 * 1000;
    private static OkHttpClient okHttpClient;

    public static void build() {


        if (okHttpClient == null) {
            OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
            okHttpClient = builder
                    .connectTimeout(CONNECT_TIME_OUT, TimeUnit.MILLISECONDS)
                    .readTimeout(READ_TIME_OUT, TimeUnit.MILLISECONDS)
                    .writeTimeout(READ_TIME_OUT, TimeUnit.MILLISECONDS)
                    .addInterceptor(new LoggingInterceptor())
                    .addNetworkInterceptor(new HttpLoggingInterceptor())
                    .build();
        }
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
    }

    public static OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }

    public static Retrofit getRetrofit() {
        return retrofit;
    }
}
