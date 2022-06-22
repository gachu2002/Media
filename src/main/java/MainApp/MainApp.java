/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package MainApp;

import KhoHang.SanPham;
import View.MainViews;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class MainApp {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame MainViews = new MainViews();
                MainViews.setLocationRelativeTo(null);
                MainViews.setVisible(true);
            }
        });
    }

}
