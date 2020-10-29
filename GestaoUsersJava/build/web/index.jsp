<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
        <link rel="stylesheet" type="text/css" href="./css/index.css">
	<meta charset="utf-8">
</head>
<body>
	<div id="geral">
		<header>			
		</header>
		<section>
			<div id="conteudo">

				<div id="info">
				
					<div id="form">
                                            <form method="get" action="logar">
							<p> <input type="text" name="nome" class="campo" size="50" placeholder="Nome" required> </p>
							<p> <input type="password" name="senha" class="campo" size="50" placeholder="Senha" required> </p>
							<p> <button type="submit" name="accao" id="btnEntrar" value="entrar"><strong>Entrar</strong></button> </p>
                                            </form>		
					</div>

				</div>

			</div>	
		</section>

		<footer>	
		</footer>
	</div>
</body>
</html>