package zhy.com.rainbowweather.database;

import org.litepal.crud.DataSupport;

/**
 * 城市表
 * Created by zhy on 2018/1/10.
 */

public class City extends DataSupport {

    private int id;

    private String cityName;//城市名

    private int cityCode;//城市代号

    private int provinceId;//城市所属省份

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

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
