package com.bmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmc.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
