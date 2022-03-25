package task3;

import java.util.Scanner;

public class Class1 {
    int x;
    int y;

    public void Method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("enter Second number: ");
        int num2 = sc.nextInt();

        x = num1;
        y = num2;
    }
    public void Method2(){
        int last = x % 10;
        System.out.println(last);
    }

    public void Method3(){
        int first = Integer.parseInt(String.valueOf((""+y).charAt(0)));
        System.out.println(first);
    }
}
