package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
  private static int nbDigitalVideoDiscs = 0;

  public static int getNbDigitalVideoDiscs() {
    return nbDigitalVideoDiscs;
  }

  public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
    DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
  }

  public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
    super(nbDigitalVideoDiscs, title, category, cost, length, director);
    nbDigitalVideoDiscs++;
  }

  @Override
  public String toString() {
    return "DVD - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length + ": "
        + this.cost;
  }

  public boolean isMatch(String title) {
    return this.title.equals(title);
  }

  // Thực hiện phương thức play() hiển thị thông tin tiêu đề và độ dài của DVD.
  @Override
  public void play() {
    System.out.println("Title: " + this.title + " Length: " + this.length);
  }
}
