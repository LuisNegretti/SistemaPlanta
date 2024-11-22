package db_Operaciones;

import java.sql.*;
import java.util.ArrayList;

public class Conexion {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
     
    public Conexion(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://192.168.193.11:3306/plantas","Luis","12345");
        System.out.println("Conexion Exitosa!"); 
        }catch(Exception e){System.out.println("Error en conexion!");}
    }
    
    public ArrayList<Plantas_Get_Set> List_Plantas(String Tabla){
        ArrayList<Plantas_Get_Set> response = new ArrayList<>();
        try{
        pst = conn.prepareStatement("SELECT * FROM plantas");
        rs = pst.executeQuery();
        while(rs.next()){
            Plantas_Get_Set pln = new Plantas_Get_Set();
            pln.setId(rs.getInt("id"));
            pln.setNombre_planta(rs.getString("Nombre_planta"));
            pln.setContenidoDeMinerales(rs.getString("contenidoDeMinerales"));
            pln.setNivel_ph(rs.getString("Nivel_ph"));
            pln.setHumedad_Suelo(rs.getString("Humedad_Suelo"));
            pln.setSalinidad(rs.getString("Salinidad"));
            pln.setTipo_tierra(rs.getString("Tipo_tierra"));
            response.add(pln);
        }
        conn.close();
        }catch(Exception e){System.out.println("Error al listar");}
        
        
        return response;
    }
    
    public ArrayList<Plantas_Get_Set> Planta_Details(String request){
        ArrayList<Plantas_Get_Set> response = new ArrayList<>();
        try{
            pst=conn.prepareStatement("SELECT * FROM plantas WHERE Nombre_planta=?");
            pst.setString(1, request);
            rs = pst.executeQuery();
            while(rs.next()){
                Plantas_Get_Set pln = new Plantas_Get_Set();
                pln.setId(rs.getInt("id"));
                pln.setNombre_planta(rs.getString("Nombre_planta"));
                pln.setContenidoDeMinerales(rs.getString("contenidoDeMinerales"));
                pln.setNivel_ph(rs.getString("Nivel_ph"));
                pln.setHumedad_Suelo(rs.getString("Humedad_Suelo"));
                pln.setSalinidad(rs.getString("Salinidad"));
                pln.setTipo_tierra(rs.getString("Tipo_tierra"));
                response.add(pln);
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        return response;
    }
}
