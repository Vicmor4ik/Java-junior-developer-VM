package lesson02;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Консольный ввод" +  " Hey");
   int yearOfBirth;
   yearOfBirth = 2000;

   int numberOfPears = 10;
   int numberOfApples = 30, numberOfBananas = 40;

   numberOfBananas = 30;

        System.out.println(numberOfApples);
        System.out.println(numberOfBananas);

        //примитивные типы данных
        //ссылочный типы данных

        byte readByte = 56;
        short userAge = 35;
        long temp = 12l, planetAge = 400000000000L;
        // l и L явно указывают на тип long

        System.out.println(planetAge);

        float outsideTemp = -12.f, catAge = 4.5F;
        // f и F явно указывают на float
        double weight = 200.5;

        System.out.println(outsideTemp);

        boolean isActive = true;
        boolean isConnected = false;

        System.out.println(isActive);

        char aLatter = 'a';
        System.out.println(aLatter);

        int numberOfStones01 = 12000;
        long numberOfStones02 = numberOfStones01;

        System.out.println(numberOfStones01);
        System.out.println(numberOfStones02);



        int distance = 100;
        byte smallDistance = (byte) distance;

        System.out.println(smallDistance);

        var version = 10;
        var bigNumber = 10L;
    }
}
