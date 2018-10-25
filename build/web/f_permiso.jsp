
<%@page import="modelo.consultas"%>
<%@page import="modelo.permisoSG"%>
<%@page import="modelo.aprendizSG"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>f_Permisos</title>
    </head>
    <body>
        <div>
            <h1>formulario Permiso aprendiz</h1>
            
            <form action="ServletPermiso" enctype="multipart/form-data" method="post">
                <td><input type="number" name="f_numerodocumento" placeholder="documento del aprendiz"></td>
                <!--<td><input type="text" name="f_tipo" placeholder="tipo de permiso"></td>-->
                <%
                
                %>

                <!--seleccion de permiso--->
                <select name="tipoper">  
                    <option>Tipo de permiso</option>
                    <option name="tipoper" value="semana morning">semana morning</option>
                    <option name="tipoper" value="semana tarde">semana tarde</option>
                    <option name="tipoper" value="fin de semana">fin de semana</option>
                    <option name="tipoper" value="extra">extra</option>
                </select>

                <td><input type="date" name="f_fechsal" placeholder="Fecha salida"></td>
                <td><input type="date" name="f_fechingre" placeholder="Fecha ingreso"><td>
                <td><input type="time" name="f_horasal" placeholder="Hora salida"></td>
                <td><input type="time" name="f_horaingre" placeholder="Hora ingreso"></td>
                <td><input type="text" name="f_moti" placeholder="Motivo"></td>
                <td><input type="file" name="f_evidenciaAdjunta" accept="imagen/*"><br><br></td>
                
                
                <input type="submit" name="btn-guardar" value="Guardar">
                
               
                    
               
                <!--<input type="submit" name="btn-permiso" value="btn_permiso">-->
               
                    
            </form>
                
           
        </div>
                
                
                <!--MODULO PARA LLAMAR METODO DE UNA CLASE-->
                
                <!--<form action="ServletPrueba" method="post">
                    
                    <div>
                        <input type="submit" name="btn-permiso" value="btn_permiso">
                    </div>
                    
                </form>-->
                
    </body>
</html>
