package com.example.marketrent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.marketrent.models") // Исправлен пакет
public class MarketRentApplication {
    public static void main(String[] args) {
        SpringApplication.run(MarketRentApplication.class, args);
    }
}