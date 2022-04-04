package quiz1;

public class A {
    int x;

    public A(){
        System.out.println("Hello A Class");
    }

    public void Method1(){
        x = (int) (Math.random() * 20 + 1);
    }
    public void Method2(){
        System.out.println(x);
    }
    public void Method3(){
        boolean flag = false;
        for (int i = 2; i <= x / 2; ++i) {
            if (x % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(x + " Martivi ricxvia");
        else
            System.out.println(x + " Ar aris martivi ricxvi");
    }
}
