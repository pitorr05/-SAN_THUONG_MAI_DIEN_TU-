
-- Drop database nếu đã tồn tại
DROP DATABASE IF EXISTS QLTV;
CREATE DATABASE QLTV;
USE QLTV;

-- Tạo bảng book
CREATE TABLE book(
    bookId VARCHAR(10) NOT NULL,
    nameB VARCHAR(50) NOT NULL,
    category VARCHAR(50) NULL,
    author VARCHAR(50) NULL,
    producer VARCHAR(50) NULL,
    price FLOAT NULL,
    count INT NULL,
    PRIMARY KEY (bookId ASC)
);

-- Tạo bảng employee
CREATE TABLE employee(
    tk VARCHAR(50) NOT NULL,
    passwd VARCHAR(50) NULL,
    name VARCHAR(20) NULL,
    gender VARCHAR(5) NULL,
    birthdayS DATE NULL,
    address VARCHAR(50) NULL,
    phone VARCHAR(11) NULL,
    PRIMARY KEY (tk)
);

-- Tạo bảng registerbook
CREATE TABLE registerbook(
    studentId VARCHAR(20) NOT NULL,
    bookId VARCHAR(20) NOT NULL,
    amount INT NULL,
    borrowDate VARCHAR(50) NULL,
    appointDate VARCHAR(50) NULL,
    payDate VARCHAR(50) NULL,
    giveBookBack VARCHAR(30) NULL,
    PRIMARY KEY (studentId ASC, bookId ASC)
);

-- Tạo bảng student
CREATE TABLE student(
    studentId VARCHAR(12) NOT NULL,
    nameS VARCHAR(50) NULL,
    gender VARCHAR(5) NULL,
    birthdayS DATE NULL,
    class VARCHAR(25) NULL,
    address VARCHAR(30) NULL,
    marjor VARCHAR(30) NULL,
    phone VARCHAR(11) NULL,
    mail VARCHAR(50) NULL,
    passwd VARCHAR(50) NULL,
    PRIMARY KEY (studentId ASC)
);

-- INSERT dữ liệu vào book (10 cuốn)
INSERT INTO book (bookId, nameB, category, author, producer, price, count) VALUES
('PTIT1001', 'Lập Trình Hướng Đối Tượng', 'Công nghệ thông tin', 'Nguyễn Văn An', 'Đại học Bách Khoa Hà Nội', 125000.0, 15),
('PTIT1002', 'An Toàn Mạng Máy Tính', 'An toàn thông tin', 'Trần Thị Bình', 'Học viện Công nghệ Bưu chính Viễn thông', 185000.0, 8),
('PTIT1003', 'Kỹ Thuật Viễn Thông', 'Điện tử viễn thông', 'Lê Văn Cường', 'Đại học Công nghệ - ĐHQGHN', 215000.0, 12),
('PTIT1004', 'Trí Tuệ Nhân Tạo', 'Khoa học máy tính', 'Phạm Thị Dung', 'Đại học FPT', 275000.0, 20),
('PTIT1005', 'Cơ Sở Dữ Liệu', 'Công nghệ thông tin', 'Hoàng Văn Em', 'Đại học Bách Khoa TP.HCM', 95000.0, 25),
('PTIT1006', 'Mã Hóa Thông Tin', 'An toàn thông tin', 'Vũ Thị Phương', 'Học viện Kỹ thuật Mật mã', 165000.0, 10),
('PTIT1007', 'Thiết Kế Vi Mạch', 'Điện tử viễn thông', 'Đặng Văn Giang', 'Đại học Công nghiệp Hà Nội', 235000.0, 6),
('PTIT1008', 'Học Máy và Ứng Dụng', 'Khoa học máy tính', 'Bùi Thị Hà', 'Đại học Khoa học Tự nhiên', 195000.0, 18),
('PTIT1009', 'Phát Triển Web', 'Công nghệ thông tin', 'Nguyễn Văn Hùng', 'Đại học Thủy lợi', 115000.0, 22),
('PTIT1010', 'Điều Tra Số', 'An toàn thông tin', 'Trần Văn Khánh', 'Học viện An ninh Nhân dân', 145000.0, 7);

-- INSERT dữ liệu vào student (40 sinh viên)
INSERT INTO student (studentId, nameS, gender, birthdayS, class, address, marjor, phone, mail, passwd) VALUES
-- Công nghệ thông tin (10 sinh viên)
('CN1001', 'Nguyễn Văn An', 'Nam', '1998-05-15', 'CN05', 'Hà Nội', 'Công nghệ thông tin', '0987654321', 'nguyenvanan@gmail.com', 'ptit123'),
('CN1002', 'Hoàng Văn Em', 'Nam', '1996-11-25', 'CN09', 'Hồ Chí Minh', 'Công nghệ thông tin', '0933456789', 'hoanganhem@gmail.com', 'ptit123'),
('CN1003', 'Nguyễn Văn Hùng', 'Nam', '1997-04-08', 'CN01', 'Quảng Ninh', 'Công nghệ thông tin', '0976543210', 'nguyenvanhung@gmail.com', 'ptit123'),
('CN1004', 'Hoàng Thị Ngọc', 'Nữ', '2002-12-03', 'CN03', 'Thái Nguyên', 'Công nghệ thông tin', '0932109876', 'hoangthingoc@gmail.com', 'ptit123'),
('CN1005', 'Trần Văn Long', 'Nam', '1995-09-14', 'CN07', 'Bắc Ninh', 'Công nghệ thông tin', '0987766554', 'tranvanlong@gmail.com', 'ptit123'),
('CN1006', 'Lê Thị Hoa', 'Nữ', '2000-03-20', 'CN02', 'Hải Phòng', 'Công nghệ thông tin', '0911223344', 'lethihoa@gmail.com', 'ptit123'),
('CN1007', 'Phạm Văn Tú', 'Nam', '1999-07-30', 'CN08', 'Nam Định', 'Công nghệ thông tin', '0922334455', 'phamvantu@gmail.com', 'ptit123'),
('CN1008', 'Vũ Thị Lan', 'Nữ', '2001-11-08', 'CN04', 'Hải Dương', 'Công nghệ thông tin', '0933445566', 'vuthilan@gmail.com', 'ptit123'),
('CN1009', 'Đặng Văn Sơn', 'Nam', '1998-02-14', 'CN06', 'Quảng Ninh', 'Công nghệ thông tin', '0944556677', 'dangvanson@gmail.com', 'ptit123'),
('CN1010', 'Bùi Thị Mai', 'Nữ', '2003-06-25', 'CN10', 'Vĩnh Phúc', 'Công nghệ thông tin', '0955667788', 'buithimai@gmail.com', 'ptit123'),

-- An toàn thông tin (10 sinh viên)
('AT1001', 'Trần Thị Bình', 'Nữ', '1999-08-22', 'AT08', 'Hải Phòng', 'An toàn thông tin', '0912345678', 'tranthibinh@gmail.com', 'ptit123'),
('AT1002', 'Vũ Thị Phương', 'Nữ', '1999-07-18', 'AT02', 'Nghệ An', 'An toàn thông tin', '0924567890', 'vuthiphuong@gmail.com', 'ptit123'),
('AT1003', 'Trần Văn Khánh', 'Nam', '2000-06-20', 'AT04', 'Bình Dương', 'An toàn thông tin', '0965432109', 'tranvankhanh@gmail.com', 'ptit123'),
('AT1004', 'Vũ Văn Phong', 'Nam', '1997-03-17', 'AT06', 'Nam Định', 'An toàn thông tin', '0921098765', 'vuvanphong@gmail.com', 'ptit123'),
('AT1005', 'Phạm Thị Mai', 'Nữ', '2004-07-08', 'AT09', 'Hưng Yên', 'An toàn thông tin', '0976655443', 'phamthimai@gmail.com', 'maicute'),
('AT1006', 'Nguyễn Thị Hằng', 'Nữ', '2000-12-12', 'AT03', 'Thanh Hóa', 'An toàn thông tin', '0912345689', 'nguyenthihang@gmail.com', 'ptit123'),
('AT1007', 'Lê Văn Đức', 'Nam', '1998-04-18', 'AT07', 'Hà Tĩnh', 'An toàn thông tin', '0923456789', 'levanduc@gmail.com', 'ptit123'),
('AT1008', 'Hoàng Thị Thảo', 'Nữ', '2002-09-05', 'AT01', 'Thái Bình', 'An toàn thông tin', '0934567890', 'hoangthithao@gmail.com', 'ptit123'),
('AT1009', 'Phạm Văn Hiếu', 'Nam', '1999-01-25', 'AT05', 'Ninh Bình', 'An toàn thông tin', '0945678901', 'phamvanhieu@gmail.com', 'hieuhieu'),
('AT1010', 'Trần Thị Ngọc', 'Nữ', '2001-05-30', 'AT10', 'Hòa Bình', 'An toàn thông tin', '0956789012', 'tranthingoc@gmail.com', 'ngocthitran'),

-- Điện tử viễn thông (10 sinh viên)
('DT1001', 'Lê Văn Cường', 'Nam', '1997-12-10', 'DT03', 'Đà Nẵng', 'Điện tử viễn thông', '0978123456', 'levancuong@gmail.com', 'ptit123'),
('DT1002', 'Đặng Văn Giang', 'Nam', '1998-09-05', 'DT06', 'Thanh Hóa', 'Điện tử viễn thông', '0915678901', 'dangvangiang@gmail.com', 'ptit123'),
('DT1003', 'Lê Thị Lan', 'Nữ', '1999-02-14', 'DT08', 'Đồng Nai', 'Điện tử viễn thông', '0954321098', 'lethilan@gmail.com', 'lanye'),
('DT1004', 'Đặng Thị Quỳnh', 'Nữ', '2000-11-09', 'DT10', 'Hải Dương', 'Điện tử viễn thông', '0910987654', 'dangthiquynh@gmail.com', 'ptit123'),
('DT1005', 'Lê Văn Nam', 'Nam', '2005-01-30', 'DT04', 'Thái Bình', 'Điện tử viễn thông', '0965544332', 'levannam@gmail.com', 'ptit123'),
('DT1006', 'Nguyễn Thị Vân', 'Nữ', '2001-08-15', 'DT02', 'Quảng Nam', 'Điện tử viễn thông', '0911223345', 'nguyenthivan@gmail.com', 'ptit123'),
('DT1007', 'Trần Văn Hải', 'Nam', '1998-06-22', 'DT07', 'Khánh Hòa', 'Điện tử viễn thông', '0922334456', 'tranvanhai@gmail.com', 'ptit123'),
('DT1008', 'Phạm Thị Linh', 'Nữ', '2002-03-11', 'DT01', 'Bình Định', 'Điện tử viễn thông', '0933445567', 'phamthilinh@gmail.com', 'linhpham'),
('DT1009', 'Vũ Văn Thành', 'Nam', '1999-10-28', 'DT09', 'Phú Yên', 'Điện tử viễn thông', '0944556678', 'vuvanthanh@gmail.com', 'ptit123'),
('DT1010', 'Hoàng Thị Nga', 'Nữ', '2003-04-17', 'DT05', 'Quảng Ngãi', 'Điện tử viễn thông', '0955667789', 'hoangthinga@gmail.com', 'boxing'),

-- Khoa học máy tính (10 sinh viên)
('KH1001', 'Phạm Thị Dung', 'Nữ', '2000-03-30', 'KH07', 'Cần Thơ', 'Khoa học máy tính', '0966789123', 'phamthidung@gmail.com', 'ptit123'),
('KH1002', 'Bùi Thị Hà', 'Nữ', '2001-01-12', 'KH10', 'Hà Tĩnh', 'Khoa học máy tính', '0989012345', 'buithiha@gmail.com', 'ptit123'),
('KH1003', 'Phạm Văn Minh', 'Nam', '1998-10-28', 'KH05', 'Bà Rịa - Vũng Tàu', 'Khoa học máy tính', '0943210987', 'phamvanminh@gmail.com', 'ptit123'),
('KH1004', 'Nguyễn Thị Kim', 'Nữ', '2003-04-25', 'KH02', 'Vĩnh Phúc', 'Khoa học máy tính', '0998877665', 'nguyenthikim@gmail.com', 'ptit123'),
('KH1005', 'Hoàng Văn Phúc', 'Nam', '2006-06-12', 'KH08', 'Quảng Nam', 'Khoa học máy tính', '0954433221', 'hoangvanphuc@gmail.com', 'ptit123'),
('KH1006', 'Lê Thị Thu', 'Nữ', '2002-07-19', 'KH04', 'Đắk Lắk', 'Khoa học máy tính', '0912345698', 'lethithu@gmail.com', 'ptit123'),
('KH1007', 'Trần Văn Tài', 'Nam', '1997-05-03', 'KH06', 'Lâm Đồng', 'Khoa học máy tính', '0923456798', 'tranvantai@gmail.com', 'taideptrai'),
('KH1008', 'Nguyễn Thị Xuân', 'Nữ', '2004-02-14', 'KH01', 'Gia Lai', 'Khoa học máy tính', '0934567898', 'nguyenthixuan@gmail.com', 'ptit123'),
('KH1009', 'Phạm Văn Hậu', 'Nam', '2000-11-08', 'KH03', 'Kon Tum', 'Khoa học máy tính', '0945678998', 'phamvanhau@gmail.com', 'ptit123'),
('KH1010', 'Vũ Thị Liên', 'Nữ', '2005-09-22', 'KH09', 'Đồng Tháp', 'Khoa học máy tính', '0956789098', 'vuthilien@gmail.com', 'ptit123');

-- INSERT dữ liệu registerbook (20 bản ghi)
INSERT INTO registerbook (studentId, bookId, amount, borrowDate, appointDate, payDate, giveBookBack) VALUES
('CN1001', 'PTIT1001', 2, '15/03/2022 09:30:15', '18/03/2022', '20/04/2022 14:25:30', 'Đã trả'),
('AT1001', 'PTIT1002', 1, '22/06/2022 14:45:20', '25/06/2022', '30/07/2022 10:15:45', 'Đã trả'),
('DT1001', 'PTIT1003', 3, '10/09/2022 11:20:35', '13/09/2022', '15/10/2022 16:40:20', 'Đã trả'),
('KH1001', 'PTIT1004', 1, '05/01/2023 08:15:10', '08/01/2023', '10/02/2023 11:30:55', 'Đã trả'),
('CN1002', 'PTIT1005', 2, '18/04/2023 13:50:40', '21/04/2023', '', 'Chưa trả'),
('AT1002', 'PTIT1006', 4, '30/07/2023 10:35:25', '02/08/2023', '05/09/2023 14:20:30', 'Đã trả'),
('DT1002', 'PTIT1007', 1, '12/11/2023 15:40:50', '15/11/2023', '', 'Chưa trả'),
('KH1002', 'PTIT1008', 3, '25/02/2024 07:25:30', '28/02/2024', '30/03/2024 13:10:25', 'Đã trả'),
('CN1003', 'PTIT1009', 2, '08/05/2022 16:15:45', '11/05/2022', '15/06/2022 10:50:35', 'Đã trả'),
('AT1003', 'PTIT1010', 1, '20/08/2022 12:30:20', '23/08/2022', '25/09/2022 15:35:50', 'Đã trả'),
('DT1003', 'PTIT1001', 2, '03/12/2022 09:45:15', '06/12/2022', '10/01/2023 12:25:40', 'Đã trả'),
('KH1003', 'PTIT1002', 1, '15/03/2023 14:20:30', '18/03/2023', '', 'Chưa trả'),
('CN1004', 'PTIT1003', 3, '28/06/2023 11:10:45', '01/07/2023', '05/08/2023 16:45:30', 'Đã trả'),
('AT1004', 'PTIT1004', 2, '10/10/2023 08:55:20', '13/10/2023', '15/11/2023 14:30:15', 'Đã trả'),
('DT1004', 'PTIT1005', 1, '22/01/2024 13:40:35', '25/01/2024', '', 'Chưa trả'),
('KH1004', 'PTIT1006', 2, '05/04/2024 10:25:50', '08/04/2024', '12/05/2024 15:40:20', 'Đã trả'),
('CN1005', 'PTIT1007', 1, '18/07/2024 15:30:15', '21/07/2024', '25/08/2024 11:15:35', 'Đã trả'),
('AT1005', 'PTIT1008', 3, '30/10/2024 12:45:40', '02/11/2024', '06/12/2024 09:30:25', 'Đã trả'),
('DT1005', 'PTIT1009', 2, '12/02/2025 07:20:30', '15/02/2025', '20/03/2025 14:50:15', 'Đã trả'),
('KH1005', 'PTIT1010', 1, '25/05/2025 16:35:45', '28/05/2025', '', 'Chưa trả');

INSERT INTO employee (tk, passwd, name, gender, birthdayS, address, phone) VALUES 
('admin', 'admin', 'Nguyễn Văn Long', 'Nam', '2004-10-03', 'Nam Định', '0987123456');



