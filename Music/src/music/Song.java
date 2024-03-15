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
    String title, genre;

    public Song(String title, String genre) {
        this.title = title;
        this.genre = genre;
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
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Override
    public String toString(){
        return title + genre;
    }
}
