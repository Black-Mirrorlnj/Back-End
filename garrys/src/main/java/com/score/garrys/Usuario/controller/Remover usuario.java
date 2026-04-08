    @DeleteMapping("/{id}")
    void deletarUsuario(@PathVariable int id) {
        usuarioRepository.delete(id);
    }
}
