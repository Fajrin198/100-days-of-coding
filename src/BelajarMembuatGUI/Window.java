/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarMembuatGUI;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author MY ASUS
 */
public class Window extends JFrame {
    
    private JPanel bestPanel = null;
    private JLabel JLabelInformatika = null;
    private JTextField JTextField1 = null;
    private JLabel JLabelUnsulbar = null;
    private JTextField JTextField2 = null;
    private JButton JButtonOK = null;
    private JButton JButtonClose = null;
    
    private void initUI() {
        setContentPane(getBestPanel());
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private JPanel getBestPanel() {
        if (bestPanel == null) {
            bestPanel = new JPanel();
            bestPanel.add(getLabelInformatika());
            bestPanel.add(getJTextField1());
            bestPanel.add(getLabelUnsulbar());
            bestPanel.add(getJTextField2());
            bestPanel.add(getJTextField2());
            bestPanel.add(getJButtonOK());
            bestPanel.add(getJButtonClose());
            
        }
        return bestPanel;
    }
    
    private JLabel getLabelInformatika() {
        if (JLabelInformatika == null) {
            JLabelInformatika = new JLabel("Informatika");
        }
        
        return JLabelInformatika;
    }
    
    private JLabel getLabelUnsulbar() {
        if (JLabelUnsulbar == null) {
            JLabelUnsulbar = new JLabel("Unsulbar");
        }
        
        return JLabelUnsulbar;
    }
    
    private JTextField getJTextField1() {
        if (JTextField1 == null) {
            JTextField1 = new JTextField();
            JTextField1.setPreferredSize(new Dimension(260, 28));
        }
        
        return JTextField1;
    }
    
    private JTextField getJTextField2() {
        if (JTextField2 == null) {
            JTextField2 = new JTextField();
            JTextField2.setPreferredSize(new Dimension(260, 28));
        }
        
        return JTextField2;
    }
    
    private JButton getJButtonOK() {
        if (JButtonOK == null) {
            JButtonOK = new JButton("OK");
            //Aksi
            JButtonClose.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String inputJTextField1 = JTextField1.getText();
                }
            });
        }
        
        return JButtonOK;
    }
    
    private JButton getJButtonClose() {
        if (JButtonClose == null) {
            JButtonClose = new JButton("Close");
            //Aksi
            JButtonClose.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        }
        
        return JButtonClose;
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Window myWindow = new Window();
                myWindow.initUI();
            }
            
        });
        
    }
}
