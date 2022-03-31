package task2.Constructor;

public class Class2 {
    int x;

    public Class2(){}
    public Class2(int x){
        this.x = x;
    }

    public void Method1() {
        if(x >= 5 && x <= 24) {
            System.out.println("motavsebulia");
        }else {
            System.out.println("araris motavsebuli");
        }
    }
}
