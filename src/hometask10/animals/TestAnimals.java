package hometask10.animals;

public class TestAnimals {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("Jj", 13.3 , 13 ,new String[]{"Картошка" , "Овощи"},"Черный" );
        Wolf wolf2 = new Wolf("Jj", 13.3 , 13 ,new String[]{"Картошка" , "Овощи"},"Черный" );
        Wolf wolf3 = new Wolf("Pushok", 7.6 , 12 ,new String[]{"Картошка" , "Овощи"},"Черный" );

        System.out.println(wolf.equals(wolf2));
        System.out.println(wolf.equals(wolf3));

    }

}
