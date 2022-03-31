package task4;

import java.util.Scanner;

public class Task10 {
    public void ToBinary(){
        System.out.println("enter decimal number");
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();

        String bin = Integer.toBinaryString(dec);
        System.out.println(bin);
    }
}
