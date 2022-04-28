package task7.task3;

import java.util.Random;

public class SubstractNumber {
    PrimaryNumber primaryNumber = new PrimaryNumber();

    public SubstractNumber(PrimaryNumber primaryNumber){
        this.primaryNumber = primaryNumber;
    }

    public void Method3(){
        int num = primaryNumber.getNumber();

        if (num>=60){
            Random rand = new Random();
            int rand1 = rand.nextInt(50, 60);

            primaryNumber.setNumber(num-rand1);
        }
        System.out.println(primaryNumber.getNumber());
    }
}
