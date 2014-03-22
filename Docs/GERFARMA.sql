CREATE DATABASE  IF NOT EXISTS `gerfarma` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `gerfarma`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: gerfarma
-- ------------------------------------------------------
-- Server version	5.6.16

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
  `BANDEIRA` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_CARTAO`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cartao`
--

LOCK TABLES `cartao` WRITE;
/*!40000 ALTER TABLE `cartao` DISABLE KEYS */;
INSERT INTO `cartao` VALUES (1,'Visa'),(2,'MasterCard');
/*!40000 ALTER TABLE `cartao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_venda`
--

DROP TABLE IF EXISTS `item_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_venda` (
  `ID_ITEM_VENDA` int(11) NOT NULL AUTO_INCREMENT,
  `QUANTIDADE` int(11) DEFAULT NULL,
  `VALOR_VENDIDO` double DEFAULT NULL,
  `MEDICAMENTO_ID_MEDICAMENTO` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_ITEM_VENDA`),
  KEY `FK_ITEM_VENDA_MEDICAMENTO_ID_MEDICAMENTO` (`MEDICAMENTO_ID_MEDICAMENTO`),
  CONSTRAINT `FK_ITEM_VENDA_MEDICAMENTO_ID_MEDICAMENTO` FOREIGN KEY (`MEDICAMENTO_ID_MEDICAMENTO`) REFERENCES `medicamento` (`ID_MEDICAMENTO`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_venda`
--

LOCK TABLES `item_venda` WRITE;
/*!40000 ALTER TABLE `item_venda` DISABLE KEYS */;
INSERT INTO `item_venda` VALUES (1,1,4,1);
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
  `CODIGO_DE_BARRAS` varchar(255) DEFAULT NULL,
  `FABRICANTE` varchar(255) DEFAULT NULL,
  `FORMULA` varchar(255) DEFAULT NULL,
  `GRUPO_MEDICAMENTO` varchar(255) DEFAULT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `PRECO_CUSTO` decimal(38,0) DEFAULT NULL,
  `PRECO_VENDA` decimal(38,0) DEFAULT NULL,
  `TIPO_MEDICAMENTO` varchar(255) DEFAULT NULL,
  `QUANTIDADE_ESTOQUE` int(11) DEFAULT NULL,
  `QUANTIDADE_ESTOQUE_MINIMO` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_MEDICAMENTO`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamento`
--

LOCK TABLES `medicamento` WRITE;
/*!40000 ALTER TABLE `medicamento` DISABLE KEYS */;
INSERT INTO `medicamento` VALUES (1,'1234124','Medley','Dipirona','Genérico','Dipirona com 10 comprimidos',3,4,'Não Controlado',49,20),(2,'1232333','Roche','Rivotril','Marca','Clonazepam',7,20,'Controlado',10,5),(3,'1231312','Eurofarma','Etinilestradiol 0,035 mg; Acetato de ciproterona 2,000 mg','Similar','Selene',15,19,'Não Controlado',38,10),(4,'123452345','Medley','Sorinol 350mg','Marca','Sorisal',4,2,'Não Controlado',0,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` VALUES (1,'Funcionario','Sulacap','215756879','Rio de Janeiro','Rua 6','Marcos','2123499876','65498732188',NULL,'gerente','x','gerente1',NULL),(2,'Funcionario','Freguesia','215676984','Rio de Janeiro','Rua 7','Luis','2126788653','12348909844',NULL,'farmacêutico','x','famarceutico1',NULL),(3,'Funcionario','Barra','21345678','Rio de Janeiro','Rua 8','Tiago','2123456543','19928837766',NULL,'balconista','x','balconista1',NULL),(4,'Funcionario','Leme','21234987','Rio de Janeiro','Rua 9','Marcelo','2120980987','23498765411',NULL,'caixa','x','caixa1',NULL),(5,'PessoaFisica','Bangu','21567567','Rio de Janeiro','Rua A','Cliente01','2128769876','98798798722',NULL,NULL,NULL,NULL,NULL),(6,'PessoaFisica','Padre Miguel','21753000','Rio de Janeiro','Rua B','Cliente02','2126546543','65419535766',NULL,NULL,NULL,NULL,NULL),(9,'Medico','Bangu','2312313','Rio de Janeiro','Rua Carmerindo','Ricardo Fonseca','1231233',NULL,NULL,NULL,NULL,NULL,'1231'),(10,'Medico','Catete','324234','Rio de Janeiro','Rua Pinto Florido','Carlos de Almeida','23423',NULL,NULL,NULL,NULL,NULL,'3424');
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
  `DATA_HORA_PREVENDA` datetime DEFAULT NULL,
  `DESCONTO` bigint(20) DEFAULT NULL,
  `CLIENTE_ID_PESSOA` int(11) DEFAULT NULL,
  `FUNCIONARIO_ID_PESSOA` int(11) DEFAULT NULL,
  `MEDICO_ID_PESSOA` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_PREVENDA`),
  KEY `FK_pre_venda_MEDICO_ID_PESSOA` (`MEDICO_ID_PESSOA`),
  KEY `FK_pre_venda_CLIENTE_ID_PESSOA` (`CLIENTE_ID_PESSOA`),
  KEY `FK_pre_venda_FUNCIONARIO_ID_PESSOA` (`FUNCIONARIO_ID_PESSOA`),
  CONSTRAINT `FK_pre_venda_CLIENTE_ID_PESSOA` FOREIGN KEY (`CLIENTE_ID_PESSOA`) REFERENCES `pessoa` (`ID_PESSOA`),
  CONSTRAINT `FK_pre_venda_FUNCIONARIO_ID_PESSOA` FOREIGN KEY (`FUNCIONARIO_ID_PESSOA`) REFERENCES `pessoa` (`ID_PESSOA`),
  CONSTRAINT `FK_pre_venda_MEDICO_ID_PESSOA` FOREIGN KEY (`MEDICO_ID_PESSOA`) REFERENCES `pessoa` (`ID_PESSOA`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pre_venda`
--

LOCK TABLES `pre_venda` WRITE;
/*!40000 ALTER TABLE `pre_venda` DISABLE KEYS */;
INSERT INTO `pre_venda` VALUES (1,'2014-03-22 10:06:38',0,10,1,9);
/*!40000 ALTER TABLE `pre_venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pre_venda_item_venda`
--

DROP TABLE IF EXISTS `pre_venda_item_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pre_venda_item_venda` (
  `PreVenda_ID_PREVENDA` int(11) NOT NULL,
  `itemsVenda_ID_ITEM_VENDA` int(11) NOT NULL,
  PRIMARY KEY (`PreVenda_ID_PREVENDA`,`itemsVenda_ID_ITEM_VENDA`),
  KEY `FK_pre_venda_ITEM_VENDA_itemsVenda_ID_ITEM_VENDA` (`itemsVenda_ID_ITEM_VENDA`),
  CONSTRAINT `FK_pre_venda_ITEM_VENDA_itemsVenda_ID_ITEM_VENDA` FOREIGN KEY (`itemsVenda_ID_ITEM_VENDA`) REFERENCES `item_venda` (`ID_ITEM_VENDA`),
  CONSTRAINT `FK_pre_venda_ITEM_VENDA_PreVenda_ID_PREVENDA` FOREIGN KEY (`PreVenda_ID_PREVENDA`) REFERENCES `pre_venda` (`ID_PREVENDA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pre_venda_item_venda`
--

LOCK TABLES `pre_venda_item_venda` WRITE;
/*!40000 ALTER TABLE `pre_venda_item_venda` DISABLE KEYS */;
INSERT INTO `pre_venda_item_venda` VALUES (1,1);
/*!40000 ALTER TABLE `pre_venda_item_venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-03-22 10:12:03
