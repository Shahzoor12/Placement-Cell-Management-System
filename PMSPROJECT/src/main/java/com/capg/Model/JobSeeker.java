package com.capg.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class JobSeeker {

	@Id
	private int jobseekerId;

	private String jobseekerName;

	private String jobseekerAddress;

	private int jobseekerContact;

	private String jobseekerType;

	private String jobseekerEmail;

	@NotNull(message="10th Percentage cannot be empty")
	private int tenthPer;
	
	@NotNull(message="12th Percentage cannot be empty")
	private int twelthPer;

	@NotNull(message="Under Graduation Percentage cannot be empty")
	private int ugPer;

	@OneToOne(mappedBy = "jobseeker")
	@JsonManagedReference
	private Eligibility eligibility;

	public int getJobseekerId() {
		return jobseekerId;
	}

	public void setJobseekerId(int jobseekerId) {
		this.jobseekerId = jobseekerId;
	}

	public String getJobseekerName() {
		return jobseekerName;
	}

	public void setJobseekerName(String jobseekerName) {
		this.jobseekerName = jobseekerName;
	}

	public String getJobseekerAddress() {
		return jobseekerAddress;
	}

	public void setJobseekerAddress(String jobseekerAddress) {
		this.jobseekerAddress = jobseekerAddress;
	}

	public int getJobseekerContact() {
		return jobseekerContact;
	}

	public void setJobseekerContact(int jobseekerContact) {
		this.jobseekerContact = jobseekerContact;
	}

	public String getJobseekerType() {
		return jobseekerType;
	}

	public void setJobseekerType(String jobseekerType) {
		this.jobseekerType = jobseekerType;
	}

	public String getJobseekerEmail() {
		return jobseekerEmail;
	}

	public void setJobseekerEmail(String jobseekerEmail) {
		this.jobseekerEmail = jobseekerEmail;
	}

	public int getTenthPer() {
		return tenthPer;
	}

	public void setTenthPer(int tenthPer) {
		this.tenthPer = tenthPer;
	}

	public int getTwelthPer() {
		return twelthPer;
	}

	public void setTwelthPer(int twelthPer) {
		this.twelthPer = twelthPer;
	}

	public int getUgPer() {
		return ugPer;
	}

	public void setUgPer(int ugPer) {
		this.ugPer = ugPer;
	}

	public Eligibility getEligibility() {
		return eligibility;
	}

	public void setEligibility(Eligibility eligibility) {
		this.eligibility = eligibility;
	}

	@Override
	public String toString() {
		return "JobSeeker [jobseekerId=" + jobseekerId + ", jobseekerName=" + jobseekerName + ", jobseekerAddress="
				+ jobseekerAddress + ", jobseekerContact=" + jobseekerContact + ", jobseekerType=" + jobseekerType
				+ ", jobseekerEmail=" + jobseekerEmail + ", tenthPer=" + tenthPer + ", twelthPer=" + twelthPer
				+ ", ugPer=" + ugPer + ", eligibility=" + eligibility + "]";
	}

	public JobSeeker(int jobseekerId, String jobseekerName, String jobseekerAddress, int jobseekerContact,
			String jobseekerType, String jobseekerEmail, int tenthPer, int twelthPer, int ugPer,
			Eligibility eligibility) {
		super();
		this.jobseekerId = jobseekerId;
		this.jobseekerName = jobseekerName;
		this.jobseekerAddress = jobseekerAddress;
		this.jobseekerContact = jobseekerContact;
		this.jobseekerType = jobseekerType;
		this.jobseekerEmail = jobseekerEmail;
		this.tenthPer = tenthPer;
		this.twelthPer = twelthPer;
		this.ugPer = ugPer;
		this.eligibility = eligibility;
	}

	public JobSeeker(int i, String string, String string2, String string3, String string4, String string5, int j, int k, int l) {
		super();
	}

}
