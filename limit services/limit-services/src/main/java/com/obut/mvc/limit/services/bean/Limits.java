package com.obut.mvc.limit.services.bean;

public class Limits {
	
	// bir max bir min ile alakalı limitleri oluşturacağı yapı yaptı 
	private int max;
	private int min;
	
	protected Limits (){
		//Default consturction tanımladı
	}
	
	
	public Limits(int max, int min) {
	
		this.max = max;
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	@Override
	public String toString() {
		return "Limits [max=" + max + ", min=" + min + "]";
	}
	
	

}
