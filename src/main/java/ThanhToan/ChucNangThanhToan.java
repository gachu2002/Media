/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThanhToan;

import DoanhThu.SuKien;
import Exception.*;
import IO.IO;
import KhoHang.SanPham;
import java.util.ArrayList;

/**
 *
 * @author XPS
 */
public class ChucNangThanhToan {

    private HoaDon HD;
    private IO IO;
    private ArrayList<SanPham> list_kho;
    private ArrayList<SuKien> list_SuKien;

    public ChucNangThanhToan() {
        this.IO = new IO();
        this.list_kho = this.IO.docSP();
        this.list_SuKien = this.IO.docSK(list_kho);
        this.HD = new HoaDon();
    }

    public void themSanPham(String sanPham, int soLuong) throws SanPhamKhongCoTrongKho, KhongDuSoSanPhamYeuCau {
//        System.out.println("tung");
//        System.out.println("tung");
//        ArrayList<String> dsSanPham = this.HD.getDanhSachSanPham();
//        ArrayList<Double> dsGia = this.HD.getDanhSachGia();
//        ArrayList<Integer> dsSoLuong = this.HD.getDanhSachSoLuong();
//        System.out.println("tung");
//
//        boolean spCoTrongKho = false;
//        for (SanPham sp : list_kho) {
//            if (sp.getTensanpham().equals(sanPham)) {
//                boolean daCo = false;
//                for (int i = 0; i < dsSanPham.size(); ++i) {
//                    if (dsSanPham.get(i).equals(sanPham)) {
//                        if (sp.getSoluong() < soLuong) {
//                            throw new KhongDuSoSanPhamYeuCau();
//                        }
//                        dsSoLuong.set(i, dsSoLuong.get(i) + soLuong);
//                        sp.setSoLuong(sp.getSoluong() - soLuong);
//                        daCo = true;
//                        break;
//                    }
//                }
//                if (daCo == false) {
//                    dsSanPham.add(sanPham);
//                    dsGia.add(new Double(sp.getGiaban()));
//                    dsSoLuong.add(soLuong);
//                }
//                spCoTrongKho = true;
//            }
//        }
//        if (spCoTrongKho == false) {
//            throw new SanPhamKhongCoTrongKho();
//        }
    }

    public void botSanPham(String sanPham, int soLuong) {

    }

    public void inHoaDon() {

    }

    public HoaDon getHD() {
        return this.HD;
    }

}
