package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Store {

  private List<Media> medias = new ArrayList<Media>();

  public void addMedia(Media media) {
    if (medias.contains(media))
      System.out.println("Store is already in the list");
    else {
      medias.add(media);
      System.out.println("Media is added");
    }
  }

  public void removeMedia(Media media) {
    if (!this.medias.contains(media))
      System.out.println("Store is not already in the list");
    else {
      this.medias.remove(media);
      System.out.println("Media is deleted");
    }
  }

  public void showStore() {
    for (Media media : medias) {
      if (media.getTitle() != null) {
        System.out.println(media.getTitle());
      }
    }
  }
}