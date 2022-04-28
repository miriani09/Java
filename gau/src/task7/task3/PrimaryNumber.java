package task7.task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class PrimaryNumber {
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    private int number;

    public void Method1(){
        Random rand = new Random();
        int rand1 = rand.nextInt(100, 200);
        setNumber(rand1);
    }

    public void Method2(){
        try {
            File myObj = new File("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task7\\task3\\numbers.txt");
            if (myObj.createNewFile()){
                System.out.println("file Created: " + myObj.getName());
            }else{
                System.out.println("file already exist");
            }

            FileWriter filewriter = new FileWriter("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task7\\task3\\numbers.txt\\", true);
            filewriter.write(getNumber() + "\n");
            filewriter.close();
        } catch (IOException e) {
            System.out.println("an error occurred");
            e.printStackTrace();
        }
    }
}
