package task2.Constructor;

public class Class3 {
    int a, b, x;
    public Class3(){}
    public Class3(int a, int b, int x){
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public void Method1(){
        if (a < b){
            System.out.println("Shualeduria");
        }else{
            System.out.println("ar aris shualeduri");
        }
    }

    public void Method2(){
        if(x >= a && x <= b) {
            System.out.println("motavsebulia");
        }else {
            System.out.println("araris motavsebuli");
        }
    }
}
