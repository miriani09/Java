package task2.Constructor;

public class Class1 {
    int x;
    public Class1(int x){
        this.x = x;
    }

    public void Method1(){
        if (this.x % 2 == 0){
            System.out.println("odd");
        }else {
            System.out.println("even");
        }
    }
}
