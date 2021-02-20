/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if1.pkg101190004.muhamadramadan.pkg8;
import java.util.Scanner;

/**
 *
 * @author ENDOG
 * NAMA     : MUHAMAD RAMADAN
 * NIM      : 10119004
 * KELAS    : IF-1
 * TGL      : 20 FEBRUARI 2021
 * NO SOAL  : 8
 */
public class UASIF1101190004MUHAMADRAMADAN8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Sisi Disini :");
        int sisi = input.nextInt();
        int panjang = input.nextInt();
        int lebar = input.nextInt();
        int luasPersegi = sisi * sisi;
        int luasPersegiPanjang = panjang * lebar;
        System.out.println("Luas Persegi : " + luasPersegi);
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);
    }
    
}
