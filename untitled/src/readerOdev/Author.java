package readerOdev;

public class Author {
    String name;
    Book[] books;

    public Author() {
    }

    public Author(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }
}
