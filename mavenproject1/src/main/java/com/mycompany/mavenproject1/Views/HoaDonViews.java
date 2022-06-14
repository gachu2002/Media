/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1.Views;

import com.mycompany.mavenproject1.IOFile.IOSanPham;
import com.mycompany.mavenproject1.Object.SanPham;
import com.mycompany.mavenproject1.Object.SuKien;
import com.mycompany.mavenproject1.Object.ThanhToan;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class HoaDonViews extends javax.swing.JFrame {
    ThanhToan HD = new ThanhToan();
    IOSanPham IO = new IOSanPham();
    private ArrayList<SuKien> list_SuKien;
    private ArrayList<SanPham> list;
    private ArrayList<String> list_tensanpham;
    private ArrayList<Integer> list_soluongsanpham;
    private ArrayList<Integer> list_giaban;
    /**
     * Creates new form HoaDonViews
     */
    public HoaDonViews() {
        initComponents();
        this.setLocationRelativeTo(null);
        list = IO.docSP();
        list_SuKien = IO.docSK(list);
        list_tensanpham = new ArrayList<> ();
        list_soluongsanpham = new ArrayList<> ();
        list_giaban = new ArrayList<> ();

        for (int i= 0; i< list.size();i++){
            list_tensanpham.add(list.get(i).getTensanpham());
            list_soluongsanpham.add(list.get(i).getSoluong());
            list_giaban.add(list.get(i).getGiaban());
        }
        TAHoaDon.setEditable(false);
//        System.out.println(list.size());

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAHoaDon = new javax.swing.JTextArea();
        BtnThemSPHD = new javax.swing.JButton();
        TFtenSanPhamHD = new javax.swing.JTextField();
        TFsoluongHD = new javax.swing.JTextField();
        lbtenSanPham = new javax.swing.JLabel();
        lbsoluong = new javax.swing.JLabel();
        BTNBotSPHD = new javax.swing.JButton();
        BtnXoaSPHD = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        BtnIn = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TAHoaDon.setColumns(20);
        TAHoaDon.setRows(5);
        jScrollPane2.setViewportView(TAHoaDon);

        BtnThemSPHD.setText("Thêm");
        BtnThemSPHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnThemSPHDActionPerformed(evt);
            }
        });

        lbtenSanPham.setText("tên sản phẩm");

        lbsoluong.setText("số lượng");

        BTNBotSPHD.setText("Bớt");
        BTNBotSPHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBotSPHDActionPerformed(evt);
            }
        });

        BtnXoaSPHD.setText("Xóa");

        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnIn.setText("In");
        BtnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lbtenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFtenSanPhamHD, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(lbsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFsoluongHD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(BtnThemSPHD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNBotSPHD)
                        .addGap(60, 60, 60)
                        .addComponent(BtnIn)
                        .addGap(54, 54, 54)
                        .addComponent(BtnXoaSPHD)))
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFtenSanPhamHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFsoluongHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbtenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnThemSPHD)
                    .addComponent(BTNBotSPHD, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnXoaSPHD)
                    .addComponent(BtnIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnThemSPHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThemSPHDActionPerformed
        // TODO add your handling code here:
//        SanPham sp =null;
//        for (int i =0;i < list.size();i++){
//            if(TFtenSanPhamHD.getText().equals(list.get(i).getTensanpham()) & Integer.parseInt(TFsoluongHD.getText()) <= list.get(i).getSoluong()){
//                sp = list.get(i);
//                break;
//            }
//        }
//        if (sp == null) {
//            System.out.print("khong co san pham");
//            return;
//        }
//        
        int key = -1;
        for (int i =0;i < list_tensanpham.size();i++){
            if(TFtenSanPhamHD.getText().equals(list_tensanpham.get(i)) & Integer.parseInt(TFsoluongHD.getText()) <= list_soluongsanpham.get(i)){
                key = i;
                break;
            }
        }
        if (key == -1) {
            System.out.print("khong co san pham");
            return;
        }
        // class HoaDon
        HD.themSanPham(list_tensanpham.get(key),Integer.parseInt(TFsoluongHD.getText()),list_giaban.get(key));
        list_soluongsanpham.set(key,list_soluongsanpham.get(key) -Integer.parseInt(TFsoluongHD.getText()));
//        System.out.print(list_soluongsanpham.get(key));
        // thay doi so luong san pham trong kho
//        Date ngay = new Date();
//        SuKien sk = new SuKien(sp,ngay,"ban",Integer. parseInt(TFsoluongHD.getText())); //// can mang su kien vi khi dung lenh xoa thi ta se ko co su kien nay
//        sk.isRealSK();
//        list_SuKien.add(sk);
        
        
        /// in ra ketqua
        showResultHD();
    }//GEN-LAST:event_BtnThemSPHDActionPerformed

    private void BTNBotSPHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBotSPHDActionPerformed
        // TODO add your handling code here:
//        SanPham sp =null;
//        for (int i =0;i < list.size();i++){
//            if(TFtenSanPhamHD.getText().equals(list.get(i).getTensanpham())){
//                sp = list.get(i);
//                break;
//            }
//        }
//        if (sp == null) {
//            System.out.print("khong co san pham");
//            return;
//        }

        int key = -1;
        for (int i =0;i < list_tensanpham.size();i++){
            if(TFtenSanPhamHD.getText().equals(list_tensanpham.get(i)) & list_soluongsanpham.get(i)  + Integer.parseInt(TFsoluongHD.getText()) <=list.get(i).getSoluong()){
                key = i;
                break;
            }
        }
        if (key == -1) return;
        HD.botSanPham(list_tensanpham.get(key),Integer.parseInt(TFsoluongHD.getText()),list_giaban.get(key));
        list_soluongsanpham.set(key,list_soluongsanpham.get(key)  + Integer.parseInt(TFsoluongHD.getText()));
//        System.out.print(HD.getSoLuongSanPham());
//        System.out.print(list_soluongsanpham.get(key));
        showResultHD();
    }//GEN-LAST:event_BTNBotSPHDActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        JFrame MainViews = new MainViews();
        this.setVisible(false);
        MainViews.setVisible(true);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInActionPerformed
        // TODO add your handling code here:
//        System.out.print(list_SuKien.size());
        for (int i =0; i< list_tensanpham.size();i++){
            SanPham sp = null;
            for (int j = 0; j< list.size();j++){
                if (list_tensanpham.get(i).equals(list.get(j).getTensanpham())){
                   sp = list.get(j);
                   break;
                }
            }
            if(sp == null) return;
            if(list_soluongsanpham.get(i)<sp.getSoluong()){
               Date ngay = new Date();
                SuKien sk = new SuKien(sp,ngay,"ban",sp.getSoluong()-list_soluongsanpham.get(i)); //// can mang su kien vi khi dung lenh xoa thi ta se ko co su kien nay
                sk.isRealSK();
                list_SuKien.add(sk); 
            }
            
        }
//        System.out.print(list_SuKien.size());
        IO.ghiSP(list);
        IO.ghiSK(list_SuKien);
        list = IO.docSP();
        list_SuKien = IO.docSK(list);
        list_tensanpham = new ArrayList<> ();
        list_soluongsanpham = new ArrayList<> ();
        list_giaban = new ArrayList<> ();
        for (int i= 0; i< list.size();i++){
            list_tensanpham.add(list.get(i).getTensanpham());
            list_soluongsanpham.add(list.get(i).getSoluong());
            list_giaban.add(list.get(i).getGiaban());
        }
        HD = new ThanhToan();
    }//GEN-LAST:event_BtnInActionPerformed
    
    
    private void showResultHD() {
        String text = "";
        text += HD.ngayThanhToan();
        text += "\nDanh sach san pham:";
        
        for (int i = 0; i < HD.getDanhSachSanPham().size(); ++i) {
            text = text + "\n"  + (i + 1) + ". " + HD.getDanhSachSanPham().get(i) + "*" + HD.getSoLuongSanPham().get(i);
        }
        text += "\n-----------------------------------";
        text += "\n" +"Tong gia tri hoa don: " + HD.tongHoaDon();
        TAHoaDon.setText(text);
    }
    
    
    
    
    
//    public static void main(String args[]) {
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HoaDonViews().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBotSPHD;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnIn;
    private javax.swing.JButton BtnThemSPHD;
    private javax.swing.JButton BtnXoaSPHD;
    private javax.swing.JTextArea TAHoaDon;
    private javax.swing.JTextField TFsoluongHD;
    private javax.swing.JTextField TFtenSanPhamHD;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbsoluong;
    private javax.swing.JLabel lbtenSanPham;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables

    
}