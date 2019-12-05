drop database if exists furama_resort_tuan_c10g;
create database furama_resort_tuan_c10g;
use furama_resort_tuan_c10g;
CREATE TABLE ViTri(
	IDViTri int,
    TenViTri NVARCHAR(45) UNIQUE,
    PRIMARY KEY(IDViTri)
);
CREATE TABLE TrinhDo(
	IDTrinhDo int Primary key,
    TrinhDo NVARCHAR(45) UNIQUE
);
CREATE TABLE Bophan(
	IDBoPhan int Primary key,
    TenBoPhan NVARCHAR(45) UNIQUE
);
CREATE TABLE NhanVien(
	IDNhanVien int Primary key,
    HoTen NVARCHAR(45),
	IDVitri int,
    IDTrinhDo int,
    IDBoPhan int,
    NgaySinh DATE,
    SoCMND NVARCHAR(45) UNIQUE,
    Luong DOUBLE(11,3),
    SDT NVARCHAR(12) UNIQUE,
    Email NVARCHAR(45) UNIQUE,
    DiaChi NVARCHAR(45),
    FOREIGN KEY(IDViTri) REFERENCES vitri(IDViTri),
    FOREIGN KEY(IDTrinhDo) REFERENCES trinhdo(IDTrinhDo),
    FOREIGN KEY(IDBoPhan) REFERENCES bophan(IDBoPhan)
);
create table LoaiDichVu(
	IDLoaiDichVu int primary key,
    TenLoaiDichVu NVARCHAR(45) UNIQUE
    );
create table KieuThue(
	IDKieuThue int primary key,
    TenKieuThue NVARCHAR(45) UNIQUE,
    Gia double
    );
create table DichVu(
	IDDichVu int primary key,
    TenDichVu NVARCHAR(45),
    DienTich DOUBLE,
    SoNguoiToiDa int,
    ChiPhiThue DOUBLE(10,3),
    IDLoaiDichVu int,
    IDKieuThue int,
    TieuChuanPhong NVARCHAR(45),
    MoTaTienNghi NVARCHAR(45),
    DienTichHoBoi DOUBLE,
    SoTang int,
    TrangThai NVARCHAR(45),
    FOREIGN KEY(IDLoaiDichVu) REFERENCES LoaiDichVu(IDLoaiDichVu),
    FOREIGN KEY(IDKieuThue) REFERENCES KieuThue(IDKieuThue)
    );
create table LoaiKhach(
	IDLoaiKhach int primary key,
    TenLoaiKhach NVARCHAR(45) UNIQUE
    );
create table KhachHang(
	IDKhachHang int primary key,
    HoTen NVARCHAR(45),
    NgaySinh DATE NOT NULL,
    GioiTinh NVARCHAR(45),
    SoCMND NVARCHAR(45) UNIQUE,
    SDT NVARCHAR(45) UNIQUE,
    Email NVARCHAR(45) UNIQUE,
    IDLoaiKhach int,
    DiaChi NVARCHAR(45),
    FOREIGN KEY (IDLoaiKhach) REFERENCES LoaiKhach(IDLoaiKhach)
    );
CREATE TABLE DichVuDiKem(
	IDDichVuDiKem int primary key ,
    TenDichVuDiKem NVARCHAR(45) UNIQUE,
    Gia double,
    DonVi int,
    TrangThaiKhaDung NVARCHAR(45)
    );
CREATE TABLE HopDong(
	IDHopDong int Primary key,
    NgayLamHopDong DATE,
    NgayKetThuc DATE,
    TienDatCoc double,
    TongTien double,
    IDKhachHang int,
    IDDichVu int,
    IDNhanVien int,
    FOREIGN KEY(IDNhanVien) REFERENCES NhanVien(IDNhanVien),
    FOREIGN KEY(IDKhachHang) REFERENCES KhachHang(IDKhachHang),
    FOREIGN KEY(IDDichVu) REFERENCES DichVu(IDDichVu)
);
CREATE TABLE HopDongChiTiet(
    IDHopDong int,
    IDDichVuDiKem int,
    SoLuong int,
    primary key (IDHopDong,IDDichVuDiKem),
    FOREIGN KEY (IDHopDong) REFERENCES HopDong(IDHopDong),
    FOREIGN KEY (IDDichVuDiKem) REFERENCES DichVuDiKem(IDDichVuDiKem)
);
insert into ViTri values(1,'Trưởng phòng');
insert into ViTri values(2,'Nhân viên');
insert into TrinhDo values(1,'Đại học');
insert into TrinhDo values(2,'Cao Đẳng');
insert into Bophan values(1,'Hành chính');
insert into Bophan values(2,'Nhân sự');
insert into NhanVien values(1,'Nguyễn Văn Ha', 1,1,1,'1988:01:01','201123451',100000,'0935123451','b1@b.com','Đà Nẵng');
insert into NhanVien values(2,'Nguyễn Văn Toan', 1,1,1,'1988:01:01','201123452',100000,'0935123452','b2@b.com','Đà Nẵng');
insert into NhanVien values(3,'Nguyễn Văn Thanh', 1,1,1,'1988:01:01','201123453',100000,'0935123453','b3@b.com','Đà Nẵng');
insert into NhanVien values(4,'Nguyễn Văn Hoang', 1,1,1,'1988:01:01','201123454',100000,'0935123454','b4@b.com','Đà Nẵng');
insert into NhanVien values(5,'Nguyễn Văn Dung', 1,1,1,'1988:01:01','201123455',100000,'0935123455','b5@b.com','Đà Nẵng');
insert into LoaiDichVu values(1,'Villa');
insert into LoaiDichVu values(2,'House');
insert into LoaiDichVu values(3,'Room');
insert into KieuThue values(1,'Năm',12000000);
insert into KieuThue values(2,'Tháng',1000000);
insert into KieuThue values(3,'Ngày',100000);
insert into KieuThue values(4,'Giờ',10000);
insert into DichVu values(1,'Xuan mai',50,5,5000000,1,1,'Vip','MoTaTienNghi',25,3,'San sang');
insert into DichVu values(2,'Mai Phuong',30,3,3000000,2,2,'Vip','MoTaTienNghi',15,2,'San sang');
insert into DichVu values(3,'Thanh Phong',10,4,1000000,3,3,'Vip','MoTaTienNghi',45,1,'San sang');
insert into DichVu values(4,'Tuan Thanh',10,6,1000000,3,3,'Vip','MoTaTienNghi',55,6,'San sang');
insert into DichVu values(5,'Tuan Thanh 2',10,9,1000000,3,3,'Vip','MoTaTienNghi',105,5,'San sang');


insert into LoaiKhach values(1, 'Diamond');
insert into LoaiKhach values(2, 'Platinium');
insert into LoaiKhach values(3, 'Silver');
insert into LoaiKhach values(4, 'Member');
insert into KhachHang values(1,'Nguyen Van Hoa','1988:01:01', 0 , '201561121', '0935123451','a1@a.com', 1, 'Đà Nẵng');
insert into KhachHang values(2,'Nguyen Van Khanh','1968:01:01', 0 , '201561122', '0935123452','a2@a.com', 2, 'Quảng Ngãi');
insert into KhachHang values(3,'Nguyen Van Toan','1908:01:01', 0 , '201561123', '0935123453','a3@a.com', 3, 'Vinh');
insert into KhachHang values(4,'Nguyen Van Dung','1908:01:01', 0 , '201561124', '0935123454','a4@a.com', 1, 'Quảng Trị');
insert into KhachHang values(5,'Nguyen Van Dung','1908:01:01', 0 , '201561125', '0935123455','a5@a.com', 1, 'Quảng Trị');

insert into DichVuDiKem values(1, 'karaoke', 50000, 1,'Kha dung');
insert into DichVuDiKem values(2, 'nước ngọt', 10000, 1,'Kha dung');
insert into DichVuDiKem values(3, 'Khăn mặt', 5000, 1,'Kha dung');
insert into DichVuDiKem values(4, 'matxa', 50000, 1,'Kha dung');

insert into HopDong values(1,'2019:11:05','2019:11:15',300000,20000000,1,1,1);
insert into HopDong values(2,'2018:11:15','2019:11:25',200000,50000000,2,2,2);
insert into HopDong values(3,'2019:11:15','2019:11:25',300000,30000000,1,1,3);
insert into HopDong values(4,'2018:01:01','2019:11:25',300000,10000000,1,3,4);
insert into HopDong values(5,'2019:02:02','2019:11:25',300000,10000000,1,2,5);

insert into HopDongChiTiet values(1,1,1);
insert into HopDongChiTiet values(1,2,5);
insert into HopDongChiTiet values(1,3,10);
insert into HopDongChiTiet values(2,1,1);
insert into HopDongChiTiet values(2,2,10);
insert into HopDongChiTiet values(2,3,20);
insert into HopDongChiTiet values(3,1,5);
insert into HopDongChiTiet values(4,1,5);
insert into HopDongChiTiet values(5,1,5);
select * from ViTri;
select * from TrinhDo;
select * from BoPhan;

select * from LoaiDichVu;
select * from KieuThue;
select * from DichVu;
select * from LoaiKhach;
select * from KhachHang;
select * from DichVuDiKem;
select * from HopDong;
select * from HopDongChiTiet;


select IDNhanVien,HoTen,IDVitri from NhanVien
where HoTen like "%T%" or HoTen like "%H%" or HoTen like "%K%"
-- them dk
having char_length(nhanvien.HoTen)<15;

select IDKhachHang,HoTen,extract(year from current_date()) - extract(year from NgaySinh )  as "tuoi" from KhachHang
where  (extract(year from current_date()) - extract(year from NgaySinh ))
between 18 and 50 and  DiaChi= 'Đà Nẵng' ;

select khachhang.HoTen,IDLoaiKhach, count(hopdong.IDKhachHang) from khachhang
inner join hopdong on khachhang.IDKhachHang = hopdong.IDKhachHang
where khachhang.IDLoaiKhach = 1
order by count(hopdong.IDKhachHang);

select khachhang.IDKhachHang, khachhang.HoTen, loaikhach.TenLoaiKhach,hopdong.IDHopDong,dichvu.TenDichVu,
hopdong.NgayLamHopDong,hopdong.NgayKetThuc,(dichvu.ChiPhiThue + (hopdongchitiet.SoLuong*dichvudikem.Gia) ) as "tong tien" from loaidichvu
 left join dichvu on dichvu.IDLoaiDichVu = loaidichvu.IDLoaiDichVu
 left join hopdong on hopdong.IDDichVu = dichvu.IDDichVu 
 left join hopdongchitiet on hopdongchitiet.IDHopDong = hopdong.IDHopDong
 left join dichvudikem on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
 left join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
 left join loaikhach on khachhang.IDLoaiKhach = loaikhach.IDLoaiKhach;
 
 -- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).;
 
 select dichvu.IDDichVu,dichvu.TenDichVu,dichvu.DienTich,dichvu.ChiPhiThue,loaidichvu.TenLoaiDichVu from dichvu
 inner join loaidichvu on dichvu.IDLoaiDichVu = loaidichvu.IDLoaiDichVu
 where not exists(select hopdong.IDHopDong from hopdong 
 where (hopdong.NgayLamHopDong between "2019-01-01" and "2019-03-31") and hopdong.IDDichVu = dichvu.IDDichVu);
 
 -- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.

select dichvu.IDDichVu,dichvu.TenDichVu,dichvu.DienTich,dichvu.ChiPhiThue,loaidichvu.TenLoaiDichVu, dichvu.SoNguoiToiDa from dichvu
inner join loaidichvu on dichvu.IDLoaiDichVu = loaidichvu.IDLoaiDichVu
where exists ( select hopdong.IDDichVu from hopdong 
where year(hopdong.NgayLamHopDong) = '2018' and hopdong.IDDichVu = dichvu.IDDichVu )
and not exists ( select hopdong.IDDichVu from hopdong 
where year(hopdong.NgayLamHopDong) = '2019' and hopdong.IDDichVu = dichvu.IDDichVu );


 -- where year(hopdong.NgayLamHopDong) = '2019' and hopdong.IDDichVu = dichvu.IDDichVu)
 
-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên

-- cach 1
select distinct khachhang.HoTen from khachhang;
-- cach 2
select khachhang.HoTen, count(khachhang.HoTen) as 'dem' from khachhang group by khachhang.HoTen;
-- cach 3
select khachhang.HoTen from khachhang union select khachhang.HoTen from khachhang;
  



-- inner join loaikhach 
 -- on khachhang.IDLoaiKhach = loaikhach.IDLoaiKhach

-- inner join hopdong 
-- on khachhang.IDKhachHang = hopdong.IDKhachHang
