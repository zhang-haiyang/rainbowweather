package zhy.com.rainbowweather.database;

import org.litepal.crud.DataSupport;

/**
 * 县表
 * Created by zhy on 2018/1/10.
 */

public class County extends DataSupport {

    private int id;

    private String countyName;//县名

    private String weatherId;//县的天气ID

    private int cityId;//县所属城市ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
