package task4;

import java.io.FileWriter;
import java.io.IOException;

public class Task3 {
    public void CreateFiles(){
        try {
            for (int i = 0; i <= 30; i++) {
                FileWriter filewriter = new FileWriter("C:\\Users\\miria\\IdeaProjects\\Java\\gau\\src\\task4\\myFiles1\\"+i, true);
                filewriter.write("Programmer" + "\n");
                filewriter.close();
            }
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("an Error occurred");
            e.printStackTrace();
        }
    }
}
