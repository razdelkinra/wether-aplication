package com.weather.app.core.yandex.service;

import com.google.gson.Gson;
import com.weather.app.core.yandex.api.WeatherYandexApi;
import com.weather.app.core.yandex.model.convertor.DataConverterFactory;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/**
 * Utils api
 */
@Component
public class ApiYandexUtils {

    public static final List<Class<?>> NETWORK_EXCEPTIONS = Arrays.asList(
            UnknownHostException.class,
            SocketTimeoutException.class,
            ConnectException.class
    );

    private static OkHttpClient client;
    private static Retrofit retrofit;
    private static Gson gson;
    private static WeatherYandexApi api;

    public static final String SERVER_URL = "https://api.weather.yandex.ru/v1/";

    public OkHttpClient getBasicAuthClient(final String email, final String password, boolean createNewInstance) {
        if (createNewInstance || client == null) {
            OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
            builder.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request().newBuilder().addHeader("X-Yandex-API-Key", "7707bf08-6800-4931-b6d6-e3122cd194cd").build();
                    return chain.proceed(request);
                }
            });
            client = builder.build();
        }
        return client;
    }

    public Retrofit getRetrofit() {
        if (gson == null) {
            gson = new Gson();
        }
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(SERVER_URL)
                    .client(getBasicAuthClient("", "", false))
                    .addConverterFactory(new DataConverterFactory())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public WeatherYandexApi getApiService() {
        if (api == null) {
            api = getRetrofit().create(WeatherYandexApi.class);
        }
        return api;
    }
}
