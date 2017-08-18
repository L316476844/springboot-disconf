package org.jon.lv.conf;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Package org.jon.lv.conf.AppConfig
 * @Description: AppConfig
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/8/18 10:57
 * version V1.0.0
 */

/**
 * 注解分布式配置
 */
@Component
@Scope("singleton")
@DisconfFile(filename = "app_env.properties")
public class AppConfig {
    // 代表连接地址
    private String host;

    // 代表连接port
    private int port;

    /**
     * 地址
     *
     * @return
     */
    @DisconfFileItem(name = "app.host")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * 端口
     *
     * @return
     */
    @DisconfFileItem(name = "app.port")
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
