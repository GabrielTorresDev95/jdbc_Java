package Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    public static void main(String[] args) throws SQLException {


        String url = "jdbc:mysql://localhost:3306/,22020?VerifyServerCertificate=false&useSSL=true";
       final String usuario = "root";
       final String senha = "12345678";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com sucesso!");

        conexao.close();


    }
}
