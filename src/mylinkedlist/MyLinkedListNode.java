package mylinkedlist;

class MyLinkedListNode<T> {
    // значение, которые добавл€етс€ в св€зный список
    private T value;
    // ссылка на следующую ноду (узел)
    private MyLinkedListNode<T> nextNode;
    // ссылка на предыдущую ноду (узел), если список двунаправленный
    private MyLinkedListNode<T> previousNode;

    public MyLinkedListNode(T value) {
        this.value = value;
        nextNode=null;
    }

    public MyLinkedListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyLinkedListNode<T> nextNode) {
        this.nextNode = nextNode;

    }

    public MyLinkedListNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(MyLinkedListNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
