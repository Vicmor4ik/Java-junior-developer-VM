package mylinkedlist;

class MyLinkedListNode<T> {
    // ��������, ������� ����������� � ������� ������
    private T value;
    // ������ �� ��������� ���� (����)
    private MyLinkedListNode<T> nextNode;
    // ������ �� ���������� ���� (����), ���� ������ ���������������
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
