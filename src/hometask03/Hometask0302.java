package hometask03;

public class Hometask0302 {
    public static void main(String[] args) {
        int currentScoreValue = 90;
        if(currentScoreValue>=90){
            System.out.println("Пользователь занял первое место!");
        } else if (currentScoreValue>=80){
            System.out.println("Пользователь занял второе место!");
        }else if (currentScoreValue>=70){
            System.out.println("Пользователь занял третье место!");
        }else {
            System.out.println("Пользователь не занял никого места!");
        }
    }
}
