    private UsuarioResponse converterParaResponse(Usuario u) {
        return new UsuarioResponse(
                u.getUserId(),
                u.getUsername(),
                u.getEmail(),
                u.isAtivo(),
                u.getCreatedAt()
        );
    }
}
