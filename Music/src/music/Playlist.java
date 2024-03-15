/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author paulp
 */
public class Playlist implements Serializable{
    private ArrayList<Song> songs;

    public Playlist(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void add(Song song){
        songs.add(song);
    }
    
    public void remove(Song song){
        songs.remove(song);
    }
    
    public Song search(String title) {
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i); // Access the song object at index i
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song; // Return the song if the title matches
            }
        }
        return null; // Return null if the song is not found
    }
    
    public int getNumSongs(){
        return songs.size();    
    }
}