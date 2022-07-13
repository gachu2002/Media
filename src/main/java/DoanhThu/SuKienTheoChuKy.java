/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

/**
 *
 * @author XPS
 */
public class SuKienTheoChuKy extends SuKienDinhKy {

    private int soNgayMotChuKy;

    public SuKienTheoChuKy(int soNgayMotChuKy) {
        super();
        this.soNgayMotChuKy = soNgayMotChuKy;
    }

    public void chinhNgay() {
        this.ngayTiepTheo = this.ngayTiepTheo.plusMonths(1);
    }
}
