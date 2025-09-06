package com.bakery_shop.bakery_shop;

import org.springframework.boot.SpringApplication;

public class TestBakeryShopApplication {

	public static void main(String[] args) {
		SpringApplication.from(BakeryShopApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
