    static UsuarioRequest toDTO(Usuario usuario) {

        UsuarioRequest dto = new UsuarioRequest();

        dto.setUsername(usuario.getUsername());
        dto.setPassword(usuario.getPassword());
        dto.setEmail(usuario.getEmail());

        return dto;
    }
}
