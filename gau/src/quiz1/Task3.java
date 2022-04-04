package quiz1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    int a, b;

    public void Method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("enter Second number: ");
        int num2 = sc.nextInt();

        a = num1;
        b = num2;
        int count = 0;
        List<Integer> list=new ArrayList<Integer>();
        if (a > b){
            int temp = a;
            a = b;
            b = temp;

            for (int i = a; i <= b; i++) {
                int rand = (int) (Math.random() * 20 + 1);
                System.out.println(rand);
                list.add(rand);
            }
        }else {
            for (int i = a; i <= b; i++) {
                int rand = (int) (Math.random() * 20 + 1);
                System.out.println(rand);
                list.add(rand);
            }
        }
        boolean flag = false;
        for (int i = 2; i <= list.size() / 2; ++i) {
            if (list.get(i) % i == 0) {
                flag = true;
                count += 1;
                break;
            }
        }

        if (!flag) {
            System.out.println(count);
        }

    }
}

