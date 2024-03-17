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
public class LikedPlaylist implements StackInterface{
    private ArrayList<String> likedSongs;

    /**
     * Create a new instance of Stack
     */
    public LikedPlaylist(){
        likedSongs = new ArrayList<>();
    }

    public int size() {
        return likedSongs.size();

    }

    public boolean isEmpty() {
        return likedSongs.isEmpty();
    }

    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    public boolean isFull() {
        return false;
    }

    /**
     * removes the item from the top of the stack and returns it
     */
    public Object pop() {
        if (!(likedSongs.isEmpty())) {
            return likedSongs.remove(0);
        } else {
            return null;
        }
    }

    /**
     * puts an item onto the top of the stack
     */
    public void push(Object newItem) {
        likedSongs.add(0, (String) newItem);
    }

    // removes all elements from the stack
    public void emptyStack() {
        while (!likedSongs.isEmpty()) {
            pop();
        }
    }

    // return a String object that consists of all elements from the stack
    // a FOR loop is used here, but you can use an Iterator instead
    public String displayStack() {
        int iCount;
        String sMessage = "";
        if (likedSongs.isEmpty()) {
            sMessage = sMessage.concat("");
        } else {
            for (iCount = 0; iCount < likedSongs.size(); iCount++) {
                sMessage = sMessage.concat(likedSongs.get(iCount) + "\n");
            }
        }
        return sMessage;
    }
    
    // Search method to find an element in the liked playlist
    public int search(String target) {
        Stack<String> tempStack = new Stack<>();
        int index = -1;
        boolean found = false;

        // Search for the target element in the stack
        while (!likedSongs.isEmpty()) {
            String current = likedSongs.remove(0);
            tempStack.push(current);
            if (current.equals(target)) {
                found = true;
                break;
            }
        }

        // Restore the original stack
        while (!tempStack.isEmpty()) {
            likedSongs.add(0, tempStack.pop());
        }

        // If found, calculate the index
        if (found) {
            index = likedSongs.size() - tempStack.size() + 1;
        }

        return index;
    }

}
