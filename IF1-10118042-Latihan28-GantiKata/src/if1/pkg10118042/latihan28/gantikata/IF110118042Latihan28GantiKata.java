/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan28.gantikata;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program   : Program ini berisi program Untuk Mengganti kata dari sebuah kalimat
 */
public class IF110118042Latihan28GantiKata {

    public static void main(String[] args) {
  String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String kataBaru;
        
        //input
        System.out.println("====PROGRAM MENGGANTI KATA====");
        System.out.print("Masukkan Kalimat\t: ");
        Scanner tempKalimat = new Scanner(System.in);
        kalimatAwal = tempKalimat.nextLine();
        
        System.out.print("Ganti Kata\t\t: ");
        Scanner tempGkata = new Scanner(System.in);
        gantiKata =  tempGkata.nextLine();
        
        System.out.print("Menjadi Kata\t\t: ");
        Scanner tempBkata = new Scanner(System.in);
        kataBaru = tempBkata.nextLine();
        System.out.println();
        
        //output
        kalimatBaru = kalimatAwal.replaceAll(gantiKata,kataBaru);
        System.out.println("======HASIL FORMATTING======");
        System.out.println("Kalimat awal  : " + kalimatAwal);
        System.out.println("Kalimat baru  : " + kalimatBaru);
        
      
    }
    
}
