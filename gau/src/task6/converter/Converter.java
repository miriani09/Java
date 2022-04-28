package task6.converter;

import java.util.Scanner;

public class Converter {
    int curse;

    public void Currency(){
        double courseUSD = 1.7710;
        double courseEUR = 2.2700;
        double courseGBP = 2.8950;
        double Usd, Eur, Gpb;

        Scanner sc = new Scanner(System.in);

        System.out.println("Following are the Choices:");
        System.out.println("Enter 1: USD");
        System.out.println("Enter 2: EUR");
        System.out.println("Enter 3: GPB");


        System.out.println("Enter the amount you want to convert?");
        int choice = sc.nextInt();

        System.out.print("\nChoose from above options: ");
        float amount = sc.nextFloat();

        switch (choice){
            case 1:
                Usd =  amount * courseEUR;


        }
    }
}
