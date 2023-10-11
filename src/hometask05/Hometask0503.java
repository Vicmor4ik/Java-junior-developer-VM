package hometask05;

import java.util.Arrays;
import java.util.Scanner;

public class Hometask0503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int random=0;
        int sum=0;
        userInput = scanner.nextInt();
        int[] randomArr = new int[userInput];
        for (int i = 0; i < randomArr.length; i++) {
            random =(int) (Math.random() * (100) + 1);
            sum=sum+random;
            randomArr[i]=random;
          //  System.out.println(randomArr[i]);
        }
        Arrays.sort(randomArr);
        System.out.println(Arrays.toString(randomArr));
        System.out.println("Минимум = " + randomArr[0]);
        System.out.println("Максимум = " + randomArr[randomArr.length-1]);
        System.out.println("Среднее арифметическое значение = " + ((double)sum/randomArr.length));
    }
}
