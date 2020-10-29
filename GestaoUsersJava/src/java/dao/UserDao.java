/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Usuario;
import Util.DbUtil;
import org.apache.catalina.User;

public class UserDao {

    private Connection connection;
    int r;

    public UserDao() {
        connection = DbUtil.getConnection();
    }

    public void addUser(Usuario user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into cadusers(nome,email,senha,telefone) values (?, ?, ?, ? )");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getSenha());
            preparedStatement.setString(4, user.getTelefone());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int userId) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from cadusers where id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(Usuario user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update cadusers set nome=?, senha=?, telefone=?, email=? where id=?");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getSenha());
            preparedStatement.setString(3, user.getTelefone());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setInt(5, user.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Usuario> getAllUsers() {
        ArrayList<Usuario> listaDeUsuario = new ArrayList<Usuario>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cadusers");
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setId(rs.getInt("ID"));
                user.setNome(rs.getString("nome"));
                user.setEmail(rs.getString("email"));
                user.setSenha(rs.getString("senha"));
                user.setTelefone(rs.getString("telefone"));
                listaDeUsuario.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeUsuario;
    }

    public Usuario getUserById(int userId) {
        Usuario user = new Usuario();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from cadusers where id=?");
            preparedStatement.setInt(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setSenha(rs.getString("senha"));
                user.setTelefone(rs.getString("telefone"));
                user.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
    
    public int validar(Usuario user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("Select * from cadusers where nome=? and senha=?");
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getSenha());
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                r = r + 1;
                user.setNome(rs.getString("nome"));
                user.setSenha(rs.getString("senha"));
            }
            if(r == 1){
                return 1;
            } else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
        
    }
    
    
    public static void main(String[] args) {
        
    }
}
