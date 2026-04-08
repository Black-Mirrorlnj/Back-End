package com.score.garrys.model.entidade;

import java.time.LocalDateTime;

class Usuariomodel {

    private int userId;
    private String username;
    private String password;
    private LocalDateTime createdAt;

    
    Usuario() {}

    
    Usuario(int userId, String username, String password, LocalDateTime createdAt) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.createdAt = createdAt;
    }

    
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
