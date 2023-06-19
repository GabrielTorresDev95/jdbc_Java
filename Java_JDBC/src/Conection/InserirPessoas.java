package Conection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InserirPessoas {


    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();

        Connection conexao = Conection1.getConexao();
        String sql = "INSERT INTO pessoas (nome) VALUES  (?) ";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setInt(2, 3);

        stmt.execute();

        System.out.println("Pessoas criada com sucesso!");

        entrada.close();
        conexao.close();
    }
}
