package com.example.marketrent.service;

import com.example.marketrent.models.MarketUser;
import com.example.marketrent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public MarketUser findByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Пользователь не найден: " + username));
    }

    public boolean isAdmin(String username) {
        MarketUser user = findByUsername(username);
        return user.isAdmin(); // предполагается, что в MarketUser есть поле boolean admin
    }

    public boolean isOwner(String username, Long productOwnerId) {
        MarketUser user = findByUsername(username);
        return user.getId().equals(productOwnerId);
    }
}