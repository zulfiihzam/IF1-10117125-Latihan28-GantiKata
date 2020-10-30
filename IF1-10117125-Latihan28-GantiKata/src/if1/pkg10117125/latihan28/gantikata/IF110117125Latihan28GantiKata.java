/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA : Zulfi Ihzam Rahmat
 * KELAS: IF-1
 * NIM  : 10117125
 * Deskripsi Program: program ini berisi program yang dapat menggantikan kata
 * dengan menginput kata
 */
public class IF110117125Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kalimat;
        String nGanti, nJadi;
        
        System.out.println();
        System.out.println("========Prgram Mengganti Kata=======");
        System.out.println("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.println("Ganti kata : ");
        nGanti = scanner.nextLine();
        
        System.out.println("Menjadi Kata : ");
        nJadi = scanner.nextLine();
        
        System.out.println();
        System.out.println("========Hasil Formatting=======");
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("Kalimat Awal : " + Kalimat);
        System.out.println("Kalimat Baru : " + ganti);
        
    }
    
}
