package zhy.com.rainbowweather.database;

import org.litepal.crud.DataSupport;

/**
 * 省份表
 * Created by zhy on 2018/1/10.
 */

public class Province extends DataSupport{//每一个实体类都必须要继承

    private int id;

    private String provinceName;//省份名

    private  int provinceCode;//省份代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
