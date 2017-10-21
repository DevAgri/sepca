/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devagri3.dao;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author willyan
 */
public class Conecta {
    public static Connection conectabd() throws ClassNotFoundException {
         
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/devagri","postgres","");
           // JOptionPane.showMessageDialog(null, "Sucesso ao conectar ao banco de dados");
            System.out.println("Sucesso na conexão com o banco de dados");
            return conexao;
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error+"Não foi possível conectar ao banco de dados");
            return null;
        }
    }
    
}
