package com.manual.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

/**
 * desc: 手册api程序主入口
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
@SpringBootApplication
public class ApplicationManualApi {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationManualApi.class);

    public static void main(String[] args) throws Exception{
        Environment env = SpringApplication.run(ApplicationManualApi.class, args).getEnvironment();
        String model = env.getProperty("spring.profiles.active");
        String port = env.getProperty("server.port");

        logger.info("Access URLs:\n----------------------------------------------------------\n\t" +
                        "Active: \t{}\n\t" +
                        "Local: \t\thttp://127.0.0.1:{}\n\t" +
                        "External: \thttp://{}:{}\n----------------------------------------------------------",
                model,
                port,
                InetAddress.getLocalHost().getHostAddress(),
                port);

    }
}
