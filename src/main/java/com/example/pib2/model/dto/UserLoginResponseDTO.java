package com.example.pib2.model.dto;

import com.example.pib2.model.entity.UserRole;

public record UserLoginResponseDTO(String name, String email, UserRole role, String provider, String token, Long businessId) {
    
}
