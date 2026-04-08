package com.score.gmod;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class VisitanteRepository {

    List<Visitante> listar() {
        List<Visitante> lista = new ArrayList<>();

        try (Connection conn = Conexao.getConnection()) {

            String sql = "SELECT * FROM visitante";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Visitante v = new Visitante();

                v.idVisitante = rs.getInt("id_visitante");
                v.nome = rs.getString("nome_usuario");
                v.kills = rs.getInt("kills");

                Timestamp entrada = rs.getTimestamp("horario_entrada");
                if (entrada != null) {
                    v.horarioEntrada = entrada.toLocalDateTime();
                }

                Timestamp saida = rs.getTimestamp("horario_saida");
                if (saida != null) {
                    v.horarioSaida = saida.toLocalDateTime();
                }

                lista.add(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
