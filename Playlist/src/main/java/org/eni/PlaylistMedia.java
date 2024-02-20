package org.eni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaylistMedia {
    private List<Media> playlist;

    public PlaylistMedia(){
        playlist = new ArrayList<>();
    }

    public void addMedia(Media media){
        playlist.add(media);
    }

    public void removeMedia(){
        playlist.remove(playlist.size()-1);
    }
    public void removeMedia(int index){
        playlist.remove(index);
    }
    public void play(){
       for(Media media: playlist){
           media.play();
       }
    }

    public void shuffle(){
        Collections.shuffle(playlist);
    }

}
