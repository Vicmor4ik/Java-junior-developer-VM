package hometask07;

import com.vicmor.project.lesson07.Author01;

public class Book {
    private String name; //null
    private boolean isPublished; //false
    private Author[] authors;

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name can't be null");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfAuthors(int numberOfAuthors) {
        if (numberOfAuthors < 1 || numberOfAuthors >= 5)
            throw new IllegalArgumentException("«начение numberOfAuthors должно находитс€ в диапазоне [1, 5)");
        authors = new Author[numberOfAuthors];
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void addAddAuthor(Author author) {
        if (author == null) throw new IllegalArgumentException("null ссылка");
        for (Author value : authors) {
            if (value != null && value.equals(author)) {
                return;
            }
        }
            for (int j = 0; j < authors.length; j++) {
                if (authors[j] == null) {
                    authors[j] = author;
                    return;
                }
            }
            throw new IllegalArgumentException("—писок авторов заполнен, нельз€ добавить нового");
        }

    }


