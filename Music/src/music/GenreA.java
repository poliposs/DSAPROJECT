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
public class GenreA implements QueueInterface {
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
    
    // Method to display the whole queue
    public String displayQueue() {
        StringBuilder sb = new StringBuilder();
        for (String item : aSongs) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
    
        public void emptyQueue() {
        aSongs.clear();
    }

    @Override
    public boolean search(String target) {
        for (String item : aSongs) {
            if (item.equals(target)) {
                return true; // Target found
            }
        }
        return false; // Target not found
    }

}
