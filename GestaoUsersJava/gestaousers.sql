-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 27-Out-2020 às 08:16
-- Versão do servidor: 8.0.21
-- versão do PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `gestaousers`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadusers`
--

DROP TABLE IF EXISTS `cadusers`;
CREATE TABLE IF NOT EXISTS `cadusers` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(30) NOT NULL,
  `Senha` varchar(30) NOT NULL,
  `Telefone` varchar(15) NOT NULL,
  `Email` varchar(40) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `cadusers`
--

INSERT INTO `cadusers` (`ID`, `Nome`, `Senha`, `Telefone`, `Email`) VALUES
(1, 'Faztudo', '1234', '849900000', 'faztudo@exemplo.com'),
(4, 'Aula', 'aula', '010101010', 'Aula@uem.ac.mz');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
