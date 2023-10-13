package hometask06;

public class Hometask0602Test {
    public static void main(String[] args) {
        String Test1 = "mamamilaramu";
        String Test2 = "ramumilamama";
        int[] sum1 = new int[Test1.length()];
        int[] sum2 = new int[Test2.length()];
        int result = 0;
        char[] chars1 = Test1.toCharArray();
        char[] chars2 = Test2.toCharArray();
        if (Test1.length() != Test2.length()) System.out.println(Test1 + " и " + Test2 + " - Не анаграммы");
        else {
            for (int i = 0; i < chars1.length; i++) {
                sum1[i] = chars1[i];
                sum2[i] = chars2[i];
                result += sum1[i] - sum2[i];
            }
            if (result != 0) {
                System.out.println(Test1 + " и " + Test2 + " - Не анаграммы");
            } else {
                System.out.println(Test1 + " и " + Test2 + " - Анаграммы");
            }
        }
    }
}
// По идее надо вычесть из одного массива чаров другой поэлементно. Просуммировать полученный новый массив,
//если результат 0, то элементы совпадают, если нет - то есть отличия (не уверен, что это правда и что учтены все проверки. Но оно работает =) )