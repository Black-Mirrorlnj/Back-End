package com.score.garrys.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.score.garrys.model.Visitante;
import com.score.garrys.config.Conexao;

public class VisitanteRepository {

    private static final String SQL_LISTAR =
        "SELECT id_visitante, nome_usuario, kills FROM visitante";

    public List<Visitante> listar() {
        List<Visitante> lista = new ArrayList<>();

        try (
            Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL_LISTAR);
            ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {
                Visitante v = new Visitante();
                v.setIdVisitante(rs.getInt("id_visitante"));
                v.setNome(rs.getString("nome_usuario"));
                v.setKills(rs.getInt("kills"));

                lista.add(v);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar visitantes", e);
        }

        return lista;
    }
}
