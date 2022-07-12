/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThanhToan;

/**
 *
 * @author minhd
 */
import Exception.KhongDuSoSanPhamYeuCau;
import Exception.SanPhamKhongCoTrongHoaDon;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class HoaDon {

    private int day;
    private int month;
    private int year;
    private ArrayList<String> danhSachSanPham;
    private ArrayList<Integer> danhSachSoLuong;
    private ArrayList<Double> danhSachGia;

    public HoaDon() {
        LocalDateTime thoiDiemHienTai = LocalDateTime.now();
        this.day = thoiDiemHienTai.getDayOfMonth();
        this.month = thoiDiemHienTai.getMonthValue();
        this.year = thoiDiemHienTai.getYear();
        this.danhSachSanPham = new ArrayList<>();
        this.danhSachSoLuong = new ArrayList<>();
        this.danhSachGia = new ArrayList<>();
    }

//    public void themSanPham(String sanPham, int soLuong, double gia) {
//        for (Integer i = 0; i < danhSachSanPham.size(); ++i) {
//            if (this.danhSachSanPham.get(i).equals(sanPham)) {
//                int soLuongHienTai = danhSachSoLuong.get(i);
//                this.danhSachSoLuong.set(i, soLuongHienTai + soLuong);
//                return;
//            }
//        }
//        this.danhSachSanPham.add(sanPham);
//        this.danhSachSoLuong.add(soLuong);
//        this.danhSachGia.add(gia);
//    }
//
//    public void themSanPham(String sanPham, double gia) {
//        themSanPham(sanPham, 1, gia);
//    }

    public double tongHoaDon() {
        Double tongHoaDon = 0D;
        for (int i = 0; i < danhSachSanPham.size(); ++i) {
            tongHoaDon += danhSachSoLuong.get(i) * danhSachGia.get(i);
        }
        return tongHoaDon;
    }

    public void botSanPham(String sanPham, int soLuong, double gia) throws SanPhamKhongCoTrongHoaDon, KhongDuSoSanPhamYeuCau {
        for (Integer i = 0; i < danhSachSanPham.size(); ++i) {
            if (this.danhSachSanPham.get(i).equals(sanPham)) {
                int soLuongHienTai = danhSachSoLuong.get(i);
                if (soLuong > soLuongHienTai) {
                    throw new KhongDuSoSanPhamYeuCau();
                }
                if (soLuong == soLuongHienTai) {
                    this.danhSachSanPham.remove(i.intValue());
                    this.danhSachSoLuong.remove(i.intValue());
                    this.danhSachGia.remove(i.intValue());
                } else {
                    this.danhSachSoLuong.set(i, soLuongHienTai - soLuong);
                }
                return;
            }
        }
        throw new SanPhamKhongCoTrongHoaDon();
    }

    public void xoaSanPham(String sanPham, double gia) {
        // xoa tat ca san pham
        for (Integer i = 0; i < danhSachSanPham.size(); ++i) {
            if (this.danhSachSanPham.get(i).equals(sanPham)) {
                this.danhSachSanPham.remove(i.intValue());
                this.danhSachSoLuong.remove(i.intValue());
                this.danhSachGia.remove(i.intValue());
                return;
            }
        }
    }

    public ArrayList<String> getDanhSachSanPham() {
        return this.danhSachSanPham;
    }

    public ArrayList<Integer> getDanhSachSoLuong() {
        return this.danhSachSoLuong;
    }

    public ArrayList<Double> getDanhSachGia() {
        return this.danhSachGia;
    }

    public void inHoaDon() {
        System.out.println(this.ngayThanhToan());
        System.out.println("Danh sach san pham:");
        for (Integer i = 0; i < this.danhSachSanPham.size(); ++i) {
            System.out.println((i + 1) + ". " + this.danhSachSanPham.get(i) + "*" + this.danhSachSoLuong.get(i));
        }
        System.out.println("-----------------------------------");
        System.out.println("Tong gia tri hoa don: " + this.tongHoaDon());
    }

    public String ngayThanhToan() {
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
}
