package hometask04;

import java.util.Scanner;

public class Hometask0404 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int mid = (max + min) / 2;
        System.out.println("Загадайте число от 1 до 100. Загаданное число  " + mid + " ?  1 - да 0 - нет");
     /*   System.out.println("мин: " + min);
        System.out.println("макс: " + max);
        System.out.println("мид: " + mid);*/
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        userInput = scanner.nextInt();
        if (userInput == 1) {
            System.out.println("Ваше число: " + mid);
        } else if (userInput == 0) {
            System.out.println("Загаданное число больше " + mid + "?  1 - да 0 - нет");
            /*System.out.println("мин: " + min);
            System.out.println("макс: " + max);
            System.out.println("мид: " + mid);*/
            Scanner scanner2 = new Scanner(System.in);
            int userInput2 = 0;
            while (true) {
                userInput2 = scanner2.nextInt();
                if (userInput2 == 1) {
                    min = mid;
                    mid = min + (max - min) / 2;
                } else if (userInput2 == 0) {
                    max = mid;
                    mid = min + (max - min) / 2;
                }
                if (max > 99) {
                    max = 100;
                }
                if ((mid - min) <= 1 && (max - mid) <= 1) {
                    System.out.println("Ваше число: " + mid);
                    break;
                }
                System.out.println("Ваше число: " + mid + "? 1 - да 0 - нет ");
                Scanner scanner3 = new Scanner(System.in);
                int userInput3 = scanner3.nextInt();
                if (userInput3 == 1) {
                    System.out.println("Ваше число: " + mid);
                    break;
                }
                System.out.println("Загаданное число больше " + mid + "?  1 - да 0 - нет");
            /*    System.out.println("мин: " + min);
                System.out.println("макс: " + max);
                System.out.println("мид: " + mid);*/
            }
        }
    }
}
