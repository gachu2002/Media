
package NhanVien;
import IO.IO;
import java.util.ArrayList;

public class QuanLyNhanVien {

    private final int MAX_PARTTIME = 15;
    private final int MAX_CODINH = 15;
    ArrayList <NhanVien> danhsachNhanViens;
    public QuanLyNhanVien(){
       IO IO = new IO();
       this.danhsachNhanViens = IO.docNV();
    }
    public int getSoNhanVienPartTime() {
        int cout = 0;
        for(NhanVien obj: danhsachNhanViens){
            if(obj instanceof NVPartTime){
               cout++;
            }
        }
        return cout;
    }
    public int getSoNhanVienCoDinh() {
        int cout = 0;
        return cout;
    }
    public boolean themNhanVien(NhanVien nv){
         danhsachNhanViens.add(nv);
         return true;
    }
    public double tongLuong() {
        double sum = 0;
        for (NhanVien obj: danhsachNhanViens) {
            sum += obj.tinhLuong();
        }
        return sum;
    }
}