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
    // Fiz os atributos como vetor para poder usar conexão com 2 BD diferentes;
    private static String urlLocal[];
    private static String userLocal[];
    private static String senhaLocal[];
    
    // Atributos que vão fazer conexão com o BD na rede servidor LocaWeb;
    private static String urlRede;
    private static String userRede;
    private static String senhaRede;
    
    // Atributos constantes que vão receber os atributos de configuração da conexão;
    private static String DRIVER;
    private static String URL;
    private static String USER;
    private static String SENHA;
    
    // Método para abrir conexão;
    public static Connection abrirConexao(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, USER);
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi poss~ivel conectar! Erro: " + ex);
            
            throw new RuntimeException("Não foi poss~ivel conectar! Erro: " + ex);
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
            JOptionPane.showMessageDialog(null, "Não foi possível fechar a conexão! Erro: " + ex);
        }
    }
    
    // Método que fecha a Conexão e também o PreparedStatement
}
