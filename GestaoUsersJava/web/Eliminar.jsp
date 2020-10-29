<%-- 
    Document   : Eliminar
    Created on : 25/out/2020, 16:13:39
    Author     : FST
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="dao.UserDao"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            try{
                UserDao dao = new UserDao();
                dao.deleteUser(Integer.parseInt(request.getParameter("codigo")));
                response.sendRedirect("utilizadores.jsp");
            }
            catch(Exception erro){
                throw new RuntimeException("Erro " + erro);
            }
        %>
    </body>
</html>
