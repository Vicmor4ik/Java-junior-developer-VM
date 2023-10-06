package hometask03;

public class Hometask0305 {
    public static void main(String[] args) {
        int couponNumber = 4444;
        double resultSum = 1234;
        switch (couponNumber){
            case 1111:
                resultSum=resultSum*0.9;
                System.out.println(resultSum);
                break;
            case 3333:
                resultSum=resultSum*0.8;
                System.out.println(resultSum);
                break;
            case 5555:
                resultSum=resultSum*0.7;
                System.out.println(resultSum);
                break;
            default:
                System.out.println(resultSum);
                break;
        }
    }
}
