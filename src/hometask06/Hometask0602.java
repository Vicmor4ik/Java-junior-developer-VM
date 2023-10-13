//Даны две строки, строки, содержащие только буквы английского алфавита. Вывести информацию о том, являются ли одна строка анаграммой другой строки.
package hometask06;

public class Hometask0602 {
    public static void main(String[] args) {
        String Test1 = "mamamilaramu";
        String Test2 = "ramumilamama";
        int sum1 = 0;
        int sum2 = 0;
        char[] chars1 = Test1.toCharArray();
        char[] chars2 = Test2.toCharArray();
        if (Test1.length() != Test2.length()) System.out.println(Test1 + " и " + Test2 + " - не анаграммы");
        else {
            for (int j = 0; j < chars1.length; j++) {
                sum1 += chars1[j];
            }
            for (int i = 0; i < chars2.length; i++) {
                sum2 += chars2[i];
            }
            if (sum1 == sum2) {
                System.out.println(Test1 + " и " + Test2 + " - анаграммы");
            } else {
                System.out.println(Test1 + " и " + Test2 + " - не анаграммы");
            }
        }
    }
}
// Не знаю как реализовать доп проверку, ведь могут быть ситуации когда одинаковое
// количество символов даст одинаковую сумму, но внутри они будут разные (9,3,4) и (7,5,4)
// либо нужно куда-то их складывать и проверять. Пытался привести одну строку к массиву и поочереди проверить каждый символ через String.contains,
// но не разобрался как ему передать chars[i]. Пробовал напрямую и через переменную в которой сохранял значения. Если перебирать посимвольно
// из одного массива символы другого, то как-будто в этом нет логики. Если строки будут большими мы будем перебирать N раз N символов

