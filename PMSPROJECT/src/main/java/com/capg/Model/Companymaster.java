package com.capg.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Companymaster {
	
	private static final long serialVersionUIO=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String companyId;
	
	private String companyName;
	
	private String companyType;
	
	private String companyAddress;
	
	private String companyEmail;
	
	private int companyContact;
	
	private Date reg_Date;
	
	private String rating;
	
	@OneToOne(mappedBy = "company")
	@JsonManagedReference
	private Eligibility eligibility;

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public int getCompanyContact() {
		return companyContact;
	}

	public void setCompanyContact(int companyContact) {
		this.companyContact = companyContact;
	}

	public Date getReg_Date() {
		return reg_Date;
	}

	public void setReg_Date(Date reg_Date) {
		this.reg_Date = reg_Date;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public static long getSerialversionuio() {
		return serialVersionUIO;
	}

	public Companymaster(String companyId, String companyName, String companyType, String companyAddress,
			String companyEmail, int companyContact, Date reg_Date, String rating) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyType = companyType;
		this.companyAddress = companyAddress;
		this.companyEmail = companyEmail;
		this.companyContact = companyContact;
		this.reg_Date = reg_Date;
		this.rating = rating;
	}

	public Companymaster() {
		super();
	}

	@Override
	public String toString() {
		return "Companymaster [companyId=" + companyId + ", companyName=" + companyName + ", companyType=" + companyType
				+ ", companyAddress=" + companyAddress + ", companyEmail=" + companyEmail + ", companyContact="
				+ companyContact + ", reg_Date=" + reg_Date + ", rating=" + rating + "]";
	}
	

	
	
	
	
	

}
