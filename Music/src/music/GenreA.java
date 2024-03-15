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
public class GenreA implements QueueInterface{
    private ArrayList<String> aSongs;

    public GenreA() {
        aSongs = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return aSongs.isEmpty();
    }

    @Override
    public int size() {
        return aSongs.size();
    }

    @Override
    public Object frontElement() {
        if (aSongs.size() > 0) {
            return aSongs.get(0);
        } else {
            return null;
        }
    }

    @Override
    public void enqueue(Object newItem) {
        aSongs.add((String) newItem);
    }

    @Override
    public Object dequeue() {
        if (aSongs.size() > 0) {
            return aSongs.remove(0);
        } else {
            return null;
        }
    }
}
