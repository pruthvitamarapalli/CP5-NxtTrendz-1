package com.example.nxttrendz1.repository;

import com.example.nxttrendz1.model.Product;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductJpaRepository extends JpaRepository<Product, Integer> {

}