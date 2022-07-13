/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import java.time.LocalDateTime;

/**
 *
 * @author XPS
 */
public class SuKienHangThang extends SuKienDinhKy implements ChinhNgay {

    private int ngay;

    public SuKienHangThang(String tenSK, String loaiSK, int ngay) {
        super(tenSK, loaiSK, LocalDateTime.now());
        LocalDateTime homnay = LocalDateTime.now();
        if (ngay > homnay.getDayOfMonth()) {
            this.ngayTiepTheo.plusDays(ngay - homnay.getDayOfMonth());
        } else {
            this.ngayTiepTheo.plusMonths(1);
            this.ngayTiepTheo.minusDays(homnay.getDayOfMonth() - ngay);
        }
        this.ngay = ngay;
    }

    public void chinhNgay() {
        this.ngayTiepTheo = this.ngayTiepTheo.plusMonths(1);
    }
}
