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

    @Override
    public String displayQueue() {
        StringBuilder sb = new StringBuilder();
        for (String item : bSongs) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }

    @Override
        public void emptyQueue() {
        bSongs.clear();
    }
        
        public void addIndie(StackInterface SI, QueueInterface QIB) {
        if (!SI.isEmpty()) {
            // Pop the last element from the stack
            Object lastElement = SI.pop();

            // Enqueue the last element into the queue
            QIB.enqueue(lastElement);
        }
    }

    @Override
    public boolean search(String target) {
        for (String item : bSongs) {
            if (item.equals(target)) {
                return true; // Target found
            }
        }
        return false; // Target not found
    }
}
