package com.whz.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by wanghaizhou on 2018/8/9.
 */

@ConfigurationProperties(prefix = "my")
@Component
public class People {
    private String name;
    private String data;
    private Integer num;
    private String uuid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", num=" + num +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
