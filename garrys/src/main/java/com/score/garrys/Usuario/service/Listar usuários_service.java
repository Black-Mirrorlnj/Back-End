    List<UsuarioResponse> listarUsuarios() {
        return usuarioRepository.findAll().stream()
                .map(this::converterParaResponse)
                .toList();
    }
