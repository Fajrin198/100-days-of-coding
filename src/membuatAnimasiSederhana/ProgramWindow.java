/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package membuatAnimasiSederhana;

import javax.swing.JFrame;

public class ProgramWindow {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Ini judul window");
        
        MyPanel panel = new MyPanel();
        jf.getContentPane().add(panel);
        
        // Mengatur ukuran window
        jf.setSize(800, 600);
        // Mengatur Lokasi window agar berada di tengah-tengah
        jf.setLocationRelativeTo(jf);
        // berfungsi agar saat windownya di close maka programnya juga akan berhenti melakukan running
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Berfungsi agar windownya dapat terlihat/muncul saat program di running
        jf.setVisible(true);
    }
}
