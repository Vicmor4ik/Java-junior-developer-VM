package hometask04;

import java.util.Scanner;

public class Hometask0402 {
    public static void main(String[] args) {
        System.out.println("������� �����.");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int userInputForResult = userInput;
        int sumDigitits = 0;
        while (userInput != 0) {
            sumDigitits += (userInput % 10);
            userInput = userInput / 10;
        }
        System.out.println("����� ���� ����� " + userInputForResult + " : " + sumDigitits);
    }
}
