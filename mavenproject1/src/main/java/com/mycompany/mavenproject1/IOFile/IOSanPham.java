
package com.mycompany.mavenproject1.IOFile;

import com.mycompany.mavenproject1.Object.NhanVien.NVPastTime;
import com.mycompany.mavenproject1.Object.NhanVien.NhanVien;
import com.mycompany.mavenproject1.Object.NhanVien.NhanVienCoDinh;
import com.mycompany.mavenproject1.Object.SanPham;
import com.mycompany.mavenproject1.Object.SuKien;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class IOSanPham {
    public void ghiSP (ArrayList <SanPham> list)  {
        try (PrintWriter pw = new PrintWriter(new File("D:\\file_code\\javanew\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\SP.DAT"))){
            for (SanPham sp: list){
                pw.println(sp.getTensanpham());
                pw.println(sp.getGianhap());
                pw.println(sp.getGiaban());
                pw.println(sp.getSoluong());
            }
        } catch (Exception e){
            System.out.println("got an exception!");
        }
    }
    
    public void ghiSK (ArrayList <SuKien> list) {
        try (PrintWriter pw = new PrintWriter(new File("D:\\file_code\\javanew\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\SK.DAT"))){
            for (SuKien sk: list){
                pw.println(sk.getSp().getTensanpham());
                pw.println(sk.getNgay());
                pw.println(sk.getHanhdong());
                pw.println(sk.getSoluong_hd());
            }
        } catch (Exception e){
            System.out.println("got an exception!");
        }
    }
    
    public ArrayList<SanPham> docSP(){
        ArrayList<SanPham> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("D:\\file_code\\javanew\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\SP.DAT"))){
            while (sc.hasNext()){
                SanPham Sp = new SanPham();
                Sp.setTensanpham(sc.nextLine());
                Sp.setGianhap(Integer.parseInt(sc.nextLine()));
                Sp.setGiaban(Integer.parseInt(sc.nextLine()));
                Sp.soluong = Integer.parseInt(sc.nextLine());
                
                list.add(Sp);
            }
        } catch (Exception e){
            System.out.println("got an exception");
        }
        return list;
    }
    
    public ArrayList<SuKien> docSK(){
        ArrayList<SuKien> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("D:\\file_code\\javanew\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\SK.DAT"))){
            while (sc.hasNext()){
                
            }
        } catch (Exception e){
            System.out.println("got an exception");
        }
        return list;
    }
    
    
    public void ghiNV (ArrayList <NhanVien> list)  {
        try (PrintWriter pw = new PrintWriter(new File("D:\\file_code\\javanew\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\NV.DAT"))){
            for (NhanVien nv : list){
                if (nv instanceof NhanVienCoDinh){
                    pw.println(0);
                    pw.println(nv.getTenNhanVien());
                    pw.println(((NhanVienCoDinh) nv).getViTri());
                    pw.println(((NhanVienCoDinh) nv).getLuongCoBan());
                    pw.println(((NhanVienCoDinh) nv).getHeSoLuong());
                }
                else if (nv instanceof NVPastTime )  {
                    pw.println(1);
                    pw.println(nv.getTenNhanVien());
                    pw.println(((NVPastTime) nv).getThoiGianLamViec());
                    pw.println(((NVPastTime) nv).getLuongTheoGio());
                }  
                
            }
        } catch (Exception e){
            System.out.println("got an exception!");
        }
    }
    
    
    public ArrayList<NhanVien> docNV(){
        ArrayList<NhanVien> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("D:\\file_code\\javanew\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\NV.DAT"))){
            while (sc.hasNext()){
                int number = Integer.parseInt(sc.nextLine());
                if(number==0){
                    NhanVienCoDinh nv = new NhanVienCoDinh();
                    nv.setTenNhanVien(sc.nextLine());
//                    System.out.println(nv.getTenNhanVien());
                    nv.setViTri(sc.nextLine());
//                    System.out.println(nv.getViTri());
                    nv.setLuongCoBan(Double.parseDouble(sc.nextLine()));  
                    nv.setHeSoLuong(Double.parseDouble(sc.nextLine())); 
                    list.add(nv);
                }
                else if (number==1){
                    NVPastTime nv = new NVPastTime();
                    nv.setTenNhanVien(sc.nextLine());
//                    System.out.println(nv.getTenNhanVien());
                    nv.setThoiGianLamViec(Double.parseDouble(sc.nextLine()));
//                    System.out.println(nv.getThoiGianLamViec());
                    nv.setLuongTheoGio(Double.parseDouble(sc.nextLine()));
                    list.add(nv);
                }
                
            }
        } catch (Exception e){
            System.out.println("got an exception");
        }
        return list;
    }
  
}
