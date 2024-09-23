package com.kh.movie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("mapper") // MyBatis가 mapper를 인식하도록
public class MovieTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTestApplication.class, args);
	}

}
