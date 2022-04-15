package com.ftps.ftpseurekaservice.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author：Psyduckzzzz
 * @Date：Created on 2022/4/4 16:56
 * @Description: 获取系统配置工具类
 */
@Component
@Slf4j
public class ServerConfig implements ApplicationListener<WebServerInitializedEvent> {

    /**
     * 获取IP+端口号
     * @param event
     */
    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        try {

            String serverIp = InetAddress.getLocalHost().getHostAddress();
            int serverPort = event.getWebServer().getPort();
            log.info("the project ip {} port {}", serverIp,serverPort);

        } catch (UnknownHostException e) {
            e.printStackTrace();
            log.error("获取系统IP地址有误!!!!!");
        }

    }
}
