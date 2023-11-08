package mylinkedlist;

public class MyLinkedList<T> {
    // размер списка (увеличивается при добавлении, уменьшается при удалении)
    private int size;
    // ссылка на первый элемент списка
    private MyLinkedListNode<T> first;
    // ссылка на последний элемент списка
    private MyLinkedListNode<T> last;

    public int getSize() {
        return size;
    }

    public MyLinkedList() {
        first = null;
        last = null;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void addToBegin(T t) {
        MyLinkedListNode newNode = new MyLinkedListNode(t);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNextNode(first);
            first.setPreviousNode(newNode);
            first = newNode;
            size++;

        }
    }

    public void addToEnd(T t) {
        MyLinkedListNode newNode = new MyLinkedListNode(t);
        MyLinkedListNode currentNode = first;

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
            newNode.setPreviousNode(last);
            last = newNode;
            size++;
        }
    }

    public void addToIndex(T t, int index) {
        MyLinkedListNode newNode = new MyLinkedListNode(t);
        if (index == 0) addToBegin(t);
         else {
            MyLinkedListNode currentNode = first;
            int currentIndex =0;
            while (currentNode!=null&&currentIndex<index){
                currentNode=currentNode.getNextNode();
                currentIndex++;
            }
            if(currentNode==null) addToEnd(t);
            else {
                newNode.setNextNode(currentNode);
                newNode.setPreviousNode(currentNode.getPreviousNode());

                currentNode.getPreviousNode().setNextNode(newNode);
                currentNode.setPreviousNode(newNode);
            }
        }
         size++;
    }

    public void print() {
        MyLinkedListNode currentNode = first;
        if (first != null) {
            System.out.print(first.getValue() + " ");
        }
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
            System.out.print(currentNode.getValue() + " ");
        }
    }

}






