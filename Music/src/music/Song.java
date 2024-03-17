/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;
import java.io.Serializable;
/**
 *
 * @author paulp
 */
public class Song implements Serializable{
    String title, artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    public Song(){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return artist;
    }

    public void setGenre(String artist) {
        this.artist = artist;
    }
    
    @Override
    public String toString(){
        return title + "by " + artist;
    }

}
