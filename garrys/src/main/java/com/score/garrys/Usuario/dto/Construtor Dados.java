UsuarioResponse() {
}
UsuarioResponse(int userId, String username, String email,
                boolean ativo, LocalDateTime createdAt) {

    this.userId = userId;
    this.username = username;
    this.email = email;
    this.ativo = ativo;
    this.createdAt = createdAt;
}
