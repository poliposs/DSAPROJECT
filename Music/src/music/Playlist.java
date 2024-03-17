/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Playlist implements Serializable {
    private ArrayList<Song> songs;

    // Default constructor
    public Playlist() {
        this.songs = new ArrayList<>();
    }

    // Constructor with initial songs
    public Playlist(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void add(Song song) {
        if (!songs.contains(song)) {
            songs.add(song);
        }
    }

    public void remove(Song song) {
        songs.remove(song);
    }

    public List<Song> search(String title) {
        List<Song> foundSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                foundSongs.add(song);
            }
        }
        return foundSongs;
    }

    public int getNumSongs() {
        return songs.size();
    }

    // Getter method for accessing songs list
    public ArrayList<Song> getSongs() {
        return songs;
    }
}
