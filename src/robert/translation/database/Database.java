package robert.translation.database;



import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Database
{
  String     driver     = "org.postgresql.Driver";
  // --------------------------------------------------------------------------
  String     host       = "localhost";            // !!! anpassen !!!
  String     port       = "5432";                 // !!! anpassen !!!
  String     database   = "NT";             // !!! anpassen !!!
  String     user       = "postgresql";                  // !!! anpassen !!!
  String     password   = "itachi6953";                  // !!! anpassen !!!
  // --------------------------------------------------------------------------
 
  Connection connection = null;

  public Database ()
  {
    loadJdbcDriver ();
    openConnection ();
    showData(database);
    closeConnection ();
  }

  //close the connection
  private void closeConnection ()
  {
    try
    {
      connection.close ();
    }
    catch (SQLException e)
    {
      e.printStackTrace ();
      System.exit (1);
    }
 
    System.out.println ("\nconnection closed");
  }
  
  //@return Url-string for postgreSQL-database connection
  private String getUrl ()
  {
    // PostgreSQL takes one of the following url-forms:
    // ================================================
    // jdbc:postgresql:database
    // jdbc:postgresql://host/database
    // jdbc:postgresql://host:port/database
    return "jdbc:postgresql://localhost:5432/NT";
    // return ("jdbc:postgresql:" + (host != null ? ("//" + host) + (port != null ? ":" + port : "") + "/" : "") + database);
  }
  //loading the JDBC driver
  private void loadJdbcDriver ()
  {
    try
    {
      //Ladet Treiber
      Class.forName(driver);
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace ();
      System.exit (1);
    }
    System.out.println ("driver loaded");
  }
  
  //opening the connection
  private void openConnection ()
  {
    try
    {
      // Stellt connection zwischen Datenbank und Javaprogramm her.
      connection = DriverManager.getConnection (getUrl (), user, password);
    }
    catch (SQLException e)
    {
      e.printStackTrace ();
      System.exit (1);
    }
 
    System.out.println ("connection opened");
  }

  private void showData(String tableName)
  {
    try
    {
      Statement statement = connection.createStatement ();
      ResultSet resultSet = statement.executeQuery ("SELECT * FROM "+tableName);
      
      ResultSetMetaData resultSetMetaData = resultSet.getMetaData ();
 
      System.out.println ("\n\nshow data from table: 'KontaktePrivat'\n");
 
      String format = "%-20s   %-30s   %-10s  %-25s %s\n";
      //Das "-" bedetutet Linksbündig
      
      for (int i = 0; i < resultSetMetaData.getColumnCount(); i++)
      {
        System.out.print(resultSetMetaData.getColumnLabel(i)+"    ");
      }
      System.out.println();
      
//      System.out.printf (format + "\n",
//                         resultSetMetaData.getColumnLabel (1),
//                         resultSetMetaData.getColumnLabel (2),
//                         resultSetMetaData.getColumnLabel (3),
//                         resultSetMetaData.getColumnLabel (4),
//                         resultSetMetaData.getColumnLabel (5));
      
      
      while (resultSet.next())
      {
        for (int i = 0; i < resultSetMetaData.getColumnCount(); i++)
        {
          System.out.print(resultSetMetaData.getColumnLabel(i)+"    ");
        }
        System.out.println();
      }
      
      
 
      resultSet.close ();
      statement.close ();
    }
    catch (SQLException e)
    {
      e.printStackTrace ();
      System.exit (1);
    }
  }
  public static void main(String[] args)
  {
    new Database();
  }
}