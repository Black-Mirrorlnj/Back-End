    static Usuario toEntity(UsuarioRequest dto) {

        Usuario usuario = new Usuario();

        usuario.setUsername(dto.getUsername());
        usuario.setPassword(dto.getPassword());
        usuario.setEmail(dto.getEmail());

        return usuario;
    }
