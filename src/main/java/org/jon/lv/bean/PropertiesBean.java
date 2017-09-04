package org.jon.lv.bean;

/**
 * @Package org.jon.lv.bean.PropertiesBean
 * @Description: PropertiesBean
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/9/4 14:48
 * version V1.0.0
 */
public class PropertiesBean {

    // 代表连接地址
    private String host;

    // 代表连接port
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
