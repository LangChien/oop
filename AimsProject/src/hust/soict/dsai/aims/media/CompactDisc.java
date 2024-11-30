package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist,
            List<Track> tracks) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public void addTrack(Track track) {
        if (this.tracks.contains(track))
            System.out.println("Tracks is already in the list");
        else {
            this.tracks.add(track);
            System.out.println("Track is added");
        }
    }

    public void removeTrack(Track track) {
        if (!this.tracks.contains(track))
            System.out.println("Tracks is not already in the list");
        else {
            this.tracks.remove(track);
            System.out.println("Track is deleted");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    /*
     * Phương thức play() cần hiển thị thông tin của CD (tiêu đề, nghệ sĩ, tổng độ
     * dài).
     * Sau đó, duyệt qua danh sách các Track trong CD và gọi phương thức play() của
     * từng track.
     */
    @Override
    public void play() {
        System.out.println("----CompactDisc----");
        System.out.println("Title: " + this.title);
        System.out.println("Artist: " + this.artist);
        System.out.println("TotalLength: " + this.getLength());
        System.out.println("----Detail----");
        for (Track track : tracks) {
            track.play();
        }

    }
}
