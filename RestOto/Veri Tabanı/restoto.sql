-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 20 Haz 2023, 18:54:26
-- Sunucu sürümü: 10.4.28-MariaDB
-- PHP Sürümü: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `restoto`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `giris`
--

CREATE TABLE `giris` (
  `kullaniciid` int(10) NOT NULL,
  `kullaniciadi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `parola` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `giris`
--

INSERT INTO `giris` (`kullaniciid`, `kullaniciadi`, `parola`) VALUES
(1, 'yunus', 'yunus'),
(2, 'sibel', 'sibel'),
(3, 'admin', 'admin'),
(4, 'deneme', 'deneme'),
(5, 'sehmus', 'sehmus');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personel`
--

CREATE TABLE `personel` (
  `personelid` int(11) NOT NULL,
  `personeladisoyadi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `personelgiristarihi` date NOT NULL,
  `personelpozisyonu` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `personeltel` varchar(15) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `personelmaasi` decimal(10,2) NOT NULL,
  `personelzamorani` decimal(10,2) NOT NULL,
  `personelyenimaasi` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `personel`
--

INSERT INTO `personel` (`personelid`, `personeladisoyadi`, `personelgiristarihi`, `personelpozisyonu`, `personeltel`, `personelmaasi`, `personelzamorani`, `personelyenimaasi`) VALUES
(5, 'Yunus Oruç', '2023-01-04', 'Patron', '00000000000', 126000.00, 0.00, 0.00),
(6, 'Muammer ÖZyürek', '2023-04-10', 'Eleman', '057075027540', 4858.00, 0.00, 0.00),
(7, 'sehmus özmez', '2022-06-17', 'eleman', '04502404', 5500.00, 0.00, 0.00),
(8, 'sibel inciii', '2022-06-25', 'eleman', '450257400', 10000.00, 0.00, 0.00),
(11, 'yeni personel', '2022-10-10', 'eleman', '425452452', 125478.00, 0.00, 0.00),
(12, 'mehmet yılmaz', '2002-06-25', 'eleman', '2752752', 545345.00, 0.00, 0.00),
(13, 'doğan şentürk', '2003-06-26', 'Müdür yardımcısı', '', 188495.00, 0.00, 0.00),
(14, 'semih memet', '2019-06-25', 'müdür', '752752', 518555.00, 0.00, 0.00),
(15, 'yusuf can', '2020-06-25', 'temizlikci', '', 54848.00, 0.00, 0.00),
(16, 'Can Adem', '2021-06-30', 'Çaycı', '', 15555.00, 0.00, 0.00),
(17, 'Meltem Yılmaz', '2018-06-29', 'Kasiyer', '', 528181.00, 0.00, 0.00),
(18, 'deneme', '2022-07-01', 'deneme1', '', 9858.00, 0.00, 0.00),
(19, 'deneme2', '2020-07-13', 'denem2', '2752752', 6655.00, 0.00, 0.00),
(20, 'denem3', '2020-07-14', 'denem3', '45245242', 5666.00, 0.00, 0.00),
(21, 'deneme4', '2020-07-16', 'denem4', '452452', 365.00, 0.00, 0.00);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `urunler`
--

CREATE TABLE `urunler` (
  `urunid` int(11) NOT NULL,
  `urunadi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `urunmiktari` decimal(10,2) NOT NULL,
  `urunfiyati` decimal(10,2) NOT NULL,
  `urunkategorisi` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `urunaciklama` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `urunalistarihi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `urunler`
--

INSERT INTO `urunler` (`urunid`, `urunadi`, `urunmiktari`, `urunfiyati`, `urunkategorisi`, `urunaciklama`, `urunalistarihi`) VALUES
(6, 'Patates', 110.00, 15.00, 'Sebze', 'değiştir', '2023-06-11'),
(7, 'Domates', 250.00, 20.00, 'Sebze', 'iade edilecek', '2023-05-12'),
(8, 'Biber', 260.00, 15.00, 'Sebze', 'gelmedi', '2023-02-30'),
(9, 'Elma', 450.00, 45.00, 'Meyve', 'geçerli', '2023-03-18'),
(10, 'Muz', 60.00, 50.00, 'Meyve', 'yarı geldi', '2023-05-06'),
(11, 'Kırmızı Et', 50.00, 500.00, 'Kasap', 'çürük', '2023-20-03'),
(16, 'Muz', 450.00, 20.00, 'Sebze', 'deneme', '2023-06-06'),
(17, 'Patates', 10.00, 20.00, 'Sebze', 'deneme', '2023-05-05'),
(18, 'Patates', 80.00, 20.00, 'Sebze', 'yeni patates', '2023-06-09'),
(19, 'Soğan', 250.00, 20.00, 'Sebze', 'Geldi', '2023-02-28');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `giris`
--
ALTER TABLE `giris`
  ADD PRIMARY KEY (`kullaniciid`);

--
-- Tablo için indeksler `personel`
--
ALTER TABLE `personel`
  ADD PRIMARY KEY (`personelid`);

--
-- Tablo için indeksler `urunler`
--
ALTER TABLE `urunler`
  ADD PRIMARY KEY (`urunid`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `personel`
--
ALTER TABLE `personel`
  MODIFY `personelid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- Tablo için AUTO_INCREMENT değeri `urunler`
--
ALTER TABLE `urunler`
  MODIFY `urunid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
