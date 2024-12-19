/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaalineweb.conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Conexao {
     public Connection getConnection() throws SQLException{
         try {
             Class.forName("com.mysql.cj.jdbc.Driver"); // Acredito que faltava essa linha, mas nao me lembro como executar o tomcat, já faz 1 milhao de ano que nao vejo ele =P
             // se puder testar e me avisar
             Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agendaaline?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8", "root", "Davi#Tomas9152");
             return conexao;
         
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }
    
}
