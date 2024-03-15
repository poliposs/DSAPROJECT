/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musixexample;

/**
 *
 * @author paulp
 */
public class MusixExample {

    /**
     * @param args the command line arguments
     */
	public static void main( String[] arg)
	{
		Menu menu = new Menu();
		
		menu.loadPlaylist();
		menu.runMenu();

	}
    
}
