package com.score.gmod;

import java.sql.Connection;
import java.sql.DriverManager;

class Conexao {

    static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/seubanco",
            "root",
            "senha"
        );
    }
}
