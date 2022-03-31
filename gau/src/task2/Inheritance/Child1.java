package task2.Inheritance;

import java.util.Scanner;

public class Child1 extends Base1{
    public int y;

    public void Method4(){
        System.out.println("Enter Child Number: ");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
    }

    public void Method5(){
        System.out.println(x + y);
    }

}
