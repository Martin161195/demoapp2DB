package com.mrp.demoapp2DB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mrp.demoapp2DB.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String>{
		
}
