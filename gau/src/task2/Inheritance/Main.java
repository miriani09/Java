package task2.Inheritance;

public class Main {
    public static void main(String[] args) {


        Base1 base1 = new Base1();
        base1.Method1();
        base1.Method2();
        base1.Method3();

        Child1 child1 = new Child1();
        child1.Method4();
        System.out.println(child1.Method5());
    }
}
