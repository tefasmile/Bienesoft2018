
<%@page import="modelo.consultas"%>
<%@page import="modelo.permisoSG"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            Permisos para coordinador
        </title>
    </head>
    <body>
        <table>
            <tr bgcolor="#A9CCE3" border="1">
                <th colspan="9" class="center">Tabla permisos VISTA COORDINADOR</th>
            </tr>
            <tr bgcolor="skyblue">
                <th>ID</th>
                <th class="center">Numero de documento del aprendiz</th>
                <th class="center">Tipo de permiso</th>
                <th class="center">Fecha de salida</th>
                <th class="center">Fecha de ingreso</th>
                <th class="center">Hora de salida</th>
                <th class="center">Hora de ingreso</th>
                <th class="center">Fecha de ingreso real</th>
                <th class="center">Hora ingreso real</th>
                <th class="center">Fecha de salida real</th>
                <th class="center">Hora de salida real</th>
                <th class="center">Observacion</th>
                <th class="center">Motivo</th>
                <th class="center">Estado</th>
                <th class="center">Autoriza</th>
                <th class="center">Evidencia</th>
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
                <td><input readonly type="number" name="t_Id" value="<%=x.getPer_ID()%>"></td>
                <td><input readonly type="number" name="t_numerodocumento" value="<%=x.getPer_Aprendiz_Apr_documento()%>"></td>
                <td><input readonly type="text" name="t_tipo" value="<%=x.getPer_tipo()%>"></td>
                <td><input readonly type="date" name="t_fechsal" value="<%=x.getPer_fecha_salida()%>"></td>
                <td><input readonly type="date" name="t_fechingre" value="<%=x.getPer_fecha_ingreso()%>"></td>
                <td><input readonly type="time" name="t_horasal" value="<%=x.getPer_hora_Salida()%>"></td>
                <td><input readonly type="time" name="t_horaingre" value="<%=x.getPer_hora_ingreso()%>"></td>
                <td><input readonly type="date" name="t_freal" value="<%=x.getPer_fecha_ingresoReal()%>"></td>
                <td><input readonly type="time" name="t_hreal" value="<%=x.getPer_fecha_ingreso()%>"></td>
                <td><input readonly type="date" name="t_fsreal" value="<%=x.getPer_hora_Salida()%>"></td>
                <td><input readonly type="time" name="t_hsreal" value="<%=x.getPer_hora_salidaReal()%>"></td>
                <td><input readonly type="text" name="t_obser" value="<%=x.getPer_observacion_permiso_llegada()%>"></td>
                <td><input readonly type="text" name="t_moti" value="<%=x.getPer_motivo()%>"></td>
                <td><input type="text" name="t_estado" value="<%=x.getPer_estado()%>"></td>
                <td><input type="text" name="t_autoriza" value="<%=x.getPer_autoriza()%>"></td> 
                <th><img src="<%=x.getPer_evidenciaAdjunta()%>" name="t_evidenciaAdjunta" width="60" height="60"/></th>
                <td style="display: none;"><input type="text" name="t_evidenciaAdjunta" value="<%=x.getPer_evidenciaAdjunta()%>"></td>
                

                <td><input type="submit" name="btn-coordupdate" value="Actualizar"></td>
                <td><input type="submit" name="btn-coordeliminar" value="Eliminar"></td>

                </tr>
            </form>
            
          
            
            <%
                }
            %>
            
        </table>
    </body>
</html>
