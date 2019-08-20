/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : tourism2

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-08-19 18:26:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bus
-- ----------------------------
DROP TABLE IF EXISTS `bus`;
CREATE TABLE `bus` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `bname` varchar(255) DEFAULT NULL,
  `bstarttime` datetime DEFAULT NULL,
  `bendtime` datetime DEFAULT NULL,
  `bnum` varchar(255) DEFAULT NULL,
  `sid` int(11) NOT NULL,
  PRIMARY KEY (`bid`),
  KEY `sid` (`sid`),
  CONSTRAINT `bus_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `scenic` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for hotel
-- ----------------------------
DROP TABLE IF EXISTS `hotel`;
CREATE TABLE `hotel` (
  `hid` int(11) NOT NULL AUTO_INCREMENT,
  `hname` varchar(255) DEFAULT NULL,
  `hcomment` varchar(255) DEFAULT NULL,
  `hprice` double DEFAULT NULL,
  `sid` int(10) NOT NULL,
  `himage` blob,
  `hstar` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`hid`),
  KEY `sid` (`sid`),
  CONSTRAINT `hotel_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `scenic` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) DEFAULT NULL,
  `pprice` double DEFAULT NULL,
  `pnum` int(11) DEFAULT NULL,
  `pimage` blob,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for scenic
-- ----------------------------
DROP TABLE IF EXISTS `scenic`;
CREATE TABLE `scenic` (
  `sid` int(10) NOT NULL AUTO_INCREMENT,
  `sname` varchar(255) DEFAULT NULL,
  `scomment` varchar(255) DEFAULT NULL,
  `sprice` double DEFAULT NULL,
  `s_opentime` varchar(255) DEFAULT NULL,
  `simage` blob,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) NOT NULL,
  `upassword` varchar(255) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
