create database QuanLiCamDo
go
use QuanLiCamDo
go
create table NguoiDung(
	tenDN nvarchar(20) not null primary key,
	SDT nchar(12) not null,
	matKhau nchar(20) not null
)
create table KhachHang(
	maKH nvarchar(20) ,
	tenKH nvarchar(50),
	diaChi nvarchar(300),
	SDT int
)