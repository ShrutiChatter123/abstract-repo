package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ApplicationDTO implements Serializable {

	private String name;
	private LocalDate attendDate;
	private String developedBy;
	private double size;
	private String availablity;

	public ApplicationDTO() {
		System.out.println("no-org constructor to ApplicationDTO");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getAttendDate() {
		return attendDate;
	}

	public void setAttendDate(LocalDate attendDate) {
		this.attendDate = attendDate;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}

	public String getAvailablity() {
		return availablity;
	}

	public void setAvailablity(String availablity) {
		this.availablity = availablity;
	}
	@Override
	public int hashCode() {
		return Objects.hash(attendDate, availablity, developedBy, name, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		return Objects.equals(attendDate, other.attendDate) && Objects.equals(availablity, other.availablity)
				&& Objects.equals(developedBy, other.developedBy) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size);
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", \nattendDate=" + attendDate + ", \ndevelopedBy=" + developedBy
				+ ", \nsize=" + size + ", \navailablity=" + availablity + "]";
	}
	

}
