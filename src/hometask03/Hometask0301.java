package hometask03;

public class Hometask0301 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * (491) + 10);
        if ((a > 25) && (a < 200)) {
            System.out.println("����� " + a + " ���������� � ��������� (25;200)");
        } else {
            System.out.println("����� " + a + " �� ���������� � ��������� (25;200)");
        }
    }
}
