package com.thaituan.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.thaituan.common.entity", "com.thaituan.admin.user"})
public class ThaituanBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThaituanBackEndApplication.class, args);
	}

}
