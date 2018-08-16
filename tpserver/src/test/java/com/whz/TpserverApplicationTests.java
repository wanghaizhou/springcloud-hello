package com.whz;

import com.whz.bean.People;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URL;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=RANDOM_PORT)
public class TpserverApplicationTests {

	@Autowired
	TestRestTemplate restTemplate;
	@LocalServerPort
	int port;
	URL url;

	@Autowired
	People people;

	@Before
	public void setUp(){
		try {
			url = new URL("http://localhost:"+port+"/test");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void contextLoads() {
		ResponseEntity<String> v = restTemplate.getForEntity(url.toString(),String.class);
		System.out.println("输出信息："+people.toString());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
		System.out.println("输出信息："+v.getBody());
	}

}
