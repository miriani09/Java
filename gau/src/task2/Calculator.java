package task2;
import java.util.Scanner;

public class Calculator {
    private double n1, n2;

    public void calc() {
        Scanner sr = new Scanner(System.in);
        System.out.println("enter first number: ");
        this.n1 = sr.nextDouble();

        System.out.println("enter Operation : ");
        sr.nextLine();
        String operation = sr.nextLine();

        System.out.println("enter first number: ");

        this.n2 = sr.nextDouble();

        sr.close();

        performOperation(operation);
    }

    private void performOperation(String operation) {
        switch (operation) {
            case "+" -> System.out.println(this.add());
            case "-" -> System.out.println(this.subtract());
            case "*" -> System.out.println(this.multiply());
            case "/" -> System.out.println(this.divide());
            default -> System.out.println("Invalid operation");
        }
    }

    private double add() {
        return n1 + n2;
    }

    private double subtract() {
        return n1 - n2;
    }

    private double multiply() {
        return n1 * n2;
    }

    private double divide() {
        if(n2 == 0) {
            System.out.println("Zero division error");
            return 0;
        }
        return n1 / n2;
    }
}