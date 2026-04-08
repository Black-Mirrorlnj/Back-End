package com.score.garrys.controller;

import com.score.garrys.model.entidade.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    List<Usuario> listar() {
        return usuarios;
    }

    @GetMapping("/{id}")
    Usuario buscarPorId(@PathVariable int id) {
        return usuarios.stream()
                .filter(u -> u.getUserId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    Usuario criar(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    @PutMapping("/{id}")
    Usuario atualizar(@PathVariable int id, @RequestBody Usuario usuarioAtualizado) {
        for (Usuario u : usuarios) {
            if (u.getUserId() == id) {
                u.setUsername(usuarioAtualizado.getUsername());
                u.setPassword(usuarioAtualizado.getPassword());
                return u;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    String deletar(@PathVariable int id) {
        usuarios.removeIf(u -> u.getUserId() == id);
        return "Usuário removido!";
    }
}
