    @PutMapping("/{id}")
    Usuario atualizarUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
        usuario.setUserId(id);
        return usuarioRepository.update(usuario);
    }
    @GetMapping("/{id}")
    Usuario buscarPorId(@PathVariable int id) {
        return usuarioRepository.findById(id);
    }
