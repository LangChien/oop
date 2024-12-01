package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Cart {
  public static final int MAX_NUMBERS_ORDERED = 20;
  private List<Media> medias = new ArrayList<Media>();

  public float totalCost() {
    float total = 0;
    for (Media media : medias)
      total += media.getCost();
    return total;
  }

  public void addMedia(Media media) {
    if (medias.contains(media))
      System.out.println("Cart is already in the list");
    else {
      medias.add(media);
      System.out.println("Media is added");
    }
  }

  public void removeMedia(Media media) {
    if (!this.medias.contains(media))
      System.out.println("Cart is not already in the list");
    else {
      this.medias.remove(media);
      System.out.println("Media is deleted");
    }
  }

  public void print() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    for (Media media : medias)
      media.display();
    System.out.println("Total cost: " + totalCost());
    System.out.println("***************************************************");
  }

  public void search(String title) {
    for (Media media : medias) {
      if (media.getTitle().equals(title)) {
        System.out.println("The disc is in the cart.");
        return;
      }
    }
    System.out.println("The disc is not in the cart.");
  }

  public void sort() {
    medias.sort((a, b) -> a.compareTo(b));
  }
}
