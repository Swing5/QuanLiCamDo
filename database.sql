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
	soNgayCam	int
)
create table KhachHang(
	maKH nvarchar(20) not null primary key ,
	tenKH nvarchar(50),
	diaChi nvarchar(300),
	SDT int
)

insert into HopDong(maHD,tenKH,doCamCo,diaChi,soDT,soCM,soTienCam,laiNgay,ngayCam,soNgayCam)
values ('HD001',N'Nguyễn Văn T',N'Xe máy',N'Bình Dương','0356226554','236521452','10000000','10000','12/01/2021',30),
		('HD003',N'Nguyễn Văn A',N'Xe máy',N'Bình Dương','0356226551','236521451','10000000','10000','12/01/2021',30),
		('HD004',N'Nguyễn Văn B',N'Xe máy',N'Bình Dương','0356226552','236521453','10000000','10000','12/01/2021',30),
		('HD005',N'Nguyễn Văn C',N'Xe máy',N'Bình Dương','0356226553','236521454','10000000','10000','12/01/2021',30),
		('HD006',N'Nguyễn Văn D',N'Xe máy',N'Bình Dương','0356226555','236521455','10000000','10000','12/01/2021',30),
		('HD007',N'Nguyễn Văn E',N'Xe máy',N'Bình Dương','0356226556','236521456','10000000','10000','12/01/2021',30)