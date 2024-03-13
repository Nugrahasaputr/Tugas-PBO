/*
Nim  : 13020220098
Nama : Nugraha saputra
Senin, 11/03/2024
 */
import java.util.Scanner;
public class KasusSwitch {
    public static void main(String[] args){
        char cc;
        Scanner masukan=new Scanner(System.in);
        System.out.print("Ketikkan Sebuah Huruf, Akhiri Dengan RETURN : ");
        cc=masukan.next().charAt(0);
        switch (cc){
            case 'a':{
                System.out.println("Yang anda ketik adalah a");
                break;
            }
            case 'u':{
                System.out.println("Yang anda ketik adalah u");
                break;
            }
            case 'e':{
                System.out.println("Yang anda ketik adalah e");
                break;
            }
            case 'i':{
                System.out.println("Yang anda ketik adalah i");
                break;
            }
            case 'o':{
                System.out.println("Yang anda ketik adalah o");
                break;
            } default:
                System.out.println("Yang anda ketik adalah huruf MATI");
        }
    }
}
