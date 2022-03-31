package task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task5 {
    public void fromAtoB(){
        System.out.println("Enter Number A: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Number B: ");
        int b = sc.nextInt();

        if (a < b) {
            for (int j = 0; j < 100; j++) {
                for (int i = a; i < b; i++) {
                    int random = (int) (Math.random() * b + a);
                    try {
                        FileWriter filewriter = new FileWriter("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task4\\myFiles\\data2.txt", true);
                        filewriter.write(random + "\n");
                        filewriter.close();
                    } catch(IOException e){
                        System.out.println("an Error occurred");
                        e.printStackTrace();
                    }
                }
            }
        }else{
            System.out.println("a must be a less than b");
        }
    }
}
