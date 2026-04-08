    @GetMapping("/{id}")
    Usuario buscarPorId(@PathVariable int id) {
        return usuarioRepository.findById(id);
    }
