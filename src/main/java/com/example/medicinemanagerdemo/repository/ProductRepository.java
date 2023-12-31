package com.example.medicinemanagerdemo.repository;

import com.example.medicinemanagerdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(nativeQuery = true,value =
            "select DISTINCT product.* from product " +
                    "where product.product_name like concat('%',?1,'%')")
    Iterable<Product> searchProductsByName(String product_name);
}
