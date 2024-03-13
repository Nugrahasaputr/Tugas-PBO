/*
Nim  : 13020220098
Nama : Nugraha saputra
Senin, 11/03/2024
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

public class BacaString {
    public static void main(String[] args) throws IOException{
        String str;
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nBaca String dan Integer\n");
        System.out.print("Masukkan Sebuah String: ");
        str = dataIn.readLine();
        System.out.print("String yang dibaca : "+ str);
    }
}
