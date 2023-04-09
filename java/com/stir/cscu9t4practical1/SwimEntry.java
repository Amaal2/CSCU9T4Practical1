package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class SwimEntry extends Entry {
	private  String Where;
	
	
	
	public SwimEntry (String n, int d, int m, int y, int h, int min, int s, float dist, String We) { 
		
		super(n,d,m,y,h,min,s,dist);
	this.Where=We;
	Calendar inst = Calendar.getInstance();
	  inst.set(y, m-1,d,h,min,s);
	  dateAndTime = inst;
  distance = dist;
	}
	public String getWhere(){
		return Where;
	}
	
	public void setWhere(String We) {
		
		this.Where =We;
   }
	

public String getEntry() {
	String result =getName()+"ran" +getDistance() +"km in"
	+getHour()+":"+getMin()+":"+getSec()+"on"  	
	+getDay()+"/"+getMonth()+"/"+getYear()+"\n"+getWhere()+":";
	return result;
}
			
}