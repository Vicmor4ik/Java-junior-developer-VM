// ���� ������, ���������� ������ ����� � �����. ������� ���������� � ���, �������� �� ������ ����� �����������.
package hometask06;

public class Hometask0601 {
    public static void main(String[] args) {
        String Test1 = "a1b2v2b1a";
        String Test2 = "a10b6d2y3z";
        char[] chars = Test1.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                System.out.println("������ �� ���������");
                break;
            }
            left++;
            right--;
            if (left == right) {
                System.out.println("������ ���������");
            }
        }
    }
}
