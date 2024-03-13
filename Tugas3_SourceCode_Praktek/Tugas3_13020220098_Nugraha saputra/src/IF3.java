/*
Nim  : 13020220098
Nama : Nugraha saputra
Senin, 11/03/2024
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class IF3 {
    public static void main(String[] args){
        int a;
        Scanner masukan=new Scanner(System.in);
        System.out.print("Contoh IF Tigas Kasus \n");
        System.out.print("Ketikkan Suatu Nilai Integer : ");
        a=masukan.nextInt();
        if(a>0){
            System.out.println("Nilai a Positif "+a);
        } else if (a==0) {
            System.out.println("Nilai Nol "+ a);
        }else{
            System.out.println("Nilai a Negatif "+ a);
        }
    }
}
