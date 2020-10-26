<?php
static $conexao;
function conectar() {
    $dbname = "gestaousers";
    $host = "localhost:3308";
    $user = "root";
    $password = "";
    try {
        $conexao = new PDO("mysql:host=$host;dbname=$dbname", $user, $password);
    } catch (Exception $ex) {
        echo $ex->getMessage();
    }
    return $conexao;
}
