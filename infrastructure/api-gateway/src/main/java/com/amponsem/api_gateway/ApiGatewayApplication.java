package com.amponsem.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
		System.out.println("\n🚀 API Gateway is running!");
		System.out.println("🌐 Access the API Gateway at: http://localhost:8080");
		System.out.println("🔧 Health Check: http://localhost:8080/actuator/health\n");
	}

}
