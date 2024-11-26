package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {

  private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];

  public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    for (int i = 0; i < 100; i++) {
      if (itemsInStore[i] == null) {
        itemsInStore[i] = disc;
        System.out.println("The disc has been added.");
        return;
      }
    }
    System.out.println("The store is full.");
  }

  public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    for (int i = 0; i < 100; i++) {
      if (itemsInStore[i] == disc) {
        for (int j = i; j < 99; j++) {
          itemsInStore[j] = itemsInStore[j + 1];
        }
        itemsInStore[99] = null;
        System.out.println("The disc has been removed.");
        return;
      }
    }
    System.out.println("The disc is not in the store.");
  }
}