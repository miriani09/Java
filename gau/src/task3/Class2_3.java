package task3;

import java.util.Scanner;

public class Class2_3 extends Class2{
    int y;
    public Class2_3(int x) {
        super(x);
    }

    public void Method2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("enter Second number: ");
        int num2 = sc.nextInt();

        x = num1;
        y = num2;
    }

    public void Method3(){
        System.out.println(x+y);
    }
}
