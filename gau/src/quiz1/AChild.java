package quiz1;

import java.util.Scanner;

public class AChild extends A{
    int x, y;
    public AChild(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void Method4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter X number: ");
        int num1 = sc.nextInt();
        System.out.println("enter Y number: ");
        int num2 = sc.nextInt();

        x = num1;
        y = num2;
    }
    public int Method5(){
        return x+2*y;
    }
}
