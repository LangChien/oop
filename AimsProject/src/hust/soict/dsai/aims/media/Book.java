package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

//  id, title, category, cost and list of authors.
public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author is already in the list");
        } else {
            authors.add(authorName);
            System.out.println("Author added");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed");
        } else {
            System.out.println("Author is not in the list");
        }
    }

}
