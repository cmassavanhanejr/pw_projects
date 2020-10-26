<?php 
session_start();
include '../controller/conexao.php';
$conexao = conectar();

if (isset($_POST['registar'])) {
require_once '../model/utilizador.php';
	$utilizador = new User();
    $utilizador->setNome($_POST['nome']);
    $utilizador->setTelefone($_POST['numero']);
    $utilizador->setEmail($_POST['email']);
    $utilizador->setSenha($_POST['senha']);   
    User::gravar($utilizador);
}

if (isset($_GET['delete'])) {
    require_once '../model/utilizador.php';
    $codigo = $_GET['delete'];
    User::apagar($codigo);
}

if (isset($_GET['update'])) {
    require_once '../model/utilizador.php';
    $codigo = $_GET['update'];
    User::listarUtilizador($codigo);
}

// if (isset($_POST['login'])) {
//     $numero = $_POST['numero'];
//     $senha = $_POST['senha'];
//     $users = $conexao->prepare("select * from utilizadores where numero='$numero' and senha='$senha'");
//     $usuarios->execute();
//     $us = $usuarios->fetchAll();
// }

 ?>