CREATE TABLE `orders` (
  `idorders` int NOT NULL AUTO_INCREMENT,
  `idclient` int DEFAULT NULL,
  `delivery_date` datetime DEFAULT NULL,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`idorders`),
  KEY `idclient_idx` (`idclient`),
  CONSTRAINT `idclient` FOREIGN KEY (`idclient`) REFERENCES `client` (`idclient`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci