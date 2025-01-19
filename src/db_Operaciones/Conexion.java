package db_Operaciones;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conexion {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
     
    public Conexion(){
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_planta","root","");
        System.out.println("Conexion Exitosa!"); 
        
         // Crear una declaración SQL
            Statement statement = conn.createStatement();
        //conn.close() probar mañana
        }catch(Exception e){
            System.out.println("Error en conexion!");
        JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos, asegurate de tener en ejecucion WampServer."); 
        }
        
    }
    
    public ArrayList<Plantas_Get_Set> List_Plantas(String Tabla){
        ArrayList<Plantas_Get_Set> response = new ArrayList<>();
        
        try{
            
        pst = conn.prepareStatement("SELECT * FROM plantas");
        rs = pst.executeQuery();
        while(rs.next()){
            Plantas_Get_Set pln = new Plantas_Get_Set();
            pln.setId(rs.getInt("id_planta"));
            pln.setNombre_planta(rs.getString("Nombre_planta"));
            pln.setContenidoDeMinerales(rs.getString("contenidoDeMinerales"));
            pln.setNivel_ph(rs.getString("Nivel_ph"));
            pln.setHumedad_Suelo(rs.getString("Humedad_Suelo"));
            pln.setSalinidad(rs.getString("Salinidad"));
            pln.setTipo_tierra(rs.getString("Tipo_tierra"));
            response.add(pln);
        }
        }catch(Exception e){System.out.println("Error al listar");}
        
        
        return response;
    }
        
    public ArrayList<Plantas_Get_Set> Planta_Details(String request){
        ArrayList<Plantas_Get_Set> response = new ArrayList<>();
        try{
            pst=conn.prepareStatement("SELECT * FROM Plantas WHERE Nombre_Planta=?");
            pst.setString(1, request);
            rs = pst.executeQuery();
            while(rs.next()){
                Plantas_Get_Set pln = new Plantas_Get_Set();
                pln.setId(rs.getInt("id_planta"));
                pln.setNombre_planta(rs.getString("Nombre_planta"));
                pln.setContenidoDeMinerales(rs.getString("contenidoDeMinerales"));
                pln.setNivel_ph(rs.getString("Nivel_ph"));
                pln.setHumedad_Suelo(rs.getString("Humedad_Suelo"));
                pln.setSalinidad(rs.getString("Salinidad"));
                pln.setTipo_tierra(rs.getString("Tipo_tierra"));
                response.add(pln);
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        return response;
    }
    
    public ArrayList<TipoTierra_Get_Set> List_TipoTierra() {
    ArrayList<TipoTierra_Get_Set> response = new ArrayList<>();
    try {
        pst = conn.prepareStatement("SELECT * FROM tipo_tierra");
        rs = pst.executeQuery();
        while (rs.next()) {
            TipoTierra_Get_Set tierra = new TipoTierra_Get_Set();
            tierra.setId(rs.getInt("Id"));
            tierra.setNombreTierra(rs.getString("Nombre_tierra"));
            tierra.setContenidoDeMinerales(rs.getString("contenidoDeMinerales"));
            tierra.setNivelPh(rs.getString("Nivel_ph"));
            tierra.setHumedadSuelo(rs.getString("Humedad_Suelo"));
            tierra.setSalinidad(rs.getString("Salinidad"));
            response.add(tierra);
        }
        //conn.close();
    } catch (Exception e) {
        System.out.println("Error al listar tipo_tierra: " + e.getMessage());
    }
    return response;
}

    public ArrayList<TipoTierra_Get_Set> Tierra_Details(String request){
        ArrayList<TipoTierra_Get_Set> response = new ArrayList<>();
        try{
            pst=conn.prepareStatement("SELECT * FROM tipo_tierra WHERE Nombre_tierra=?");
            pst.setString(1, request);
            rs = pst.executeQuery();
            while(rs.next()){
                TipoTierra_Get_Set pln = new TipoTierra_Get_Set();
                pln.setId(rs.getInt("Id"));
                pln.setNombreTierra(rs.getString("Nombre_tierra"));
                pln.setContenidoDeMinerales(rs.getString("contenidoDeMinerales"));
                pln.setNivelPh(rs.getString("Nivel_ph"));
                pln.setHumedadSuelo(rs.getString("Humedad_Suelo"));
                pln.setSalinidad(rs.getString("Salinidad"));
                response.add(pln);
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
        return response;
    }

    public void InsertarHistoria(String fecha, String planta, String PH, String Tierra, String Mineral, String resultado ){
        try{
            String sql = "INSERT INTO historial(Fecha, Planta, PH, Tierra, Mineral, Resultado)VALUES(?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1, fecha);
            pst.setString(2, planta);
            pst.setString(3, PH);
            pst.setString(4, Tierra);
            pst.setString(5, Mineral);
            pst.setString(6, resultado);
            
            pst.executeUpdate();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }

//    public void viewTable(){
//        try{
//            String sql = "SELECT * FROM historial";
//            pst = conn.prepareStatement(sql);
//            rs = pst.executeQuery();
//            
//            while(rs.next()){
//                  
//            }
//        }catch(SQLException e){System.out.println(e);}
//    }

}
