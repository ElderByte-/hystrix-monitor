package com.elderbyte.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Entry point of the Eureka Service Discovery Server
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableTurbine
public class HystrixDashboardServer {

    private static final Logger log = LoggerFactory.getLogger(HystrixDashboardServer.class);

    public static void main(String[] args) throws UnknownHostException {
        ApplicationContext ctx = SpringApplication.run(HystrixDashboardServer.class, args);

        Environment env = ctx.getEnvironment();
        log.info("Access URLs:\n----------------------------------------------------------\n\t" +
                        "External: \thttp://{}:{}\n----------------------------------------------------------",
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }

}

