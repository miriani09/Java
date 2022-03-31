package task2.Inheritance;

import java.util.Scanner;

public class Base1 {
    public int x;

    public Base1(){
        System.out.println("hello My Class");
    }

    public void Method1(){
        System.out.println("Enter Parent Number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
    }

    public void Method2(){
        System.out.println(x);
    }

    public void Method3(){
        if (x % 2 == 0){
            System.out.println("x is a odd number");
        }else {
            System.out.println("x is a even number");
        }
    }
}
