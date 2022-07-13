/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

/**
 *
 * @author XPS
 */
public class SuKienHangThang extends SuKienDinhKy implements ChinhNgay {
    
    private int ngay;
    
    public SuKienHangThang(int ngay){
        super();
        this.ngay = ngay;
    }
    
    public void chinhNgay(){
        this.ngayTiepTheo = this.ngayTiepTheo.plusMonths(1);
    }
}
