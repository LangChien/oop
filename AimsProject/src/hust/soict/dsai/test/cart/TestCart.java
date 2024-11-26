package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestCart {

  public static void main(String[] args) {
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

    Cart cart = new Cart();
    cart.addDigitalVideoDisc(dvd1);
    cart.addDigitalVideoDisc(dvd2);
    cart.addDigitalVideoDisc(dvd3);

    // test print method
    cart.print();

    // test search method
    // not fond
    cart.search("title...");
    // found
    cart.search("The Lion King");
  }
}