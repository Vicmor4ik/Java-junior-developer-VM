package hometask05;

import java.util.Arrays;
import java.util.Scanner;

public class Hometask0502 {
    public static void main(String[] args) {
        int posArr[] = new int[5];
        int negArr[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int pos = 0;
        int neg = 0;
        while (true) {
            userInput = scanner.nextInt();
            if (userInput > 0 && (pos < posArr.length)) {
                posArr[pos] = userInput;
                pos++;
            }
            if (userInput < 0 && (neg<negArr.length)){
                negArr[neg] = userInput;
                neg++;
            }
            if (userInput==0 || (pos==5&&neg==5)){
                System.out.println(Arrays.toString(posArr));
                System.out.println(Arrays.toString(negArr));
                break;
            }
        }

    }
}