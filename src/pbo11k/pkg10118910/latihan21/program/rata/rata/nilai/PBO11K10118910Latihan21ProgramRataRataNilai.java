/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan21.program.rata.rata.nilai;

import java.util.Scanner;

/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh
 * Kelas:IF11K
 * NIM  :10118910
 * 
 * Description : Program Rata-Rata Nilai
 */
public class PBO11K10118910Latihan21ProgramRataRataNilai {

    /**
     * @param i
     * @param args the command line arguments
     */
    public static Scanner scan = new Scanner(System.in);
    public static void rata_rata(int i){
        double ratarata,jumlah=0,n;
        for (int j = 1; j <= i; j++) {
            System.out.print("Nilai Mahasiswa ke-"+j+"\t: ");
            n = scan.nextInt();
            jumlah = jumlah + n;
        }
        ratarata =jumlah / i;
        System.out.println("\n"+"Maka, Rata-rata Nilainya adalah " + ratarata);
        System.out.println("Developed by : Muhamad Syifa Amruloh");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.print("Masukan Banyaknya Mahasiswa\t: ");
        n = scan.nextInt();
        rata_rata(n);
    }
    
}
