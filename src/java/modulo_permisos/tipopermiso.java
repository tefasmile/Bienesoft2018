
package modulo_permisos;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    public String metodo_semana(String opcuno){
        
        String psemana="";
        
        JOptionPane.showMessageDialog(null,"metodo semana");
        
        return psemana;
      
    }
    
    
    //METODO FIN DE SEMANA
    public String metodo_fsemana(String opcdos){
        
        String pfinsemana="";
        JOptionPane.showMessageDialog(null,"metodo fin de semana");
        
        return pfinsemana;
      
    }
    
    
    
    

}
