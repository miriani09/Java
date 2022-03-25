package task3;

public class Class2 {
    int x;
    public Class2(int x){
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

