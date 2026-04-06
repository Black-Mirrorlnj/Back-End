package com.score.garrys.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.score.garrys.model.Visitante;
import com.score.garrys.config.Conexao;

public class VisitanteRepository {

    public List<Visitante> listar() {
        List<Visitante> lista = new ArrayList<>();

        try (Connection conn = Conexao.getConnection()) {
            String sql = "SELECT * FROM visitante";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Visitante v = new Visitante();
                v.setIdVisitante(rs.getInt("id_visitante"));
                v.setNome(rs.getString("nome"));
                v.setNivel(rs.getInt("nivel"));
                v.setKills(rs.getInt("kills"));

                lista.add(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
