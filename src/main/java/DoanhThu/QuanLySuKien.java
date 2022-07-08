/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author XPS
 */
public class QuanLySuKien {
    
    private ArrayList<SuKienMotLan> dsSuKien;
    
    public QuanLySuKien(){
        
    }
    
    public int thongKeChiPhi(Date start, Date end){
        return 0;
    }
    
    public ArrayList<SuKienMotLan> getDanhSachSuKien(){
        return this.dsSuKien;
    }
    
    public void setDanhSachSuKien(ArrayList<SuKienMotLan> s){
        this.dsSuKien = s;
    }
    
}
