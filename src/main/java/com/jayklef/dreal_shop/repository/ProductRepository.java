package com.jayklef.dreal_shop.repository;

import com.jayklef.dreal_shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
