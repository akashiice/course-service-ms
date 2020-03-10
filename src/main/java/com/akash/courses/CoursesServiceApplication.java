package com.akash.courses;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class CoursesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesServiceApplication.class, args);
	}

	@Bean
	//creating a sampler called always sampler
	public Sampler defaultSampler()
	{
		return Sampler.ALWAYS_SAMPLE;
	}
}
