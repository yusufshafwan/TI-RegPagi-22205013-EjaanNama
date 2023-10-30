/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class latihan25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== Program Ejaan Nama ======");

        // Meminta pengguna untuk memasukkan nama
        System.out.print("Masukkan nama depan Anda untuk di eja: ");
        String nama = scanner.nextLine();

        // Ejaan nama
        System.out.println("Ejaan untuk \"" + nama + "\" adalah.");

        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + nama.charAt(i));
        }

        // Menutup scanner
        scanner.close();
    }
    
}

