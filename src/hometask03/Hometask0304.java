package hometask03;

public class Hometask0304 {
    public static void main(String[] args) {
        int monthNumber = 2;
        boolean isLeap = false;
        switch (monthNumber) {
            case 1:
                System.out.println("31 день");
                break;
            case 2:
                if (isLeap == true) {
                    System.out.println("29 дней");
                } else {
                    System.out.println("28 дней");
                }
                break;
            case 3:
                System.out.println("31 день");
                break;
            case 4:
                System.out.println("30 дней");
                break;
            case 5:
                System.out.println("31 день");
                break;
            case 6:
                System.out.println("30 дней");
                break;
            case 7:
                System.out.println("31 день");
                break;
            case 8:
                System.out.println("31 день");
                break;
            case 9:
                System.out.println("30 день");
                break;
            case 10:
                System.out.println("31 день");
                break;
            case 11:
                System.out.println("31 день");
                break;
            case 12:
                System.out.println("31 день");
                break;
        }

    }
}
