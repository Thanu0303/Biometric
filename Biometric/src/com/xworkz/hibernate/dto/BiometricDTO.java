package com.xworkz.hibernate.dto;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.xworkz.hibernate.APPCONST;
import com.xworkz.hibernate.TYPECONST;

@Entity
@Table(name="biometrcidto")
public class BiometricDTO implements Serializable{
	
	public BiometricDTO() {
		System.out.println("Created\t"+this.getClass().getSimpleName());
	}
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	
	@Column(name="bid")
	private int bid;
	@Enumerated(EnumType.STRING)
	@Column(name="type")
	private TYPECONST type;
	@Column(name="workingCondtn")
	private APPCONST workingCondtn;
	@Column(name="timein")
	private String timein;
	@Column(name="timeout")
	private String timeout;
	
	public int getBid() {
		return bid;
	}
	
	public TYPECONST getType() {
		return type;
	}
	public void setType(TYPECONST type) {
		this.type = type;
	}
	public APPCONST isWorkingCondtn() {
		return workingCondtn;
	}
	public void setWorkingCondtn(APPCONST workingCondtn) {
		this.workingCondtn = workingCondtn;
	}
	public String getTimein() {
		return timein;
	}
	public void setTimein(String timein) {
		this.timein = timein;
	}
	public String getTimeout() {
		return timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	
	@Override
	public String toString() {
		return "BiometricDTO [bid=" + bid + ", type=" + type + ", workingCondtn=" + workingCondtn + ", timein=" + timein
				+ ", timeout=" + timeout + "]";
	}
	
}
