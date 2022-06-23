/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThanhToan;

/**
 *
 * @author minhd
 */
import java.util.Vector;
import java.time.LocalDateTime;
import java.lang.Math;

public class ThanhToan {
    private int day;
    private int month;
    private int year;
    private double tongSoTien;
    private Vector<String> danhSachSanPham;
    private  Vector<Integer> danhSachSoLuong;

    public ThanhToan() {
        LocalDateTime thoiDiemHienTai = LocalDateTime.now();
        this.day = thoiDiemHienTai.getDayOfMonth();
        this.month = thoiDiemHienTai.getMonthValue();
        this.year = thoiDiemHienTai.getYear();
        this.tongSoTien = 0;
        this.danhSachSanPham = new Vector<String>();
        this.danhSachSoLuong = new Vector<Integer>();
    }

    public void themSanPham(String sanPham, int soLuong, double gia) {
        this.tongSoTien += gia * soLuong;
        for (Integer i = 0; i < danhSachSanPham.size(); ++i) {
            if (this.danhSachSanPham.get(i) == sanPham) {
                int soLuongHienTai = danhSachSoLuong.get(i);
                this.danhSachSoLuong.set(i, soLuongHienTai + soLuong);
                return;
            }
        }
        this.danhSachSanPham.add(sanPham);
        this.danhSachSoLuong.add(soLuong);
    }

    public void themSanPham(String sanPham, double gia) {
        themSanPham(sanPham, 1, gia);
    }

    public double tongHoaDon() {
        return this.tongSoTien;
    }

    public void botSanPham(String sanPham, int soLuong, double gia) {
        for (Integer i = 0; i < danhSachSanPham.size(); ++i) {
            if (this.danhSachSanPham.get(i).equals(sanPham)) {
                int soLuongHienTai = danhSachSoLuong.get(i);
                soLuong = Math.min(soLuong, soLuongHienTai);
                this.tongSoTien -= soLuong * gia;
                if (soLuong == soLuongHienTai) {
                    this.danhSachSanPham.remove(i.intValue());
                    this.danhSachSoLuong.remove(i.intValue());
                } else {
                    this.danhSachSoLuong.set(i, soLuongHienTai - soLuong);
                }
                return;
            }
        }
    }

    public void xoaSanPham(String sanPham, double gia) {
        // xoa tat ca san pham
        for (Integer i = 0; i < danhSachSanPham.size(); ++i) {
            if (this.danhSachSanPham.get(i) == sanPham) {
                this.tongSoTien -= this.danhSachSoLuong.get(i) * gia;
                this.danhSachSanPham.remove(i.intValue());
                this.danhSachSoLuong.remove(i.intValue());
                return;
            }
        }
    }

    public Vector<String> getDanhSachSanPham(){
        return this.danhSachSanPham;
    }

    public Vector<Integer> getSoLuongSanPham(){
        return this.danhSachSoLuong;
    }

    public void inHoaDon() {
        System.out.println(this.ngayThanhToan());
        System.out.println("Danh sach san pham:");
        for (Integer i = 0; i < this.danhSachSanPham.size(); ++i) {
            System.out.println((i + 1) + ". " + this.danhSachSanPham.get(i) + "*" + this.danhSachSoLuong.get(i));
        }
        System.out.println("-----------------------------------");
        System.out.println("Tong gia tri hoa don: " + this.tongSoTien);
    }

    public String ngayThanhToan(){
        return this.day + "/" + this.month + "/" + this.year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int dayOfMonth) {
        this.day = dayOfMonth;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // public int getM(){
    // return int(this.time.getMonth());
    // }

    // public void luuSuKien(){
    // suKien.add(this);
    // }
}
