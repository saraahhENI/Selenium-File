package org.eni;

public class Song extends Media {
    private String artiste;
    private String album;
    private final int id;
    private  static int count = 0;

    public Song(String artiste, String album, int duration, String title){
        super(title, duration);
        this.artiste = artiste;
        this.album = album;
        this.id = count;
        count++;
    }
    public void play(){
        System.out.println("-------Play Song--------");
        System.out.println(getArtiste()+ " - Album : " + getAlbum());
        System.out.println("------ "+ getTitle() + " ----------");
        System.out.println("------ "+ getDurationInFormat() + " ----------");
    }

    public String getArtiste() {
        return artiste;
    }

    public int getId() {
        return id;
    }

    public String getAlbum() {
        return album;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
