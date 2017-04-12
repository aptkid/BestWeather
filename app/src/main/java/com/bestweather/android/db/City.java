package com.bestweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Java on 2017/4/12.
 */

public class City extends DataSupport {

    private int id;

    private String cityName;//记录城市名字

    private int cityCode;//记录市的代号

    private int provinceId;//记录当前市所属的省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
