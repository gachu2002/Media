/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import IO.IO;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author XPS
 */
public class QuanLySuKien {

    private ArrayList<SuKienMotLan> dsSuKien;

    public QuanLySuKien() {
        IO IO = new IO();
        this.dsSuKien = IO.docSKMotLan();
    }

    public ArrayList<SuKienMotLan> getThongKeSuKien(LocalDateTime start, LocalDateTime end) {
        ArrayList<SuKienMotLan> dsThongKeSuKien = new ArrayList<SuKienMotLan>();
        for (SuKienMotLan obj : dsSuKien) {
            if ((obj.getDate()).compareTo(start) >= 0 && (obj.getDate()).compareTo(end) < 0) {
                dsThongKeSuKien.add(obj);
            }
        }
        return dsThongKeSuKien;
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
            }
            else {
                doanhthu -=obj.getGiatri();
            }}
        return doanhthu;
        }
    
    

    

    

    public ArrayList<SuKienMotLan> getDanhSachSuKien() {
        return this.dsSuKien;
    }

    public void setDanhSachSuKien(ArrayList<SuKienMotLan> s) {
        this.dsSuKien = s;
    }

}
