package hometask04;

import java.util.Scanner;

public class Hometask0404 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int mid = (max + min) / 2;
        System.out.println("��������� ����� �� 1 �� 100. ���������� �����  " + mid + " ?  1 - �� 0 - ���");
     /*   System.out.println("���: " + min);
        System.out.println("����: " + max);
        System.out.println("���: " + mid);*/
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        userInput = scanner.nextInt();
        if (userInput == 1) {
            System.out.println("���� �����: " + mid);
        } else if (userInput == 0) {
            System.out.println("���������� ����� ������ " + mid + "?  1 - �� 0 - ���");
            /*System.out.println("���: " + min);
            System.out.println("����: " + max);
            System.out.println("���: " + mid);*/
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
                    System.out.println("���� �����: " + mid);
                    break;
                }
                System.out.println("���� �����: " + mid + "? 1 - �� 0 - ��� ");
                Scanner scanner3 = new Scanner(System.in);
                int userInput3 = scanner3.nextInt();
                if (userInput3 == 1) {
                    System.out.println("���� �����: " + mid);
                    break;
                }
                System.out.println("���������� ����� ������ " + mid + "?  1 - �� 0 - ���");
            /*    System.out.println("���: " + min);
                System.out.println("����: " + max);
                System.out.println("���: " + mid);*/
            }
        }
    }
}
