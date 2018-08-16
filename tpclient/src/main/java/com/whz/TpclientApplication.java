package com.whz;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class TpclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpclientApplication.class, args);
	}


	@Value("${server.port}")
	Integer port;

	@Value("${foo}")
	private  String foo;
	/*@Value("${age}")
	private  String age;
	@Value("${version}")
	private  String version="开发环境";*/

	@RequestMapping("/hi")
	public String hi(@RequestParam(name = "name",defaultValue = "haha") String name){
		return "hi,"+name+"! my port is "+port;
	}

	@RequestMapping("/hi2")
	public String hi2(@RequestParam(name = "name",defaultValue = "haha") String name){
		return "hi,"+name+"! my port is "+port+" and foo:"+foo;
	}



	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
