//Дан массив целых чисел: int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44}. Найти максимальную сумму четырёх смежных целых чисел в массиве task04. Использовать алгоритм скользящего окна.
package hometask05;

public class Hometask0504 {
    public static void main(String[] args) {
        int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44};
        int wStart = 0;
        int sum = 0;
        int max = 0;
        for (int wEnd = 0; wEnd < task04.length; wEnd++) {
            sum += task04[wEnd];
            if (max < sum) {
                max = sum;
            }
            if ((wEnd - wStart) == 3) {
                sum -= task04[wStart];
                wStart++;
            }
        }
        System.out.println(max);
    }
}
