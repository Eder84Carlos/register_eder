package com.example.register_eder.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.register_eder.entities.Seller;
import com.example.register_eder.services.SellerService;

@RestController
@RequestMapping(value = "/Seller")
public class SellerResource {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<Seller>> findAll(){
		List<Seller> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Seller> findById(@PathVariable Long id){
		Seller obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
