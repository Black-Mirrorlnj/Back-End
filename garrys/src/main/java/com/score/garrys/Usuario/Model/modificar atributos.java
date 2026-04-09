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
    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }
    boolean isAtivo() {
        return ativo;
    }

    void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    LocalDateTime getCreatedAt() {
        return createdAt;
    }

    void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
