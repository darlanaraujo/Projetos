/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author Darlan
 */
public class Conexao {
    
    // Atributos que vão armazenar os dados que permitem a conexão com o BD;
    private static String driver = "com.mysql.cj.jdbc.Driver";
    
    // Fiz os atributos como vetor para poder usar conexões diferentes com BD;
    // Na posição 0 fica a conexão em rede;
    // Na posição 1 fica a conexão local;
    private static String url[] = {"bd_cadastros.mysql.dbaas.com.br", "jdbc:mysql://127.0.0.1:3306/cadastros?zeroDateTimeBehavior=CONVERT_TO_NULL"};
    private static String user[] = {"bd_cadastros", "root"};
    private static String senha[] = {"adminSite", "Mudar#123"};
    
    // Atributos constantes que vão receber os atributos de configuração da conexão;
    private static String DRIVER = driver;
    private static String URL = url[0];
    private static String USER = user[0];
    private static String SENHA = senha[0];
    
    // Método para abrir conexão;
    public static Connection abrirConexao(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, USER);
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar! Erro: " + ex);
            
            throw new RuntimeException("Não foi possível conectar! Erro: " + ex);
        }
    }
    
    // Método para fechar a Conexão
    public static void fecharConexao(Connection con){
        // Primeiro verifico se a conexão está aberta;
        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível fechar a conexão 1! Erro: " + ex);
        }
    }
    
    // Método que fecha a Conexão e também o PreparedStatement (as instruções SQL);
    public static void fecharConexao(Connection con, PreparedStatement stmt){
        
        //Primeiro eu fecho a primeira conexão (con);
        fecharConexao(con);
        
        try{
            if(stmt != null){ // Se a conexão stmt for diferente de null ela está aberta;
                stmt.close();
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível fechar a conexão 2! Erro: " + ex);
        }
        
    }
    
    // Método que fecha a Conexão, as instruções SQL e as Tabelas (ResultSet);
    public static void fecharConexao(Connection con, PreparedStatement stmt, ResultSet rs){
        
        // Primeiro as conexões anteriores;
        fecharConexao(con, stmt);
        
        try{
            if(rs != null){ // Se for diferente de null é porque está aberta;
                rs.close();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível fechar a conexão 3! Erro: " + ex);
        }
    }
}
