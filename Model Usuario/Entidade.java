package com.score.garrys.model.entidade;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Construtor vazio obrigatório para JPA
    Usuario() {}

    // Getters e Setters
    int getUserId() {
        return userId;
    }

    void setUserId(int userId) {
        this.userId = userId;
    }

    String getUsername() {
        return username;
    }

    void setUsername(String username) {
        this.username = username;
    }

    String getPassword() {
        return password;
    }

    void setPassword(String password) {
        this.password = password;
    }

    LocalDateTime getCreatedAt() {
        return createdAt;
    }

    void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
