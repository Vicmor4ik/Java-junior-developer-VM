package hometask03;

public class Hometask0303 {
    public static void main(String[] args) {
        int x=1;
        int y=-1;
        if(x>0 && y>0){
            System.out.println("����� ����������� ������ ��������");
        } else if (x<0 && y>0){
            System.out.println("����� ����������� ������ ��������");
        }else if (x<0 && y<0){
            System.out.println("����� ����������� ������� ��������");
        }else if (x>0 && y<0){
            System.out.println("����� ����������� ��������� ��������");
        }else{
            System.out.println("���� �� ��������� ����� ����� ����, ������� ���������� ��������");
        }
    }
}
