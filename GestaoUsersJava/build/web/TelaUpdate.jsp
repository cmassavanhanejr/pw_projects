<%-- 
    Document   : TelaUpdate
    Created on : 25/out/2020, 16:39:34
    Author     : FST
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" 
        import="Model.Usuario"
        import="dao.UserDao" %>
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
                        <form method="POST" action="Atualizar.jsp">
                            <p> <input type="text" name="codigo" class="campo" size="50" placeholder="codigo" value="<%= request.getParameter("codigo") %>"> </p>
                            <p> <input type="text" name="nome" class="campo" size="50" placeholder="Nome completo" value="<%= request.getParameter("nome") %>" required> </p>
                            <p> <input type="text" name="telefone" class="campo" size="50" placeholder="telefone" value="<%= request.getParameter("telefone") %>" required> </p>
                            <p> <input type="email" name="email" class="campo" size="50" placeholder="Email" value="<%= request.getParameter("email") %>" required> </p>
                            <p> <input type="password" name="senha" class="campo" size="50" placeholder="Senha" value="<%= request.getParameter("senha") %>" required> </p>
                            <p> <button type="submit" name="atualizar" id="btnRegistar"><strong>Atualizar</strong></button> </p>
                        </form>
                    </div>
                </div>
            </div>
        </section>
        <footer></footer>
    </div>
</body>

</html>