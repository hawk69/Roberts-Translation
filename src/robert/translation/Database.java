
package robert.translation;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.UUID;

import java.sql.Connection;


public class Database {
   
    public static void main(String[] args) throws Exception{
        Connection conn = null;
      try {
             Class.forName("org.postgresql.Driver");
             conn = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/testdb",
            "postgres", "itachi6953");
            if(conn!=null)
            System.out.println("Connected!");
            Statement st=conn.createStatement();
            String sql="insert into cool values(5,'John')";   
            st.execute(sql);          
        }   catch (Exception e) {
             e.printStackTrace();
            
        }
        
       
        
        
        }
    
    }
