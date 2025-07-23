package com.lft.tylerspub.dao;

import com.lft.tylerspub.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
