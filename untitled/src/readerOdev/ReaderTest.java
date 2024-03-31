package readerOdev;

import readerOdev.Reader;

public class ReaderTest {
    public static void main(String[] args) {
        Book kizilNehirler = new Book();
        Book oluRuhlarOrmani = new Book();
        Book goriotBaba = new Book();

        Author jeanChristopheGrange = new Author("Jean Christophe Grange", null);
        Author honoreDeBalzac = new Author("honoreDeBalzac", null);

        Reader hakan = new Reader("Hakan", 31, 'm');
        Reader ayse = new Reader("Ayse", 23, 'f');

        kizilNehirler.setAuthor(jeanChristopheGrange);
        kizilNehirler.setTitle("Kızıl Nehirler");
        kizilNehirler.setPageCount(328);
        kizilNehirler.setReader(hakan);

        oluRuhlarOrmani.setAuthor(jeanChristopheGrange);
        oluRuhlarOrmani.setTitle("Ölü Ruhlar Ormanı");
        oluRuhlarOrmani.setPageCount(460);
        oluRuhlarOrmani.setReader(hakan);

        goriotBaba.setTitle("Goriot Baba");
        goriotBaba.setAuthor(honoreDeBalzac);
        goriotBaba.setPageCount(376);
        goriotBaba.setHardCover("Ciltli");
        goriotBaba.setReader(ayse);

        jeanChristopheGrange.books = new Book[20];
        jeanChristopheGrange.books[0] = kizilNehirler;
        jeanChristopheGrange.books[1] = oluRuhlarOrmani;

        honoreDeBalzac.books = new Book[20];
        honoreDeBalzac.books[0] = goriotBaba;

        hakan.books = new Book[20];
        hakan.books[0] = kizilNehirler;
        hakan.books[1] = oluRuhlarOrmani;
        kizilNehirler.setCurrentPage(39);
        oluRuhlarOrmani.setCurrentPage(77);
        System.out.println("Hakan's current page before read to " + hakan.books[0].getTitle() + ": " + hakan.books[0].getCurrentPage());
        System.out.println("Hakan's current page before read to " + hakan.books[1].getTitle() + ": " + hakan.books[1].getCurrentPage());
        hakan.read(kizilNehirler);
        hakan.read(oluRuhlarOrmani);
        hakan.read(oluRuhlarOrmani);
        hakan.read(oluRuhlarOrmani);
        System.out.println("Hakan's current page after read to " + hakan.books[0].getTitle() + ": " + hakan.books[0].getCurrentPage());
        System.out.println("Hakan's current page after read to " + hakan.books[1].getTitle() + ": " + hakan.books[1].getCurrentPage());

        System.out.println("********************************************************");

        ayse.setBooks(new Book[20]);
        ayse.books[0] = goriotBaba;
        goriotBaba.setCurrentPage(153);
        System.out.println("Ayse's current page before read to " + ayse.books[0].getTitle() + ": " + ayse.books[0].getCurrentPage());
        ayse.read(goriotBaba);
        ayse.read(goriotBaba);
        ayse.read(goriotBaba);
        System.out.println("Ayse's current page after read to " + ayse.books[0].getTitle() + ": " + ayse.books[0].getCurrentPage());

        System.out.println("********************************************************");

        System.out.println("Jean Christophe Grange's first book is " + jeanChristopheGrange.books[0].getTitle() +
                " and the reader is: " + jeanChristopheGrange.getBooks()[0].getReader().getName());
    }
}
