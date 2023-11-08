package mylinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList<>();
        linkedList.addToEnd(2);

        linkedList.addToEnd(1);

        linkedList.addToEnd(3);

        linkedList.addToBegin(5);

        linkedList.print();


        linkedList.addToIndex(7, 2);
        System.out.println(linkedList.getSize()+"!");
        System.out.println();
        linkedList.print();

    }


}
