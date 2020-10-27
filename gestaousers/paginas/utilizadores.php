<?php
	include_once ('myController.php');
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

		<div class="mensagem">
			

		</div>
	
 			<div id="conteudo">

				<div id="info">
				
					<div id="form">


						<form method="POST" action="myController.php">
							<p> <input type="text" name="nome" class="campo" size="50" placeholder="Nome completo"> </p>
							<p> <input type="number" name="numero" class="campo" size="50" placeholder="Número"> </p>
							<p> <input type="email" name="email" class="campo" size="50" placeholder="Email"> </p>
							<p> <input type="password" name="senha" class="campo" size="50" placeholder="Senha"> </p>
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
						 <?php
                        require_once '../model/utilizador.php';
                        foreach (User::listar() as $registo):
                            ?>
						<tr>
							<td><?php echo $registo['codigo'] ?></td>
							<td><?php echo $registo['nome'] ?></td>
							<td><?php echo $registo['telefone'] ?></td>
							<td><?php echo $registo['email'] ?></td>
							<td> <a href="myController.php?update=<?php echo $registo['codigo']; ?>">Editar</a></td> <td><a href="myController.php?delete=<?php echo $registo['codigo']; ?>">Apagar</a></td>
						</tr>
						<?php
                        endforeach;
                         ?>
					</tbody>
				</table>

				</div>


			</div>

 		</section>
 		<footer></footer> 	
 	</div>
 </body>
 </html>