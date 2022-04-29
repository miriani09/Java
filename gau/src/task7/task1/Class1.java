package task7.task1;
import java.util.*;

public class Class1 {
    int a, b;
    int[] m = new int [12];

    public void Method1(){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter First number: ");
        num1 = sc.nextInt();
        System.out.println("enter Second number: ");
        num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0){
            if (num1 < num2){
                a = num1;
                b = num2;
            }else if (num1 > num2){
                a = num2;
                b = num1;
            }else {
                System.out.println("Error");
            }
        }else {
            System.out.println("Entered numbers must be positive numbers");
        }


    }
    public void Method2(){
        for (int i = 0; i < m.length; i++) {
            Random rand = new Random();
            int rand1 = rand.nextInt(a, b);

            m[i] = rand1;
        }
    }
    public void Method3(){
        System.out.println(Arrays.toString(m));
        System.out.println("Min NUmber From Array is: " + Arrays.stream(m).min().getAsInt());
    }
    public void Method4(){
        for (int i = 0; i < m.length; i++) {
            System.out.println("Arrays Element is: " +m[i]+ " and index is: " + i);
        }
    }
    public void Method5(){
        for (int i = 0; i < m.length; i++) {
            if (m[i] % 3 == 0){
                System.out.println(m[i]);
            }
        }
    }
}
