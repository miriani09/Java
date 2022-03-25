package task3;

import java.util.Scanner;

public class Class3 {
    int a;
    int b;

    public void Method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("enter Second number: ");
        int num2 = sc.nextInt();

        a = num1;
        b = num2;
        int count_odd = 0;
        int count_even = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0){
                count_odd += 1;
            }else if(i % 2 == 1){
                count_even += 1;
            }else {
                System.out.println("error");
            }
        }
        System.out.println("Odd: " + count_odd);
        System.out.println("even: " + count_even);
    }
}
