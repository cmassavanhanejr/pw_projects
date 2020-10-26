<?php 
 ?>

 <!DOCTYPE html>
 <html>
 <head>
 	<title>Gestão de utilizadores</title>
 	<link rel="stylesheet" type="text/css" href="../css/utilizadores.css">
 	<meta charset="utf-8">
 </head>
 <body>
 	<div id="geral">
 		<header></header>
 		<section>
 			<div id="conteudo">

				<div id="info">
				
					<div id="form">
						<form>
							<p> <input type="text" name="nome" class="campo" size="50" placeholder="Nome completo"> </p>
							<p> <input type="text" name="numero" class="campo" size="50" placeholder="Número"> </p>
							<p> <input type="email" name="email" class="campo" size="50" placeholder="Email"> </p>
							<p> <input type="password" name="senha" class="campo" size="50" placeholder="Senha"> </p>
							<p> <input type="password" name="confirmarSenha" class="campo" size="50" placeholder="Confirmar Senha"> </p>
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
							<th colspan="2">Acções</th>

						</tr>
					</thead>
					<tbody>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td> <a href="#">Editar</a></td> <td><a href="#">Apagar</a></td>
						</tr>
						
					</tbody>
				</table>

				</div>


			</div>

 		</section>
 		<footer></footer> 	
 	</div>
 </body>
 </html>