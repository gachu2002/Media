package com.mycompany.mavenproject1.Object.NhanVien;
public class TongChiPhi {
    private double tienMatBang;
    private double tienSinhHoat;
    QuanLyNhanVien danhSachNhanVien;

    public TongChiPhi(double tienMatBang, double tienSinhHoat, QuanLyNhanVien a){
        this.tienMatBang=tienMatBang;
        this.tienSinhHoat=tienSinhHoat;
        this.danhSachNhanVien=a;
    }
    
    public double getTongChiPhi(){
    return tienMatBang+ tienSinhHoat+danhSachNhanVien.tongLuong();
    }
}
