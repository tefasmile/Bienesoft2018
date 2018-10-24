/*
 * AUTORIZACION DE PERMISOS VISTA SEGURIDAD
 */
package modulo_permisos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.permisoSG;

/**
 *
 * @author Stefany
 */
public class Autorizacion {
    
    conexion con=new conexion();
    com.mysql.jdbc.Connection cnn=con.conexiondb();
    PreparedStatement ps= null;
    ResultSet rs=null;
    

    //METODO DE CONSULTA ID DE PERMISO
    public ArrayList<permisoSG> consultaperID(permisoSG perId ){
        ArrayList<permisoSG> permisoid = new ArrayList<>();
        try {
           ps = cnn.prepareStatement("SELECT*FROM permiso WHERE per_ID='"+perId.getPer_ID()+"' ");
           rs = ps.executeQuery();
          if(rs.next()){
                permisoSG setget = new permisoSG(rs.getInt(1), rs.getInt(2),rs.getString(3) , rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),rs.getString(15),rs.getString(16));
                permisoid.add(setget);
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se puede mostra el contenido"+e);
        }
        
        return permisoid;
    
    }
    
    
    
    //METODO DE AUTORIZACION DE PERMISO ACCION PARA EL GUARDA
    public boolean AutorizaSeguridad(String estado){

        if(estado.equals("Autorizado")){
            return true;        
        }        
        return false;
    }

    
    
    //METODO DE ENTRADA Y SALIDA DE PERMISO FRENTE APRENDIZ 
    
    //PERMISO PARA VERIFICAR SI ES UNA ENTRADA O UNA SALIDA
    //public ArrayList<permisoSG> PermisoSalida(permisoSG fapr, permisoSG hapr, permisoSG fr, permisoSG hr) 
    public ArrayList<permisoSG> PermisoSalidaEntrada(permisoSG fireal, permisoSG hireal, permisoSG fsreal, permisoSG hsreal){
        ArrayList<permisoSG> permisoes = new ArrayList<>();
        
        if(fireal == null && hireal == null) {
            JOptionPane.showMessageDialog(null, "Es una entrada");
        }else if( fsreal == null && hsreal == null){
            JOptionPane.showMessageDialog(null, "Es una salida");
        }
           
        return permisoes;
        
    }
    
    
    
    //METODO DE VERIFICACION DE HORAS Y FECHAS ESTIPULADAS DEL APRENDIZ CON REALES
    public ArrayList<permisoSG> fechaHoraEstipulada(permisoSG fireal, permisoSG hireal, permisoSG fsreal, permisoSG hsreal){
        ArrayList<permisoSG> permisoes = new ArrayList<>();
        
        if(fireal == null && hireal == null) {
            JOptionPane.showMessageDialog(null, "Es una entrada");
        }else if( fsreal == null && hsreal == null){
            JOptionPane.showMessageDialog(null, "Es una salida");
        }
           
        return permisoes;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
