package task2.Constructor;

public class Class5 {
    int a, b, x;

    public Class5(){

    }
    public Class5(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void Method1(){
        if (a < b){
            System.out.println("Shualeduria");
        }else{
            System.out.println("ar aris shualeduri");
        }
    }

    public void Method2(){
        this.x = 4;
        if(x >= a && x <= b) {
            System.out.println("motavsebulia");
        }else {
            System.out.println("araris motavsebuli");
        }
    }
}
