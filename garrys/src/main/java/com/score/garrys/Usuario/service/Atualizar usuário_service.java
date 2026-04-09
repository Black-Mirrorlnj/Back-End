    UsuarioResponse atualizarUsuario(int id, UsuarioRequest dto) {

        Usuario usuario = usuarioRepository.findById(id).orElse(null);

        if (usuario != null) {
            usuario.setUsername(dto.getUsername());
            usuario.setPassword(dto.getPassword());
            usuario.setEmail(dto.getEmail());

            return converterParaResponse(usuarioRepository.save(usuario));
        }

        return null;
    }
