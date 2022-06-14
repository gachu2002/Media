
package com.mycompany.mavenproject1.IOFile;

import com.mycompany.mavenproject1.Object.DiaNhac;
import com.mycompany.mavenproject1.Object.DiaPhim;
import com.mycompany.mavenproject1.Object.NhanVien.NVPastTime;
import com.mycompany.mavenproject1.Object.NhanVien.NhanVien;
import com.mycompany.mavenproject1.Object.NhanVien.NhanVienCoDinh;
import com.mycompany.mavenproject1.Object.Sach;
import com.mycompany.mavenproject1.Object.SanPham;
import com.mycompany.mavenproject1.Object.SuKien;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class IOSanPham {
    public void ghiSP (ArrayList <SanPham> list)  {
        try (PrintWriter pw = new PrintWriter(new File("src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\SP.DAT"))){
            for (SanPham sp: list){
                if(sp instanceof Sach){
                    pw.println(0);
                    pw.println(sp.getTensanpham());
                    pw.println(sp.getGianhap());
                    pw.println(sp.getGiaban());
                    pw.println(sp.getSoluong());
                    pw.println(((Sach)sp).getTentacgia());
                    pw.println(((Sach)sp).getNhaxuatban());
                    pw.println(((Sach)sp).getTheloai());
                    pw.println(((Sach)sp).getNamphathanh());
                    
                }
                else if (sp instanceof DiaPhim){
                    pw.println(1);
                    pw.println(sp.getTensanpham());
                    pw.println(sp.getGianhap());
                    pw.println(sp.getGiaban());
                    pw.println(sp.getSoluong());
                    pw.println(((DiaPhim)sp).getDaodien());
                    pw.println(((DiaPhim)sp).getDienvien());
                    pw.println(((DiaPhim)sp).getTheloai());
                    pw.println(((DiaPhim)sp).getNamsanxuat());
                }
                else if (sp instanceof DiaNhac){
                    pw.println(2);
                    pw.println(sp.getTensanpham());
                    pw.println(sp.getGianhap());
                    pw.println(sp.getGiaban());
                    pw.println(sp.getSoluong());
                    pw.println(((DiaNhac)sp).getTencasi());
                    pw.println(((DiaNhac)sp).getTheloai());
                    pw.println(((DiaNhac)sp).getNamphathanh());
                }
//                pw.println(sp.getTensanpham());
//                pw.println(sp.getGianhap());
//                pw.println(sp.getGiaban());
//                pw.println(sp.getSoluong());
            }
        } catch (Exception e){
            System.out.println("got an exception!");
        }
    }
    
    
    
    public ArrayList<SanPham> docSP(){
        ArrayList<SanPham> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\SP.DAT"))){
            while (sc.hasNext()){
                int number = Integer.parseInt(sc.nextLine());
                if (number ==0){
                    Sach sp = new Sach();
                    sp.setTensanpham(sc.nextLine());
                    sp.setGianhap(Integer.parseInt(sc.nextLine()));
                    sp.setGiaban(Integer.parseInt(sc.nextLine()));
                    sp.soluong = Integer.parseInt(sc.nextLine());
                    sp.setTentacgia(sc.nextLine());
                    sp.setNhaxuatban(sc.nextLine());
                    sp.setTheloai(sc.nextLine());
                    sp.setNamphathanh(Integer.parseInt(sc.nextLine()));                   
                    list.add(sp);
                }
                else if (number ==1){
                    DiaPhim sp = new DiaPhim();
                    sp.setTensanpham(sc.nextLine());
                    sp.setGianhap(Integer.parseInt(sc.nextLine()));
                    sp.setGiaban(Integer.parseInt(sc.nextLine()));
                    sp.soluong = Integer.parseInt(sc.nextLine());
                    sp.setDaodien(sc.nextLine());
                    sp.setDienvien(sc.nextLine());
                    sp.setTheloai(sc.nextLine());
                    sp.setNamsanxuat(Integer.parseInt(sc.nextLine()));                   
                    list.add(sp);
                }
                else if (number == 2){
                    DiaNhac sp = new DiaNhac();
                    sp.setTensanpham(sc.nextLine());
                    sp.setGianhap(Integer.parseInt(sc.nextLine()));
                    sp.setGiaban(Integer.parseInt(sc.nextLine()));
                    sp.soluong = Integer.parseInt(sc.nextLine());
                    sp.setTencasi(sc.nextLine());
                    sp.setTheloai(sc.nextLine());
                    sp.setNamphathanh(Integer.parseInt(sc.nextLine()));                   
                    list.add(sp);
                }
//                SanPham Sp = new SanPham();
//                Sp.setTensanpham(sc.nextLine());
//                Sp.setGianhap(Integer.parseInt(sc.nextLine()));
//                Sp.setGiaban(Integer.parseInt(sc.nextLine()));
//                Sp.soluong = Integer.parseInt(sc.nextLine());
//                
//                list.add(sp);
            }
        } catch (Exception e){
            System.out.println("got an exception");
        }
        return list;
    }
    
    public void ghiSK (ArrayList <SuKien> list) {
        try (PrintWriter pw = new PrintWriter(new File("src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\SK.DAT"))){
            for (SuKien sk: list){
                pw.println(sk.getSp().getTensanpham());
//                pw.println(sk.getSp().getGianhap());
//                pw.println(sk.getSp().getGiaban());
//                pw.println(sk.getSp().getSoluong());
                pw.println(sk.getNgay());
                pw.println(sk.getHanhdong());
                pw.println(sk.getSoluong_hd());
            }
        } catch (Exception e){
            System.out.println("got an exception!");
        }
    }
    
    public ArrayList<SuKien> docSK(ArrayList<SanPham> list_sp){
        ArrayList<SuKien> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\SK.DAT"))){
            while (sc.hasNext()){
                SuKien sk = new SuKien();
                SanPham sp = null ;
                String tenSanPham = sc.nextLine();
                
                for (int i =0; i <list_sp.size();i++){
                    if(list_sp.get(i).getTensanpham().equals(tenSanPham)){
                        sp = list_sp.get(i);
                        break;
                    }
                }
//                sp.setTensanpham(sc.nextLine());
//                sp.setGianhap(Integer.parseInt(sc.nextLine()));
//                sp.setGiaban(Integer.parseInt(sc.nextLine()));
//                sp.soluong = Integer.parseInt(sc.nextLine());
                sk.setSp(sp);
                
                Date ngay=new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US).parse(sc.nextLine()); 
//                System.out.print(list_sp.size());   
                sk.setNgay(ngay);
                sk.setHanhdong(sc.nextLine());
                sk.setSoluong_hd(Integer.parseInt(sc.nextLine()));
                list.add(sk);
            }
        } catch (Exception e){
            System.out.println("got an exception");
        }
        return list;
    }
    
    
    
    public void ghiNV (ArrayList <NhanVien> list)  {
        try (PrintWriter pw = new PrintWriter(new File("src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\NV.DAT"))){
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
        try (Scanner sc = new Scanner(new File("src\\main\\java\\com\\mycompany\\mavenproject1\\IOFile\\NV.DAT"))){
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
