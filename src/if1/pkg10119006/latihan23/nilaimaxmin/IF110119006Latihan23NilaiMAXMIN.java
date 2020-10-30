/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan23.nilaimaxmin;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Menentukan nilai max dan min
 */
public class IF110119006Latihan23NilaiMAXMIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int jmlhMhs;

        System.out.println("====Program Nilai terbesar dan Terkecil Nilai Mahasiswa======");
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = inputUser.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        jmlhMhs = inputUser.nextInt();
        
        //input array
        int[] nilai = new int[jmlhMhs];
        
        for (int i=1; i <= jmlhMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " = ");
            nilai[i-1] = inputUser.nextInt();
        }
        
        //menampilkan isi array
        System.out.println();
        System.out.println("======Hasil Nilai Mahasiswa======");
        for (int i=1; i <= jmlhMhs; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i-1]);
        }
        
        //mencari nilai terbesar dan terkecil
        int max = -1000;
        int min = 1000;
        
        for(int i=0; i < nilai.length; i++){
            if(nilai[i] > max){
                max = nilai[i];
            }
            if(nilai[i] < min) {
                min = nilai[i];
            }
        }
        
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println();
        System.out.println("Petugas : " + petugas);
    }
    
}
