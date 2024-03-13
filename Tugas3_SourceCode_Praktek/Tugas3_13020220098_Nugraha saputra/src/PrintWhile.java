/*
Nim  : 13020220098
Nama : Nugraha saputra
Senin, 11/03/2024
 */
import java.util.Scanner;
public class PrintWhile {
    public static void main(String[] args){
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);

        System.out.print ("Nilai N >0 = ");
        N = masukan.nextInt();
        i = 1;

        System.out.print ("Print i dengan WHILE: \n");
        while (i <= N) {
            System.out.println (i);
            i++;
        }
    }
}
