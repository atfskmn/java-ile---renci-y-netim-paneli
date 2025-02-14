


import com.sun.jdi.connect.Connector;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Teknosa
 */
public class MyConnector {
    
    private final static String URL  ="jdbc:mysql://localhost/deneme";
    private final static String KAdi="root";
    private final static String Parola="";
    private Connection connector=null;
    public MyConnector(){
    
    try{
     connector=DriverManager.getConnection(URL,KAdi,Parola);
         if(connector!=null){
          System.out.println("veri tabanýna baðlanýldý");
          
         }else{
          System.out.println("veri tabanýna baðlanýlmadý");
            
         }
          
          
     }catch(SQLException sqlExp){
       System.out.println("veri tabanýn da hata oluþtu");

     }
   
    }
    
    public Connection getConnector(){
    
    return connector;}
    
    public Connection closeConnector(){
    
       try{
           connector.close();
       }catch(SQLException sqle){
       
           System.out.println("baðlantý sonlanamadý");
           sqle.printStackTrace();
       }
        return null;
     }
    
  
    
    }
    
    

