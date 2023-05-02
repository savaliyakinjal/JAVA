package com;

import java.util.Date; 
import java.text.SimpleDateFormat;

public class date {
	public static void main(String[] args) throws Exception{
	    String sDate1="31-Dec-1998";  
	    Date date1=(Date) new SimpleDateFormat("dd-MMM-yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1); 
	    System.out.println(date1.toString());
	    
	}
}
