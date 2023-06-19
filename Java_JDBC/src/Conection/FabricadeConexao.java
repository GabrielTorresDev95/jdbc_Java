package Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FabricadeConexao {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/?VerifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "12345678";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        Statement sttm = conexao.createStatement();
        sttm.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso!");
        conexao.close();


    }
    }


