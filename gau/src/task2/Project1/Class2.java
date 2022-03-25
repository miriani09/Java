package task2.Project1;

import java.util.Scanner;

public class Class2 {
    int a;
    int b;
    int c;

    public void Method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A number: ");
        int num1 = sc.nextInt();
        System.out.println("enter B number: ");
        int num2 = sc.nextInt();
        System.out.println("enter C number: ");
        int num3 = sc.nextInt();

        a = num1;
        b = num2;
        c = num3;
    }

    public void Method2(){
        if (a > b && a > c){
            System.out.println("Max Number Is: " + a);
        }else if (b > a && b > c){
            System.out.println("Max Number Is: " + b);
        }else if (c > a && c > b){
            System.out.println("Max Number Is: " + c);
        }else {
            System.out.println("Error");
        }
    }

    public void Method3(){
        if (a < b && a < c){
            System.out.println("Min Number Is: " + a);
        }else if (b < a && b < c){
            System.out.println("Min Number Is: " + b);
        }else if (c < a && c < b){
            System.out.println("Min Number Is: " + c);
        }else {
            System.out.println("Error");
        }
    }
}
