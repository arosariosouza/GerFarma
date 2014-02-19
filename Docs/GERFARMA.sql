CREATE DATABASE  IF NOT EXISTS `gerfarma` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `gerfarma`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: gerfarma
-- ------------------------------------------------------
-- Server version	5.6.12-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cartao`
--

DROP TABLE IF EXISTS `cartao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cartao` (
  `ID_CARTAO` int(11) NOT NULL,
  `BANDEIRA` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_CARTAO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cartao`
--

LOCK TABLES `cartao` WRITE;
/*!40000 ALTER TABLE `cartao` DISABLE KEYS */;
/*!40000 ALTER TABLE `cartao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamento`
--

DROP TABLE IF EXISTS `medicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicamento` (
  `ID_MEDICAMENTO` int(11) NOT NULL,
  `CODIGO_DE_BARRAS` varchar(255) DEFAULT NULL,
  `FABRICANTE` varchar(255) DEFAULT NULL,
  `FORMULA` varchar(255) DEFAULT NULL,
  `GRUPO_MEDICAMENTO` varchar(255) DEFAULT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `PRECO_CUSTO` decimal(38,0) DEFAULT NULL,
  `PRECO_VENDA` decimal(38,0) DEFAULT NULL,
  `TIPO_MEDICAMENTO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_MEDICAMENTO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamento`
--

LOCK TABLES `medicamento` WRITE;
/*!40000 ALTER TABLE `medicamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pessoa` (
  `ID_PESSOA` int(11) NOT NULL AUTO_INCREMENT,
  `TIPO_PESSOA` varchar(20) DEFAULT NULL,
  `BAIRRO` varchar(255) DEFAULT NULL,
  `CEP` varchar(255) DEFAULT NULL,
  `CIDADE` varchar(255) DEFAULT NULL,
  `ENDERECO` varchar(255) DEFAULT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `TELEFONE` varchar(255) DEFAULT NULL,
  `CPF` varchar(255) DEFAULT NULL,
  `CNPJ` varchar(255) DEFAULT NULL,
  `CARGO` varchar(255) DEFAULT NULL,
  `SENHA` varchar(255) DEFAULT NULL,
  `USUARIO` varchar(255) DEFAULT NULL,
  `CRM` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_PESSOA`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` VALUES (1,'Funcionario','Sulacap','215756879','Rio de Janeiro','Rua 6','Marcos','2123499876','65498732188',NULL,'gerente','x','gerente1',NULL),(2,'Funcionario','Freguesia','215676984','Rio de Janeiro','Rua 7','Luis','2126788653','12348909844',NULL,'farmacêutico','x','famarceutico1',NULL),(3,'Funcionario','Barra','21345678','Rio de Janeiro','Rua 8','Tiago','2123456543','19928837766',NULL,'balconista','x','balconista1',NULL),(4,'Funcionario','Leme','21234987','Rio de Janeiro','Rua 9','Marcelo','2120980987','23498765411',NULL,'caixa','x','caixa1',NULL),(5,'PessoaFisica','Bangu','21567567','Rio de Janeiro','Rua A','Cliente01','2128769876','98798798722',NULL,NULL,NULL,NULL,NULL),(6,'PessoaFisica','Padre Miguel','21753000','Rio de Janeiro','Rua B','Cliente02','2126546543','65419535766',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-02-19 14:01:06
