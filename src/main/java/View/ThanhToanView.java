/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Exception.ChuaNhapDuThongTin;
import ThanhToan.ChucNangThanhToan;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class ThanhToanView extends javax.swing.JFrame {

    private ChucNangThanhToan TT;

    /**
     * Creates new form HoaDonViews
     */
    public ThanhToanView() {
        initComponents();
        this.setLocationRelativeTo(null);
        ChucNangThanhToan TT = new ChucNangThanhToan();
        TAHoaDon.setEditable(false);
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

        lbtenSanPham.setText("Tên sản phẩm");

        lbsoluong.setText("Số lượng");

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
                .addComponent(BtnBack)
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

        try {
            String spThem;
            int soLuongSpThem;
            try {
                spThem = TFtenSanPhamHD.getText();
                soLuongSpThem = Integer.parseInt(TFsoluongHD.getText());
            } catch (Exception e) {
                throw new ChuaNhapDuThongTin();
            }
            System.out.println("tung");
            this.TT.themSanPham(spThem, soLuongSpThem);
            System.out.println("tung");
        } catch (ChuaNhapDuThongTin e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Chưa nhập đủ thông tin!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
//        } catch (SanPhamKhongCoTrongKho e) {
//            JFrame frame = new JFrame("");
//            JOptionPane.showMessageDialog(frame,
//                    "Sản phẩm không có trong kho!",
//                    "",
//                    JOptionPane.ERROR_MESSAGE);
//        } catch (KhongDuSoSanPhamYeuCau e) {
//            JFrame frame = new JFrame("");
//            JOptionPane.showMessageDialog(frame,
//                    "Trong kho không đủ số sản phẩm yêu cầu!",
//                    "",
//                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getClass());
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Error!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
//            this.showResultHD();
        }
    }//GEN-LAST:event_BtnThemSPHDActionPerformed

    private void BTNBotSPHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBotSPHDActionPerformed
        // TODO add your handling code here:
//        int i = 0;
//        try {
//            for (; i < HD.getDanhSachSanPham().size(); i++) {
//                if (TFtenSanPhamHD.getText().equals(HD.getDanhSachSanPham().get(i))) {
//                    if (Integer.parseInt(TFsoluongHD.getText()) > HD.getDanhSachSoLuong().get(i)) {
//                        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
//                        JOptionPane.showMessageDialog(frame,
//                                "Số lượng sản phẩm muốn bỏ ra vượt quá số lượng sản phẩm đã thêm!",
//                                "",
//                                JOptionPane.ERROR_MESSAGE);
//                        return;
//                    } else {
//                        break;
//                    }
//                }
//            }
//        } catch (Exception e) {
//            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
//            JOptionPane.showMessageDialog(frame,
//                    "Chưa nhập đủ thông tin!",
//                    "",
//                    JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        if (i == HD.getDanhSachSanPham().size()) {
//            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
//            JOptionPane.showMessageDialog(frame,
//                    "Không có sản phẩm!",
//                    "",
//                    JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        HD.botSanPham(HD.getDanhSachSanPham().get(i), Integer.parseInt(TFsoluongHD.getText()), HD.getDanhSachGia().get(i));
//        showResultHD();
    }//GEN-LAST:event_BTNBotSPHDActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        JFrame MainViews = new MainViews();
        this.setVisible(false);
        MainViews.setVisible(true);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInActionPerformed
//        // TODO add your handling code here:
//        for (int i = 0; i < HD.getDanhSachSanPham().size(); i++) {
//            SanPham sp = null;
//            for (int j = 0; j < this.list_kho.size(); j++) {
//                if (HD.getDanhSachSanPham().get(i).equals(this.list_kho.get(j).getTensanpham())) {
//                    sp = this.list_kho.get(j);
//                    break;
//                }
//            }
//            if (sp == null) {
//                return;
//            }
//            if (HD.getDanhSachSoLuong().get(i) < sp.getSoluong()) {
//                Date ngay = new Date();
//                SuKien sk = new SuKien(sp, ngay, "ban", sp.getSoluong() - HD.getDanhSachSoLuong().get(i));
//// can mang su kien vi khi dung lenh xoa thi ta se ko co su kien nay
//                sk.isRealSK();
//                list_SuKien.add(sk);
//            }
//
//        }
//        IO.ghiSP(this.list_kho);
//        IO.ghiSK(list_SuKien);
    }//GEN-LAST:event_BtnInActionPerformed

    private void showResultHD() {
        String text = "";
        text += TT.getHD().ngayThanhToan();
        text += "\nDanh sach san pham:";

        for (int i = 0; i < TT.getHD().getDanhSachSanPham().size(); ++i) {
            text = text + "\n" + (i + 1) + ". " + TT.getHD().getDanhSachSanPham().get(i) + "*" + TT.getHD().getDanhSachSoLuong().get(i);
        }
        text += "\n-----------------------------------";
        text += "\n" + "Tong gia tri hoa don: " + TT.getHD().tongHoaDon();
        TAHoaDon.setText(text);
    }

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
