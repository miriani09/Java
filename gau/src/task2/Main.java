package task2;

import java.text.Format;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
//       Calculator calc = new Calculator();
//       calc.calc();

       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();

       if (a == 0){
           throw new Exception("dont zero");
       }
    }
}