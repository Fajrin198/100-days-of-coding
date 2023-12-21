/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarMembuatGUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MY ASUS
 */
public class Window1 extends JFrame {
    
    private JPanel bestPanel = null;
    private JTable myTable = null;
    
    private void initUI() {
        setContentPane(getBestPanel());
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private JPanel getBestPanel() {
        if (bestPanel == null) {
            bestPanel = new JPanel();
            bestPanel.add(getMyTable());
            
        }
        return bestPanel;
    }
    
    private JTable getMyTable(){
        if(myTable == null){
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nama");
            model.addColumn("NIM");
            model.addColumn("Mata Kuliah");
            model.addRow(new String []{"Fajrin","D0222336","Algoritma Struktur Data"});
            model.addRow(new String []{"Fajrin","D0222336","Algoritma Struktur Data"});
            model.addRow(new String []{"Fajrin","D0222336","Algoritma Struktur Data"});
            myTable = new JTable(model);
        }
        return myTable;
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Window1 myWindow = new Window1();
                myWindow.initUI();
            }
            
        });
        
    }
}
