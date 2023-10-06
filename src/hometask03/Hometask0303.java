package hometask03;

public class Hometask0303 {
    public static void main(String[] args) {
        int x=1;
        int y=-1;
        if(x>0 && y>0){
            System.out.println("Точка принадлежит первой четверти");
        } else if (x<0 && y>0){
            System.out.println("Точка принадлежит второй четверти");
        }else if (x<0 && y<0){
            System.out.println("Точка принадлежит третьей четверти");
        }else if (x>0 && y<0){
            System.out.println("Точка принадлежит четвертой четверти");
        }else{
            System.out.println("Одна из координат точек равна нолю, введите корректное значение");
        }
    }
}
