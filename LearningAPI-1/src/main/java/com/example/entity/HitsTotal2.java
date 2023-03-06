package com.example.entity;

public class HitsTotal2 {
	String Name;
	String Classname;
	String standard;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getClassname() {
		return Classname;
	}
	public void setClassname(String class1) {
		Classname = class1;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "HitsTotal2 [Name=" + Name + ", Class=" + Classname + ", standard=" + standard + "]";
	}
	public HitsTotal2(String name, String class1, String standard) {
		super();
		Name = name;
		Classname = class1;
		this.standard = standard;
	}
	public HitsTotal2() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
