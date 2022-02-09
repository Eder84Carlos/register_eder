package com.example.register_eder.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.register_eder.entities.Client;
import com.example.register_eder.entities.Seller;
import com.example.register_eder.repositories.ClientRepository;
import com.example.register_eder.repositories.SellerRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Seller u1 = new Seller(null, "Andre Daniel");
		Seller u2 = new Seller(null, "Daniel Andre");
		
		Client o1 = new Client(null,"Maria", Instant.parse("2022-02-08T19:53:07Z"), u1); 
		Client o2 = new Client(null, "Davi", Instant.parse("2022-02-07T03:42:10Z"), u2); 
		Client o3 = new Client(null, "Flavio", Instant.parse("2022-02-09T15:21:22Z"), u1);
		
		sellerRepository.saveAll(Arrays.asList(u1, u2));
		clientRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	

}
