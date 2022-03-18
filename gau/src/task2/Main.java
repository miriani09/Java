package task2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("აირჩიეთ ოპერაცია: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("შეიყვანეთ პირველი რიცხვი: ");
        number1 = input.nextDouble();

        System.out.println("შეიყვანეთ მეორე რიცხვი: ");
        number2 = input.nextDouble();

        switch (operator) {

            case '+' -> {
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
            }
            case '-' -> {
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            }
            case '*' -> {
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
            }
            case '/' -> {
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }
            default -> System.out.println("შეცდომა!");
        }
    }
}