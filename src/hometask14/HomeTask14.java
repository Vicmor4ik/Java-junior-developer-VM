package hometask14;

public class HomeTask14 {
    public static void main(String[] args) {
        PairContainer<Integer, String> pairContainer1 = new PairContainer<>(7, "Джеймс Бонд");
        PairContainer<String, User<Integer>> pairContainer2 = new PairContainer<>("Семь", new User<>(14));
        PairContainer<String, PairContainer<Integer, User<String>>> pairContainer3 = new PairContainer<>("Седьмой", new PairContainer<>(70, new User<>("Семьдесят")));
    }
}
//Объявить класс PairContainer со свойствами key и value. key и value - generic свойства без ограничений, но могут быть разных типов.
//Создать экземпляр PairContainer, где key - любые числа, value - строка
//Создать экземпляр PairContainer, где key - строка, value - тип User, у которого id - любые числа
//Создать экземпляр PairContainer, где key - строка, value - тип PairContainer, у которого key - любые числа, value - тип User, у которого id - строка