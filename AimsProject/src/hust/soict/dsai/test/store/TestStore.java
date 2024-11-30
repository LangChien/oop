package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class TestStore {
  public static void main(String[] args) {
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, 87, "Roger Allers");

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, 124, "George Lucas");

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f, 90, "John Musker");

    // add to store
    Store store = new Store();
    store.addMedia(dvd1);
    store.addMedia(dvd2);
    store.addMedia(dvd3);
    store.showStore();
    // remove from store
    store.removeMedia(dvd1);
    store.showStore();

  }
}
