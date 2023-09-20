package com.msd.departmentregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentRegistryApplication.class, args);
	}

}
