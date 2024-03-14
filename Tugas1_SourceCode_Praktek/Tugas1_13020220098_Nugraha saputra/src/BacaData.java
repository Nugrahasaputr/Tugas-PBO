/*
Nim  : 13020220098
Nama : Nugraha Saputra
--Rabu, 21/02/2024--
 */
import java.util.Scanner;
public class BacaData {
    public static void main(String[] args) {
        int a;
        Scanner masukan;
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt();
        System.out.print ("Nilai yang dibaca : "+ a);
    }
}
