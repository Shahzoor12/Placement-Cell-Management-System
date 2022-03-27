package com.capg.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ELIGIBILE_JOBSEEKER")
public class Eligibility {

	@Id
	private int eligibilityId;

	@OneToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinColumn(name = "companyId")
	private Companymaster company;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "jobseekerId")
	@JsonBackReference
	private JobSeeker jobseeker;

	private int writtenTest;

	private int groupDiscussion;

	private int humanResourse;

	private String remarks;

	private int year;

	private String rating;

	public int getEligibilityId() {
		return eligibilityId;
	}

	public void setEligibilityId(int eligibilityId) {
		this.eligibilityId = eligibilityId;
	}

	public Companymaster getCompany() {
		return company;
	}

	public void setCompany(Companymaster company) {
		this.company = company;
	}

	public JobSeeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}

	public int getWrittenTest() {
		return writtenTest;
	}

	public void setWrittenTest(int writtenTest) {
		this.writtenTest = writtenTest;
	}

	public int getGroupDiscussion() {
		return groupDiscussion;
	}

	public void setGroupDiscussion(int groupDiscussion) {
		this.groupDiscussion = groupDiscussion;
	}

	public int getHumanResourse() {
		return humanResourse;
	}

	public void setHumanResourse(int humanResourse) {
		this.humanResourse = humanResourse;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Eligibility [eligibilityId=" + eligibilityId + ", company=" + company + ", jobseeker=" + jobseeker
				+ ", writtenTest=" + writtenTest + ", groupDiscussion=" + groupDiscussion + ", humanResourse="
				+ humanResourse + ", remarks=" + remarks + ", year=" + year + ", rating=" + rating + "]";
	}

	public Eligibility(int eligibilityId, Companymaster company, JobSeeker jobseeker, int writtenTest,
			int groupDiscussion, int humanResourse, String remarks, int year, String rating) {
		super();
		this.eligibilityId = eligibilityId;
		this.company = company;
		this.jobseeker = jobseeker;
		this.writtenTest = writtenTest;
		this.groupDiscussion = groupDiscussion;
		this.humanResourse = humanResourse;
		this.remarks = remarks;
		this.year = year;
		this.rating = rating;
	}

	public Eligibility() {
		super();
	}

}
