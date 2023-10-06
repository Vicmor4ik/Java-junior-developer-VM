package lesson04;

import java.util.Scanner;

public class Task0401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите положительные целые числа");
        int userInput;
        int sum=0;
        int countOfТNumbers = 0;
        int max=0;
        double avDiv=0;
        while (scanner.hasNextInt()&&(userInput = scanner.nextInt())>0){
            sum +=userInput;
            countOfТNumbers ++;
            if(userInput>0){
                max=userInput;
            }
        }
        avDiv=(double) sum/countOfТNumbers;
        System.out.println(sum);
        System.out.println("количство введенных чисел: " + countOfТNumbers);
        System.out.println("Среднее арифмитическое значение введенных чисел: " + avDiv );
        System.out.println("Максимум: " + max);

    }
}
