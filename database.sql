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

insert into NhanVien(maNV,hoTen,ngaySinh,chucVu,email,sdt,gioiTinh,diaChi)
values ('NV001',N'Nguyễn Văn A','12/10/2002','Nhân Viên','aaa@gmail.com','03965226','Nam',N'Thái Nguyên')