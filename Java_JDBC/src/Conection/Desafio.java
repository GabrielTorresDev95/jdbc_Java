package Conection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        Connection conexao = Conection1.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome like ? ";

        System.out.println("Informe algumas letras: ");
        String valor = entrada.next();


        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,  "%" +valor+ "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoas> pessoas = new ArrayList<>();

        while(resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoas(codigo, nome));
        }

        for (Pessoas p: pessoas) {
            System.out.println(p.getCodigo()+ " ==> " + p.getNome());
        }

        stmt.close();
        conexao.close();

        stmt.close();
        conexao.close();


        entrada.close();
    }
}
