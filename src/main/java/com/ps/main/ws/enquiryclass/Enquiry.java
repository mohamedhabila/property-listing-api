package com.ps.main.ws.enquiryclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ps.main.ws.propertyclass.Property;

@Entity(name = "enquiry")
public class Enquiry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

    private String fullName;
    private String phoneNumber;
    private Integer numberOfShares;
    private String notes;
	private Integer property_id;

	public Enquiry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enquiry(Integer id, String fullName, String phoneNumber, int numberOfShares, String notes, Integer property_id) {
		super();
		this.id = id;
		this.fullName = fullName;
        this.phoneNumber = phoneNumber;
		this.numberOfShares = numberOfShares;
        this.notes = notes;
		this.property_id = property_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

    public String getPhoneNumber() {
		return fullName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(Integer numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

    public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@JsonIgnore
	public Integer getProperty_id() {
		return property_id;
	}

	public void setProperty_id(Integer property_id) {
		this.property_id = property_id;
	}

	@Override
	public String toString() {
		return "Enquiry [id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", numberOfShares=" + numberOfShares + ", notes=" + notes + ", property_id=" + property_id + "]";
	}

}
