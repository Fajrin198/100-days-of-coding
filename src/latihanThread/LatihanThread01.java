/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanThread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LatihanThread01 extends Thread {
    
    private volatile boolean running = true;
    
    public static void main(String[] args) {
        LatihanThread01 tr = new LatihanThread01();
        Thread thread = new Thread(tr);
        thread.start();
    }
    
    private void delay(long l){
        try {
            Thread.sleep(l);
        } catch (InterruptedException ex) {
            
        }
    }
    
    @Override
    public void run() {
        while(running){
            System.out.println("Ini ada di thread");
            delay(1000);
        }
    }

    
    
    
    
    
}
