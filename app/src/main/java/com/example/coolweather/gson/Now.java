package com.example.coolweather.gson;

/**
 * Created by 陈志坚 on 2018/6/13.
 */


import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
