USE [master]
GO
/****** Object:  Database [qlThuVien]    Script Date: 8/5/2018 1:12:12 PM ******/
CREATE DATABASE [qlThuVien]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'qlThuVien', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\qlThuVien.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'qlThuVien_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\qlThuVien_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [qlThuVien] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [qlThuVien].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [qlThuVien] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [qlThuVien] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [qlThuVien] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [qlThuVien] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [qlThuVien] SET ARITHABORT OFF 
GO
ALTER DATABASE [qlThuVien] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [qlThuVien] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [qlThuVien] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [qlThuVien] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [qlThuVien] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [qlThuVien] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [qlThuVien] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [qlThuVien] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [qlThuVien] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [qlThuVien] SET  DISABLE_BROKER 
GO
ALTER DATABASE [qlThuVien] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [qlThuVien] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [qlThuVien] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [qlThuVien] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [qlThuVien] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [qlThuVien] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [qlThuVien] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [qlThuVien] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [qlThuVien] SET  MULTI_USER 
GO
ALTER DATABASE [qlThuVien] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [qlThuVien] SET DB_CHAINING OFF 
GO
ALTER DATABASE [qlThuVien] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [qlThuVien] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [qlThuVien] SET DELAYED_DURABILITY = DISABLED 
GO
USE [qlThuVien]
GO
/****** Object:  Table [dbo].[account]    Script Date: 8/5/2018 1:12:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[account](
	[Usename] [nvarchar](50) NOT NULL,
	[Password] [nvarchar](50) NULL,
 CONSTRAINT [PK_account] PRIMARY KEY CLUSTERED 
(
	[Usename] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[bansao]    Script Date: 8/5/2018 1:12:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[bansao](
	[MaSach] [nvarchar](10) NOT NULL,
	[MaBanSao] [nvarchar](10) NOT NULL,
	[SoLuong] [int] NOT NULL,
 CONSTRAINT [PK_bansao] PRIMARY KEY CLUSTERED 
(
	[MaBanSao] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[docgia]    Script Date: 8/5/2018 1:12:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[docgia](
	[MaDocGia] [nvarchar](10) NOT NULL,
	[TenDocGia] [nvarchar](50) NULL,
	[NgaySinh] [date] NULL,
	[GioiTinh] [nvarchar](5) NULL,
	[DiaChi] [nvarchar](50) NULL,
	[DienThoai] [nvarchar](12) NULL,
	[Mail] [nvarchar](50) NULL,
	[Usename] [nvarchar](50) NULL,
 CONSTRAINT [PK_docgia] PRIMARY KEY CLUSTERED 
(
	[MaDocGia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[sach]    Script Date: 8/5/2018 1:12:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sach](
	[MaSach] [nvarchar](10) NOT NULL,
	[TenSach] [nvarchar](50) NULL,
	[TenTacGia] [nvarchar](50) NULL,
	[NhaXuatBan] [nvarchar](50) NULL,
	[TheLoaiSach] [nvarchar](50) NULL,
	[GiaSach] [nvarchar](50) NULL,
 CONSTRAINT [PK_sach] PRIMARY KEY CLUSTERED 
(
	[MaSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[themuon]    Script Date: 8/5/2018 1:12:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[themuon](
	[MaTheMuon] [nvarchar](10) NOT NULL,
	[MaDocGia] [nvarchar](10) NOT NULL,
	[MaThuThu] [nvarchar](10) NULL,
	[NgayMuon] [date] NULL,
	[NgayTra] [date] NULL,
	[MaSach] [nvarchar](10) NULL,
	[TienDatCoc] [int] NULL,
	[TienPhat] [int] NULL,
 CONSTRAINT [PK_themuon] PRIMARY KEY CLUSTERED 
(
	[MaTheMuon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[thuthu]    Script Date: 8/5/2018 1:12:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[thuthu](
	[MaThuThu] [nvarchar](10) NOT NULL,
	[TenThuThu] [nvarchar](50) NULL,
	[NgaySinh] [date] NULL,
	[GioiTinh] [nvarchar](5) NULL,
	[DiaChi] [nvarchar](50) NULL,
	[DienThoai] [nvarchar](12) NULL,
	[Mail] [nvarchar](50) NULL,
	[Usename] [nvarchar](50) NULL,
 CONSTRAINT [PK_thuthu] PRIMARY KEY CLUSTERED 
(
	[MaThuThu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[account] ([Usename], [Password]) VALUES (N'a', N'a')
INSERT [dbo].[account] ([Usename], [Password]) VALUES (N'b', N'b')
INSERT [dbo].[account] ([Usename], [Password]) VALUES (N'c', N'c')
INSERT [dbo].[account] ([Usename], [Password]) VALUES (N'd', N'd')
INSERT [dbo].[account] ([Usename], [Password]) VALUES (N'e', N'e')
INSERT [dbo].[account] ([Usename], [Password]) VALUES (N'l', N'l')
INSERT [dbo].[account] ([Usename], [Password]) VALUES (N'm', N'm')
INSERT [dbo].[account] ([Usename], [Password]) VALUES (N'n', N'n')
INSERT [dbo].[account] ([Usename], [Password]) VALUES (N'o', N'o')
INSERT [dbo].[account] ([Usename], [Password]) VALUES (N'p', N'p')
INSERT [dbo].[bansao] ([MaSach], [MaBanSao], [SoLuong]) VALUES (N'LTJava', N'LTJava001', 5)
INSERT [dbo].[docgia] ([MaDocGia], [TenDocGia], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'DG001', N'Nguyễn Văn A', CAST(N'1997-01-01' AS Date), N'Nam', N'Hà Nội', N'0123456789', N'anv@gmail.com', N'a')
INSERT [dbo].[docgia] ([MaDocGia], [TenDocGia], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'DG002', N'Nguyễn Văn B', CAST(N'1997-01-01' AS Date), N'Nam', N'Bắc Ninh', N'0147258369', N'bnv@gmail.com', N'b')
INSERT [dbo].[docgia] ([MaDocGia], [TenDocGia], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'DG003', N'Nguyễn Văn C', CAST(N'1997-01-02' AS Date), N'Nam', N'Hải Phòng', N'0159357248', N'bnv@gmail.com', N'c')
INSERT [dbo].[docgia] ([MaDocGia], [TenDocGia], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'DG004', N'Nguyễn Thị D', CAST(N'1997-07-05' AS Date), N'Nữ', N'Hải Dương', N'0134829658', N'dnt@gmail.com', N'd')
INSERT [dbo].[docgia] ([MaDocGia], [TenDocGia], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'DG005', N'Nguyễn Thị E', CAST(N'1997-09-04' AS Date), N'Nữ', N'Bắc Giang', N'0325689665', N'ent2gmail.com', N'e')
INSERT [dbo].[docgia] ([MaDocGia], [TenDocGia], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'DG006', N'Nguyễn Bá F', CAST(N'1997-09-05' AS Date), N'Nam', N'Hà Nam', N'0169826825', N'fnb@gmail.com', NULL)
INSERT [dbo].[docgia] ([MaDocGia], [TenDocGia], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'DG007', N'Lê Văn G', CAST(N'1997-08-04' AS Date), N'Nam', N'Hòa Bình', N'0193526662', N'glv@gmail.com', NULL)
INSERT [dbo].[docgia] ([MaDocGia], [TenDocGia], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'DG008', N'Đặng Thị H', CAST(N'1997-08-04' AS Date), N'Nữ', N'Sơn La', N'0196865626', N'hdt@gmail.com', NULL)
INSERT [dbo].[docgia] ([MaDocGia], [TenDocGia], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'DG009', N'Trịnh Văn K', CAST(N'1997-03-04' AS Date), N'Nam', N'Thái Nguyên', N'0159562596', N'ktv@gmail.com', NULL)
INSERT [dbo].[docgia] ([MaDocGia], [TenDocGia], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'DG010', N'Phan Thị J', CAST(N'1997-07-01' AS Date), N'Nữ', NULL, N'0195685688', N'jpt@gmail.com', NULL)
INSERT [dbo].[sach] ([MaSach], [TenSach], [TenTacGia], [NhaXuatBan], [TheLoaiSach], [GiaSach]) VALUES (N'LTJava', N'Giáo trình lập trình Java', N'Đoàn Văn Ban', N'NXB Giáo Dục', N'Java', N'54000')
INSERT [dbo].[themuon] ([MaTheMuon], [MaDocGia], [MaThuThu], [NgayMuon], [NgayTra], [MaSach], [TienDatCoc], [TienPhat]) VALUES (N'TM001', N'DG001', N'TT001', CAST(N'2018-01-01' AS Date), CAST(N'2018-05-01' AS Date), N'LTJava', 10000, 0)
INSERT [dbo].[thuthu] ([MaThuThu], [TenThuThu], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'TT001', N'Nguyễn Văn L', CAST(N'1990-08-01' AS Date), N'Nam', N'Cao Bằng', N'01983593531', N'lnv@gmail.com', N'l')
INSERT [dbo].[thuthu] ([MaThuThu], [TenThuThu], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'TT002', N'ĐInh Thị M', CAST(N'1990-07-04' AS Date), N'Nữ', N'Lạng Sơn', N'01235652656', N'mdt@gmail.com', N'm')
INSERT [dbo].[thuthu] ([MaThuThu], [TenThuThu], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'TT003', N'Phan Đắc N', CAST(N'1991-09-04' AS Date), N'Nam', N'Hồ Chí Minh', N'01983656523', N'npd@gmail.com', N'n')
INSERT [dbo].[thuthu] ([MaThuThu], [TenThuThu], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'TT004', N'Nguyễn Văn O', CAST(N'1992-04-09' AS Date), N'Nam', N'Hà Tiên', N'01935655525', N'onv@gmail.com', N'o')
INSERT [dbo].[thuthu] ([MaThuThu], [TenThuThu], [NgaySinh], [GioiTinh], [DiaChi], [DienThoai], [Mail], [Usename]) VALUES (N'TT005', N'Đặng Thị P', CAST(N'1991-03-07' AS Date), N'Nữ', N'Khánh Hòa', N'01956566666', N'pdt@gmail.com', N'p')
ALTER TABLE [dbo].[bansao]  WITH CHECK ADD  CONSTRAINT [FK_bansao_sach] FOREIGN KEY([MaSach])
REFERENCES [dbo].[sach] ([MaSach])
GO
ALTER TABLE [dbo].[bansao] CHECK CONSTRAINT [FK_bansao_sach]
GO
ALTER TABLE [dbo].[docgia]  WITH CHECK ADD  CONSTRAINT [FK_docgia_account] FOREIGN KEY([Usename])
REFERENCES [dbo].[account] ([Usename])
GO
ALTER TABLE [dbo].[docgia] CHECK CONSTRAINT [FK_docgia_account]
GO
ALTER TABLE [dbo].[themuon]  WITH CHECK ADD  CONSTRAINT [FK_themuon_docgia] FOREIGN KEY([MaDocGia])
REFERENCES [dbo].[docgia] ([MaDocGia])
GO
ALTER TABLE [dbo].[themuon] CHECK CONSTRAINT [FK_themuon_docgia]
GO
ALTER TABLE [dbo].[themuon]  WITH CHECK ADD  CONSTRAINT [FK_themuon_sach] FOREIGN KEY([MaSach])
REFERENCES [dbo].[sach] ([MaSach])
GO
ALTER TABLE [dbo].[themuon] CHECK CONSTRAINT [FK_themuon_sach]
GO
ALTER TABLE [dbo].[themuon]  WITH CHECK ADD  CONSTRAINT [FK_themuon_thuthu] FOREIGN KEY([MaThuThu])
REFERENCES [dbo].[thuthu] ([MaThuThu])
GO
ALTER TABLE [dbo].[themuon] CHECK CONSTRAINT [FK_themuon_thuthu]
GO
ALTER TABLE [dbo].[thuthu]  WITH CHECK ADD  CONSTRAINT [FK_thuthu_account] FOREIGN KEY([Usename])
REFERENCES [dbo].[account] ([Usename])
GO
ALTER TABLE [dbo].[thuthu] CHECK CONSTRAINT [FK_thuthu_account]
GO
USE [master]
GO
ALTER DATABASE [qlThuVien] SET  READ_WRITE 
GO
