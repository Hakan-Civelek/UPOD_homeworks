package readerOdev;

public class Book {

    String title;
    int pageCount;
    String type;
    int currentPage = 0;
    String hardCover = "Karton kapak";
    Author author;
    Reader reader;

    public Book() {
    }

    public Book(String title, int pageCount, Author author) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setHardCover(String hardCover) {
        this.hardCover = hardCover;
    }

    public String getHardCover() {
        return hardCover;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Reader getReader() {
        return reader;
    }
}
