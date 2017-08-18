package org.jon.lv.conf;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Package org.jon.lv.conf.AppConfigUpdateCallback
 * @Description: 更新配置时的回调函数
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/8/18 11:15
 * version V1.0.0
 */
@Component
@DisconfUpdateService(classes = { AppConfig.class})
public class AppConfigUpdateCallback implements IDisconfUpdate {
    @Autowired
    private SimpleDemoService simpleDemoService;

    public void reload() throws Exception {
        simpleDemoService.changeConfig();
    }
}
