    UsuarioResponse criarUsuario(UsuarioRequest dto) {

        Usuario usuario = new Usuario();

        usuario.setUsername(dto.getUsername());
        usuario.setPassword(dto.getPassword());
        usuario.setEmail(dto.getEmail());

        Usuario salvo = usuarioRepository.save(usuario);

        return converterParaResponse(salvo);
    }
