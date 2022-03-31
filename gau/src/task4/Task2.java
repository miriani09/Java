package task4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public void  Write_0to100(){
        try {
            for (int i = 0; i <= 100; i++) {
                FileWriter filewriter = new FileWriter("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task4\\myFiles\\data1.txt", true);
                filewriter.write(Integer.toString(i) + "\n");
                filewriter.close();
            }
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("an Error occurred");
            e.printStackTrace();
        }
    }
}
