/*
Nim  : 13020220098
Nama : Nugraha saputra
Senin, 11/03/2024
 */
import java.util.Scanner;
public class PrintXRepeat {
    public static void main(String[] args){
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);

        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();
        if (x == 999){
            System.out.print("Kasus kosong \n");
        }else{
            Sum = 0;
            do {
                Sum = Sum + x; /* Proses */
                System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt();
            }while (x!=999);
        }
    }
}
