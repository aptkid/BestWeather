package com.bestweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Java on 2017/4/12.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
