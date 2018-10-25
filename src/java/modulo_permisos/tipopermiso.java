
package modulo_permisos;

import com.mysql.jdbc.Connection;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import javax.websocket.SendResult;
import modelo.aprendizSG;
import modelo.consultas;
import modelo.permisoSG;

/**
 *
 * @author Stefany
 */
public class tipopermiso {
    
    conexion con=new conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps= null;
    ResultSet rs=null;
    
    
    
    //METODO SEMANA
    public boolean metodo_semana(String horaReal, String tipoPermiso ){
        
        String horario[] = horaReal.split(":");
        int hora = Integer.parseInt(horario[0]);
        int minutos = Integer.parseInt(horario[1]);
        
        if(tipoPermiso.equals("semana morning")){
            if( (hora >= 8 && hora <= 12) && minutos <= 10) {
                return true;
            }
        } else if(tipoPermiso.equals("semana tarde")) {
            if( (hora >= 12 && hora <= 12) && minutos <= 20) {
                return true;
            }
        }
      return false;
    }
    
    
    //METODO FIN DE SEMANA
//    public boolean metodo_finsemana(String fechaReal, String horaReal, String tipoPermiso){
//        
//        String pfinsemana="";
//        JOptionPane.showMessageDialog(null,"metodo fin de semana, ENTRO A metodo FIN DE SEMANA");
//        
//        return pfinsemana;
//        
//      
//    }
    
    
    
    
    
    
    
    
    

}
