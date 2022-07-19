/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import IO.IO;
import ThongBao.ThongBao;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author XPS
 */
public class QuanLySuKien {

    private ArrayList<SuKienMotLan> dsSuKien;
    private ArrayList<SuKienDinhKy> dsSKDK;

    public QuanLySuKien() {
        IO IO = new IO();
        this.dsSuKien = IO.docSKMotLan();
        this.dsSKDK = IO.docSKDinhKy();
    }

    public ArrayList<SuKienMotLan> getThongKeSuKien(LocalDateTime start, LocalDateTime end) {
        ArrayList<SuKienMotLan> dsThongKeSuKien = new ArrayList<>();
        for (SuKienMotLan obj : dsSuKien) {
            if ((obj.getDate()).compareTo(start) >= 0 && (obj.getDate()).compareTo(end) < 0) {
                dsThongKeSuKien.add(obj);
            }
        }
        return dsThongKeSuKien;
    }

    private boolean isSameDay(LocalDateTime a, LocalDateTime b) {
        LocalDateTime c = LocalDateTime.of(a.getDayOfYear(), a.getMonthValue(), a.getDayOfMonth(), 0, 0, 0);
        LocalDateTime d = LocalDateTime.of(a.getDayOfYear(), a.getMonthValue(), a.getDayOfMonth(), 23, 59, 59);
        return b.isAfter(c) && b.isBefore(d);
    }

    public void checkSKDK() {
        LocalDateTime tdht = LocalDateTime.now();
        IO io = new IO();
        ArrayList<ThongBao> tb = io.docThongBao();
        for (SuKienDinhKy skdk : dsSKDK) {
            if (isSameDay(tdht, skdk.getNgayTiepTheo())) {
                tb.add(new ThongBao(skdk.getTenSuKien(), false));
                if (skdk instanceof SuKienHangThang) {
                    skdk.setNgayTiepTheo(skdk.getNgayTiepTheo().plusMonths(1));
                } else if (skdk instanceof SuKienTheoChuKy) {
                    SuKienTheoChuKy skdk1 = (SuKienTheoChuKy) skdk;
                    skdk.setNgayTiepTheo(skdk.getNgayTiepTheo().plusDays(skdk1.getSoNgayMotChuKy()));
                }
            }
        }
        io.ghiSKDinhKy(dsSKDK);
    }

    public int getDoanhThu(LocalDateTime start, LocalDateTime end) {
        int doanhthu = 0;
        for (SuKienMotLan obj : this.getThongKeSuKien(start, end)) {
            if ((obj.getLoaiSuKien()).equals("Bán")) {
                doanhthu += obj.getGiatri();
            }
        }
        return doanhthu;
    }

    public int getLoiNhuan(LocalDateTime start, LocalDateTime end) {
        int doanhthu = 0;
        for (SuKienMotLan obj : this.getThongKeSuKien(start, end)) {
            if ((obj.getLoaiSuKien()).equals("Bán")) {
                doanhthu += obj.getGiatri();
            } else {
                doanhthu -= obj.getGiatri();
            }
        }
        return doanhthu;
    }

    public ArrayList<SuKienMotLan> getDanhSachSuKien() {
        return this.dsSuKien;
    }

    public void setDanhSachSuKien(ArrayList<SuKienMotLan> s) {
        this.dsSuKien = s;
    }

}
