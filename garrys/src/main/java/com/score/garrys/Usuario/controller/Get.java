    @GetMapping
    List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }
