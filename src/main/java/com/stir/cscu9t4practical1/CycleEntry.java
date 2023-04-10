package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class CycleEntry extends Entry {
	private String terrain;
	private String tempo;

	public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String rain, String temp) {
		super(n, d, m, y, h, min, s, dist);
		this.terrain = rain;
		this.tempo = temp;
		Calendar inst = Calendar.getInstance();
		  inst.set(y, m-1,d,h,min,s);
		  dateAndTime = inst;
	    distance = dist;
	}

	public String getterrain() {
		return terrain;
	}

	public void setterrain(String rain) {

		this.terrain = rain;
	}

	public String gettempo() {
		return tempo;
	}

	public void settempo(String tem) {

		this.terrain = tem;
	}

	public String getTerrain() {
		return terrain;
	}

	public String getTempo() {
		return tempo;
	}

	public String getEntry() {
		String result = getName() + "ran" + getDistance() + "km in" 
	+ getHour() + ":" + getMin() + ":" + getSec() + "on"
				+ getDay() + "/" + getMonth() + "/" + getYear() + "\n" + getTerrain() + ":" + getTempo() + ":";
		return result;
	}

}