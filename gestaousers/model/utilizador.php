<?php

 class User {   

    private $codigo;
    private $nome;
    private $telefone;
    private $email;
    private $senha;

    function getCodigo() {
        return $this->codigo;
    }

    function setcodigo($codigo) {
        $this->codigo = $codigo;
    }

    function getNome() {
        return $this->nome;
    }

    function setNome($nome) {
        $this->nome = $nome;
    }

    function getTelefone() {
        return $this->telefone;
    }

    function setTelefone($telefone) {
        $this->telefone = $telefone;
    }

    function getEmail() {
        return $this->email;
    }

    function setEmail($email) {
        $this->email = $email;
    }

    function getSenha() {
        return $this->senha;
    }

    function setSenha($senha) {
        $this->senha = $senha;
    }

    public static function gravar(User $user){
    	require_once '../controller/conexao.php';
        $conexao = conectar();
        $gravar = $conexao->prepare("INSERT INTO utilizadores(nome,telefone,email,senha) VALUES(:nome,:telefone,:email,:senha)");
        $gravar->bindValue(":nome", $user->getNome());
        $gravar->bindValue(":telefone", $user->getTelefone());
        $gravar->bindValue(":email", $user->getEmail());
        $gravar->bindValue(":senha", $user->getSenha());
        
            if ($gravar->execute()) {
                echo "<script>alert('Dados gravados com sucesso!')</script>";
                header('location: ../paginas/utilizadores.php');
            } else {
                echo "<script>alert('Erro durante a gravação dos dados!')</script>";
                header('location: ../paginas/utilizadores.php');
            }
          }

    public static function actualizar(){
        require_once '../controller/conexao.php';
        $conexao = conectar();
        $pesquisar = $conexao->prepare("update utilizadores set nome=:nome, numero=:numero, email=:email, senha=:senha where codigo=:codigo");
        $pesquisar->bindValue(":codigo", $codigo);
        $pesquisar->bindValue(":nome", $nome);
        $pesquisar->bindValue(":numero", $numero);
        $pesquisar->bindValue(":email", $email);
        $pesquisar->bindValue(":senha", $senha);
        
        if ($pesquisar->execute()) {
            echo "<script>alert('Dados actualizados com Sucesso!')</script>";
            header('location: ../paginas/utilizadores.php');
        } else {
            echo "<script>alert('Não foi possível actualizar os dados!')</script>";
            header('location: ../paginas/utilizadores.php');
        }
    }

    public static function apagar($codigo){
        require_once '../controller/conexao.php';
        $conexao = conectar();
        $pesquisar = $conexao->prepare("update utilizadores set status=:in where codigo=:codigo");
        $pesquisar->bindValue(":codigo", $codigo);
        $pesquisar->bindValue(":in", "inactivo");
        if ($pesquisar->execute()) {
            echo "<script>alert('Eliminado com Sucesso!')</script>";
            header('location: ../paginas/utilizadores.php');
        } else {
            echo "<script>alert('Não foi possível eliminar!')</script>";
            header('location: ../paginas/utilizadores.php');
        }

    
    }
    public static function listar(){
        require_once '../controller/conexao.php';
        $conexao = conectar();
        $pesquisar = $conexao->prepare("select * from utilizadores where status = 'activo'");
        $pesquisar->execute();
        return $pesquisar->fetchAll(PDO::FETCH_ASSOC);
    }

     public static function listarUtilizador($codigo){
        require_once '../controller/conexao.php';
        $conexao = conectar();
        $pesquisar = $conexao->prepare("select * from utilizadores where codigo = '$codigo'");
        $pesquisar->execute();
        return $pesquisar->fetchAll(PDO::FETCH_ASSOC);
    }
}
