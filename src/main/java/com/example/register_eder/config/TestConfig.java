package com.example.register_eder.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.register_eder.entities.Seller;
import com.example.register_eder.repositories.SellerRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private SellerRepository sellerRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Seller u1 = new Seller(null, "Maria Brown");
		Seller u2 = new Seller(null, "Alex Green");
		
		sellerRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	

}
