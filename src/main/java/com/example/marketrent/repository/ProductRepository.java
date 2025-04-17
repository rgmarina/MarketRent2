package com.example.marketrent.repository;

import com.example.marketrent.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByOwnerId(Long ownerId);
    boolean existsByIdAndOwnerId(Long id, Long ownerId);
}