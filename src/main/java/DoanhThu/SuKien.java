package DoanhThu;

import KhoHang.SanPham;

import java.util.Date;

/*
TODO1: sửa các lớp SuKien và một số lớp liên quan
    - Thêm 2 class SuKienMotLan và SuKienDinhKy
    - SuKien:
        + String tenSuKien;
        + String loaiSuKien; 
    - SuKienMotLan extends SuKien:
        + int giaTri; (>0 nếu thu được tiền, <0 nếu phải trả tiền)
        + Date ngay;
    - SuKienDinhKy extends SuKien:
        + Date ngayTiepTheo;
        + void themThongBao(); 
            // thêm thông báo để nhắc nhở ng dùng thêm sự kiện một lần khi đến ngày
        + abstract void chinhNgay(); 
            // sửa Date ngayTiepTheo khi đến ngày
    - SuKienHangThang extends SuKienDinhKy:
        + int ngayTrongThang;
    - SuKienTheoChuKy extends SuKienDinhKy:
        + int soNgayMotChuKy;
TODO2: Thống nhất với class ChiPhi và NhanVien
TODO3: sửa các file .DAT thành .csv (chưa cần lắm)
TODO4: chia rõ các class Quản lý với các class View (?)
TODO5: NhanVien: ArrayList<NhanVien>, them, xoa, ...
 */
public class SuKien {

    public SuKien() {
    }

    private SanPham sp;
    private Date ngay;
    private String hanhdong;
    private int soluong_hd;

    public int getSoluong_hd() {
        return soluong_hd;
    }

    public void setSoluong_hd(int soluong_hd) {
        this.soluong_hd = soluong_hd;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getHanhdong() {
        return hanhdong;
    }

    public void setHanhdong(String hanhdong) {
        this.hanhdong = hanhdong;
    }

    public SuKien(SanPham sp, Date ngay, String hanhdong, int soluong_hd) {
        this.sp = sp;
        this.ngay = ngay;
        this.hanhdong = hanhdong;
        this.soluong_hd = soluong_hd;
    }

    public void isRealSK() {
        if (this.hanhdong.equals("mua")) {
            this.sp.setSoLuong(this.sp.getSoluong() + this.soluong_hd);
        } else if (this.hanhdong.equals("ban") & this.sp.getSoluong() > this.soluong_hd - 1) {
            this.sp.setSoLuong(this.sp.getSoluong() - this.soluong_hd);
        }
    }
}
