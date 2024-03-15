/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;
import java.util.*;
/**
 *
 * @author paulp
 */
public class GenreB implements QueueInterface{
    private ArrayList<String> bSongs;

    public GenreB() {
        bSongs = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return bSongs.isEmpty();
    }

    @Override
    public int size() {
        return bSongs.size();
    }

    @Override
    public Object frontElement() {
        if (bSongs.size() > 0) {
            return bSongs.get(0);
        } else {
            return null;
        }
    }

    @Override
    public void enqueue(Object newItem) {
        bSongs.add((String) newItem);
    }

    @Override
    public Object dequeue() {
        if (bSongs.size() > 0) {
            return bSongs.remove(0);
        } else {
            return null;
        }
    }
}
