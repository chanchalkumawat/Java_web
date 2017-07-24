package com.DI;

public class Hostel {
	private String hostelname,city;

	public String getHostelname() {
		return hostelname;
	}

	public void setHostelname(String hostelname) {
		this.hostelname = hostelname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Hostel [hostelname=" + hostelname + ", city=" + city + "]";
	}
	

}
