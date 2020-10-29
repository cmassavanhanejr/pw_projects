<%-- 
    Document   : Cadastro
    Created on : 25/out/2020, 16:11:47
    Author     : FST
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" 
        import="Model.Usuario"
        import="dao.UserDao" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        try{
            Usuario user = new Usuario();
            UserDao dao = new UserDao();
            user.setNome(request.getParameter("nome"));
            user.setSenha(request.getParameter("senha"));
            user.setEmail(request.getParameter("email"));
            user.setTelefone(request.getParameter("telefone"));
            dao.addUser(user);
            response.sendRedirect("utilizadores.jsp");
        }
        catch(Exception erro){
            throw new RuntimeException("Erro " + erro);
        }
        %>
    </body>
</html>
