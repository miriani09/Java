package task4;
import java.util.Scanner;

public class Task11 {
    public void ToDecimal(){
        System.out.println("enter binary number");
        Scanner sc = new Scanner(System.in);
        String bin = sc.nextLine();

        int decimal=Integer.parseInt(bin,2);
        System.out.println(decimal);
    }
}
