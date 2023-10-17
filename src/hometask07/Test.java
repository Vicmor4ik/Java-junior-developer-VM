package hometask07;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setNumberOfAuthors(4);
       Author author3 = new Author();
       author3.name="Толстой";
       book1.addAddAuthor(author3);
        System.out.println(Arrays.toString(book1.getAuthors()));

        Cat cat1 = new Cat(5);
        Cat Gedon = new Cat(7,"Гедон");
        System.out.println(Gedon.attack(cat1));
    }
}
