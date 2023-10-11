package hometask05;

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
            if (userInput > 0) {
                posArr[pos] = userInput;
                pos++;
                continue;
            } else if (userInput < 0) {
                negArr[neg] = userInput;
                neg++;
                continue;
            }else if ((posArr[posArr.length-1]!=0 && negArr[negArr.length-1]!=0)||userInput==0){
                for (int i = 0; i < posArr.length; i++) {
                    System.out.print(posArr[i]+ ", ");
                }
                for (int i = 0; i < negArr.length; i++) {
                    System.out.print(negArr[i] + ", ");
                }
            }
        }
    }
}