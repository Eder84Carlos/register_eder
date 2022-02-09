package com.example.register_eder.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.register_eder.entities.Seller;
import com.example.register_eder.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<Seller> findAll(){
		return repository.findAll();
	}
	
	public Seller findById(Long id) {
		Optional<Seller> obj = repository.findById(id);
		return obj.get();
	}
	
	public Seller insert(Seller obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
