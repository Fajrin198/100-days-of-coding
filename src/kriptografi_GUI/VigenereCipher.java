package kriptografi_GUI;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VigenereCipher extends JFrame {
    
    private JPanel bestPanel = null;
    private JTextField JTextFieldMassege = null;
    private JTextField JTextFieldKeyword = null;
    private JTextField JTextFieldEncrypt = null;
    private JTextField JTextFieldDecrypt = null;
    private JLabel JLabelMassege = null;
    private JLabel JLabelKeyword = null;
    private JLabel JLabelEncrypt = null;
    private JLabel JLabelDecrypt = null;
    private JButton JButtonOK = null;
    
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
            bestPanel.add(getLabelMassege());
            bestPanel.add(getJTextFieldMassege());
            bestPanel.add(getLabelKeyword());
            bestPanel.add(getJTextFieldKeyword());
            bestPanel.add(getJButtonOK());
            bestPanel.add(getLabelEncrypt());
            bestPanel.add(getJTextFieldEncrypt());
            bestPanel.add(getLabelDecrypt());
            bestPanel.add(getJTextFieldDecrypt());
            
        }
        return bestPanel;
    }
    
    private JLabel getLabelMassege() {
        if (JLabelMassege == null) {
            JLabelMassege = new JLabel("Massege");
        }
        
        return JLabelMassege;
    }
    private JLabel getLabelKeyword() {
        if (JLabelKeyword == null) {
            JLabelKeyword = new JLabel("Keyword");
        }
        
        return JLabelKeyword;
    }
    
    private JLabel getLabelEncrypt() {
        if (JLabelEncrypt == null) {
            JLabelEncrypt = new JLabel("Ciphertext");
        }
        
        return JLabelEncrypt;
    }
    
    private JLabel getLabelDecrypt() {
        if (JLabelDecrypt == null) {
            JLabelDecrypt = new JLabel("Plaintext");
        }
        
        return JLabelDecrypt;
    }
    
    private JTextField getJTextFieldMassege() {
        if (JTextFieldMassege == null) {
            JTextFieldMassege = new JTextField();
            JTextFieldMassege.setPreferredSize(new Dimension(200, 28));
        }
        
        return JTextFieldMassege;
    }
    private JTextField getJTextFieldKeyword() {
        if (JTextFieldKeyword == null) {
            JTextFieldKeyword = new JTextField();
            JTextFieldKeyword.setPreferredSize(new Dimension(200, 28));
        }
        
        return JTextFieldKeyword;
    }
    
    private JTextField getJTextFieldEncrypt() {
        if (JTextFieldEncrypt == null) {
            JTextFieldEncrypt = new JTextField();
            JTextFieldEncrypt.setPreferredSize(new Dimension(200,28));
        }
        
        return JTextFieldEncrypt;
    }
    
    private JTextField getJTextFieldDecrypt() {
        if (JTextFieldDecrypt == null) {
            JTextFieldDecrypt = new JTextField();
            JTextFieldDecrypt.setPreferredSize(new Dimension(200,28));
        }
        
        return JTextFieldDecrypt;
    }
    
    public static String encrypt(String message, String keyword){
        String plaintext = message.toUpperCase();
        keyword = keyword.toUpperCase();
        char[] charArray = plaintext.toCharArray();
        char[] keyArray = keyword.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<charArray.length; i++){
            int p = (int) charArray[i]-65;
            int k = i%keyArray.length;
            int key = (int)keyArray[k]-65;
            int c = p;
            if (p>=0 && p<26 && key>=0 && key<26){
                c= (p+key)%26;
            }
            c = c+65;
            sb.append((char)c);
        }
        String ciphertext = sb.toString();
        return ciphertext;
        
    }
    public static String decrypt(String message, String keyword){
        String ciphertext = message.toUpperCase();
        keyword = keyword.toUpperCase();
        char[] charArray = ciphertext.toCharArray();
        char[] keyArray = keyword.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<charArray.length; i++){
            int c = (int) charArray[i]-65;
            int k = i%keyArray.length;
            int key = (int)keyArray[k]-65;
            int p = c;
            if (c>=0 && c<26 && key>=0 && key<26){
                p= (c-key)%26;
                if (p<0){
                    p = 26+p;
                }
            }
            p = p+65;
            sb.append((char)p);
        }
        String plaintext = sb.toString();
        return plaintext;
    }
    
    private JButton getJButtonOK() {
        if (JButtonOK == null) {
            JButtonOK = new JButton("Convert");
            JButtonOK.setPreferredSize(new Dimension(240,28));
            //Aksi
            JButtonOK.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String message = JTextFieldMassege.getText();
                    String keyword = JTextFieldKeyword.getText();
                    String ciphertext = encrypt(message, keyword);
                    JTextFieldEncrypt.setText(ciphertext);
                    String plaintext = decrypt(ciphertext, keyword);
                    JTextFieldDecrypt.setText(plaintext);
                }
            });
        }
        
        return JButtonOK;
    }
    
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VigenereCipher vc = new VigenereCipher();
                vc.initUI();
            }
            
        });
        
    }
}
