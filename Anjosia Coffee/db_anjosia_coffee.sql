-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 16 Des 2022 pada 10.39
-- Versi server: 10.4.25-MariaDB
-- Versi PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_anjosia_coffee`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_barang`
--
-- Kesalahan membaca struktur untuk tabel db_anjosia_coffee.tbl_barang: #1932 - Table 'db_anjosia_coffee.tbl_barang' doesn't exist in engine
-- Kesalahan membaca data untuk tabel db_anjosia_coffee.tbl_barang: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'FROM `db_anjosia_coffee`.`tbl_barang`' at line 1

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_pemasukan`
--
-- Kesalahan membaca struktur untuk tabel db_anjosia_coffee.tbl_pemasukan: #1932 - Table 'db_anjosia_coffee.tbl_pemasukan' doesn't exist in engine
-- Kesalahan membaca data untuk tabel db_anjosia_coffee.tbl_pemasukan: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'FROM `db_anjosia_coffee`.`tbl_pemasukan`' at line 1

--
-- Trigger `tbl_pemasukan`
--
DELIMITER $$
CREATE TRIGGER `trigger _insert_product` AFTER INSERT ON `tbl_pemasukan` FOR EACH ROW BEGIN
UPDATE tbl_barang SET stok_barang = stok_barang + new.stok_awal
WHERE kode_barang = new.kode_barang;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_pengeluaran`
--
-- Kesalahan membaca struktur untuk tabel db_anjosia_coffee.tbl_pengeluaran: #1932 - Table 'db_anjosia_coffee.tbl_pengeluaran' doesn't exist in engine
-- Kesalahan membaca data untuk tabel db_anjosia_coffee.tbl_pengeluaran: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'FROM `db_anjosia_coffee`.`tbl_pengeluaran`' at line 1

--
-- Trigger `tbl_pengeluaran`
--
DELIMITER $$
CREATE TRIGGER `trigger _pengeluaran_product` AFTER INSERT ON `tbl_pengeluaran` FOR EACH ROW BEGIN
UPDATE tbl_barang SET stok_barang = stok_barang - new.stok_akhir WHERE kode_barang = new.kode_barang;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_supplier`
--
-- Kesalahan membaca struktur untuk tabel db_anjosia_coffee.tbl_supplier: #1932 - Table 'db_anjosia_coffee.tbl_supplier' doesn't exist in engine
-- Kesalahan membaca data untuk tabel db_anjosia_coffee.tbl_supplier: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'FROM `db_anjosia_coffee`.`tbl_supplier`' at line 1

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_user`
--
-- Kesalahan membaca struktur untuk tabel db_anjosia_coffee.tbl_user: #1932 - Table 'db_anjosia_coffee.tbl_user' doesn't exist in engine
-- Kesalahan membaca data untuk tabel db_anjosia_coffee.tbl_user: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'FROM `db_anjosia_coffee`.`tbl_user`' at line 1
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
