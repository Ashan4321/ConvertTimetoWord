package com.convert.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConvertTime {

	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in); 
	    System.out.println("Please enter the Hours");
	   int hours = in.nextInt();
	   System.out.println("Please enter the Minutes");
	   int minutes = in.nextInt();
	    if(hours<=23 && hours>=0 && minutes>=0 && minutes<=59) {
	    	System.out.println("Time is: "+getTimeName(hours, minutes));
	    	}
	    else {
	    	System.out.println("Please Enter correct time");
	    }
	    }
	      
	    
	    public static String getTimeName(int hours, int minutes){
	    	String time=null; 
	    	String nums[] = { "zero", "one", "two", "three", "four",
                     "five", "six", "seven", "eight", "nine",
                     "ten", "eleven", "twelve", "thirteen",
                     "fourteen", "fifteen", "sixteen", "seventeen",
                     "eighteen", "nineteen","Twenty","Twenty One","Twenty Two","Twenty Three"
                 };
	    	String nums2[] = { "", "", "Twenty", "Thirty", "Forty",
	    			"Fifty"};
	    	 if(minutes<=19) {
	    		 time="It's"+" "+nums[hours]+" "+nums2[minutes];
	    	 }
	    	 else if(minutes>19) {
	    		 int a=minutes/10;
	    		 int b=minutes%10;
	    		 time="It's"+" "+nums[hours]+" "+nums[a]+" "+nums[b];
	    	 }
	    	return time;

	}

}
