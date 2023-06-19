package Conection;

import java.sql.*;
import java.util.Scanner;

public class AtualizartabelaPessoa {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        Connection conect = Conection1.getConexao();
        String selectsql = "SELECT * FROM pessoas";
        Statement sttm = conect.createStatement();

        ResultSet resultado = sttm.executeQuery(selectsql);

        while(resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            System.out.println(codigo + " " + " " + nome);

        }


        System.out.println("Informe o codigo da pessoa");
        int codigo = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Informe o novo nome: ");
        String nome = entrada.nextLine();


        Connection conexao = Conection1.getConexao();

        String SQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setString(1, nome);
        stmt.setInt(2, codigo);



        stmt.execute();

        System.out.println("Nome atualizado com sucesso!");
        conexao.close();
        stmt.close();

        entrada.close();

    }
}
