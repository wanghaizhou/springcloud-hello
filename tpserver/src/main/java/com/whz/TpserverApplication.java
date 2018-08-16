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
		/*String token = "4d77YfruADJdLud8AlaOlxUT8SBBZwrwyuwVM6tQNssJgX4IK6nZgbbSD2x5yBnw4Q3M0mI7YHrTrGQQTq7bvYnVeTCJR7WisQ8i1Wu9BIDVoFj4VtIdl/VBX+NuUmh37h0gOJOYkx237DWGeQHr";
		try {
			token = URLEncoder.encode(token,"UTF-8");
			System.out.println(token);
			token = URLEncoder.encode(token,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(token);*/

		SpringApplication.run(TpserverApplication.class, args);
	}
}
