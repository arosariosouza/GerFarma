CREATE DATABASE  IF NOT EXISTS `gerfarma` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `gerfarma`;
-- MySQL dump 10.13  Distrib 5.6.11, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: gerfarma
-- ------------------------------------------------------
-- Server version	5.6.11

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
  `ID_CARTAO` int(11) NOT NULL AUTO_INCREMENT,
  `BANDEIRA` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_CARTAO`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cartao`
--

LOCK TABLES `cartao` WRITE;
/*!40000 ALTER TABLE `cartao` DISABLE KEYS */;
INSERT INTO `cartao` VALUES (1,'Visa'),(2,'Master'),(3,'Diners'),(4,'Elo');
/*!40000 ALTER TABLE `cartao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `ID_PESSOA` int(11) NOT NULL AUTO_INCREMENT,
  `CPF` varchar(11) DEFAULT NULL,
  `NOME` varchar(60) NOT NULL,
  `ENDERECO` varchar(100) DEFAULT NULL,
  `BAIRRO` varchar(50) DEFAULT NULL,
  `CIDADE` varchar(50) DEFAULT NULL,
  `CEP` varchar(8) DEFAULT NULL,
  `TELEFONE` varchar(11) DEFAULT NULL,
  `CARGO` varchar(45) DEFAULT NULL,
  `USUARIO` varchar(10) DEFAULT NULL,
  `SENHA` varchar(45) DEFAULT NULL,
  `CRM` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID_PESSOA`),
  UNIQUE KEY `NOME_UNIQUE` (`NOME`),
  UNIQUE KEY `CPF_UNIQUE` (`CPF`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_pedido`
--

DROP TABLE IF EXISTS `item_pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_pedido` (
  `ID_ITEM_PEDIDO` int(11) NOT NULL AUTO_INCREMENT,
  `ID_PEDIDO` int(11) NOT NULL,
  `ID_MEDICAMENTO` int(11) NOT NULL,
  `QUANTIDADE` int(11) NOT NULL,
  PRIMARY KEY (`ID_ITEM_PEDIDO`),
  KEY `fk_ITEM_PEDIDO_PEDIDO` (`ID_PEDIDO`),
  KEY `fk_ITEM_PEDIDO_MEDICAMENTO` (`ID_MEDICAMENTO`),
  CONSTRAINT `fk_ITEM_PEDIDO_PEDIDO` FOREIGN KEY (`ID_PEDIDO`) REFERENCES `pedido` (`ID_PEDIDO`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ITEM_PEDIDO_MEDICAMENTO` FOREIGN KEY (`ID_MEDICAMENTO`) REFERENCES `medicamento` (`ID_MEDICAMENTO`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_pedido`
--

LOCK TABLES `item_pedido` WRITE;
/*!40000 ALTER TABLE `item_pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_venda`
--

DROP TABLE IF EXISTS `item_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_venda` (
  `ID_ITEM_VENDA` int(11) NOT NULL AUTO_INCREMENT,
  `ID_PRE_VENDA` int(11) DEFAULT NULL,
  `ID_VENDA` int(11) DEFAULT NULL,
  `ID_MEDICAMENTO` int(11) NOT NULL,
  `QUANTIDADE` int(11) NOT NULL,
  `VALOR_VENDIDO` decimal(10,2) NOT NULL,
  PRIMARY KEY (`ID_ITEM_VENDA`),
  KEY `fk_ITEM_VENDA_PRE_VENDA` (`ID_PRE_VENDA`),
  KEY `fk_ITEM_VENDA_VENDA` (`ID_VENDA`),
  KEY `fk_ITEM_VENDA_MEDICAMENTO` (`ID_MEDICAMENTO`),
  CONSTRAINT `fk_ITEM_VENDA_MEDICAMENTO` FOREIGN KEY (`ID_MEDICAMENTO`) REFERENCES `medicamento` (`ID_MEDICAMENTO`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ITEM_VENDA_PRE_VENDA` FOREIGN KEY (`ID_PRE_VENDA`) REFERENCES `pre_venda` (`ID_PREVENDA`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ITEM_VENDA_VENDA` FOREIGN KEY (`ID_VENDA`) REFERENCES `venda` (`ID_VENDA`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_venda`
--

LOCK TABLES `item_venda` WRITE;
/*!40000 ALTER TABLE `item_venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamento`
--

DROP TABLE IF EXISTS `medicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicamento` (
  `ID_MEDICAMENTO` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(50) NOT NULL,
  `FORMULA` varchar(45) NOT NULL,
  `FABRICANTE` varchar(45) NOT NULL,
  `PRECO_VENDA` decimal(10,2) NOT NULL,
  `PRECO_CUSTO` decimal(10,2) NOT NULL,
  `CODIGO_DE_BARRAS` varchar(15) DEFAULT NULL,
  `TIPO_MEDICAMENTO` varchar(10) NOT NULL,
  `GRUPO_MEDICAMENTO` varchar(10) NOT NULL,
  PRIMARY KEY (`ID_MEDICAMENTO`),
  UNIQUE KEY `NOME_UNIQUE` (`NOME`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamento`
--

LOCK TABLES `medicamento` WRITE;
/*!40000 ALTER TABLE `medicamento` DISABLE KEYS */;
INSERT INTO `medicamento` VALUES (1,'Dipirona','Paracetamol','Bayer',3.00,1.00,'12345678','NC','De marca');
/*!40000 ALTER TABLE `medicamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedido` (
  `ID_PEDIDO` int(11) NOT NULL AUTO_INCREMENT,
  `ID_FORNECEDOR` int(11) NOT NULL,
  `TITULO` varchar(50) DEFAULT NULL,
  `DATA_HORA_PEDIDO` datetime DEFAULT NULL,
  PRIMARY KEY (`ID_PEDIDO`),
  KEY `fk_PEDIDO_FORNECEDOR` (`ID_FORNECEDOR`),
  CONSTRAINT `fk_PEDIDO_FORNECEDOR` FOREIGN KEY (`ID_FORNECEDOR`) REFERENCES `pessoa` (`ID_PESSOA`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pessoa` (
  `ID_PESSOA` int(11) NOT NULL AUTO_INCREMENT,
  `CNPJ` varchar(14) DEFAULT NULL,
  `CPF` varchar(11) DEFAULT NULL,
  `NOME` varchar(60) NOT NULL,
  `ENDERECO` varchar(100) DEFAULT NULL,
  `BAIRRO` varchar(50) DEFAULT NULL,
  `CIDADE` varchar(50) DEFAULT NULL,
  `CEP` varchar(8) DEFAULT NULL,
  `TELEFONE` varchar(11) DEFAULT NULL,
  `TIPO_PESSOA` varchar(20) NOT NULL,
  `CARGO` varchar(45) DEFAULT NULL,
  `USUARIO` varchar(10) DEFAULT NULL,
  `SENHA` varchar(45) DEFAULT NULL,
  `CRM` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID_PESSOA`),
  UNIQUE KEY `NOME_UNIQUE` (`NOME`),
  UNIQUE KEY `CPF_UNIQUE` (`CPF`),
  UNIQUE KEY `CNPJ_UNIQUE` (`CNPJ`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` VALUES (1,NULL,'11111111111','Allan Carlos','Rua 6','Sulacap','Cidade','21750000','99999999','PessoaFisica',NULL,NULL,NULL,NULL),(2,'04927171000179',NULL,'Dois Irmãos Ltda','Rua 8','Bangu','Rio de Janeiro','12344000','66666666','PessoaJuridica',NULL,NULL,NULL,NULL),(3,NULL,'12312312398','Joaquin Carvalho dos Santos','Rua 3','Padre Miguel','Rio de Janeiro','98234000','33333333','Funcionario','balconista','5467','x',NULL),(4,NULL,'12436768665','Jonas','Rua 8','Madureira','Rio de Janeiro','12348344','93899999','Medico',NULL,NULL,NULL,'12534');
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pre_venda`
--

DROP TABLE IF EXISTS `pre_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pre_venda` (
  `ID_PREVENDA` int(11) NOT NULL AUTO_INCREMENT,
  `ID_FUNCIONARIO` int(11) NOT NULL,
  `ID_CLIENTE` int(11) DEFAULT NULL,
  `ID_MEDICO` int(11) DEFAULT NULL,
  `DATA_HORA_PREVENDA` datetime NOT NULL,
  `DESCONTO` decimal(10,0) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID_PREVENDA`),
  KEY `fk_PREVENDA_FUNCIONARIO` (`ID_FUNCIONARIO`),
  KEY `fk_PREVENDA_CLIENTE` (`ID_CLIENTE`),
  KEY `fk_PREVENDA_MEDICO` (`ID_MEDICO`),
  CONSTRAINT `fk_PREVENDA_CLIENTE` FOREIGN KEY (`ID_CLIENTE`) REFERENCES `pessoa` (`ID_PESSOA`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_PREVENDA_FUNCIONARIO` FOREIGN KEY (`ID_FUNCIONARIO`) REFERENCES `pessoa` (`ID_PESSOA`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_PREVENDA_MEDICO` FOREIGN KEY (`ID_MEDICO`) REFERENCES `pessoa` (`ID_PESSOA`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pre_venda`
--

LOCK TABLES `pre_venda` WRITE;
/*!40000 ALTER TABLE `pre_venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `pre_venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venda` (
  `ID_VENDA` int(11) NOT NULL AUTO_INCREMENT,
  `ID_FUNCIONARIO` int(11) NOT NULL,
  `ID_PRE_VENDA` int(11) DEFAULT NULL,
  `ID_CARTAO` int(11) DEFAULT NULL,
  `VALOR_PAGO` decimal(10,0) DEFAULT NULL,
  `DATA_HORA_VENDA` datetime NOT NULL,
  PRIMARY KEY (`ID_VENDA`),
  KEY `fk_VENDA_PREVENDA` (`ID_PRE_VENDA`),
  KEY `fk_VENDA_FUNCIONARIO` (`ID_FUNCIONARIO`),
  KEY `fk_VENDA_CARTAO` (`ID_CARTAO`),
  CONSTRAINT `fk_VENDA_PREVENDA` FOREIGN KEY (`ID_PRE_VENDA`) REFERENCES `pre_venda` (`ID_PREVENDA`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_VENDA_FUNCIONARIO` FOREIGN KEY (`ID_FUNCIONARIO`) REFERENCES `pessoa` (`ID_PESSOA`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_VENDA_CARTAO` FOREIGN KEY (`ID_CARTAO`) REFERENCES `cartao` (`ID_CARTAO`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-09-30 17:55:45
