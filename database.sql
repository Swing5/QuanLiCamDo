create database QuanLiCamDo2
go
use QuanLiCamDo2
go
create table NguoiDung(
	tenDN nvarchar(20) not null primary key,
	SDT nchar(12) not null,
	matKhau nchar(20) not null
)
go
create table NhanVien(
	maNV	nvarchar(20) not null primary key,
	hoTen	nvarchar(50) not null,
	ngaySinh varchar(20) ,
	chucVu	nvarchar(50) ,
	email	nchar(50),
	sdt		nchar(20),
	gioiTinh	nvarchar(10),
	diaChi		nvarchar(50)
	)

go 
create table HopDong(
	maHD	varchar(10) not null primary key,
	tenKH	nvarchar(50) not null,
	doCamCo	nvarchar(50) not null,
	diaChi	nvarchar(50) not null,
	soDT	nvarchar(13),
	soCM	nvarchar(20),
	soTienCam	nvarchar(13),
	laiNgay		nvarchar(13),
	ngayCam		nvarchar(20),
	soNgayCam	nvarchar(10),
	giaHan		nvarchar(10) default '0',
	liDo		nvarchar(100)
)
create table KhachHang(
	maKH nvarchar(20) not null primary key ,
	tenKH nvarchar(50),
	diaChi nvarchar(300),
	SDT int
)
go
insert into HopDong(maHD,tenKH,doCamCo,diaChi,soDT,soCM,soTienCam,laiNgay,ngayCam,soNgayCam)
values ('HD001',N'Nguyễn Văn T',N'Xe máy',N'Bình Dương','0356226554','236521452','100000','10000','12/01/2021','30'),
		('HD003',N'Nguyễn Văn A',N'Xe máy',N'Bình Dương','0356226551','236521451','10000','10000','12/01/2021','30'),
		('HD004',N'Nguyễn Văn B',N'Xe máy',N'Bình Dương','0356226552','236521453','100000','10000','12/01/2021','30'),
		('HD005',N'Nguyễn Văn C',N'Xe máy',N'Bình Dương','0356226553','236521454','10000','10000','12/01/2021','20'),
		('HD006',N'Nguyễn Văn D',N'Xe máy',N'Bình Dương','0356226555','236521455','10000000','10000','12/01/2021','20'),
		('HD007',N'Nguyễn Văn E',N'Xe máy',N'Bình Dương','0356226556','236521456','10000000','10000','12/01/2021','40')

go
insert into KhachHang(maKH,tenKH,diaChi,SDT)
values ('KH001',N'Nguyễn Văn A',N'Đà Nẵng','0920930940'),
		('KH002',N'Nguyễn Văn B',N'Đà Nẵng','0920930941'),
		('KH003',N'Nguyễn Văn C',N'Đà Nẵng','0920930942'),
		('KH004',N'Nguyễn Văn D',N'Đà Nẵng','0920930943'),
		('KH005',N'Nguyễn Văn E',N'Đà Nẵng','0920930944'),
		('KH006',N'Nguyễn Văn F',N'Đà Nẵng','0920930945'),
		('KH007',N'Nguyễn Văn G',N'Đà Nẵng','0920930946')



