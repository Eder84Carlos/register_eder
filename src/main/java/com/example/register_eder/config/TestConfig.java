package com.example.register_eder.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.register_eder.entities.Category;
import com.example.register_eder.entities.Client;
import com.example.register_eder.entities.Product;
import com.example.register_eder.entities.Seller;
import com.example.register_eder.entities.enums.ClientStatus;
import com.example.register_eder.repositories.CategoryRepository;
import com.example.register_eder.repositories.ClientRepository;
import com.example.register_eder.repositories.ProductRepository;
import com.example.register_eder.repositories.SellerRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings"); 
		Product p2 = new Product(null, "Smart TV"); 
		Product p3 = new Product(null, "Macbook Pro"); 
		Product p4 = new Product(null, "PC Gamer"); 
		Product p5 = new Product(null, "Rails for Dummies");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		Seller u1 = new Seller(null, "Andre Daniel");
		Seller u2 = new Seller(null, "Daniel Andre");
		
		Client o1 = new Client(null,"Maria", Instant.parse("2022-02-08T19:53:07Z"),ClientStatus.ANSWERED, u1); 
		Client o2 = new Client(null, "Davi", Instant.parse("2022-02-07T03:42:10Z"),ClientStatus.SERVICE, u2); 
		Client o3 = new Client(null, "Flavio", Instant.parse("2022-02-09T15:21:22Z"),ClientStatus.SERVICE, u1);
		
		sellerRepository.saveAll(Arrays.asList(u1, u2));
		clientRepository.saveAll(Arrays.asList(o1, o2, o3));
		
		
	}
	
	

}
