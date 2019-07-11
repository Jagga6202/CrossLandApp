-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jul 11, 2019 at 05:02 AM
-- Server version: 10.3.15-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id10077498_register`
--

-- --------------------------------------------------------

--
-- Table structure for table `crosslandtable`
--

CREATE TABLE `crosslandtable` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `city` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `mobile` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `quali` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `interest` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `country` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `fcm_id` text COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `crosslandtable`
--

INSERT INTO `crosslandtable` (`id`, `name`, `city`, `mobile`, `email`, `quali`, `interest`, `country`, `fcm_id`, `created_at`) VALUES
(4, 'Jagdeep Singh', 'Mohali', '8727033949', 'jagga6202@gmail.com', 'Mtech', 'PR', 'Canada', 'e48-EX7IKB4:APA91bEogGWw_w_H7xfScVo9LrP48URvcdA1vtYYkKDIB2uB9peRmoVpOJAR-Pwup2bJhxY4jS4eba-bpii7-LFzZhS2iNHDlRxcJAj6dEC_MnPP4xZZ1a8XcwoCXHiHFl8C-HBaWBxA', '2019-07-10 06:49:40'),
(5, 'Sunil kumar ', 'Chandigarh ', '9216043055', 'sunil123@gmail.com ', 'Bsc', 'Study Visa', 'Canada', 'exAO5sKiK6A:APA91bFMtrtjQLF8qiijvmsj09o4ZecWkItPoiX572HRzzuc2RvJxR6mvYkKGnoNVhTjRvQ6mkjV966jWpWIFFEmkPPlwQ0HFf0u8LUyX1ddzSZ5Au03YLPQr98ZT7yUt5wifbYC40cy', '2019-07-10 07:00:10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `crosslandtable`
--
ALTER TABLE `crosslandtable`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `mobile` (`mobile`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `crosslandtable`
--
ALTER TABLE `crosslandtable`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
