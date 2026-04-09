
Usuario() {
    }
Usuario(int userId, String username, String password, String email,
            boolean ativo, LocalDateTime createdAt, LocalDateTime updatedAt) {

        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.ativo = ativo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
