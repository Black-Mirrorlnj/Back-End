package com.score.garrys.dto;

class UsuarioDTO {

    private int userId;
    private String username;

    // Construtor vazio
    UsuarioDTO() {}

    // Construtor com parâmetros
    UsuarioDTO(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

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
}
