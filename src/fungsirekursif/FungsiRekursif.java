/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsirekursif;

import java.util.Scanner;

/**
 *
 * @author MOKLET-01
 */
public class FungsiRekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //memberi inputan
        Scanner masukan = new Scanner(System.in);
        //deklarasi variabel
        int bil, hasil;
        System.out.print("Masukkan suatu bilagan : ");
        //input bilangan dari user
        bil  = masukan.nextInt();
        //rumus hasil
        hasil = faktorial(bil);
        //output
        System.out.println("Nilai faktorial "+ bil +" adalah "+ hasil);
    }
    //fungsi rekursif (pemanggilan nilainya sendiri)
    private static int faktorial(int a){
    if (a==1){
        return 1;
    }else{
        return (a*faktorial(a-1));
    }
}
}