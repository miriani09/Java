package task2.Project1;
import java.util.Scanner;

public class Class1 {
    int a;
    int b;

    public void Method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A number: ");
        int num1 = sc.nextInt();
        System.out.println("enter B number: ");
        int num2 = sc.nextInt();

        a = num1;
        b = num2;
    }

    public void Method2(){
        System.out.println(a+b);
    }

    public void Method3(){
        System.out.println(a*b);
    }
}
