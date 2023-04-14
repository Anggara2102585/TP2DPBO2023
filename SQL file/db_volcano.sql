-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2023 at 04:26 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_volcano`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id_account` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id_account`, `username`, `password`) VALUES
(1, 'admin', 'admin'),
(3, 'Anggara', 'anggara');

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE `country` (
  `id_country` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `holoceneVolc` int(11) NOT NULL,
  `flagPath` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `country`
--

INSERT INTO `country` (`id_country`, `name`, `holoceneVolc`, `flagPath`) VALUES
(11, 'United States', 162, 'uploads/country_flags/d307da6a-4b7c-4078-afd5-30eec5d9aaf6.png'),
(12, 'Japan', 122, 'uploads/country_flags/b7d56c81-caec-4ef8-9a7f-260180a98e41.png'),
(13, 'Indonesia', 120, 'uploads/country_flags/d3e3bb5d-5d56-489c-845d-a6c923afe11e.png'),
(14, 'Russia', 117, 'uploads/country_flags/bd72fecc-ffce-4f34-b6be-bdc7fda0bff5.png'),
(15, 'Chile', 91, 'uploads/country_flags/b3d065d1-9caa-4580-8ad2-bc73e261ac64.png'),
(16, 'Ethiopia', 53, 'uploads/country_flags/1fec306b-325f-4e72-9d96-52c59b9e3981.png'),
(17, 'Papua New Guinea', 46, 'uploads/country_flags/92352a53-e2c3-45d3-b3a8-992574886ce7.png'),
(18, 'Philippines', 38, 'uploads/country_flags/cf03c114-6cd4-4d81-a19b-357dc4b47b34.png'),
(19, 'Mexico', 37, 'uploads/country_flags/f3b4ecbb-585e-463b-8072-bd541c9f770a.png'),
(20, 'Argentina', 35, 'uploads/country_flags/79529a8e-8082-4d58-bd4a-0d4a3eb2b91a.png');

-- --------------------------------------------------------

--
-- Table structure for table `volcano`
--

CREATE TABLE `volcano` (
  `id_volcano` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `lastEruption` int(11) NOT NULL,
  `id_country` int(11) NOT NULL,
  `imgPath` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `volcano`
--

INSERT INTO `volcano` (`id_volcano`, `name`, `type`, `lastEruption`, `id_country`, `imgPath`) VALUES
(6, 'Adams', 'Stratovolcano', 950, 11, 'uploads/volcano_img/26a34928-4c2f-46f7-aa1b-5581e5bc72db.jpg'),
(7, 'Kīlauea', 'Shield', 2023, 11, 'uploads/volcano_img/366e156c-d8c9-4f29-94cc-62071c498ecb.jpg'),
(8, 'Asosan', 'Caledra', 2021, 12, 'uploads/volcano_img/0a3eb599-8921-4fbc-8ae9-b05ba76ab1af.jpg'),
(9, 'Dieng Volcanic Complex', 'Complex', 2021, 13, 'uploads/volcano_img/15ae40a3-5fa0-40ad-923d-f74abe0c1e62.jpg'),
(10, 'Ushkovsky', 'Compound', 1890, 14, 'uploads/volcano_img/6cd15190-d031-4974-a765-e3912c179bae.jpg'),
(11, 'Caburgua-Huelemolle', 'Pyroclastic cone(s)', -5050, 15, 'uploads/volcano_img/50a58bc3-be7c-4045-a6d9-09df38b84d8d.jpg'),
(12, 'Dallol', 'Explosion crater(s)', 2011, 16, 'uploads/volcano_img/510414d7-169c-4e3a-9814-ef0365ffdab0.jpg'),
(13, 'Bagana', 'Lava cone', 2023, 17, 'uploads/volcano_img/c460a812-6bb8-43fa-9a82-036c96c4b91c.jpg'),
(14, 'San Pablo Volcanic Field', 'Volcanic field', 1350, 18, 'uploads/volcano_img/926e3bd5-a41f-4ff2-8fd2-e1e5a84b79f9.jpg'),
(15, 'Blue Lake Crater', 'Maar', 680, 11, 'uploads/volcano_img/271e70bf-5959-424d-80ff-3ff68ee7f918.jpg'),
(16, 'Bogoslof', 'Submarine', 2017, 11, 'uploads/volcano_img/c41433dd-1226-4e99-b47d-9349bb2c8121.jpg'),
(17, 'Alu-Dalafilla', 'Fissure vent(s)', 2008, 16, 'uploads/volcano_img/9fec15c3-1ef8-46b9-a695-0878e7a75935.jpg'),
(18, 'Buzzard Creek', 'Tuff ring(s)', -1050, 11, 'uploads/volcano_img/a7b62e06-d838-41f6-96a7-305202b0b73c.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id_account`);

--
-- Indexes for table `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`id_country`),
  ADD KEY `id_country` (`id_country`);

--
-- Indexes for table `volcano`
--
ALTER TABLE `volcano`
  ADD PRIMARY KEY (`id_volcano`),
  ADD KEY `id_country` (`id_country`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `id_account` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `country`
--
ALTER TABLE `country`
  MODIFY `id_country` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `volcano`
--
ALTER TABLE `volcano`
  MODIFY `id_volcano` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `volcano`
--
ALTER TABLE `volcano`
  ADD CONSTRAINT `volcano_ibfk_1` FOREIGN KEY (`id_country`) REFERENCES `country` (`id_country`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
