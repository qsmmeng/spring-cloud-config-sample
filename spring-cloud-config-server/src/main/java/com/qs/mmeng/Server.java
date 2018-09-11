package com.qs.mmeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * spring-cloud-config-sample
 *
 * @author qsm
 * @date 2018/09/11
 */
@EnableConfigServer
@SpringBootApplication
public class Server {

    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);

    }

}
