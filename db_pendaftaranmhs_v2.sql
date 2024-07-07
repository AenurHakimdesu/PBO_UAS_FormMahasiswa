-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 06, 2024 at 05:50 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pendaftaranmhs`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_mhs`
--

CREATE TABLE `data_mhs` (
  `ID_Siswa` int(11) NOT NULL,
  `Nama_Siswa` varchar(100) DEFAULT NULL,
  `Tgl_Lahir` date DEFAULT NULL,
  `Asal_Sekolah` varchar(100) DEFAULT NULL,
  `Jenis_Kelamin` enum('Laki-Laki','Perempuan') DEFAULT NULL,
  `Kota_Asal` varchar(100) DEFAULT NULL,
  `Email_Siswa` varchar(100) DEFAULT NULL,
  `ID_Wali` int(11) DEFAULT NULL,
  `ID_Prodi` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_mhs`
--

INSERT INTO `data_mhs` (`ID_Siswa`, `Nama_Siswa`, `Tgl_Lahir`, `Asal_Sekolah`, `Jenis_Kelamin`, `Kota_Asal`, `Email_Siswa`, `ID_Wali`, `ID_Prodi`) VALUES
(18, 'Ambatukam Rusdiansyah', '2004-01-01', 'SMA 02', 'Laki-Laki', 'Ngawi', 'p69@gmail.com', 7, 12),
(20, 'Fuad', '2004-01-15', 'SMA 02', 'Perempuan', 'Ngawi', 'p96@gmail.com', 7, 7);

-- --------------------------------------------------------

--
-- Table structure for table `prodi_mhs`
--

CREATE TABLE `prodi_mhs` (
  `ID_Prodi` int(11) NOT NULL,
  `Nama_Prodi` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prodi_mhs`
--

INSERT INTO `prodi_mhs` (`ID_Prodi`, `Nama_Prodi`) VALUES
(1, 'Teknik Informatika S1'),
(2, 'Sistem Informasi S1'),
(3, 'Desain Komunikasi Visual S1'),
(4, 'Film dan Televisi S1'),
(5, 'Akuntansi S1'),
(6, 'Manajemen S1'),
(7, 'Bahasa Inggris S1'),
(8, 'Sastra Jepang S1'),
(9, 'Kesehatan Masyarakat S1'),
(10, 'Teknik Elektro S1'),
(11, 'Teknik Industri S1'),
(12, 'Teknik Biomedis S1'),
(13, 'Kedokteran S1');

-- --------------------------------------------------------

--
-- Table structure for table `wali_mhs`
--

CREATE TABLE `wali_mhs` (
  `ID_Wali` int(11) NOT NULL,
  `Nama_Wali` varchar(100) DEFAULT NULL,
  `Jenis_Kelamin` enum('Laki-Laki','Perempuan') NOT NULL,
  `Umur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `wali_mhs`
--

INSERT INTO `wali_mhs` (`ID_Wali`, `Nama_Wali`, `Jenis_Kelamin`, `Umur`) VALUES
(7, 'Agustina', 'Perempuan', 40);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_mhs`
--
ALTER TABLE `data_mhs`
  ADD PRIMARY KEY (`ID_Siswa`),
  ADD KEY `ID_Wali` (`ID_Wali`),
  ADD KEY `ID_Prodi` (`ID_Prodi`);

--
-- Indexes for table `prodi_mhs`
--
ALTER TABLE `prodi_mhs`
  ADD PRIMARY KEY (`ID_Prodi`);

--
-- Indexes for table `wali_mhs`
--
ALTER TABLE `wali_mhs`
  ADD PRIMARY KEY (`ID_Wali`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_mhs`
--
ALTER TABLE `data_mhs`
  MODIFY `ID_Siswa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `prodi_mhs`
--
ALTER TABLE `prodi_mhs`
  MODIFY `ID_Prodi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `wali_mhs`
--
ALTER TABLE `wali_mhs`
  MODIFY `ID_Wali` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `data_mhs`
--
ALTER TABLE `data_mhs`
  ADD CONSTRAINT `data_mhs_ibfk_1` FOREIGN KEY (`ID_Wali`) REFERENCES `wali_mhs` (`ID_Wali`),
  ADD CONSTRAINT `data_mhs_ibfk_2` FOREIGN KEY (`ID_Prodi`) REFERENCES `prodi_mhs` (`ID_Prodi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
