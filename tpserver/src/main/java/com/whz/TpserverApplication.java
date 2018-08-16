package com.whz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@SpringBootApplication
@EnableEurekaServer
public class TpserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpserverApplication.class, args);
	}
}
