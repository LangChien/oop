package hust.soict.dsai.test.media;

import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;

public class TestMedia {
    public static void main(String[] args) {
        Disc cd = new Disc(1, "CD", "Music", 10.5f, 100, "Singer");
        DigitalVideoDisc dvd = new DigitalVideoDisc("DVD", "Movie", 20.5f, 120, "Director");
        List<String> authors = List.of("Author1", "Author2");
        Book book = new Book(2, "Book", "Book", 15.5f, authors);

        List<Media> items = List.of(cd, dvd, book);

        System.out.println();
        System.out.println("--------------------");
        for (Media item : items) {
            System.out.println(item.toString());
        }
    }
}
