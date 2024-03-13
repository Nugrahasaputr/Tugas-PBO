/*
Nim  : 13020220098
Nama : Nugraha saputra
Senin, 11/03/2024
 */
import java.util.Scanner;
public class Max2 {
    public static void main(String[] args){
        int a, b;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Maksimum Dua Bilangan : ");
        System.out.println("Ketikkan Dua Bilangan, Pisahkan dengan RETURN : ");
        a=masukan.nextInt();
        b=masukan.nextInt();
        System.out.println("Ke Dua Bulangan : a = "+a+" b = "+b);
        if(a >= b){
            System.out.println("Nilai a yang maksimum: "+ a);
        }else {
            System.out.println("Nilai b yang maksimum: "+ b);
        }
    }
}
