package com.example.marketrent.repository;

import com.example.marketrent.models.MarketUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<MarketUser, Long> {
    Optional<MarketUser> findByUsername(String username);
}