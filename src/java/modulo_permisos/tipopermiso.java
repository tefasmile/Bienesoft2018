
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
    public String metodo_semana(String opcuno){
        String psemana="";
        JOptionPane.showMessageDialog(null,"metodo semana, archivo tipopermiso.java");
        
        //Vars 
        int hsalreal, htope, htopet, horapr, contapermiso, hora, minutos, segundos;
        String resp="si";
        //Datos de la hora
        Calendar calendario = Calendar.getInstance();
        
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        //vars
//        HttpSession dato = request.getSession();
//        String tipo = (String) dato.getAttribute("tipoper");
        
        
//        //Inicio de codigo
//        while(resp != "no"){
//                contapermiso=contapermiso+1;
//                System.out.println("Tu nombre");
//                String nombre=request.getParameter("documento");
//                System.out.println("Hora aprendiz que diligencia");
//                int horapr=entrada.nextInt();
//                //10 min de salida
//                if(horapr == horapr){
//                    horapr=+10;
//                    System.out.println("1");
//                } 
//        }
        
        
        return psemana;
        //datos aprendiz


        
        
      
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
