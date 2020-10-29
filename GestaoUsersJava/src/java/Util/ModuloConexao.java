/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author FASTUDO
 */
public class ModuloConexao {
    public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mySQL://localhost:3306/gestaousers?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão feita com sucesso");
            return conexao;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão de" + e.getMessage());
            return null;
        }

    }
    
    public static void main(String[] args) {
        conector();
    }
}
