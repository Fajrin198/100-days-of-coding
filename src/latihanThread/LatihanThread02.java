/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanThread;

/**
 *
 * @author MY ASUS
 */
public class LatihanThread02 implements Runnable {
    
    private volatile boolean running = true;
    
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
    
    public static void main(String[] args) {
        LatihanThread02 tr = new LatihanThread02();
        Thread thread = new Thread(tr);
        thread.start();
    }
    
}
