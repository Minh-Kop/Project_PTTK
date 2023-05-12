/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     10/5/2023 7:07:33 pm                         */
/*==============================================================*/

ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
/
CREATE OR REPLACE PROCEDURE SYS.USP_DROPUSER (
    USER_NAME VARCHAR2
)
    AUTHID CURRENT_USER
AS
    N NUMBER := 0;
BEGIN
    SELECT COUNT(*) INTO N
    FROM DBA_USERS
    WHERE USERNAME = UPPER(USER_NAME);

    IF N != 0 THEN
        EXECUTE IMMEDIATE ( 'DROP USER ' || USER_NAME || ' CASCADE' );
    END IF;
END;
/
EXEC SYS.USP_DROPUSER('qlks');
CREATE USER qlks IDENTIFIED BY 1;
grant create session to qlks;
ALTER USER qlks QUOTA UNLIMITED ON USERS;
GRANT CREATE TABLE TO qlks;

alter table CO_UU_DAI
   drop constraint FK_CO_UU_DA_CO_UU_DAI_LOAIPHON;

alter table CO_UU_DAI
   drop constraint FK_CO_UU_DA_CO_UU_DAI_DICHVU;

alter table DANGKYTOUR
   drop constraint FK_DANGKYTO_DANGKYTOU_PHIEUDAT;

alter table DANGKYTOUR
   drop constraint FK_DANGKYTO_DANGKYTOU_TOURDULI;

alter table DICHVU
   drop constraint FK_DICHVU_THUOC_LOA_LOAIDICH;

alter table DICHVUCOLICHKH
   drop constraint FK_DICHVUCO_RELATIONS_PHIEUDAT;

alter table DICHVUCOLICHKH
   drop constraint FK_DICHVUCO_RELATIONS_DICHVUTH;

alter table DICHVUCOLICHKH
   drop constraint FK_DICHVUCO_XU_LY_DVC_NHANVIEN;

alter table DICHVUCOLINH
   drop constraint FK_DICHVUCO_RELATIONS_DICHVU;

alter table DICHVUCOLINH
   drop constraint FK_DICHVUCO_RELATIONS_THOIGIAN;

alter table DICHVUDASUDUNG
   drop constraint FK_DICHVUDA_RELATIONS_DICHVU;

alter table DICHVUDASUDUNG
   drop constraint FK_DICHVUDA_RELATIONS_PHIEUDAT;

alter table DICHVUTHEONGAY
   drop constraint FK_DICHVUTH_CU_THE_TH_DICHVUCO;

alter table DOAN
   drop constraint FK_DOAN_CO_TRUONG_KHACHHAN;

alter table HOADON
   drop constraint FK_HOADON_CUA_KHACH_KHACHHAN;

alter table HOADON
   drop constraint FK_HOADON_XU_LY_HOA_NHANVIEN;

alter table PHIEUDATPHONG
   drop constraint FK_PHIEUDAT_CUA_KHACH_KHACHHAN;

alter table PHIEUDATPHONG
   drop constraint FK_PHIEUDAT_HOADON30_HOADON;

alter table PHIEUDATPHONG
   drop constraint FK_PHIEUDAT_HOADON70_HOADON;

alter table PHIEUDATPHONG
   drop constraint FK_PHIEUDAT_SU_DUNG_PHONG;

alter table PHIEUDATPHONG
   drop constraint FK_PHIEUDAT_THUOC_DOA_DOAN;

alter table PHIEUDATPHONG
   drop constraint FK_PHIEUDAT_XU_LY_PDP_NHANVIEN;

alter table PHONG
   drop constraint FK_PHONG_THUOC_LOA_LOAIPHON;

drop index CO_UU_DAI2_FK;

drop index CO_UU_DAI_FK;

drop table CO_UU_DAI cascade constraints;

drop index DANGKYTOUR2_FK;

drop index DANGKYTOUR_FK;

drop table DANGKYTOUR cascade constraints;

drop index THUOC_LOAI_DICH_VU_FK;

drop table DICHVU cascade constraints;

drop index XU_LY_DVCL_FK;

drop index RELATIONSHIP_17_FK;

drop index RELATIONSHIP_16_FK;

drop table DICHVUCOLICHKH cascade constraints;

drop index RELATIONSHIP_10_FK;

drop index RELATIONSHIP_9_FK;

drop table DICHVUCOLINH cascade constraints;

drop index RELATIONSHIP_12_FK;

drop index RELATIONSHIP_11_FK;

drop table DICHVUDASUDUNG cascade constraints;

drop index CU_THE_THEO_NGAY_FK;

drop table DICHVUTHEONGAY cascade constraints;

drop index CO_TRUONG_DOAN_LA_FK;

drop table DOAN cascade constraints;

drop index XU_LY_HOA_DON_FK;

drop index CUA_KHACH_HANG_NAO_FK;

drop table HOADON cascade constraints;

drop table KHACHHANG cascade constraints;

drop table LOAIDICHVU cascade constraints;

drop table LOAIPHONG cascade constraints;

drop table NHANVIEN cascade constraints;

drop index XU_LY_PDP_FK;

drop index HOADON30_FK;

drop index HOADON70_FK;

drop index SU_DUNG_FK;

drop index THUOC_DOAN_FK;

drop index CUA_KHACH_HANG_FK;

drop table PHIEUDATPHONG cascade constraints;

drop index THUOC_LOAI_PHONG_FK;

drop table PHONG cascade constraints;

drop table THOIGIANBIEU cascade constraints;

drop table TOURDULICH cascade constraints;

/*==============================================================*/
/* Table: CO_UU_DAI                                             */
/*==============================================================*/
create table CO_UU_DAI 
(
   MALP                 CHAR(3)              not null,
   MADV                 CHAR(3)              not null,
   constraint PK_CO_UU_DAI primary key (MALP, MADV)
);

/*==============================================================*/
/* Index: CO_UU_DAI_FK                                          */
/*==============================================================*/
create index CO_UU_DAI_FK on CO_UU_DAI (
   MALP ASC
);

/*==============================================================*/
/* Index: CO_UU_DAI2_FK                                         */
/*==============================================================*/
create index CO_UU_DAI2_FK on CO_UU_DAI (
   MADV ASC
);

/*==============================================================*/
/* Table: DANGKYTOUR                                            */
/*==============================================================*/
create table DANGKYTOUR 
(
   MAPHIEU              CHAR(3)              not null,
   MATOUR               CHAR(3)              not null,
   THOIGIANKHOIHANH     DATE,
   SONGUOI              INTEGER,
   CODUADON             SMALLINT,
   NHUCAUDACBIET        VARCHAR2(100),
   constraint PK_DANGKYTOUR primary key (MAPHIEU, MATOUR)
);

/*==============================================================*/
/* Index: DANGKYTOUR_FK                                         */
/*==============================================================*/
create index DANGKYTOUR_FK on DANGKYTOUR (
   MAPHIEU ASC
);

/*==============================================================*/
/* Index: DANGKYTOUR2_FK                                        */
/*==============================================================*/
create index DANGKYTOUR2_FK on DANGKYTOUR (
   MATOUR ASC
);

/*==============================================================*/
/* Table: DICHVU                                                */
/*==============================================================*/
create table DICHVU 
(
   MADV                 CHAR(3)              not null,
   MALDV                CHAR(4)              not null,
   TENDICHVU            VARCHAR2(20),
   GIA                  INTEGER,
   TINHTRANG            INTEGER,
   TENLOAIDICHVU        VARCHAR2(20),
   constraint PK_DICHVU primary key (MADV)
);

/*==============================================================*/
/* Index: THUOC_LOAI_DICH_VU_FK                                 */
/*==============================================================*/
create index THUOC_LOAI_DICH_VU_FK on DICHVU (
   MALDV ASC
);

/*==============================================================*/
/* Table: DICHVUCOLICHKH                                        */
/*==============================================================*/
create table DICHVUCOLICHKH 
(
   MAPHIEU              CHAR(3)              not null,
   MATG                 CHAR(3)              not null,
   MADV                 CHAR(3)              not null,
   NGAY                 DATE                 not null,
   MANV                 CHAR(3)              not null,
   SOLUONG              INTEGER,
   GIA                  INTEGER,
   constraint PK_DICHVUCOLICHKH primary key (MATG, MADV, MAPHIEU, NGAY)
);

/*==============================================================*/
/* Index: RELATIONSHIP_16_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_16_FK on DICHVUCOLICHKH (
   MAPHIEU ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_17_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_17_FK on DICHVUCOLICHKH (
   MATG ASC,
   MADV ASC,
   NGAY ASC
);

/*==============================================================*/
/* Index: XU_LY_DVCL_FK                                         */
/*==============================================================*/
create index XU_LY_DVCL_FK on DICHVUCOLICHKH (
   MANV ASC
);

/*==============================================================*/
/* Table: DICHVUCOLINH                                          */
/*==============================================================*/
create table DICHVUCOLINH 
(
   MATG                 CHAR(3)              not null,
   MADV                 CHAR(3)              not null,
   SOLUONG              INTEGER,
   TINHTRANG            INTEGER,
   constraint PK_DICHVUCOLINH primary key (MATG, MADV)
);

/*==============================================================*/
/* Index: RELATIONSHIP_9_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_9_FK on DICHVUCOLINH (
   MATG ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_10_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_10_FK on DICHVUCOLINH (
   MADV ASC
);

/*==============================================================*/
/* Table: DICHVUDASUDUNG                                        */
/*==============================================================*/
create table DICHVUDASUDUNG 
(
   MADV                 CHAR(3)              not null,
   MAPHIEU              CHAR(3)              not null,
   NGAYSD               DATE                 not null,
   SOLUONG              INTEGER,
   TONGGIA              INTEGER,
   constraint PK_DICHVUDASUDUNG primary key (MADV, MAPHIEU, NGAYSD)
);

/*==============================================================*/
/* Index: RELATIONSHIP_11_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_11_FK on DICHVUDASUDUNG (
   MADV ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_12_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_12_FK on DICHVUDASUDUNG (
   MAPHIEU ASC
);

/*==============================================================*/
/* Table: DICHVUTHEONGAY                                        */
/*==============================================================*/
create table DICHVUTHEONGAY 
(
   MATG                 CHAR(3)              not null,
   MADV                 CHAR(3)              not null,
   NGAY                 DATE                 not null,
   TINHTRANG            INTEGER,
   SOLUONGTRONG         INTEGER,
   constraint PK_DICHVUTHEONGAY primary key (MATG, MADV, NGAY)
);

/*==============================================================*/
/* Index: CU_THE_THEO_NGAY_FK                                   */
/*==============================================================*/
create index CU_THE_THEO_NGAY_FK on DICHVUTHEONGAY (
   MATG ASC,
   MADV ASC
);

/*==============================================================*/
/* Table: DOAN                                                  */
/*==============================================================*/
create table DOAN 
(
   MADOAN               CHAR(3)              not null,
   MAKH                 CHAR(3)              not null,
   TENDOAN              VARCHAR2(50),
   SOLUONGPHONG         INTEGER,
   NGAYDEN              DATE,
   NGAYDI               DATE,
   constraint PK_DOAN primary key (MADOAN)
);

/*==============================================================*/
/* Index: CO_TRUONG_DOAN_LA_FK                                  */
/*==============================================================*/
create index CO_TRUONG_DOAN_LA_FK on DOAN (
   MAKH ASC
);

/*==============================================================*/
/* Table: HOADON                                                */
/*==============================================================*/
create table HOADON 
(
   MAHD                 CHAR(3)              not null,
   MANV                 CHAR(3)              not null,
   MAKH                 CHAR(3)              not null,
   NOIDUNG              VARCHAR2(50),
   THOIGIAN             DATE,
   TONGGIA              INTEGER,
   constraint PK_HOADON primary key (MAHD)
);

/*==============================================================*/
/* Index: CUA_KHACH_HANG_NAO_FK                                 */
/*==============================================================*/
create index CUA_KHACH_HANG_NAO_FK on HOADON (
   MAKH ASC
);

/*==============================================================*/
/* Index: XU_LY_HOA_DON_FK                                      */
/*==============================================================*/
create index XU_LY_HOA_DON_FK on HOADON (
   MANV ASC
);

/*==============================================================*/
/* Table: KHACHHANG                                             */
/*==============================================================*/
create table KHACHHANG 
(
   MAKH                 CHAR(3)              not null,
   CCCD                 CHAR(12),
   TENKHACHHANG         VARCHAR2(50),
   NGAYSINH             DATE,
   SODT                 CHAR(10),
   DIACHI               VARCHAR2(50),
   EMAIL                VARCHAR2(50),
   MAFAX                CHAR(5),
   constraint PK_KHACHHANG primary key (MAKH)
);

/*==============================================================*/
/* Table: LOAIDICHVU                                            */
/*==============================================================*/
create table LOAIDICHVU 
(
   MALDV                CHAR(4)              not null,
   TENLOAIDICHVU        VARCHAR2(20),
   COTHEONGAY           SMALLINT,
   constraint PK_LOAIDICHVU primary key (MALDV)
);

/*==============================================================*/
/* Table: LOAIPHONG                                             */
/*==============================================================*/
create table LOAIPHONG 
(
   MALP                 CHAR(3)              not null,
   TENLOAIPHONG         VARCHAR2(30),
   GIA                  INTEGER,
   constraint PK_LOAIPHONG primary key (MALP)
);

/*==============================================================*/
/* Table: NHANVIEN                                              */
/*==============================================================*/
create table NHANVIEN 
(
   MANV                 CHAR(3)              not null,
   VAITRO               VARCHAR2(20),
   TINHTRANG            INTEGER,
   PASSWORD             VARCHAR2(50),
   constraint PK_NHANVIEN primary key (MANV)
);

/*==============================================================*/
/* Table: PHIEUDATPHONG                                         */
/*==============================================================*/
create table PHIEUDATPHONG 
(
   MAPHIEU              CHAR(3)              not null,
   MAPHONG              CHAR(3)              not null,
   MAKH                 CHAR(3)              not null,
   TENKHACHHANG         VARCHAR2(50),
   TINHTRANG            INTEGER,
   NGAYLAP              DATE,
   NGAYDEN              DATE,
   YEUCAUDACBIET        VARCHAR2(50),
   MADOAN               CHAR(3),
   MANV                 CHAR(3)              not null,
   HOADON30             CHAR(3)              not null,
   HOADON70             CHAR(3)              not null,
   constraint PK_PHIEUDATPHONG primary key (MAPHIEU)
);

/*==============================================================*/
/* Index: CUA_KHACH_HANG_FK                                     */
/*==============================================================*/
create index CUA_KHACH_HANG_FK on PHIEUDATPHONG (
   MAKH ASC
);

/*==============================================================*/
/* Index: THUOC_DOAN_FK                                         */
/*==============================================================*/
create index THUOC_DOAN_FK on PHIEUDATPHONG (
   MADOAN ASC
);

/*==============================================================*/
/* Index: SU_DUNG_FK                                            */
/*==============================================================*/
create index SU_DUNG_FK on PHIEUDATPHONG (
   MAPHONG ASC
);

/*==============================================================*/
/* Index: HOADON70_FK                                           */
/*==============================================================*/
create index HOADON70_FK on PHIEUDATPHONG (
   HOADON70 ASC
);

/*==============================================================*/
/* Index: HOADON30_FK                                           */
/*==============================================================*/
create index HOADON30_FK on PHIEUDATPHONG (
   HOADON30 ASC
);

/*==============================================================*/
/* Index: XU_LY_PDP_FK                                          */
/*==============================================================*/
create index XU_LY_PDP_FK on PHIEUDATPHONG (
   MANV ASC
);

/*==============================================================*/
/* Table: PHONG                                                 */
/*==============================================================*/
create table PHONG 
(
   MAPHONG              CHAR(3)              not null,
   MALP                 CHAR(3)              not null,
   TENLOAIPHONG         VARCHAR2(30),
   TINHTRANGTHUE        INTEGER,
   TINHTRANGDONDEP      INTEGER,
   constraint PK_PHONG primary key (MAPHONG)
);

/*==============================================================*/
/* Index: THUOC_LOAI_PHONG_FK                                   */
/*==============================================================*/
create index THUOC_LOAI_PHONG_FK on PHONG (
   MALP ASC
);

/*==============================================================*/
/* Table: THOIGIANBIEU                                          */
/*==============================================================*/
create table THOIGIANBIEU 
(
   MATG                 CHAR(3)              not null,
   MOTA                 VARCHAR2(20),
   constraint PK_THOIGIANBIEU primary key (MATG)
);

/*==============================================================*/
/* Table: TOURDULICH                                            */
/*==============================================================*/
create table TOURDULICH 
(
   MATOUR               CHAR(3)              not null,
   TENTOUR              VARCHAR2(50),
   constraint PK_TOURDULICH primary key (MATOUR)
);

alter table CO_UU_DAI
   add constraint FK_CO_UU_DA_CO_UU_DAI_LOAIPHON foreign key (MALP)
      references LOAIPHONG (MALP);

alter table CO_UU_DAI
   add constraint FK_CO_UU_DA_CO_UU_DAI_DICHVU foreign key (MADV)
      references DICHVU (MADV);

alter table DANGKYTOUR
   add constraint FK_DANGKYTO_DANGKYTOU_PHIEUDAT foreign key (MAPHIEU)
      references PHIEUDATPHONG (MAPHIEU);

alter table DANGKYTOUR
   add constraint FK_DANGKYTO_DANGKYTOU_TOURDULI foreign key (MATOUR)
      references TOURDULICH (MATOUR);

alter table DICHVU
   add constraint FK_DICHVU_THUOC_LOA_LOAIDICH foreign key (MALDV)
      references LOAIDICHVU (MALDV);

alter table DICHVUCOLICHKH
   add constraint FK_DICHVUCO_RELATIONS_PHIEUDAT foreign key (MAPHIEU)
      references PHIEUDATPHONG (MAPHIEU);

alter table DICHVUCOLICHKH
   add constraint FK_DICHVUCO_RELATIONS_DICHVUTH foreign key (MATG, MADV, NGAY)
      references DICHVUTHEONGAY (MATG, MADV, NGAY);

alter table DICHVUCOLICHKH
   add constraint FK_DICHVUCO_XU_LY_DVC_NHANVIEN foreign key (MANV)
      references NHANVIEN (MANV);

alter table DICHVUCOLINH
   add constraint FK_DICHVUCO_RELATIONS_DICHVU foreign key (MADV)
      references DICHVU (MADV);

alter table DICHVUCOLINH
   add constraint FK_DICHVUCO_RELATIONS_THOIGIAN foreign key (MATG)
      references THOIGIANBIEU (MATG);

alter table DICHVUDASUDUNG
   add constraint FK_DICHVUDA_RELATIONS_DICHVU foreign key (MADV)
      references DICHVU (MADV);

alter table DICHVUDASUDUNG
   add constraint FK_DICHVUDA_RELATIONS_PHIEUDAT foreign key (MAPHIEU)
      references PHIEUDATPHONG (MAPHIEU);

alter table DICHVUTHEONGAY
   add constraint FK_DICHVUTH_CU_THE_TH_DICHVUCO foreign key (MATG, MADV)
      references DICHVUCOLINH (MATG, MADV);

alter table DOAN
   add constraint FK_DOAN_CO_TRUONG_KHACHHAN foreign key (MAKH)
      references KHACHHANG (MAKH);

alter table HOADON
   add constraint FK_HOADON_CUA_KHACH_KHACHHAN foreign key (MAKH)
      references KHACHHANG (MAKH);

alter table HOADON
   add constraint FK_HOADON_XU_LY_HOA_NHANVIEN foreign key (MANV)
      references NHANVIEN (MANV);

alter table PHIEUDATPHONG
   add constraint FK_PHIEUDAT_CUA_KHACH_KHACHHAN foreign key (MAKH)
      references KHACHHANG (MAKH);

alter table PHIEUDATPHONG
   add constraint FK_PHIEUDAT_HOADON30_HOADON foreign key (HOADON30)
      references HOADON (MAHD);

alter table PHIEUDATPHONG
   add constraint FK_PHIEUDAT_HOADON70_HOADON foreign key (HOADON70)
      references HOADON (MAHD);

alter table PHIEUDATPHONG
   add constraint FK_PHIEUDAT_SU_DUNG_PHONG foreign key (MAPHONG)
      references PHONG (MAPHONG);

alter table PHIEUDATPHONG
   add constraint FK_PHIEUDAT_THUOC_DOA_DOAN foreign key (MADOAN)
      references DOAN (MADOAN);

alter table PHIEUDATPHONG
   add constraint FK_PHIEUDAT_XU_LY_PDP_NHANVIEN foreign key (MANV)
      references NHANVIEN (MANV);

alter table PHONG
   add constraint FK_PHONG_THUOC_LOA_LOAIPHON foreign key (MALP)
      references LOAIPHONG (MALP);

commit;