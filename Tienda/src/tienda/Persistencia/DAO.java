/*
 insertar, actualizar, borrar y consultar la información
 */
package tienda.Persistencia;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DAO {

    protected Connection Conexion = null;
    protected ResultSet Resultado = null;
    protected Statement Sentencia = null;
    private final String Usuario = "root";
    private final String Contraseña = "root";
    private final String DataBase = "Tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarBase() throws Exception {
        try {
            Class.forName(DRIVER);
            String url = "jdbc:mysql://localhost:3306/"+ DataBase +"?useSSL=false";
            Conexion = (Connection) DriverManager.getConnection(url, Usuario, Contraseña);
        } catch(ClassNotFoundException | SQLException e)  {
           e.printStackTrace(); 
            throw e;
        } 
    }
    protected void desconectarBase() throws Exception{
        try{
        if (Conexion != null) {
            Conexion.close();
        }
        if (Resultado != null) {
            Resultado.close();
        }
        if (Sentencia != null) {
            Sentencia.close();
        }
        } catch(SQLException e){
            e.printStackTrace();
            throw e;
        }
    }
    protected void executeUpdate(String sql) throws Exception{
        try {
            conectarBase();
            Sentencia=(Statement) Conexion.createStatement();
            Sentencia.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
            Conexion.rollback();
            throw e;
        } finally{
            desconectarBase();
        }
    }
    protected void executeQuery(String sql) throws Exception{
        try {
            conectarBase();
            Sentencia=(Statement) Conexion.createStatement();
            Sentencia.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
