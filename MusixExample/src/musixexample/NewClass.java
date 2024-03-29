/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musixexample;

/**
 *
 * @author paulp
 */
public class NewClass extends Exception
{

	private int numberSent;
	
	//Creates a blank InvalidRatingException with no arguments.
	private InvalidRatingException()
	{
		
	}

	//Creates an InvalidRatingException with the invalid number.
	public InvalidRatingException(int inNumberSent)
	{
		this.numberSent = inNumberSent;
	}
	
	//Returns the numberSent of an InvalidRatingException.
	public int getNumberSent()
	{
		return this.numberSent;
	}
	
	//Returns InvalidRatingException as a String.
	public String toString()
	{
		String returnString;
		
		returnString = this.numberSent + " is an invalid rating! Please choose a rating between 1 and 5.\n";
		
		return returnString;
	}
}