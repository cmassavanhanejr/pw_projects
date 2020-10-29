<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="Model.Usuario" %>
<%@ page import="dao.UserDao" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>

<head>
    <title>Gestao de utilizadores</title>
    <link rel="stylesheet" type="text/css" href="./css/utilizadores.css">
    <meta charset="utf-8">
</head>

<body>
    <% %>
    <div id="geral">
        <header></header>
        <section>
            <div id="conteudo">
                <div id="info">
                    <div id="form">
                        <a href="./index.jsp" id="log"> Login </a>
                        <form method="POST" action="Cadastro.jsp">
                            <p> <input type="text" name="nome" class="campo" size="50" placeholder="Nome completo" required> </p>
                            <p> <input type="text" name="telefone" class="campo" size="50" placeholder="Telefone" required> </p>
                            <p> <input type="email" name="email" class="campo" size="50" placeholder="Email" required> </p>
                            <p> <input type="password" name="senha" class="campo" size="50" placeholder="Senha" required> </p>
                            <p> <button type="submit" name="registar" id="btnRegistar"><strong>Registar</strong></button> </p>
                        </form>
                    </div>
                    <br> <br>
                    <table>
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nome</th>
                                <th>Telefone</th>
                                <th>Email</th>
                                <th colspan ="2" >Accoes</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                              UserDao dao = new UserDao();
                              ArrayList<Usuario> lista = dao.getAllUsers();
                              for(int num = 0;num < lista.size(); num++){
                                out.print("<tr>");
                                out.print("<td>"+ lista.get(num).getId()+"</td>");
                                out.print("<td>"+ lista.get(num).getNome()+"</td>");
                                out.print("<td>"+ lista.get(num).getTelefone()+"</td>");
                                out.print("<td>"+ lista.get(num).getEmail()+"</td>");
                                out.print("<td><a href='TelaUpdate.jsp?codigo="+lista.get(num).getId()+"&nome="+ lista.get(num).getNome()+"&telefone="+lista.get(num).getTelefone()+"&email="+lista.get(num).getEmail()+"&senha="+lista.get(num).getSenha()+"'>Atualizar</a></td>");
                                out.print("<td><a href='Eliminar.jsp?codigo="+lista.get(num).getId()+"'>Eliminar</a></td>");
                                out.print("</tr>");}
                              %>
                        </tbody>
                    </table>
                </div>
            </div>
        </section>
        <footer></footer>
    </div>
</body>

</html>