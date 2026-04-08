package com.score.garrys.repository;

import com.score.garrys.model.entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    // Buscar por username
    Optional<Usuario> findByUsername(String username);
}
