package com.score.garrys.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.score.garrys.model.Usuario;
import com.score.garrys.config.Conexao;

class UsuarioRepository {

    List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();

        try (Connection conn = Conexao.getConnection()) {

            String sql = "SELECT * FROM users";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setUserId(rs.getInt("userId"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setCreatedAt(rs.getString("createdAt"));

                lista.add(u);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
       
