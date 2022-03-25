package task2.Project1;

import java.util.Scanner;

public class Class3 {
    int a;
    int b;
    int c;

    public void Method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A Number: ");
        int num1 = sc.nextInt();
        System.out.println("enter B Number: ");
        int num2 = sc.nextInt();
        System.out.println("enter C Number: ");
        int num3 = sc.nextInt();

        a = num1;
        b = num2;
        c = num3;
    }

    public int Method2(){
        return a % 10;
    }

    public int Method3(){
        return Integer.parseInt(String.valueOf((""+b).charAt(0)));
    }

    public int Method4(){
        int digit, sum = 0;
        while(c > 0) {
            digit = c % 10;
            sum = sum + digit;
            c = c / 10;
        }
        return sum;
    }

    public void Method5(){
        System.out.println(Method2() * Method3());
    }

    public void Method6(){
        System.out.println(Method3() * Method4());
    }
}
