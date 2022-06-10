
package com.mycompany.mavenproject1.Object.NhanVien;
public class QuanLyNhanVien {
    private final int MAX_PASTTIME=15;
    private final int MAX_CODINH=15;
    private int soNhanVienPastTime;
    private int soNhanVienCoDinh;
    NVPastTime []nvpt;
    NhanVienCoDinh []nvcd;
    public QuanLyNhanVien(){
        soNhanVienPastTime=0;
        soNhanVienCoDinh=0;
    }

    public int getSoNhanVienPastTime() {
        return soNhanVienPastTime;
    }

    public int getSoNhanVienCoDinh() {
        return soNhanVienCoDinh;
    }
    
    public boolean themPastTime(NVPastTime nv){
        if(soNhanVienPastTime==MAX_PASTTIME){
           System.out.println("Da du nhan vien past-time.");
           return false;
        }
        else{
           nvpt[soNhanVienPastTime]=nv;
           soNhanVienPastTime++;
           return true;
        }
    }
    public boolean themCoDinh(NhanVienCoDinh nv){
        if(soNhanVienCoDinh==MAX_CODINH){
           System.out.println("Da du nhan vien co dinh.");
           return false;
        }
        else{
           nvcd[soNhanVienCoDinh]=nv;
           soNhanVienCoDinh++;
           return true;
        }
    }
    public double tongLuong(){
        double sum=0;
        for(int i=0;i<soNhanVienCoDinh;i++){
            sum+=nvcd[i].tinhLuong();
        }
        for(int i=0;i<soNhanVienPastTime;i++){
            sum+=nvpt[i].tinhLuong();
        }
        return sum;
    }
}
