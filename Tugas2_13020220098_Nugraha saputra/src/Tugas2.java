/*
Nim  : 13020220098
Nama : Nugraha Saputra
--Senin, 04/03/2024--
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nim      : ");
        String nim = reader.readLine();
        System.out.print("Nama     : ");
        String nama = reader.readLine();
        System.out.print("Jurusan  : ");
        String jurusan = scanner.nextLine();
        System.out.print("Fakultas : ");
        String fakultas = scanner.nextLine();

        int totalDetik = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Detik"));
        System.out.println(totalDetik);

        long detikSekarang = totalDetik % 60;
        long totalMenit = totalDetik / 60;
        long menitSekarang = totalMenit % 60;
        long totalJam = totalMenit / 60;
        long jamSekarang = totalJam % 24;

//        JOptionPane.showMessageDialog(null, "Waktu saat ini: " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang);
        System.out.println("Waktu saat ini: " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang);

        System.out.println("NIM : "+nim+"\n"+"Nama : "+nama+"\n"+"Jurusan : "+jurusan+"\n"+"Fakultas : "+fakultas);
        JOptionPane.showMessageDialog(null, "Waktu saat ini: " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang+"\n"+"NIM : "+nim+"\n"+"Nama : "+nama+"\n"+"Jurusan : "+jurusan+"\n"+"Fakultas : "+fakultas);
    }
}
