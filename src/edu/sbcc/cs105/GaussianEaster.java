/**
 * CS 105 Theory & Practice I
 * CRN: 62499
 * Assignment: GaussianEaster
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Mattys C vanZeyl
 */
package edu.sbcc.cs105;

import java.util.*;

/**
 * This class implements the GaussianEaster algorithm.
 *
 */
public class GaussianEaster {

	private static Scanner in1;

	/**
	 * Compute the date of easter using the Gaussian formula.
	 * 
	 * @param year The year for which to compute the date
	 * @return A formated string with the month and day of easter.
	 */
	public static String computeDate(int year) {

        int y = year;
        int a = (int) (y % 19.0);
        int b = (int) (y / 100.0);
        int c = (int) (y % 100.0);
        int d = (int) (b / 4.0);
        int e = (int) (b % 4.0);
        int g = (int) (((8.0 * b) + 13.0) / 25.0);
        int h = (int) ((19.0 * a + b - d - g + 15.0) % 30.0);
        int j = (int) (c / 4.0);
        int k = (int) (c % 4.0);
        int m = (int) ((a + 11.0 * h) / 319.0);
        int r = (int) ((2.0 * e + 2.0 * j - k - h + m + 32.0) % 7.0);
        int n = (int) ((h - m + r + 90.0) / 25.0);
        int p = (int) ((h - m + r + n + 19.0) % 32.0);
        
        String month = String.format("%1d",n);
        String day = String.format("%1d",p);
        
        String date = "Month: " + month + " Day: " + day;
        	     
        return date;
    }
	 
    /**
     * Test this code by asking for a year and then having the code compute the value.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {

    	in1 = new Scanner(System.in);
    	
    	System.out.print("Enter Easter year: ");
    	int year = in1.nextInt();
    	
    	System.out.print("Year: " + year + " ");
    	
    	/** if to break absurd value
    	if (year < 0) {
    		System.out.print("Before 0 AD, Jesus hadn't been born yet, let alone risen from the dead. Try again? press \"y\" then \"enter\" to continue or any other key then \"enter\" to enter a different year. ");
    		
    	}else if(year >10000){
    		System.out.print("Just confirming that you didnt add one too many digits. Try again? press \"y\" then \"enter\" to continue or any other key then \"enter\" to enter a different year. ");
    		
    	}
    	**/
    	
    	String date = computeDate(year);
    	
    	System.out.print(date);
    	
    	
    	
    }
}