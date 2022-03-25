package task2.Project3;

import java.util.Arrays;
import java.util.Scanner;

public class Class1 {
    int[] myArray = new int [10];


    public void Method1(){
        System.out.println("Enter 10 Arrays : ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of the Array one by one: ");

        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = s.nextInt();
        }
        System.out.println("Contents of the Array are: " + Arrays.toString(myArray));
    }

    public void Method2(){
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)(Math.random() * 15 + 0);
        }
        System.out.println(Arrays.toString(myArray));
    }
}
