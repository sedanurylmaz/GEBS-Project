-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: gebs
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `policereport`
--

DROP TABLE IF EXISTS `policereport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `policereport` (
  `policeID` int NOT NULL,
  `CaseNO` int NOT NULL,
  `ArrestDate` varchar(45) NOT NULL,
  `Details` varchar(45) NOT NULL,
  `LastSeen` varchar(45) NOT NULL,
  `CaughtID` int NOT NULL,
  PRIMARY KEY (`policeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `policereport`
--

LOCK TABLES `policereport` WRITE;
/*!40000 ALTER TABLE `policereport` DISABLE KEYS */;
INSERT INTO `policereport` VALUES (1,7989,'Missing','Not Authorized!','5 Days ago',1006),(2,7990,'Missing','Not Authorized!','2 Years ago',1003),(3,7991,'24/04/22','Not Authorized!','In Prison',1009),(4,7992,'Missing','Not Authorized!','19 Years go',1007),(5,7993,'05/07/76','Not Authorized!','In Prison',1010),(6,7994,'Missing','Not Authorized!','2 Months ago',1002),(7,7995,'11/15/98','Not Authorized!','In Prison',1004),(8,7996,'Missing','Not Authorized!','9 Months ago',1008),(9,7997,'16/04/02','Not Authorized!','In Prison',1005),(10,7998,'11/09/16','Not Authorized!','In Prison',1001);
/*!40000 ALTER TABLE `policereport` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-12 22:48:23
