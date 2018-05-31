package com.weather.app.core.yandex.model.convertor;

import com.google.gson.reflect.TypeToken;
import com.weather.app.core.yandex.model.WeatherResponse;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * Created by marat.taychinov
 */

public class DataConverterFactory extends Converter.Factory {

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Type envelopedType = TypeToken.getParameterized(WeatherResponse.class, type).getType();

        final Converter<ResponseBody, WeatherResponse> delegate = retrofit.nextResponseBodyConverter(this, envelopedType, annotations);

        return body -> {
            WeatherResponse data = delegate.convert(body);
            return data;
        };
    }
}
