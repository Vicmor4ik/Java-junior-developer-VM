package hometask04;

import java.util.Scanner;

public class Hometask0403 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * (9) + 1);
        System.out.println("Попробуйте отгадать загаданное программой число от 1 до 9. 0 - Выход из программы.");
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        while (true) {
            userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
            if (userInput < 0 || userInput > 9) {
                System.out.println("Введите корректные данные");
                continue;
            }
            if (userInput < 10) {
                if (userInput < random) {
                    System.out.println("Загаданное число больше");
                } else if (userInput > random) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Вы угадали!");
                    break;
                }
            }
        }
    }
}
