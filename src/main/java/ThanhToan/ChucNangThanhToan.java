/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThanhToan;

import DoanhThu.SuKien;
import DoanhThu.SuKienMotLan;
import Exception.*;
import IO.IO;
import KhoHang.SanPham;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author XPS
 */
public class ChucNangThanhToan {

    private HoaDon HD;
    private IO IO;
    private ArrayList<SanPham> list_kho;
    private ArrayList<SuKienMotLan> list_SuKien;
// thêm âm sản phẩm: báo lỗi

    public ChucNangThanhToan() {
        this.IO = new IO();
        this.list_kho = this.IO.docSP();
        this.list_SuKien = this.IO.docSKMotLan();
        this.HD = new HoaDon();
    }

    public void themSanPham(String sanPham, int soLuong) throws SanPhamKhongCoTrongKho, KhongDuSoSanPhamYeuCau {
        ArrayList<String> dsSanPham = this.HD.getDanhSachSanPham();
        ArrayList<Double> dsGia = this.HD.getDanhSachGia();
        ArrayList<Integer> dsSoLuong = this.HD.getDanhSachSoLuong();

        boolean spCoTrongKho = false;
        for (int j = 0; j < list_kho.size(); j++) {
            SanPham sp = list_kho.get(j);
            if (sp.getTensanpham().equals(sanPham)) {
                if (sp.getSoluong() < soLuong) {
                    throw new KhongDuSoSanPhamYeuCau();
                }
                boolean daCo = false;
                for (int i = 0; i < dsSanPham.size(); ++i) {
                    if (dsSanPham.get(i).equals(sanPham)) {
                        dsSoLuong.set(i, dsSoLuong.get(i) + soLuong);
                        daCo = true;
                        break;
                    }
                }
                if (daCo == false) {
                    dsSanPham.add(sanPham);
                    dsGia.add(new Double(sp.getGiaban()));
                    dsSoLuong.add(soLuong);
                }
                if (sp.getSoluong() == soLuong) {
                    list_kho.remove(j);
                } else {
                    sp.setSoLuong(sp.getSoluong() - soLuong);
                }
                IO.ghiSP(list_kho);
                spCoTrongKho = true;
            }
        }
        if (spCoTrongKho == false) {
            throw new SanPhamKhongCoTrongKho();
        }

    }

    public void botSanPham(String sanPham, int soLuong) throws SanPhamKhongCoTrongHoaDon, KhongDuSoSanPhamYeuCau {
        ArrayList<String> dsSanPham = this.HD.getDanhSachSanPham();
        ArrayList<Double> dsGia = this.HD.getDanhSachGia();
        ArrayList<Integer> dsSoLuong = this.HD.getDanhSachSoLuong();

        for (Integer i = 0; i < dsSanPham.size(); ++i) {
            if (dsSanPham.get(i).equals(sanPham)) {
                int soLuongHienTai = dsSoLuong.get(i);
                if (soLuong > soLuongHienTai) {
                    throw new KhongDuSoSanPhamYeuCau();
                }
                for (int j = 0; j < list_kho.size(); ++j) {
                    SanPham sp = list_kho.get(j);
                    if (sp.getTensanpham().equals(sanPham)) {
                        if (soLuong == soLuongHienTai) {
                            sp.setSoLuong(sp.getSoluong() + soLuong);
                            dsSanPham.remove(i.intValue());
                            dsSoLuong.remove(i.intValue());
                            dsGia.remove(i.intValue());
                        } else {
                            sp.setSoLuong(sp.getSoluong() + soLuong);
                            dsSoLuong.set(i, soLuongHienTai - soLuong);
                        }
                        IO.ghiSP(list_kho);
                    }
                }
                return;
            }
        }
        throw new SanPhamKhongCoTrongHoaDon();
    }

    public void taoSuKien() {
        IO IO = new IO();
        ArrayList<SuKienMotLan> dsSK = IO.docSKMotLan();
        dsSK.add(new SuKienMotLan(LocalDateTime.now(), "Bán hàng", "Bán", (int) this.HD.tongHoaDon()));
        IO.ghiSKMotLan(dsSK);
    }

    public void huy() {
        ArrayList<String> dsSanPham = this.HD.getDanhSachSanPham();
        ArrayList<Double> dsGia = this.HD.getDanhSachGia();
        ArrayList<Integer> dsSoLuong = this.HD.getDanhSachSoLuong();

        for (int i = 0; i < dsSanPham.size(); ++i) {
            for (int j = 0; j < list_kho.size(); ++j) {
                SanPham sp = list_kho.get(j);
                if (sp.getTensanpham().equals(dsSanPham.get(i))) {
                    sp.setSoLuong(sp.getSoluong() + dsSoLuong.get(i));
                    break;
                }
            }
        }
        IO.ghiSP(list_kho);
    }

    public HoaDon getHD() {
        return this.HD;
    }

}
