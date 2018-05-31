package com.weather.app.core.yandex.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ruslan on 27.05.2018.
 */
public class AccumPrec {

    @SerializedName("1")
    private String str1;

    @SerializedName("3")
    private String str3;

    @SerializedName("7")
    private String str7;

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    public String getStr7() {
        return str7;
    }

    public void setStr7(String str7) {
        this.str7 = str7;
    }
}
