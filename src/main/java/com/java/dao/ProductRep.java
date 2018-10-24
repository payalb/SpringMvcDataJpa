package com.java.dao;

import org.springframework.data.repository.CrudRepository;

import com.java.dto.Product;

public interface ProductRep extends CrudRepository<Product,Integer>{

}
