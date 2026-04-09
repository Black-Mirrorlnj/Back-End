    UsuarioResponse buscarPorId(int id) {
        return usuarioRepository.findById(id)
                .map(this::converterParaResponse)
                .orElse(null);
    }
