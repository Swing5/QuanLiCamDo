create database QuanLiCamDo
go
use QuanLiCamDo
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
	soDT	varchar(13),
	soCM	varchar(20),
	soTienCam	money,
	laiNgay		money,
	ngayCam		nchar(30),
	hanCam		nchar(30)
)
create table KhachHang(
	maKH nvarchar(20) not null primary key ,
	tenKH nvarchar(50),
	diaChi nvarchar(300),
	SDT int
)