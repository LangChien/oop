package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestCart {

  public static void main(String[] args) {
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, 87, "Roger Allers");

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, 124, "George Lucas");

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f, 90, "John Musker");

    Cart cart = new Cart();
    cart.addMedia(dvd1);
    cart.addMedia(dvd2);
    cart.addMedia(dvd3);

    // test print method
    cart.print();

    // test search method
    // not fond
    cart.search("title...");
    // found
    cart.search("The Lion King");
  }
}