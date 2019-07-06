package com.xworkz.hibernate;

public enum APPCONST {
	
	WORKING(0), NOTWORKING(1);
	
	private APPCONST(int value)
	{
this.value= value;
	}
	
	private final int value;
}
