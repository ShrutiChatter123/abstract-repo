package com.xworkz.multipleInheritance.thing;

public abstract class AbstractInfo {

	private String createdBy;
	private String updatedBy;
	
	
	public void init(String createdBy,String updatedBy) {
		System.out.println("init in abstractInfo...");
		this.createdBy=createdBy;
		this.updatedBy=updatedBy;
	}
	
	@Override
	public String toString() {
		System.out.println("to string method in abstract method");
		return "Created By:"+createdBy+"/n updatedBy:"+updatedBy;
	}
	
	
	
	
}
