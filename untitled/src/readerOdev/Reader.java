package readerOdev;

public class Reader {
    String name;
    int age;
    char sex;
    Book[] books;

    public Reader(){

    }

    public Reader(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void read(Book book){
        book.currentPage += 10;
    }
}
