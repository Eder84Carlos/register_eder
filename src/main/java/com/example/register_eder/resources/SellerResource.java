package com.example.register_eder.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.register_eder.entities.Seller;

@RestController
@RequestMapping(value = "/Seller")
public class SellerResource {
	
	@GetMapping
	public ResponseEntity<Seller> findAll(){
		Seller u = new Seller(1L, "Eder Carlos");
		return ResponseEntity.ok().body(u);

	}
}
