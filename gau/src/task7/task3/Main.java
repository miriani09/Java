package task7.task3;

public class Main {
    public static void main(String[] args) {
        PrimaryNumber primaryNumber = new PrimaryNumber();
        primaryNumber.Method1();
        primaryNumber.Method2();

        SubstractNumber substractNumber1 = new SubstractNumber(primaryNumber);
        SubstractNumber substractNumber2 = new SubstractNumber(primaryNumber);

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                substractNumber1.Method3();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                substractNumber2.Method3();
            }
        }).start();
    }
}
