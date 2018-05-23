-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 18, 2018 at 01:56 PM
-- Server version: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qltv`
--

-- --------------------------------------------------------

--
-- Table structure for table `bansao`
--

DROP TABLE IF EXISTS `bansao`;
CREATE TABLE IF NOT EXISTS `bansao` (
  `id_bansao` int(11) NOT NULL,
  `id_sach` int(11) NOT NULL,
  `gia` int(11) NOT NULL,
  `theloai` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(1) NOT NULL,
  PRIMARY KEY (`id_bansao`),
  KEY `id_sach` (`id_sach`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chitietmuontra`
--

DROP TABLE IF EXISTS `chitietmuontra`;
CREATE TABLE IF NOT EXISTS `chitietmuontra` (
  `id_chitietmuontra` int(11) NOT NULL,
  `id_muontra` int(11) NOT NULL,
  `id_bansao` int(11) NOT NULL,
  `ngaytra` date NOT NULL,
  `trangthai` int(1) DEFAULT NULL,
  PRIMARY KEY (`id_chitietmuontra`),
  KEY `id_bansao` (`id_bansao`),
  KEY `id_muontra` (`id_muontra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `docgia`
--

DROP TABLE IF EXISTS `docgia`;
CREATE TABLE IF NOT EXISTS `docgia` (
  `id_docgia` int(11) NOT NULL,
  `gioitinh` int(1) NOT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(12) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `mssv` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `hoten` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(1) NOT NULL,
  PRIMARY KEY (`id_docgia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `muontra`
--

DROP TABLE IF EXISTS `muontra`;
CREATE TABLE IF NOT EXISTS `muontra` (
  `id_muontra` int(11) NOT NULL,
  `id_themuon` int(11) NOT NULL,
  `ngaydangky` date NOT NULL,
  `ngaymuon` date NOT NULL,
  `hantra` date NOT NULL,
  `tiendatcoc` int(11) NOT NULL,
  `id_thuthu` int(11) NOT NULL,
  PRIMARY KEY (`id_muontra`),
  KEY `id_themuon` (`id_themuon`),
  KEY `id_thuthu` (`id_thuthu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `sach`
--

DROP TABLE IF EXISTS `sach`;
CREATE TABLE IF NOT EXISTS `sach` (
  `id_sach` int(11) NOT NULL,
  `nxb` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `theloai` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `tieude` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `tacgia` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(1) NOT NULL,
  PRIMARY KEY (`id_sach`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `themuon`
--

DROP TABLE IF EXISTS `themuon`;
CREATE TABLE IF NOT EXISTS `themuon` (
  `id_themuon` int(11) NOT NULL,
  `ngaykichhoat` date NOT NULL,
  `ngayhethan` date NOT NULL,
  `id_docgia` int(11) NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_themuon`),
  KEY `id_docgia` (`id_docgia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `thuthu`
--

DROP TABLE IF EXISTS `thuthu`;
CREATE TABLE IF NOT EXISTS `thuthu` (
  `id_thuthu` int(11) NOT NULL,
  `gioitinh` int(1) NOT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(12) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `hoten` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(1) NOT NULL,
  PRIMARY KEY (`id_thuthu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bansao`
--
ALTER TABLE `bansao`
  ADD CONSTRAINT `bansao_ibfk_1` FOREIGN KEY (`id_sach`) REFERENCES `sach` (`id_sach`);

--
-- Constraints for table `chitietmuontra`
--
ALTER TABLE `chitietmuontra`
  ADD CONSTRAINT `chitietmuontra_ibfk_1` FOREIGN KEY (`id_bansao`) REFERENCES `bansao` (`id_bansao`),
  ADD CONSTRAINT `chitietmuontra_ibfk_2` FOREIGN KEY (`id_muontra`) REFERENCES `muontra` (`id_muontra`);

--
-- Constraints for table `muontra`
--
ALTER TABLE `muontra`
  ADD CONSTRAINT `muontra_ibfk_1` FOREIGN KEY (`id_themuon`) REFERENCES `themuon` (`id_themuon`),
  ADD CONSTRAINT `muontra_ibfk_2` FOREIGN KEY (`id_thuthu`) REFERENCES `thuthu` (`id_thuthu`);

--
-- Constraints for table `themuon`
--
ALTER TABLE `themuon`
  ADD CONSTRAINT `themuon_ibfk_1` FOREIGN KEY (`id_docgia`) REFERENCES `docgia` (`id_docgia`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
