package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task1
//        System.out.println("""
//                C++
//                c#
//                java
//                pascal""");

        //task2
//        Scanner sc = new Scanner(System.in);
//        System.out.print("ENter Firs Number: ");
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(a/b);
//        System.out.println((double) a / (double) b);

        //task3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter First Number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter First Number: ");
//        int b = sc.nextInt();
//        System.out.print("Enter First Number: ");
//        int c = sc.nextInt();
//
//        int x = a+b+c;
//        int y = a*b*c;
//        String sum = String.format("sum: %d", x);
//        String multiply = String.format("sum: %d", y);
//        System.out.println(sum);
//        System.out.println(multiply);

        //task4
//        System.out.print("enter 3 digit number: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a > 100 && a <=999){
//            int a1 = a / 100;
//            int a2 = a / 10 % 10;
//            int a3 = a % 10;
//            System.out.println(a1);
//            System.out.println(a2);
//            System.out.println(a3);
//        } else {
//            System.out.println("enter 3 digit number");
//        }

        //task5
//        System.out.print("enter 4 digit number: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a > 1000 && a <=9999){
//            int a1 = a / 1000 % 10;
//            int a2 = a / 100 % 10;
//            int a3 = a / 10 % 10;
//            int a4 = a % 10;
//            System.out.println(a1);
//            System.out.println(a2);
//            System.out.println(a3);
//            System.out.println(a4);
//            int sum = a1 + a2 + a3 + a4;
//            String s = String.format("Sum: %d", sum);
//            System.out.println(s);
//        } else {
//            System.out.println("enter 4 digit number");
//        }

        //task6
//        int number, digit, sum = 0;
//        System.out.print("Enter the number: ");
//
//        Scanner sc = new Scanner(System.in);
//        number = sc.nextInt();
//
//        while(number > 0)
//        {
//            digit = number % 10;
//            sum = sum + digit;
//            number = number / 10;
//        }
//        System.out.println("Sum of Digits: "+sum);

        //task7
//        int x = 16, y = 8, gcd = 1;
//        for (int i = 1; i <= x && i <= y; i++) {
//            if (x % i == 0 && y % i == 0){
//                gcd = i;
//                System.out.println(gcd);
//            }
//        }

        //task8
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter first namber: ");
//        int a = sc.nextInt();
//        System.out.println("enter second namber: ");
//        int b = sc.nextInt();
//
//        if (a < b){
//            for (int i = a; i < b; i++) {
//                String range = String.format("from a to b numbers: %d", i);
//                System.out.println(range);
//            }
//        }else {
//            System.out.println("a must be a less than b number!!!");
//        }

        //task9
//        int[] arr = {1,38,5,66,3,53,21,13};
//        int max = Arrays.stream(arr).max().getAsInt();
//        int min = Arrays.stream(arr).min().getAsInt();
//        System.out.println("Max Array Number: " + max);
//        System.out.println("Min Array Number: " + min);

        //task10
//        int[] arr = {1,38,5,66,3,53,21,13};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        //task11
//        List<Integer> arr = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            int random = (int)(Math.random() * 20 + 1);
//            arr.add(random);
//        }
//        System.out.println(arr.getClass().getName());

        //task12
//        List<Integer> arr = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            int random = (int)(Math.random() * 20 + 1);
//            arr.add(random);
//        }
//        arr.sort(Collections.reverseOrder());
//        System.out.println(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("pirveli riccxvi: ");
        int num1 = sc.nextInt();
        System.out.println("meore ricxvi: ");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            int rand = (int) (Math.random() * 20 + 1);
            System.out.println(rand);
        }
    }
}

