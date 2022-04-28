package task7.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws IOException {
        int x = -12, y = 23;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Quantity N: ");
        int n = sc.nextInt();

        try {
            File myObj = new File("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task7\\task2\\numbers.txt");
            if (myObj.createNewFile()){
                System.out.println("file Created: " + myObj.getName());
            }else{
                System.out.println("file already exist");
            }
        } catch (IOException e) {
            System.out.println("an error occurred");
            e.printStackTrace();
        }

        for (int i = 0; i <= n; i++) {
            Random rand = new Random();
            int rand1 = rand.nextInt(x, y);

            FileWriter filewriter = new FileWriter("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task7\\task2\\numbers.txt\\", true);
            filewriter.write(rand1 + "\n");
            filewriter.close();
        }

        try {
            int sum = 0;
            File myObj = new File("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task7\\task2\\numbers.txt\\");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                sum += Integer.parseInt(data);
            }
            System.out.println("Sum is: " + sum);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
