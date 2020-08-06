-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 26, 2020 at 11:01 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mob104`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `AddressID` bigint(255) NOT NULL,
  `PostCode` varchar(100) DEFAULT NULL,
  `TownID` bigint(255) NOT NULL,
  `CountyID` bigint(255) NOT NULL,
  `CountryID` bigint(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`AddressID`, `PostCode`, `TownID`, `CountyID`, `CountryID`) VALUES
(1, '100000', 1, 1, 1),
(2, '200000', 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `business`
--

CREATE TABLE `business` (
  `BusinessID` bigint(255) NOT NULL,
  `BusinessName` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Sic2007` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Sic2003` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `shortDepcription` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `coppyAddress` bit(1) NOT NULL,
  `address1` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `cityTown` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `nationCountry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `Country` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `fullDescription` text CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `sicCode` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `fax` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `website` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `charityNumber` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `companyNumber` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `business`
--

INSERT INTO `business` (`BusinessID`, `BusinessName`, `Sic2007`, `Sic2003`, `shortDepcription`, `coppyAddress`, `address1`, `cityTown`, `nationCountry`, `Country`, `fullDescription`, `sicCode`, `phone`, `fax`, `email`, `website`, `charityNumber`, `companyNumber`) VALUES
(1, 'Công ty cổ phần FPT', 'ISO-1078', 'ISO-2003', 'FPT, tên viết tắt của Công ty cổ phần FPT, là một trong những công ty dịch vụ công nghệ thông tin lớn nhất tại Việt Nam với lĩnh vực kinh doanh chính là cung cấp các dịch vụ liên quan công nghệ thông tin', b'0', ' 48 Vạn Bảo, Ngọc Khánh, Ba Đình, Hà Nội', 'Hà nội', 'VIETNAMESE', 'VIỆT NAM', 'FPT (Tập đoàn FPT, tiếng Anh: FPT Group), tên viết tắt của Công ty cổ phần FPT (tên cũ là Công ty Phát triển và Đầu tư Công nghệ), là một trong những công ty dịch vụ công nghệ thông tin lớn nhất tại Việt Nam[cần dẫn nguồn] với lĩnh vực kinh doanh chính là cung cấp các dịch vụ liên quan công nghệ thông tin. Theo thống kê của Chương trình Phát triển Liên Hiệp Quốc, đây là doanh nghiệp lớn thứ 14 của Việt Nam vào năm 2007.[1] Theo VNReport thì đây là doanh nghiệp tư nhân lớn thứ ba của Việt Nam trong năm 2012[2] Tiêu chí để Vietnam Report lựa chọn các doanh nghiệp tư nhân là những doanh nghiệp có vốn sở hữu tư nhân lớn hơn hoặc bằng 51%.[3]. Năm 2018, doanh thu FPT đạt 23.214 tỷ đồng, tăng 17% so với năm 2017; lợi nhuận trước thuế đạt 3.858 tăng 31% so với năm 2017. Doanh thu và lợi nhuận từ thị trường nước ngoài tăng trưởng cao, lần lượt tăng 27% và 35% so với cùng kỳ.', 'ISO-1030', '19006571', '11111111', 'fptservices@fpt.com.vn', 'https://www.fpt.com.vn/', 'f13232', 'FPT3011'),
(2, 'CÔNG TY CỔ PHẦN CÔNG NGHỆ ITSOL - GIẢI PHÁP CÔNG NGHỆ HÀNG ĐẦU VIỆT NAM', 'ISO-1078', 'ISO-2003', 'ITSOL, tên viết tắt của Công ty cổ phần Internet Technologi Solve, là một trong những công ty dịch vụ công nghệ thông tin lớn nhất tại Việt Nam với lĩnh vực kinh doanh chính là cung cấp các dịch vụ liên quan công nghệ thông tin', b'0', ' 48 Vạn Bảo, Ngọc Khánh, Ba Đình, Hà Nội', 'Hà nội', 'VIETNAMESE', 'VIỆT NAM', 'ITSOL, tên viết tắt của Công ty cổ phần Internet Technologi Solve, là một trong những công ty dịch vụ công nghệ thông tin lớn nhất tại Việt Nam với lĩnh vực kinh doanh chính là cung cấp các dịch vụ liên quan công nghệ thông tin.[1] Theo VNReport thì đây là doanh nghiệp tư nhân lớn thứ ba của Việt Nam trong năm 2012[2] Tiêu chí để Vietnam Report lựa chọn các doanh nghiệp tư nhân là những doanh nghiệp có vốn sở hữu tư nhân lớn hơn hoặc bằng 51%.[3]. Năm 2018, doanh thu FPT đạt 23.214 tỷ đồng, tăng 17% so với năm 2017; lợi nhuận trước thuế đạt 3.858 tăng 31% so với năm 2017. Doanh thu và lợi nhuận từ thị trường nước ngoài tăng trưởng cao, lần lượt tăng 27% và 35% so với cùng kỳ.', 'ISO-1030', '19006571', NULL, 'itsolvesupport@gmail.com', 'https://www.itsol.com.vn/', 'f13232', 'FPT3011');

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `ContactID` bigint(255) NOT NULL,
  `firstname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `ManagerID` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`ContactID`, `firstname`, `ManagerID`) VALUES
(1, 'FPT UNIVERSITY', 312321),
(2, 'Trường Đại Học Hà Nội (HANU)', 3),
(4, 'CAO ĐẲNG THỰC HÀNH FPT', 2),
(5, 'Viện Đại học RMIT', 5);

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE `country` (
  `CountryID` bigint(255) NOT NULL,
  `CountryName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `country`
--

INSERT INTO `country` (`CountryID`, `CountryName`) VALUES
(1, 'Việt Nam');

-- --------------------------------------------------------

--
-- Table structure for table `county`
--

CREATE TABLE `county` (
  `CountyID` bigint(255) NOT NULL,
  `CountryID` bigint(255) NOT NULL,
  `CountyName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `county`
--

INSERT INTO `county` (`CountyID`, `CountryID`, `CountyName`) VALUES
(1, 1, 'Việt Nam'),
(2, 1, 'American'),
(6, 1, 'Chinese');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `DepartmentID` bigint(255) NOT NULL,
  `DirectorateID` bigint(255) NOT NULL,
  `ContactID` bigint(255) NOT NULL,
  `shortDepcription` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `address1` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `postcode` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `cityTown` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `nationCountry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `Country` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `fullDescription` text CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `sicCode` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `fax` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `website` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `charityNumber` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `companyNumber` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`DepartmentID`, `DirectorateID`, `ContactID`, `shortDepcription`, `address1`, `postcode`, `cityTown`, `nationCountry`, `Country`, `fullDescription`, `sicCode`, `phone`, `fax`, `email`, `website`, `charityNumber`, `companyNumber`) VALUES
(2, 1, 1, 'Ban tuyển sinh đại học FPT', 'KCN HÒa Lạc, Thạch Thất, Hà Nội', '100000', 'Hà Nội', 'Việt Nam', 'Việt Nam', 'Nơi tiếp nhận hồ sơ tuyển sinh từ mọi miền trên đất nước. Tạo mọi điều kiện tốt nhất để sinh viên có thể học tập tại Đại Học FPT- nơi đào tạo chất lượng bậc nhất Việt Nam', '10000', '0374550289', '11111111', 'tuyensinh.hanoi@fpt.edu.vn', 'https://www.fpt.com.vn/', '003', 'FPT3011'),
(3, 2, 1, 'Ban tuyển sinh Cao đẳng FPT', 'Tòa nhà FPT Polytechnic, Phố Trịnh Văn Bô, Xuân Phương, Nam Từ Liêm', '100000', 'Hà Nội', 'Việt Nam', 'Việt Nam', 'Nơi tiếp nhận hồ sơ tuyển sinh từ mọi miền trên đất nước. Tạo mọi điều kiện tốt nhất để sinh viên có thể học tập tại Cao Đẳng FPT- nơi đào tạo chất lượng bậc nhất Việt Nam', '10000', '0374550289', '11111111', 'caodang@fpt.edu.vn', 'https://caodang.fpt.edu.vn/', '003', 'FPT3011');

-- --------------------------------------------------------

--
-- Table structure for table `directorate`
--

CREATE TABLE `directorate` (
  `DirectorateID` bigint(255) NOT NULL,
  `OrgID` int(255) NOT NULL,
  `ContactID` bigint(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `directorate`
--

INSERT INTO `directorate` (`DirectorateID`, `OrgID`, `ContactID`) VALUES
(1, 1, 1),
(2, 1, 4),
(3, 2, 4);

-- --------------------------------------------------------

--
-- Table structure for table `govofficeregion`
--

CREATE TABLE `govofficeregion` (
  `GovOfficeRegionID` bigint(255) NOT NULL,
  `GovOfficeRegionName` varchar(100) NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'0',
  `CountyID` bigint(255) NOT NULL,
  `CountryID` bigint(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `organisation`
--

CREATE TABLE `organisation` (
  `OrgID` int(255) NOT NULL,
  `Orgname` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `address1` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `isActive` bit(1) NOT NULL,
  `shortDepcription` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `cityTown` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `Country` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `ContactID` bigint(255) NOT NULL,
  `nationCountry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `preferenceOrg` bit(1) DEFAULT b'0',
  `exInternet` bit(1) NOT NULL DEFAULT b'0',
  `sicCode` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `fullDescription` text CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `fax` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `website` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `charityNumber` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `companyNumber` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `organisation`
--

INSERT INTO `organisation` (`OrgID`, `Orgname`, `address1`, `isActive`, `shortDepcription`, `cityTown`, `Country`, `ContactID`, `nationCountry`, `preferenceOrg`, `exInternet`, `sicCode`, `fullDescription`, `phone`, `fax`, `website`, `charityNumber`, `companyNumber`, `email`) VALUES
(1, 'FPT UNIVERSITY', 'KHU CNC HÒA LẠC, HÀ NỘI', b'1', 'Trường ĐH FPT LÀ CƠ SỞ ĐÀO TẠO CHẤT LƯỢNG TỐT NHẤT', 'HÀ NỘI', 'VIỆT NAM', 1, 'VIETNAMESE', b'0', b'0', '100000', 'ĐH FPT', '0374550289', '1111111111', 'http://hanoi.fpt.edu.vn/', 'f13232', 'FPT001', 'tuyensinh.hanoi@fpt.edu.vn'),
(2, 'CAO ĐẲNG THỰC HÀNH FPT POLYTECHNIC', ' Tòa nhà FPT Polytechnic, Phố Trịnh Văn Bô, Xuân Phương, Nam Từ Liêm, Hà Nội 100000', b'1', 'Cao đẳng thực hành FPT Polytechnic ra đời với sứ mệnh cung cấp dịch vụ', 'HÀ NỘI', 'VIỆT NAM', 4, 'VIETNAMESE', b'0', b'0', NULL, 'Cao đẳng fpt', '(024) 7300 ', '11111111', 'https://caodang.fpt.edu.vn/', '1212121', '002', 'tuyensinh.hanoi@caodangfpt.edu.vn'),
(4, 'Trường Đại Học Hà Nội (HANU)\r\n', 'Km 9 Nguyễn Trãi, Thanh Xuân Bắc, Thanh Xuân, Hà Nội', b'1', 'Trường Đại học Hà Nội, tên cũ là Trường đại học Ngoại ngữ Hà Nội, được thành lập năm 1959, tọa lạc tại km 9 đường Nguyễn Trãi, quận Thanh Xuân, Hà Nội', 'HÀ NỘI', 'VIỆT NAM', 2, 'VIETNAMESE', b'0', b'0', NULL, 'đại học hà nội', '938123129', '03231212', 'http://www.hanu.vn/vn/', '342112', '002', 'hanu@hanu.edu.vn'),
(5, 'Trường Đại Học Sư Phạm Hà Nội', 'Số 136 Xuân Thủy, Dịch Vọng Hậu, Cầu Giấy, Hà Nội 123106', b'1', 'Trường Đại học Sư phạm Hà Nội là một trung tâm đào tạo đại học, sau đại học, nghiên cứu và ứng dụng khoa học giáo dục và đa ngành chất lượng cao, là một trong các trường đại học trọng điểm trong hệ thống giáo dục đại học Việt Nam', 'HÀ NỘI', 'VIỆT NAM', 2, 'VIETNAMESE', b'0', b'0', NULL, 'đại học sư phạm', '938123129', '2139382', 'http://www.hnue.edu.vn/', '323223', '002', 'hanu@hanu.edu.vn'),
(6, 'Trường Đại Học RMIT, cơ sở Hà Nội\r\n', ' Handi Resco Building, 521 Kim Mã, Ba Đình, Hà Nội', b'1', 'RMIT University Vietnam’s Hanoi City campus is located in attractive newly refurbished premises in the Handi Resco Building, on the banks of one of Hanoi\'s most picturesque lakes. The campus is close to many amenities including restaurants, shopping centres, and cinemas. Over 1500 students learn from our team of expert academics in Hanoi. We have state-of-the-art learning facilities, including multimedia technology and other innovative features to allow for small group learning in an informal, c', 'HÀ NỘI', 'VIỆT NAM', 5, 'VIETNAMESE', b'0', b'0', NULL, 'Viện RMIT', '2437261460', '11111111', 'https://www.event.rmit.edu.vn/', '003', '004', 'hanoi.enquiries@rmit.edu.vn'),
(7, 'FPT UNIVERSITY', 'KHU CNC HÒA LẠC, HÀ NỘI', b'1', 'Trường ĐH FPT LÀ CƠ SỞ ĐÀO TẠO CHẤT LƯỢNG TỐT NHẤT', 'HÀ NỘI', 'VIỆT NAM', 1, 'VIETNAMESE', b'0', b'0', '100000', 'ĐH FPT', '0374550289', '1111111111', 'http://hanoi.fpt.edu.vn/', 'f13232', 'FPT001', 'email');

-- --------------------------------------------------------

--
-- Table structure for table `premise`
--

CREATE TABLE `premise` (
  `PremiseID` bigint(255) NOT NULL,
  `premiseName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `locationName` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `knowas` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `locationstatusDate` date NOT NULL DEFAULT current_timestamp(),
  `cityTown` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `country` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `nationCountry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `primaryLocation` bit(1) NOT NULL DEFAULT b'0',
  `locationManager` bit(1) NOT NULL DEFAULT b'0',
  `stNetworkConnectivity` bit(1) NOT NULL DEFAULT b'0',
  `locationDescription` text CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `genaralFaxNumber` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `minisecondNumber` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `isNew` bit(1) NOT NULL DEFAULT b'0',
  `flagDate` date NOT NULL DEFAULT current_timestamp(),
  `address` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `phoneNumber` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `projectCode` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'0',
  `specialShop` bit(1) NOT NULL DEFAULT b'0',
  `ServiceID` bigint(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `premise`
--

INSERT INTO `premise` (`PremiseID`, `premiseName`, `locationName`, `knowas`, `locationstatusDate`, `cityTown`, `country`, `nationCountry`, `primaryLocation`, `locationManager`, `stNetworkConnectivity`, `locationDescription`, `genaralFaxNumber`, `minisecondNumber`, `isNew`, `flagDate`, `address`, `phoneNumber`, `projectCode`, `isActive`, `specialShop`, `ServiceID`) VALUES
(1, 'Số 1 Phạm văn đồng', 'Số 1 Phạm văn đồng, Mai Dịch, Hà Nội', 'Thanh Xuân', '2020-07-26', 'Hà Nội', 'Việt Nam', 'Internal', b'1', b'1', b'1', 'Nơi có địa thế đẹp, tọa lạc bên tòa VIN HOME sang trọng & đẳng cấp', '0374550289', '21', b'1', '2020-07-26', 'Hà Noi', '0374550289', 'PH08312', b'1', b'1', 2),
(2, 'Cơ sở đào tạo tiếng anh trực thuộc đại học FPT', 'Số 1 phan tiến dũng, bắc từ liêm, hà nội', 'Thanh Xuân', '2020-07-26', 'Hà Nội', 'Việt Nam', 'Internal', b'1', b'1', b'1', 'Nơi có địa thế đẹp, tọa lạc bên tòa VINHOME sang trọng & đẳng cấp', '0374550289', '21', b'1', '2020-07-26', 'Hà Noi', '0374550289', 'PH08312', b'1', b'1', 3),
(3, 'Trung tâm đào tạo tiếng anh ECORP BẮC TỪ LIÊM', 'Số 1 đình nguyên xá, bắc từ liêm, hà nội', 'Thanh Xuân', '2020-07-26', 'Hà Nội', 'Việt Nam', 'Internal', b'1', b'1', b'1', 'Nơi có địa thế đẹp, tọa lạc bên tòa VINHOME sang trọng & đẳng cấp', '0374550289', '21', b'1', '2020-07-26', 'Hà Noi', '0374550289', 'PH08312', b'1', b'1', 3);

-- --------------------------------------------------------

--
-- Table structure for table `programme`
--

CREATE TABLE `programme` (
  `ProgrammeID` bigint(255) NOT NULL,
  `programeName` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `description` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `isactive` bit(1) NOT NULL DEFAULT b'0',
  `ContactID` bigint(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `programme`
--

INSERT INTO `programme` (`ProgrammeID`, `programeName`, `description`, `isactive`, `ContactID`) VALUES
(1, 'Jobfair 2020 `', 'Ngày hội việc làm của FPT Polytechic, với sự tham gia của các nhà tuyển dụng chất lượng trong nước', b'1', 4),
(2, 'Khán giả “ngả mũ” trước màn lột xác 360 độ của các “bóng hồng” ĐH FPT', 'Ngày 29/9, La Rose En Vert – Sự kiện được mong chờ nhất trong tháng rèn luyện quân sự dành cho sinh viên Khoá 14 ĐH FPT đã diễn ra. Nóng bỏng, táo bạo và đầy bất ngờ, khán giả đã phải “ngả mũ” trước sự lột xác hoàn toàn của các nam sinh trong những bộ cánh vô cùng lộng lẫy.', b'0', 1),
(3, 'Tham gia và kết nối với cộng đồng sinh viên ', 'Học tập tại RMIT Việt Nam, bạn đã trở thành một phần của cộng đồng sinh viên năng động, thân thiện và cùng hòa nhập vào hàng loạt các sự kiện xã hội, văn hóa, thể thao diễn ra tại trường.\r\n\r\nHãy vui chơi, kết bạn và khám phá trọn vẹn cuộc sống sinh viên tại RMIT! Mỗi năm, hàng trăm sự kiện được tổ chức, từ những buổi hòa nhạc quy mô lớn, các lễ hội đến triển lãm nghệ thuật, hội thảo và các hành trình tình nguyện vì cộng đồng.', b'0', 5),
(4, 'Trường ĐHHN và Đại học Kinh tế Tài chính Vân Nam thiết lập quan hệ hợp tác song phương', 'Ngày 12 tháng 4 năm 2013, Phó Hiệu trưởng Nguyễn Thị Cúc Phương đã tiếp và làm việc với ông Kim Quốc Hưng, Bí thư Học viện ASEAN - Đại học Kinh tế Tài chính Vân Nam (Trung Quốc) nhân dịp ông Kim Quốc Hưng và đoàn sang thăm và làm việc với Trường ĐHHN.\r\n\r\nTại buổi làm việc, hai trường đã bàn bạc về việc ký kết thỏa thuận hợp tác làm cơ sở pháp lý thực hiện các chương trình trao đổi sinh viên, giáo viên, xây dựng chương trình liên kết đào tạo 1+3, 2+2. Chương trình hợp tác này được thực hiện sẽ tạ', b'0', 2);

-- --------------------------------------------------------

--
-- Table structure for table `referencedata`
--

CREATE TABLE `referencedata` (
  `RefID` bigint(255) NOT NULL,
  `RefCode` varchar(200) NOT NULL,
  `RefValue` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

CREATE TABLE `service` (
  `ServiceID` bigint(255) NOT NULL,
  `serviceName` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `shortDescription` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `subType` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `clientDescription` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `serviceStart` date NOT NULL DEFAULT current_timestamp(),
  `serviceEnd` date NOT NULL DEFAULT current_timestamp(),
  `serviceEntendable` bit(1) NOT NULL DEFAULT b'0',
  `serviceActive` bit(1) NOT NULL DEFAULT b'0',
  `fullDescription` text CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `deptCode` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `deliverDescription` text CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `contractCode` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `contractValue` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `contractPayment` bit(1) NOT NULL DEFAULT b'0',
  `serviceTimelimit` bit(1) NOT NULL DEFAULT b'0',
  `ContactID` bigint(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `service`
--

INSERT INTO `service` (`ServiceID`, `serviceName`, `shortDescription`, `subType`, `clientDescription`, `serviceStart`, `serviceEnd`, `serviceEntendable`, `serviceActive`, `fullDescription`, `deptCode`, `deliverDescription`, `contractCode`, `contractValue`, `contractPayment`, `serviceTimelimit`, `ContactID`) VALUES
(2, 'THIẾT KẾ WEBSITE CHẤT LƯỢNG', 'THIẾT KẾ WEBSITE CHUYÊN NGHIỆP & ĐẲNG CẤP', '1', 'DỊCH VỤ TUYỆT VỜI CHẤT LƯỢNG 5 SAO', '2020-07-21', '2020-07-29', b'1', b'1', 'Dịch vụ thiết kế web không chỉ đẹp mắt ✅✅ mà còn mang về nhiều lượt truy cập, nhiều đơn hàng. Công ty thiết kế website chuyên nghiệp ', '131231', 'Đống đa hà nội', 'COD123', 'COD456', b'1', b'0', 1),
(3, 'TRUNG TÂM DẠY TIẾNG ANH ECORP BẮC TỪ LIÊM', 'Ecorp English Bắc Từ Liêm', 'Ecorp English Bắc Từ Liêm', 'Nơi dạy tiếng anh rất tốt, học viên chăm chỉ, giáo viên chuyên nghiệp', '2020-07-26', '2020-07-26', b'1', b'1', 'Là nơi cung cấp dịch vụ đào tạo tiếng anh tốt nhất cả nước', 'ECORP', 'Số 1, Đình nguyên xá, Đình Thôn, Bắc Từ Liêm, Hà Nội', 'ECORP21', '191', b'0', b'0', 1),
(4, 'ĐÀO TẠO TIẾNG ANH CƠ BẢN VÀ NÂNG CAO', 'dịch vụ đào tạo tiếng anh chất lượng', '1', 'DỊCH VỤ TUYỆT VỜI CHẤT LƯỢNG 5 SAO', '2020-07-21', '2020-07-29', b'1', b'1', 'Đào tạo từ người mất gốc trở thành người bản xứ ', '131231', 'Đống đa hà nội', 'COD123', 'COD456', b'1', b'0', 1);

-- --------------------------------------------------------

--
-- Table structure for table `supportingmaterial`
--

CREATE TABLE `supportingmaterial` (
  `SupportingMaterialID` int(255) NOT NULL,
  `OrgID` int(255) NOT NULL,
  `UserID` int(255) NOT NULL,
  `url` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `type` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `addBy` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `addDate` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `team`
--

CREATE TABLE `team` (
  `TeamID` bigint(255) NOT NULL,
  `teamName` varchar(200) NOT NULL,
  `DepartmentID` bigint(255) NOT NULL,
  `ContactID` bigint(255) NOT NULL,
  `shortDepcription` varchar(500) DEFAULT NULL,
  `address1` varchar(500) DEFAULT NULL,
  `postcode` varchar(10) NOT NULL,
  `cityTown` varchar(200) DEFAULT NULL,
  `nationCountry` varchar(200) DEFAULT NULL,
  `Country` varchar(200) DEFAULT NULL,
  `fullDescription` text NOT NULL,
  `sicCode` varchar(10) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `fax` varchar(10) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `website` varchar(50) DEFAULT NULL,
  `charityNumber` varchar(10) NOT NULL,
  `companyNumber` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `town`
--

CREATE TABLE `town` (
  `TownID` bigint(255) NOT NULL,
  `CountyID` bigint(255) NOT NULL,
  `Country` bigint(255) NOT NULL,
  `TownName` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `town`
--

INSERT INTO `town` (`TownID`, `CountyID`, `Country`, `TownName`) VALUES
(1, 1, 1, 'Hải Dương'),
(2, 1, 1, 'Hà Nội'),
(3, 1, 1, 'Hải Phòng');

-- --------------------------------------------------------

--
-- Table structure for table `trusdistrict`
--

CREATE TABLE `trusdistrict` (
  `TrustDistrictID` int(255) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `Description` varchar(500) NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'0',
  `TrustRegionID` bigint(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `trustregion`
--

CREATE TABLE `trustregion` (
  `TrustRegionID` bigint(255) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Description` varchar(1000) NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'0',
  `CountryID` bigint(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `USERID` int(255) NOT NULL,
  `ACCOUNTS` varchar(50) NOT NULL,
  `EMAIL` varchar(200) NOT NULL,
  `ROLE` int(1) NOT NULL,
  `PASSWORDS` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`USERID`, `ACCOUNTS`, `EMAIL`, `ROLE`, `PASSWORDS`) VALUES
(1, 'daotqph08312', 'daotqph08312@fpt.edu.vn', 1, '8463781b6317349dd77edd6599af5bfe'),
(2, 'cuongc500', 'cuongc500@fpt.edu.vn', 2, 'cuongc500');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`AddressID`),
  ADD KEY `TownID` (`TownID`),
  ADD KEY `CountryID` (`CountryID`),
  ADD KEY `CountyID` (`CountyID`);

--
-- Indexes for table `business`
--
ALTER TABLE `business`
  ADD PRIMARY KEY (`BusinessID`);

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`ContactID`);

--
-- Indexes for table `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`CountryID`);

--
-- Indexes for table `county`
--
ALTER TABLE `county`
  ADD PRIMARY KEY (`CountyID`),
  ADD KEY `CountryID` (`CountryID`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`DepartmentID`),
  ADD KEY `ContactID` (`ContactID`),
  ADD KEY `DirectorateID` (`DirectorateID`);

--
-- Indexes for table `directorate`
--
ALTER TABLE `directorate`
  ADD PRIMARY KEY (`DirectorateID`),
  ADD KEY `ContactID` (`ContactID`);

--
-- Indexes for table `govofficeregion`
--
ALTER TABLE `govofficeregion`
  ADD PRIMARY KEY (`GovOfficeRegionID`);

--
-- Indexes for table `organisation`
--
ALTER TABLE `organisation`
  ADD PRIMARY KEY (`OrgID`),
  ADD KEY `ContactID` (`ContactID`);

--
-- Indexes for table `premise`
--
ALTER TABLE `premise`
  ADD PRIMARY KEY (`PremiseID`),
  ADD KEY `ServiceID` (`ServiceID`);

--
-- Indexes for table `programme`
--
ALTER TABLE `programme`
  ADD PRIMARY KEY (`ProgrammeID`),
  ADD KEY `ContactID` (`ContactID`);

--
-- Indexes for table `referencedata`
--
ALTER TABLE `referencedata`
  ADD PRIMARY KEY (`RefID`);

--
-- Indexes for table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`ServiceID`),
  ADD KEY `ContactID` (`ContactID`);

--
-- Indexes for table `supportingmaterial`
--
ALTER TABLE `supportingmaterial`
  ADD PRIMARY KEY (`SupportingMaterialID`),
  ADD KEY `UserID` (`UserID`),
  ADD KEY `OrgID` (`OrgID`);

--
-- Indexes for table `team`
--
ALTER TABLE `team`
  ADD PRIMARY KEY (`TeamID`),
  ADD KEY `DepartmentID` (`DepartmentID`),
  ADD KEY `ContactID` (`ContactID`);

--
-- Indexes for table `town`
--
ALTER TABLE `town`
  ADD PRIMARY KEY (`TownID`),
  ADD KEY `Country` (`Country`),
  ADD KEY `CountyID` (`CountyID`);

--
-- Indexes for table `trusdistrict`
--
ALTER TABLE `trusdistrict`
  ADD PRIMARY KEY (`TrustDistrictID`),
  ADD KEY `TrustRegionID` (`TrustRegionID`);

--
-- Indexes for table `trustregion`
--
ALTER TABLE `trustregion`
  ADD PRIMARY KEY (`TrustRegionID`),
  ADD KEY `CountryID` (`CountryID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`USERID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
  MODIFY `AddressID` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `business`
--
ALTER TABLE `business`
  MODIFY `BusinessID` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `contact`
--
ALTER TABLE `contact`
  MODIFY `ContactID` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `country`
--
ALTER TABLE `country`
  MODIFY `CountryID` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `county`
--
ALTER TABLE `county`
  MODIFY `CountyID` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `DepartmentID` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `directorate`
--
ALTER TABLE `directorate`
  MODIFY `DirectorateID` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `govofficeregion`
--
ALTER TABLE `govofficeregion`
  MODIFY `GovOfficeRegionID` bigint(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `organisation`
--
ALTER TABLE `organisation`
  MODIFY `OrgID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `premise`
--
ALTER TABLE `premise`
  MODIFY `PremiseID` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `programme`
--
ALTER TABLE `programme`
  MODIFY `ProgrammeID` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `referencedata`
--
ALTER TABLE `referencedata`
  MODIFY `RefID` bigint(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `service`
--
ALTER TABLE `service`
  MODIFY `ServiceID` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `supportingmaterial`
--
ALTER TABLE `supportingmaterial`
  MODIFY `SupportingMaterialID` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `team`
--
ALTER TABLE `team`
  MODIFY `TeamID` bigint(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `town`
--
ALTER TABLE `town`
  MODIFY `TownID` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `trusdistrict`
--
ALTER TABLE `trusdistrict`
  MODIFY `TrustDistrictID` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `trustregion`
--
ALTER TABLE `trustregion`
  MODIFY `TrustRegionID` bigint(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `USERID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `address`
--
ALTER TABLE `address`
  ADD CONSTRAINT `address_ibfk_1` FOREIGN KEY (`TownID`) REFERENCES `town` (`TownID`),
  ADD CONSTRAINT `address_ibfk_2` FOREIGN KEY (`CountryID`) REFERENCES `country` (`CountryID`),
  ADD CONSTRAINT `address_ibfk_3` FOREIGN KEY (`CountyID`) REFERENCES `county` (`CountyID`);

--
-- Constraints for table `county`
--
ALTER TABLE `county`
  ADD CONSTRAINT `county_ibfk_1` FOREIGN KEY (`CountryID`) REFERENCES `country` (`CountryID`);

--
-- Constraints for table `department`
--
ALTER TABLE `department`
  ADD CONSTRAINT `department_ibfk_1` FOREIGN KEY (`ContactID`) REFERENCES `contact` (`ContactID`),
  ADD CONSTRAINT `department_ibfk_2` FOREIGN KEY (`DirectorateID`) REFERENCES `directorate` (`DirectorateID`);

--
-- Constraints for table `directorate`
--
ALTER TABLE `directorate`
  ADD CONSTRAINT `directorate_ibfk_1` FOREIGN KEY (`ContactID`) REFERENCES `contact` (`ContactID`);

--
-- Constraints for table `organisation`
--
ALTER TABLE `organisation`
  ADD CONSTRAINT `organisation_ibfk_1` FOREIGN KEY (`ContactID`) REFERENCES `contact` (`ContactID`);

--
-- Constraints for table `premise`
--
ALTER TABLE `premise`
  ADD CONSTRAINT `premise_ibfk_1` FOREIGN KEY (`ServiceID`) REFERENCES `service` (`ServiceID`);

--
-- Constraints for table `programme`
--
ALTER TABLE `programme`
  ADD CONSTRAINT `programme_ibfk_1` FOREIGN KEY (`ContactID`) REFERENCES `contact` (`ContactID`);

--
-- Constraints for table `service`
--
ALTER TABLE `service`
  ADD CONSTRAINT `service_ibfk_1` FOREIGN KEY (`ContactID`) REFERENCES `contact` (`ContactID`);

--
-- Constraints for table `supportingmaterial`
--
ALTER TABLE `supportingmaterial`
  ADD CONSTRAINT `supportingmaterial_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `users` (`USERID`),
  ADD CONSTRAINT `supportingmaterial_ibfk_2` FOREIGN KEY (`OrgID`) REFERENCES `organisation` (`OrgID`);

--
-- Constraints for table `team`
--
ALTER TABLE `team`
  ADD CONSTRAINT `team_ibfk_1` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`),
  ADD CONSTRAINT `team_ibfk_2` FOREIGN KEY (`ContactID`) REFERENCES `contact` (`ContactID`);

--
-- Constraints for table `town`
--
ALTER TABLE `town`
  ADD CONSTRAINT `town_ibfk_1` FOREIGN KEY (`Country`) REFERENCES `country` (`CountryID`),
  ADD CONSTRAINT `town_ibfk_2` FOREIGN KEY (`CountyID`) REFERENCES `county` (`CountyID`);

--
-- Constraints for table `trusdistrict`
--
ALTER TABLE `trusdistrict`
  ADD CONSTRAINT `trusdistrict_ibfk_1` FOREIGN KEY (`TrustRegionID`) REFERENCES `trustregion` (`TrustRegionID`);

--
-- Constraints for table `trustregion`
--
ALTER TABLE `trustregion`
  ADD CONSTRAINT `trustregion_ibfk_1` FOREIGN KEY (`CountryID`) REFERENCES `country` (`CountryID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
