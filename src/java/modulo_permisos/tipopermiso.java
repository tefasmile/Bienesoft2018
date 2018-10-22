
package modulo_permisos;

import com.mysql.jdbc.Connection;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import javax.websocket.SendResult;
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
    //Vars 
    int hsalreal, htope, htopet, horapr, resp, contapermiso;
    private String tipopermiso;
    
    
    //METODO SEMANA
    public String metodo_semana(String opcuno){
        
        String psemana="";
        JOptionPane.showMessageDialog(null,"metodo semana, archivo tipopermiso.java");
        return psemana;
        //INICIO
//        resp=1;
//        while(resp != -1){
//                contapermiso=contapermiso+1;
//                System.out.println("Tu nombre");
//                String nombre=entrada.nextLine();
//                System.out.println("Hora aprendiz que diligencia");
//                int horapr=entrada.nextInt();
//                //10 min de salida
//                if(horapr == horapr){
//                    horapr=+10;
//                    System.out.println("1");
//                } 
//        }
        
      
    }
    
    
    //METODO FIN DE SEMANA
    public String metodo_fsemana(String opcdos){
        
        String pfinsemana="";
        JOptionPane.showMessageDialog(null,"metodo fin de semana, ENTRO A metodo FIN DE SEMANA");
        
        return pfinsemana;
        
      
    }
    
    
    
    //METODO EMERGENCIA
    public String metodo_emergencia(String opctres){
        
        String pemergencia="";
        JOptionPane.showMessageDialog(null,"Permiso Emergencia");
        
        return pemergencia;
        
      
    }
    
    
    
    
    
    

}
