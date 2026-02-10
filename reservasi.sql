-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Feb 2026 pada 13.07
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `reservasihotel`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `reservasi`
--

CREATE TABLE `reservasi` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `nomor_telepon` int(15) NOT NULL,
  `usia` int(11) NOT NULL,
  `jenis_kamar` int(5) NOT NULL,
  `nomor_kamar` int(11) NOT NULL,
  `lama_menginap` int(11) NOT NULL,
  `tanggal_check_in` varchar(255) NOT NULL,
  `tanggal_check_out` varchar(255) NOT NULL,
  `harga_perhari` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `reservasi`
--

INSERT INTO `reservasi` (`id`, `nama`, `nomor_telepon`, `usia`, `jenis_kamar`, `nomor_kamar`, `lama_menginap`, `tanggal_check_in`, `tanggal_check_out`, `harga_perhari`) VALUES
(1, 'nana', 726356783, 12, 1, 1, 1, '19/12/2023', '20/12/2023', 300000),
(2, 'kin', 123, 15, 1, 21, 2, '19', '12', 300000),
(123, 'kintarou', 123321123, 12, 1, 2, 2, '10/10/2023', '12/10/2023', 300000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `reservasi`
--
ALTER TABLE `reservasi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `reservasi`
--
ALTER TABLE `reservasi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
