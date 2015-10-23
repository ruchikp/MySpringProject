package com.digi.setterinjection;

public class Coustomer {
	
	private String FirstName;
	private String LastName;
	private int id;
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Coustomer [FirstName=" + FirstName + ", LastName=" + LastName + ", id=" + id + "]";
	}
	
	
}
