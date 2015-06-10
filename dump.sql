-- MySQL dump 10.13  Distrib 5.6.24, for Win32 (x86)
--
-- Host: localhost    Database: newsbase
-- ------------------------------------------------------
-- Server version	5.6.24

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
-- Table structure for table `pages`
--

DROP TABLE IF EXISTS `pages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pages` (
  `id` char(10) NOT NULL DEFAULT '',
  `parentid` char(10) DEFAULT NULL,
  `title` char(70) NOT NULL,
  `title4menu` char(50) NOT NULL,
  `user` int(11) NOT NULL,
  `date` date NOT NULL,
  `maintext` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pages`
--

LOCK TABLES `pages` WRITE;
/*!40000 ALTER TABLE `pages` DISABLE KEYS */;
INSERT INTO `pages` VALUES ('main',NULL,'Главная страница','Главная',0,'2015-04-01','Текст главной страницы'),('n1','main','Экономика и бизнес','Экономика',0,'2015-04-01','Текст1'),('n11','n1','Экономичская ситуация','Экономическая ситуация',0,'2015-04-02','Оставляет желать лучшего'),('n12','n1','Курсы валют','Курсы валют',0,'2015-04-01','Курсы валют снова поменялись'),('n13','n13','title','title4menu',0,'2015-04-02','tekst tekst tekst'),('n14','n1','sssssssssssss','assssssssss',0,'2015-04-02','blablabla'),('n2','main','Политика','Политика',0,'2015-04-01','Текст2'),('n21','n2','Предвыборная политика','Выборы',0,'2015-04-03','И снова выборы'),('n22','n2','Политическая ситуация','Политическая ситуация',0,'2015-04-11','Политическая ситуация в стране следующая...'),('n3','main','Спорт и туризм','Спорт',0,'2015-04-01','Текст3'),('n31','n3','Охота','Охота',0,'2015-04-23','Текст Охота'),('n32','n3','Рыбалка','Рыбалка',0,'2015-04-17','Текст рыбалка'),('n4','main','Prochee','Prochee',0,'2015-04-05','blablabla');
/*!40000 ALTER TABLE `pages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `idu` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(20) NOT NULL,
  `lastname` char(30) NOT NULL,
  `password` char(40) NOT NULL,
  `role` int(11) DEFAULT NULL,
  `email` char(40) NOT NULL,
  PRIMARY KEY (`idu`),
  UNIQUE KEY `unique_idu` (`idu`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'roma','roma','roma',0,'roma@ro.ru'),(2,'admin','admin','admin',1,'admin@ro.ru');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-04-25 18:20:12
