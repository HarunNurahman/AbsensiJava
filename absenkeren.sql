-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 08, 2020 at 05:24 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `absenkeren`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_absen`
--

CREATE TABLE `t_absen` (
  `id_absen` int(10) NOT NULL,
  `nis` varchar(20) DEFAULT NULL,
  `bulan` varchar(20) DEFAULT NULL,
  `m1` varchar(30) DEFAULT NULL,
  `m2` varchar(30) DEFAULT NULL,
  `m3` varchar(30) DEFAULT NULL,
  `m4` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_absen`
--

INSERT INTO `t_absen` (`id_absen`, `nis`, `bulan`, `m1`, `m2`, `m3`, `m4`) VALUES
(1, '17111363', '1', '', '', '', ''),
(2, '17111363', '2', '', '', '', ''),
(3, '17111363', '3', '', '', '', ''),
(4, '17111363', '4', '', '', '', ''),
(5, '17111363', '5', '', '', '', ''),
(6, '17111363', '6', '', '', '', ''),
(7, '17111363', '7', '', '', '', ''),
(8, '17111363', '8', '', '', '', ''),
(9, '17111363', '9', '', '', '', ''),
(10, '17111363', '10', '', '', '', ''),
(11, '17111363', '11', '', '', '', ''),
(12, '17111363', '12', '', '', '', ''),
(13, '17111361', '1', NULL, NULL, NULL, NULL),
(14, '17111361', '2', NULL, NULL, NULL, NULL),
(15, '17111361', '3', NULL, NULL, NULL, NULL),
(16, '17111361', '4', NULL, NULL, NULL, NULL),
(17, '17111361', '5', NULL, NULL, NULL, NULL),
(18, '17111361', '6', NULL, NULL, NULL, NULL),
(19, '17111361', '7', NULL, NULL, NULL, NULL),
(20, '17111361', '8', NULL, NULL, NULL, NULL),
(21, '17111361', '9', NULL, NULL, NULL, NULL),
(22, '17111361', '10', NULL, NULL, NULL, NULL),
(23, '17111361', '11', 'h', 'a', 'h', 'a'),
(24, '17111361', '12', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `t_kelas`
--

CREATE TABLE `t_kelas` (
  `id_kelas` int(5) NOT NULL,
  `kelas` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_kelas`
--

INSERT INTO `t_kelas` (`id_kelas`, `kelas`) VALUES
(1, 'XII RPL'),
(2, 'XII TKJ'),
(3, 'XII MM'),
(4, 'XII AV');

-- --------------------------------------------------------

--
-- Table structure for table `t_murid`
--

CREATE TABLE `t_murid` (
  `nis` varchar(11) NOT NULL,
  `no_absen` int(5) DEFAULT NULL,
  `nm_siswa` varchar(50) DEFAULT NULL,
  `kelas` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_murid`
--

INSERT INTO `t_murid` (`nis`, `no_absen`, `nm_siswa`, `kelas`) VALUES
('17111361', NULL, 'Jajang', 'XII RPL');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_absen`
--
ALTER TABLE `t_absen`
  ADD PRIMARY KEY (`id_absen`);

--
-- Indexes for table `t_kelas`
--
ALTER TABLE `t_kelas`
  ADD PRIMARY KEY (`id_kelas`);

--
-- Indexes for table `t_murid`
--
ALTER TABLE `t_murid`
  ADD PRIMARY KEY (`nis`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t_absen`
--
ALTER TABLE `t_absen`
  MODIFY `id_absen` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
