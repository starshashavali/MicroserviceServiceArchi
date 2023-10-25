package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CalcStockPriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcStockPriceApplication.class, args);
	}

}
