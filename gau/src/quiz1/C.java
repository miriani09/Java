package quiz1;

import java.util.Scanner;

public class C {
    int a, b;

    public void Method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A number: ");
        int num1 = sc.nextInt();
        System.out.println("enter B number: ");
        int num2 = sc.nextInt();

        a = num1;
        b = num2;
    }
    public int Method2(){
        int digit, sum = 0;
        while(a > 0)
        {
            digit = a % 10;
            if (digit % 2 == 0){
                sum = sum + digit;
            }
            a = a / 10;
        }
        return sum;
    }
    public int Method3(){
        int count = 0;
        for (int i = 1; i <= b; i++) {
            if (i % 2 == 0){
                count = i * i;
            }
        }
        return count;
    }
    public void Method4(){
        System.out.println("A ricxvis luwi cifrebis jami: "+Method2());
        System.out.println("B ricxvis gamyofebis jami: "+Method3());
    }
}
