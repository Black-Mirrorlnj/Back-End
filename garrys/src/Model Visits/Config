package com.score.garrys.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/seubanco",
            "root",
            "senha"
        );
    }
}
