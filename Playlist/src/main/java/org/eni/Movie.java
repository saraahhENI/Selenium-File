package org.eni;

public class Movie extends Media {

    private String realisateur;
    private final int id;
    private static int count = 0;

    public Movie (String title, String realisateur, int duration ){
        super(title, duration);
        this.realisateur = realisateur;
        this.id = count;
        count++;
    }

    public String getDurationInFormat(){
        int hours = duration / 3600;
        int minutes = (duration % 3600)/60;
        int secondes = duration % 60;
        return hours + "H" + minutes + "min" + secondes;
    }
    public void play(){
        System.out.println("-------Play Movie--------");
        System.out.println(getTitle()+ " - Réalisateur : " + getRealisateur());
        System.out.println("------ "+ getDurationInFormat() + " ----------");
        System.out.println("------ "+ getId() + " ----------");
    }
    public int getId() {
        return id;
    }
    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }
}
