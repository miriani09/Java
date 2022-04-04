package task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public void CreateFile1(){
        try {
            File myObj = new File("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task4\\myFiles\\doc.txt");
            if (myObj.createNewFile()){
                System.out.println("file Created: " + myObj.getName());
            }else{
                System.out.println("file already exist");
            }
        } catch (IOException e) {
            System.out.println("an error occurred");
            e.printStackTrace();
        }
    }
    public void WriteToFile(){
        try {
            System.out.println("Enter Text To Write In File");
            Scanner sc = new Scanner(System.in);
            String inputTxt = sc.nextLine();

            FileWriter filewriter = new FileWriter("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task4\\myFiles\\doc.txt", true);
            filewriter.write(inputTxt);
            filewriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("an Error occurred");
            e.printStackTrace();
        }
    }
    public void ReadFile(){
        try {
            File myObj = new File("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task4\\myFiles\\doc.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
