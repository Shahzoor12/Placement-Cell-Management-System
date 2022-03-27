package com.capg.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.JobSeeker;
import com.capg.Service.JobSeekerService;

@RestController
@RequestMapping("/Admin")
public class JobSeekerController {

	@Autowired
	JobSeekerService service;


	@GetMapping("/checkJobSeekerEligibility/{tenthMark}/{twelthMark}/{ugPer}")
	public ResponseEntity<List<JobSeeker>> getEligibleJobSeeker(@PathVariable int tenthMark,
			@PathVariable int twelthMark, @PathVariable int ugPer) {

		System.out.println("tenth:" + tenthMark);
		System.out.println("twel" + twelthMark);
		System.out.println("UG" + ugPer);
		List<JobSeeker> jobSeekerObj = service.fetchJobSeeker(tenthMark, twelthMark, ugPer);

		return new ResponseEntity<List<JobSeeker>>(jobSeekerObj, HttpStatus.OK);
	}

}
