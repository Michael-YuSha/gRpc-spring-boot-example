package org.mygrpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class GrpcSpringBootServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcSpringBootServerApplication.class, args);
	}
}
