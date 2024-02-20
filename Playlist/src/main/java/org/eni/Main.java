package org.eni;

public class Main {
    public static void main(String[] args) {

        PlaylistMedia playlist1 = new PlaylistMedia();

       playlist1.addMedia(new Song("Titanic", "then", 100, "hello"));
        playlist1.addMedia(new Movie("Arne", "John", 4200));

       /* System.out.println(media1.getTitle());
        System.out.println(media1.getDuration());

        media1.setTitle("Sommet");
        System.out.println(media1.getTitle());

        media1.play();
        playlist1.addMedia(media1);
        playlist1.addMedia(media2);
        playlist1.addMedia(new Media("deux", 52));
        playlist1.addMedia( new Media("trois", 52));

        playlist1.shuffle();
        playlist1.play();
        playlist1.removeMedia(0);
        playlist1.play();


        Song hello = new Song("Adele", "21", 450, "Hello");
        //System.out.println(hello.getTitle());
        hello.play();

        Movie movie = new Movie("Avatar", "Spielberg", 5000);
        movie.play(); */
        playlist1.shuffle();
        playlist1.play();
    }
}