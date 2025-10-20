drop database if exists QLTV;
CREATE DATABASE QLTV;

USE QLTV;

-- drop table book; 
CREATE TABLE book(
	bookId varchar(10) NOT NULL,
	nameB varchar(50) NOT NULL,
	category varchar(50) NULL,
	author varchar(50) NULL,
	producer varchar(50) NULL,
	price float NULL,
	count int NULL,
	PRIMARY KEY ( bookId ASC )
);

CREATE TABLE employee(
	tk varchar(50) NULL,
	passwd varchar(50) NULL,
	name varchar(20) NULL,
	gender varchar(5) NULL,
	birthdayS date NULL,
	address varchar(50) NULL,
	phone varchar(11) NULL
);


CREATE TABLE registerbook(
	studentId varchar(20) NOT NULL,
	bookId varchar(20) NOT NULL,
	amount int NULL,
	borrowDate varchar(50) NULL,
	appointDate varchar(50) NULL,
	payDate varchar(50) NULL,
	giveBookBack varchar(30) NULL,
	CONSTRAINT p_ka PRIMARY KEY 
(
	studentId ASC,
	bookId ASC
));

CREATE TABLE student(
	studentId varchar(8) NOT NULL,
	nameS varchar(50) NULL,
	gender varchar(5) NULL,
	birthdayS date NULL,
	class varchar(25) NULL,
	address varchar(30) NULL,
	marjor varchar(30) NULL,
	phone varchar(11) NULL,
	mail varchar(50) NULL,
	passwd varchar(50) NULL,
	PRIMARY KEY ( studentId ASC )
);

INSERT into book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10001', 'Chương Trình Dịch', 'Công Nghệ Thông  Ti', 'Nguyễn Văn Phác', 'Học Viện Kĩ Thuật Mật Mã', 12500, 17);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10002', 'Lập Trình Hướng Đối Tượng', 'Công Nghệ Thông Ti', 'Lê Bá Cường', 'Học Viện Kĩ Thuật Mật Mã', 22500, 56);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10003', 'Kỹ Thuật Máy Tính', 'Công Nghệ Thông Ti', 'Vũ Văn Kiê', 'Đại Học Bách Khoa', 32500, 26);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10004', 'Cấu Trúc Dữ Liệu', 'Công Nghệ Thông Ti', 'Nguyễn Văn Phác', 'Học Viện Kĩ Thuật Mật Mã', 32500, 30);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10005', 'Cơ Sở Dữ Liệu', 'Công Nghệ Thông Ti', 'Nguyễn Thùy Trang', 'Đại Học Quốc Gia', 12500, 19);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10006', 'Hệ Thống Nhúng', 'Công Nghệ Thông Ti', 'Lê Bá Cường', 'Học Viện Kĩ Thuật Mật Mã', 22500, 26);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10007', 'Khai Thác Lỗ Hỏng', 'An Toàn Thông Ti', 'Nguyễn Thị Giang', 'Học Viện Kĩ Thuật Mật Mã', 12500, 23);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10008', 'Mã Độc', 'An Toàn Thông Ti', 'Nguyễn Ngọc Quang', 'Đại Học Khoa Học Tự Nhiê', 12500, 27);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10009', 'An Thông Mạng Không Dây', 'An Toàn Thông Ti', 'Nguyễn Văn Thắng', 'Học Viện Bưu Chính', 22000, 8);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10010', 'Quản Lý An Toàn Thông Ti', 'An Toàn Thông Ti', 'Đồng Văn Nghĩa', 'Đại Học FPT', 42000, 29);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10011', 'Tấn Công Và Phòng Thủ HT ', 'An Toàn Thông Ti', 'Đặng Xuân Nghĩa', 'Học Viện Kĩ Thuật Mật Mã', 12500, 27);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10012', 'Thiết Kế Vi Mạch Số', 'Điện Tử Viễn Thông', 'Lý Ngọc Ánh', 'Học Viện Kĩ Thuật Mật Mã', 32000, 48);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10013', 'Cơ Sở Điều Khiể', 'Điện Tử Viễn Thông', 'Trần Xuân Hùng', 'Học Viện Bưu Chính', 44500, 28);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10014', 'Điện Tử Tương Tự', 'Điện Tử Viễn Thông', 'Nguyễn Hồng Phong', 'Học Viện Kĩ Thuật Mật Mã', 42500, 30);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10015', 'Hệ Thống Viễn Thông', 'Điện Tử Viễn Thông', 'Nguyễn Văn Phượng', 'Học Viện Kĩ Thuật Mật Mã', 32500, 30);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10016', 'Linux và Phần mền mã mở', 'Công Nghệ Thông  Ti', 'Trần Văn Xuâ', 'Đại Học Công Nghệ', 22500, 18);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10017', 'Toán Rời Rạc', 'Đại Cương', 'Nguyễn Hữu Cường', 'Đại Học Kĩ Thuật Hưng Yê', 13500, 12);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10018', 'Toán a2', 'Đại Cương', 'Nguyễn Văn Đệ', 'Học Viện Kĩ Thuật Mật Mã', 23500, 10);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10020', 'An Toàn Mạng', 'An Toàn Thông Ti', 'Nguyễn Hữu Nghĩa', 'Học Viện Kĩ Thuật Mật Mã', 12500, 100);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10021', 'Cơ Sở Dữ Liệu', 'Công Nghệ Thông Ti', 'Lê Bá Cường', 'Học Viện Kĩ Thuật Mật Mã', 12500, 39);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10022', 'Cơ Sở Dữ Liệu', 'Công Nghệ Thông Ti', 'Nguyễn Văn Phác', 'Học Viện Kĩ Thuật Mật Mã', 29000, 20);
INSERT book (bookId, nameB, category, author, producer, price, count) VALUES ('KMA10023', 'Chương trình dịch', 'Công Nghệ Thông Ti', 'Nguyễn Văn Đồng', 'Đại Học FPT', 13000, 97);
-- INSERT employee (tk, passwd, name, gender, birthdayS, address, phone); VALUES ('admi', 'admin456', 'Nguyễn Xuân Tuấn Anh', 'Nam', CAST('1992-12-09' AS Date), 'HÀ NỘI', '0981089125');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10001', 2, '01/11/2022 00:50:12', '06/11/2022', '26/11/2022 16:41:43', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10002', 1, '01/10/2022 09:25:12', '06/10/2022', '26/11/2022 15:57:59', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10003', 2, '02/12/2022 23:57:41', '06/12/2022', '16/12/2022 10:56:54', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10005', 2, '19/12/2022 00:08:26', '26/12/2022', '', 'chưa trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10008', 1, '25/11/2022 15:13:24', '11/10/2023', '21/12/2022 16:44:45', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10009', 2, '02/12/2022 23:58:21', '12/12/2022', '15/12/2022 22:59:08', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10010', 1, '05/12/2022 08:26:46', '15/12/2022', '18/12/2022 16:31:26', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10011', 3, '18/12/2022 16:20:56', '19/12/2022', '18/12/2022 17:35:59', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10012', 2, '18/12/2022 16:31:13', '21/12/2022', '18/12/2022 17:52:14', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10013', 2, '18/12/2022 17:35:49', '20/12/2022', '21/12/2022 10:04:06', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10016', 3, '18/12/2022 17:51:49', '30/12/2022', '21/12/2022 10:01:36', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10018', 3, '21/12/2022 16:43:48', '28/12/2022', '', 'chưa trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10021', 1, '19/12/2022 00:33:08', '27/12/2022', '', 'chưa trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171001', 'KMA10023', 3, '21/12/2022 16:44:14', '29/12/2022', '', 'chưa trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171002', 'KMA10001', 1, '22/11/2022 11:10:06', '26/11/2022', '28/11/2022 20:17:24', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171002', 'KMA10002', 1, '25/09/2022 17:20:12', '27/09/2022', '', 'chưa trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171002', 'KMA10005', 3, '12/12/2022 00:16:46', '14/12/2022', '18/12/2022 17:32:39', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171002', 'KMA10006', 2, '27/11/2022 11:29:35', '12/10/2023', '', 'chưa trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171002', 'KMA10007', 1, '26/11/2022 22:34:28', '28/11/2022', '27/11/2022 11:45:36', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171002', 'KMA10008', 1, '25/11/2022 15:23:42', '12/12/2022', '16/12/2022 10:31:05', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171002', 'KMA10009', 1, '26/11/2022 22:32:35', '28/11/2022', '21/12/2022 10:01:48', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('AT171002', 'KMA10010', 2, '05/12/2022 08:51:10', '14/12/2022', '16/12/2022 10:28:52', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051003', 'KMA10001', 1, '20/11/2022 16:50:01', '28/11/2022', '', 'chưa trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051003', 'KMA10003', 1, '01/09/2022 14:50:12', '06/09/2022', '26/11/2022 16:48:06', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051003', 'KMA10007', 2, '17/12/2022 20:49:12', '20/12/2022', '', 'chưa trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051004', 'KMA10004', 1, '20/10/2022 08:50:33', '06/11/2022', '18/12/2022 16:29:25', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051004', 'KMA10005', 1, '25/10/2022 11:50:22', '06/11/2022', '30/11/2022 07:39:57', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051004', 'KMA10006', 3, '18/12/2022 16:16:48', '20/12/2022', '', 'chưa trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051005', 'KMA10004', 2, '18/12/2022 17:31:21', '20/12/2022', '18/12/2022 17:31:38', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051005', 'KMA10006', 1, '10/10/2022 10:50:12', '06/11/2022', '17/12/2022 19:47:24', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051006', 'KMA10001', 3, '12/12/2022 00:18:34', '17/12/2022', '', 'chưa trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051006', 'KMA10002', 3, '18/12/2022 16:28:04', '20/12/2022', '18/12/2022 16:28:23', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051006', 'KMA10007', 2, '11/11/2022 14:50:11', '21/11/2022', '28/11/2022 14:58:27', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051006', 'KMA10010', 2, '17/12/2022 20:43:46', '20/12/2022', '18/12/2022 17:50:36', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051027', 'KMA10001', 2, '18/12/2022 17:49:03', '20/12/2022', '18/12/2022 17:49:21', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051027', 'KMA10002', 2, '18/12/2022 22:07:35', '25/12/2022', '21/12/2022 10:02:15', 'đã trả');
INSERT registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES ('CT051027', 'KMA10004', 2, '21/12/2022 16:39:19', '25/12/2022', '21/12/2022 16:41:20', 'đã trả');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('AT171001', 'Lê Thùy Dương', 'Nữ', CAST('1997-05-12' AS Date), 'AT17B', 'Hà Tĩnh', 'An toàn thông ti', '0372018721', 'duong@gmail.com', 'duong123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('AT171002', 'Nguyễn Thị Nga', 'Nữ', CAST('1997-05-12' AS Date), 'AT17A', 'Hà Tĩnh', 'An toàn thông ti', '0372018721', 'nga@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('AT171008', 'Phạm Trung Tính', 'Nam', CAST('1995-03-30' AS Date), 'AT17C', 'Hải Dương', 'An toàn thông ti', '0367952382', 'tinh@gmail.com', 'tinh123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('AT171010', 'Phạm Thị Giang Hương', 'Nữ', CAST('1999-02-21' AS Date), 'AT17A', 'Nam Định', 'An toàn thông ti', '0978360291', 'huong@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('AT171016', 'Lê Hồng Vâ', 'Nữ', CAST('2004-12-22' AS Date), 'AT17C', 'Nghệ A', 'Công nghệ thông ti', '0981089125', 'van@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051003', 'Trần Phương Thảo', 'Nam', CAST('1996-03-30' AS Date), 'CT5A', 'Nghệ A', 'Công nghệ thông ti', '0345718342', 'thao@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051004', 'Lê Trường A', 'Nam', CAST('1995-11-20' AS Date), 'CT5C', 'Nam Định', 'Công nghệ thông ti', '0934627827', 'truongan@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051005', 'Phạm Thị Hương Giang', 'Nữ', CAST('1999-02-21' AS Date), 'CT5B', 'Hà Nam', 'Công nghệ thông ti', '0965783101', 'giang@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051006', 'Trần Anh Bảo', 'Nam', CAST('1995-12-14' AS Date), 'CT5B', 'Ninh Bình', 'Công nghệ thông ti', '0298567150', 'bao@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051009', 'Lê An Hải', 'Nam', CAST('1995-11-20' AS Date), 'CT5A', 'Phú Thọ', 'Công nghệ thông ti', '0390217653', 'hai@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051011', 'Đồng Văn Nghĩa', 'Nam', CAST('2003-12-22' AS Date), 'CT5C', 'Bắc Giang', 'Công nghệ thông ti', '0981089111', 'nghia@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051013', 'Đặng Xuân Nam', 'nam', CAST('2001-11-13' AS Date), 'CT5C', 'Hà Nội', 'Công nghệ thông ti', '0981089141', 'nam@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051014', 'Nguyễn Văn Tuấ', 'nam', CAST('2001-11-22' AS Date), 'CT5C', 'Hà Nội', 'Công nghệ thông ti', '0981089115', 'tuan@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051015', 'Nguyễn Xuân Tuấ', 'Nam', CAST('2002-12-22' AS Date), 'CT5A', 'Bắc Giang', 'Công nghệ thông ti', '0981089121', 'tuan@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051017', 'Nguyễn Xuân Tuấn Anh', 'Nam', CAST('2002-12-22' AS Date), 'CT5C', 'Bắc Giang', 'Công Nghệ Thông Ti', '0981089125', 'xuantuananh@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051020', 'Nguyễn Văn Hùng', 'Nam', CAST('2003-12-22' AS Date), 'AT17C', 'Bắc Giang', 'Công Nghệ Thông Ti', '0981089126', 'xuananh@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051022', 'Nguyễn Văn Hùng', 'Nam', CAST('2001-12-22' AS Date), 'CT5B', 'Bắc Giang', 'Công nghệ thông ti', '0981089121', 'hung@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051023', 'Trần Bảo Ngọc', 'Nam', CAST('2002-12-12' AS Date), 'CT5A', 'Hà Nội', 'Công Nghệ Thông Ti', '0981089123', 'ngoc2212@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051024', 'Lê Bá Hùng', 'Nam', CAST('2001-12-12' AS Date), 'CT5A', 'Hà Nội', 'Công Nghệ Thông Ti', '0981089122', 'hung1122@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051025', 'Nguyễn Văn Đạt', 'Nam', CAST('2001-12-12' AS Date), 'CT5A', 'Hà Nội', 'Công nghệ thông ti', '0980189112', 'dat2212@gmail.com', 'dat1234');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051026', 'Nguyễn Xuân Hà', 'Nam', CAST('2001-12-22' AS Date), 'CT5A', 'Hà Nam', 'Công nghệ thông ti', '0981891255', 'ha2212@gmail.com', 'duong1');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051027', 'Lê Xuân Nghĩa', 'Nam', CAST('2002-12-12' AS Date), 'CT5A', 'Hà Nội', 'Công nghệ thông ti', '0981089123', 'nghia12@gmail.com', 'nghia123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('CT051028', 'Lê Văn Dũng', 'Nam', CAST('2002-12-12' AS Date), 'CT5C', 'Bắc Giang', 'Công Nghệ Thông Ti', '0981089123', 'dung1221@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('DT041012', 'Hoàng Xuân Nghĩa', 'Nam', CAST('2004-12-12' AS Date), 'DT4A', 'Hà Nội', 'Điện Tử Viễn Thông', '0981089131', 'nghia@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('DT041018', 'Đồng Văn Sơ', 'Nam', CAST('2002-11-12' AS Date), 'DT4A', 'Hà Nội', 'Điện Tử Viễn Thông', '0981089126', 'son@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('DT041019', 'Vũ Thị Ánh', 'Nữ', CAST('2004-04-13' AS Date), 'AT17B', 'Hà Tĩnh', 'Điện Tử Viễn Thông', '0981089129', 'anh11@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('DT041021', 'Lê Trọng Hùng', 'Nam', CAST('2002-12-22' AS Date), 'DT4A', 'Hà Nội', 'Điện Tử Viễn Thông', '0980189127', 'hung@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('DT041029', 'Nguyễn Văn Anh', 'Nam', CAST('2001-12-12' AS Date), 'DT4A', 'Bắc Giang', 'Điện Tử Viễn Thông', '0981089127', 'anh123@gmail.com', 'kma123');
INSERT student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES ('DT041030', 'Nguyễn Văn Hải', 'Nam', CAST('2001-12-12' AS Date), 'DT4A', 'Bắc Giang', 'Điện Tử Viễn Thông', '0981089128', 'xuananh2212@gmail.com', 'kma123');
-- ALTER TABLE student  WITH CHECK ADD CHECK  ((gender='Nam' OR gender='Nữ'));--  

-- select * from stregisterbookbookudent;
-- select * from book;
-- select * from employee;
-- 
insert employee (tk, passwd, name,gender, birthdayS, address, phone) values ('admin', 'admin', 'long', 'name', '2004-10-3', 'nammmm', '239410');
