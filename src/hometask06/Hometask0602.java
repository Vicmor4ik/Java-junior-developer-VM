//���� ��� ������, ������, ���������� ������ ����� ����������� ��������. ������� ���������� � ���, �������� �� ���� ������ ���������� ������ ������.
package hometask06;

public class Hometask0602 {
    public static void main(String[] args) {
        String Test1 = "mamamilaramu";
        String Test2 = "ramumilamama";
        char test;
        int sum1 = 0;
        int sum2 = 0;
        char[] chars1 = Test1.toCharArray();
        char[] chars2 = Test2.toCharArray();
        if (Test1.length() != Test2.length()) System.out.println(Test1 + " � " + Test2 + " - �� ���������");
        else {
            for (int j = 0; j < chars1.length; j++) {
                sum1 += (int) chars1[j];
            }
            for (int i = 0; i < chars2.length; i++) {
                sum2 += (int) chars2[i];
            }
            if (sum1 == sum2) {
                System.out.println(Test1 + " � " + Test2 + " - ���������");
            } else {
                System.out.println(Test1 + " � " + Test2 + " - �� ���������");
            }
        }
    }
}
// �� ���� ��� ����������� �������� ��� ��������, ���� ����� ���� �������� ����� ����������
// ���������� �������� ���� ���������� �����, �� ������ ��� ����� ������ (9,3,4) � (7,5,4)
// ���� ����� ����-�� �� ���������� � ���������. ������� �������� ���� ������ � ������� � ��������� ��������� ������ ������ ����� String.contains,
// �� �� ���������� ��� ��� �������� chars[i], �������� �������� � ����� ���������� � ������� �������� ��������

