package hometask04;

import java.util.Scanner;

public class Hometask0403 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * (9) + 1);
        System.out.println("���������� �������� ���������� ���������� ����� �� 1 �� 9. 0 - ����� �� ���������.");
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        while (true) {
            userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
            if (userInput < 0 || userInput > 9) {
                System.out.println("������� ���������� ������");
                continue;
            }
            if (userInput < 10) {
                if (userInput < random) {
                    System.out.println("���������� ����� ������");
                } else if (userInput > random) {
                    System.out.println("���������� ����� ������");
                } else {
                    System.out.println("�� �������!");
                    break;
                }
            }
        }
    }
}
