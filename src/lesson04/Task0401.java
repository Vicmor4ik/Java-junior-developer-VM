package lesson04;

import java.util.Scanner;

public class Task0401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������������� ����� �����");
        int userInput;
        int sum=0;
        int countOf�Numbers = 0;
        int max=0;
        double avDiv=0;
        while (scanner.hasNextInt()&&(userInput = scanner.nextInt())>0){
            sum +=userInput;
            countOf�Numbers ++;
            if(userInput>0){
                max=userInput;
            }
        }
        avDiv=(double) sum/countOf�Numbers;
        System.out.println(sum);
        System.out.println("��������� ��������� �����: " + countOf�Numbers);
        System.out.println("������� �������������� �������� ��������� �����: " + avDiv );
        System.out.println("��������: " + max);

    }
}
