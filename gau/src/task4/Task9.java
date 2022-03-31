package task4;

import java.io.FileWriter;
import java.io.IOException;

public class Task9 {
    public void Files1000(){
        try {
            for (int i = 0; i <= 1000; i++) {
                FileWriter filewriter = new FileWriter("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task4\\myFiles1000\\"+i, true);
                filewriter.write(i + "\n");
                filewriter.close();
            }
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("an Error occurred");
            e.printStackTrace();
        }
    }
}
