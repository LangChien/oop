package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Thực hiện phương thức play() hiển thị thông tin tiêu đề và độ dài của track.
    // Nếu track có độ dài không hợp lệ (≤ 0), cần thông báo lỗi.
    @Override
    public void play() {
        if (this.length < 0)
            System.out.println("Length is not valid!");
        else
            System.out.println("Title: " + this.title + " Length: " + this.length);
    }

}
