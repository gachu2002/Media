package com.mycompany.mavenproject1.Object.NhanVien;
public abstract class NhanVien {

    public NhanVien() {
    }


    private String tenNhanVien;
    public void setTenNhanVien(String tenNhanVien){
         this.tenNhanVien = tenNhanVien;
    }
    public String getTenNhanVien(){
         return this.tenNhanVien;
    }
    public abstract double tinhLuong();
    public abstract void inThongTin();

}
