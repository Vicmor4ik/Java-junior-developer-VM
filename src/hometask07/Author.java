package hometask07;

public class Author {
    public long id;
    public String name;
    public boolean isTrue;


    public Author(long authorId) {
        id = authorId;
    }

    public Author() {
    }

    public Author(long authorId, String authorName) {
        this(authorId);
        this.name = authorName;
    }

    public void printInfo() {
        System.out.println("�����: id = " + id + ", name = " + name);
    }

    public String getInfo() {
        return "�����: id = " + id + ", name = " + name;
    }

    public void getInfo(String prefix){
        if (prefix==null) return;
        System.out.println(prefix + " �����: id = " + id + ", name = " + name);
    }
}

