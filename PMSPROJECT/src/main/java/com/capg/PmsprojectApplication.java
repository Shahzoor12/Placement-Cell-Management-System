package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.capg.Model.Companymaster;
import com.capg.Model.JobSeeker;

@SpringBootApplication
@EnableJpaRepositories
public class PmsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsprojectApplication.class, args);
		
		/*
		 * Companymaster cmp=new Companymaster(); cmp.setCompanyAddress("Bangalore");
		 * cmp.setCompanyContact(1234567890); cmp.setCompanyEmail("Cmp@gmail.com");
		 * cmp.setCompanyId("cpg111"); cmp.setCompanyName("Capgemini");
		 * cmp.setCompanyType("Service"); cmp.setRating("Ok");
		 * 
		 * 
		 * JobSeeker job=new JobSeeker(); job.setJobseekerAddress("Bngl");
		 * job.setJobseekerContact(987654321); job.setJobseekerEmail("Job@gmail.com");
		 * job.setJobseekerId(2468); job.setJobseekerName("JACK"); job.setTenthPer(90);
		 * job.setTwelthPer(92); job.setUgPer(94);
		 */
	}

}
