package hometask03;

public class Hometask0301 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * (491) + 10);
        if ((a > 25) && (a < 200)) {
            System.out.println("Число " + a + " содержится в интервале (25;200)");
        } else {
            System.out.println("Число " + a + " не содержится в интервале (25;200)");
        }
    }
}
