/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MY ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        ArrayList<String> MataKuliah = new ArrayList();
        ArrayList<Integer> sks = new ArrayList();
        ArrayList<Character> nilaiHuruf = new ArrayList();
        
        int sumSKS = 0;
        int i = 0;
        // input
        while(true){
            System.out.println("------------------------------------");
            if(sumSKS>=24){
                break;
            }
            System.out.print("Matakuliah  : ");
            String inputMK = sc.nextLine();
            MataKuliah.add(i, inputMK);
            
            System.out.print("SKS         : ");
            int inputSKS = sc2.nextInt();
            sks.add(i, inputSKS);
            
            System.out.print("Nilai angka : ");
            double inputNilai = sc2.nextDouble();
            
            if(inputNilai>=80){
                nilaiHuruf.add(i, 'A');
            }else if(inputNilai>=70){
                nilaiHuruf.add(i, 'B');
            }else if(inputNilai>=50){
                nilaiHuruf.add(i, 'C');
            }else if(inputNilai>=30){
                nilaiHuruf.add(i, 'D');
            }else{
                nilaiHuruf.add(i, 'E');
            }
            
            sumSKS += inputSKS;
            i++;
            System.out.println("Total SKS yang sudah diambil = "+sumSKS);
        }
        System.out.println("------------------------------------");
        OUTER:
        while (true) {
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Update Data");
            System.out.println("3. Hapus Nilai");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu(1/2/3/4) : ");
            int opsi = sc2.nextInt();
            switch (opsi) {
                case 1:
                    System.out.println("--------------------------------------");
                    System.out.println("No.\tMata Kuliah\tSKS\tNilai\t");
                    for (int j = 0; j < MataKuliah.size(); j++) {
                        System.out.print(j+1);
                        System.out.print(MataKuliah.get(j)+"\t");
                        System.out.print(sks.get(j)+"\t");
                        System.out.print(nilaiHuruf.get(j)+"\t");
                        System.out.println();
                    }
                    System.out.println("--------------------------------------");
                    break;
                case 2:
                    {
                        System.out.print("Masukkan No kolom yang ingin di update : ");
                        int no = sc.nextInt();
                        System.out.print("Nilai angka : ");
                        double inputNilai = sc2.nextDouble();
                        if(inputNilai>=80){
                            nilaiHuruf.remove(no-1);
                            nilaiHuruf.add(no-1, 'A');
                        }else if(inputNilai>=70){
                            nilaiHuruf.remove(no-1);
                            nilaiHuruf.add(no-1, 'B');
                        }else if(inputNilai>=50){
                            nilaiHuruf.remove(no-1);
                            nilaiHuruf.add(no-1, 'C');
                        }else if(inputNilai>=30){
                            nilaiHuruf.remove(no-1);
                            nilaiHuruf.add(no-1, 'D');
                        }else{
                            nilaiHuruf.remove(no-1);
                            nilaiHuruf.add(no-1, 'E');
                        }       System.out.println("Update Berhasil!!");
                        break;
                    }
                case 3:
                    {
                        System.out.print("Masukkan No kolom yang ingin di delete : ");
                        int no = sc.nextInt();
                        MataKuliah.remove(no-1);
                        nilaiHuruf.remove(no-1);
                        System.out.println("Data berhasil di delete!!");
                        break;
                    }
                case 4:
                    break OUTER;
                default:
                    break;
            }
        }
        
    }
}
