package Conection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException {


    Connection conexao = Conection1.getConexao();

    String sql = "CREATE TABLE IF NOT EXISTS pessoas (" +
            "codigo INT AUTO_INCREMENT PRIMARY KEY," +
            "nome varchar(80) NOT NULL" +
            ")";

    Statement stmt = conexao.createStatement();
    stmt.execute(sql);
        System.out.println("Tabela Criada com sucesso!");

    conexao.close();

}


}
