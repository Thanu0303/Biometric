package com.xworkz.hibernate;

public enum TYPECONST {
	
	FINGERPRINT("GIVE FINGERPRINT"),IDCARD("GIVE FIDCARD"),SENSOR("GIVE SENSOR");
	
	private TYPECONST(String type) 
	{
		this.type=type;
	}
private final String type;
}
