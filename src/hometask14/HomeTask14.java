package hometask14;

public class HomeTask14 {
    public static void main(String[] args) {
        PairContainer<Integer, String> pairContainer1 = new PairContainer<>(7, "������ ����");
        PairContainer<String, User<Integer>> pairContainer2 = new PairContainer<>("����", new User<>(14));
        PairContainer<String, PairContainer<Integer, User<String>>> pairContainer3 = new PairContainer<>("�������", new PairContainer<>(70, new User<>("���������")));
    }
}
//�������� ����� PairContainer �� ���������� key � value. key � value - generic �������� ��� �����������, �� ����� ���� ������ �����.
//������� ��������� PairContainer, ��� key - ����� �����, value - ������
//������� ��������� PairContainer, ��� key - ������, value - ��� User, � �������� id - ����� �����
//������� ��������� PairContainer, ��� key - ������, value - ��� PairContainer, � �������� key - ����� �����, value - ��� User, � �������� id - ������