/*
 Navicat Premium Data Transfer

 Source Server         : Quản lý thư viện
 Source Server Type    : MySQL
 Source Server Version : 100132
 Source Host           : 156.67.222.40:3306
 Source Schema         : u514628801_qltv
 Source Database       : u514628801_qltv
 Source Password       : 123456a@

 Target Server Type    : MySQL
 Target Server Version : 100132
 File Encoding         : 65001

 Date: 09/05/2018 01:20:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id_book` varchar(6) COLLATE utf8_unicode_ci NOT NULL,
  `title` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `description` text COLLATE utf8_unicode_ci,
  `author` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `publishing` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `type_book` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `cost` float NOT NULL,
  `created` date NOT NULL,
  `updated` date DEFAULT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`id_book`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for librarians
-- ----------------------------
DROP TABLE IF EXISTS `librarians`;
CREATE TABLE `librarians` (
  `id_librarian` varchar(6) COLLATE utf8_unicode_ci NOT NULL,
  `user_name` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `mail` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `phone_number` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `first_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(0) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `gender` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` text COLLATE utf8_unicode_ci,
  `created` date NOT NULL,
  `updated` date DEFAULT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`id_librarian`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for copybooks
-- ----------------------------
DROP TABLE IF EXISTS `copybooks`;
CREATE TABLE `copybooks` (
  `id_book` varchar(6) COLLATE utf8_unicode_ci NOT NULL,
  `id_librarian` varchar(6) COLLATE utf8_unicode_ci NOT NULL,
  `amount` int(11) NOT NULL,
  `created` date NOT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`id_book`,`id_librarian`),
  CONSTRAINT `copybooks_ibfk_1` FOREIGN KEY (`id_book`) REFERENCES `books` (`id_book`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `copybooks_ibfk_2` FOREIGN KEY (`id_librarian`) REFERENCES `librarians` (`id_librarian`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for readers
-- ----------------------------
DROP TABLE IF EXISTS `readers`;
CREATE TABLE `readers` (
  `id_reader` varchar(6) COLLATE utf8_unicode_ci NOT NULL,
  `user_name` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `mail` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `phone_number` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `first_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(0) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `gender` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` text COLLATE utf8_unicode_ci,
  `created` date NOT NULL,
  `updated` date DEFAULT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`id_reader`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for lendbooks
-- ----------------------------
DROP TABLE IF EXISTS `lendbooks`;
CREATE TABLE `lendbooks` (
  `id_card` varchar(6) COLLATE utf8_unicode_ci NOT NULL,
  `id_book` varchar(6) COLLATE utf8_unicode_ci NOT NULL,
  `id_reader` varchar(6) COLLATE utf8_unicode_ci NOT NULL,
  `id_librarian` varchar(6) COLLATE utf8_unicode_ci NOT NULL,
  `borrowd_day` date NOT NULL,
  `pay_appointment_day` date NOT NULL,
  `pay_day` date DEFAULT NULL,
  `deposit` float NOT NULL,
  `mulct` float DEFAULT NULL,
  `created` date NOT NULL,
  `updated` date DEFAULT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`id_card`),
  KEY `id_book` (`id_book`),
  CONSTRAINT `lendbooks_ibfk_1` FOREIGN KEY (`id_book`) REFERENCES `books` (`id_book`),
  CONSTRAINT `lendbooks_ibfk_2` FOREIGN KEY (`id_reader`) REFERENCES `readers` (`id_reader`),
  CONSTRAINT `lendbooks_ibfk_3` FOREIGN KEY (`id_librarian`) REFERENCES `librarians` (`id_librarian`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

SET FOREIGN_KEY_CHECKS = 1;
