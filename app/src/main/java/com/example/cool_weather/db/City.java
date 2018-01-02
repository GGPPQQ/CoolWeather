package com.example.cool_weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS on 2018/1/2.
 */

public class City extends DataSupport {
    private  int id;
    private  String cityName;
    private  int cityCode;
    private  int provincecld;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvincecld() {
        return provincecld;
    }

    public void setProvincecld(int provincecld) {
        this.provincecld = provincecld;
    }
}
