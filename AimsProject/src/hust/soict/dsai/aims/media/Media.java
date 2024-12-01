package hust.soict.dsai.aims.media;

public class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public void display() {
        System.out.println("ID: " + id + " - Title: " + title + " - Category: " + category + " - Cost: " + cost);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        else if (obj instanceof Media) {
            Media media = (Media) obj;
            return this.title == media.title;
        } else
            return false;
    }

    // sort by title => cost
    public int compareTo(Media media) {
        if (this.title.compareTo(media.title) == 0) {
            if (this.cost < media.cost)
                return -1;
            else if (this.cost > media.cost)
                return 1;
            else
                return 0;
        } else
            return this.title.compareTo(media.title);
    }

}
