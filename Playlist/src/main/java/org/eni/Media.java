package org.eni;

public abstract class Media {
    //attributs
    protected String title;
    protected int duration;
    private int id;
    private static int count = 0;

    //constructor
    public Media (String title, int duration){
        this.title = title;
        this.duration = duration;
        this.id = count;
        count++;
    }

    // méthodes
    public String getDurationInFormat(){
        int minutes = this.duration / 60;
        int secondes = this.duration % 60;
        return minutes + "min" + secondes;
    }
    abstract void play();
//    public void play(){
//        System.out.println("-------------------PLAYING-------------------");
//        System.out.println("----Title: "+this.title+" -----");
//        System.out.println("----Durée: "+this.getDurationInFormat()+" -----");
//        System.out.println("---------------------------------------------");
//    }


// getters et setters
    public String getTitle(){
        return this.title;
    }
    public int getDuration(){
        return this.duration;
    }
    public int getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }

}