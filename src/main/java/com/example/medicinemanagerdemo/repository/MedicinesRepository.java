package com.example.medicinemanagerdemo.repository;

import com.example.medicinemanagerdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface MedicinesRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM product where Category = ?1", nativeQuery = true)
    Iterable<Product> findByCategory(int Category);

    @Query(nativeQuery = true,value =
            "select DISTINCT product.* from product " +
                    "where product.product_name like concat('%',?1,'%') and product.Category = 2")
    Iterable<Product> searchProductsByName(String product_name);
}
