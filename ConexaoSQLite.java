/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.conexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Windows
 */
public class ConexaoSQLite {
    public Connection conectar(){
        Connection conexao = null; //declara uma variavel pra armazenar a conexao
        String url = "jdbc:sqlite:usuariosNovo.db"; //define o caminho do banco de dasos SQLite
         
        
        try {
            //tenta estabelecer a conexao com o banco de dados usando a url fornecida
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexao com SQLite estabelecida!");
        }catch (SQLException e){
            //caso ocorra um erro, ele sera capturado e xebido
            System.out.println("Erro ao conectar banco" + e.getMessage());
        }
        return conexao;
                
    }
 
    
public void desconectar(Connection conexao){
    
}

}
