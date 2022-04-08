package quiz1;

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.Method1();
        c.Method4();

        A a = new A();
        a.Method1();
        a.Method2();
        a.Method3();
        AChild aChild = new AChild(1,2);
        aChild.Method4();
        System.out.println(aChild.Method5());

        Task3 task3 = new Task3();
        task3.Method1();
    }
}
