<%@page import="modelo.consultas"%>
<%@page import="modelo.permisoSG"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            Lista de permisos de aprendices
        </title>
    </head>
    <body>
        <table>
            <tr bgcolor="#A9CCE3" border="1">
                <th colspan="9" class="center">Lista de permisos de aprendices AUTORIZADOS</th>
            </tr>
            <tr bgcolor="skyblue">
                <th>ID</th>
                <th class="center">Numero de documento del aprendiz</th>
                <th class="center">Tipo de permiso</th>
                <th class="center">Fecha de salida</th>
                <th class="center">Hora de salida</th>
                <!--<th class="center">Hora de salida</th>-->
                <!--<th class="center">Hora de ingreso</th>-->
                <!--<th class="center">Fecha de ingreso real</th>-->
                <!--<th class="center">Hora ingreso real</th>-->
                <!--<th class="center">Fecha de salida real</th>-->
                <!--<th class="center">Hora de salida real</th>-->
                <!--<th class="center">Observacion</th>>-->
                <!--<th class="center">Motivo</th>-->
                <th class="center">Motivo</th>
                <th class="center">Estado</th>
                <!--<th class="center">Evidencia</th>-->
            </tr>
            
            <%
                ArrayList <permisoSG> listdat = new ArrayList<>();
                consultas con = new consultas();
                listdat = con.consultarPermiso();
                permisoSG x = new permisoSG();
                
                for(int i = 0; i< listdat.size(); i++){
                x = listdat.get(i);
            %>
            
           
            <form action="ServletPermiso" enctype="multipart/form-data" method="post">
                <tr>
                <td><input type="number" name="t_Id" value="<%=x.getPer_ID()%>" readonly></td>
                <td><input type="number" name="t_numerodocumento" value="<%=x.getPer_Aprendiz_Apr_documento()%>"></td>
                <td><input type="text" name="t_tipo" value="<%=x.getPer_tipo()%>"></td>
                <td><input type="date" name="t_fechsal" value="<%=x.getPer_fecha_salida()%>"></td>
                <td><input type="time" name="t_horasal" value="<%=x.getPer_hora_Salida()%>"></td>
                <td><input type="text" name="t_moti" value="<%=x.getPer_motivo()%>"></td>
                <td><input type="text" name="t_estado" value="<%=x.getPer_estado()%>"></td>

                <td><input type="submit" name="btn-autorizado" value="Autorizado"></td>
                
                </tr>
            </form>
          
            
            <%
                }
            %>
            
        </table>
    </body>
</html>