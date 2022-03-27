package com.capg.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Model.JobSeeker;
import com.capg.Repository.JobSeekerRepo;

@Service
public class JobSeekerService {

	@Autowired
	JobSeekerRepo repo;

	public List<JobSeeker> fetchJobSeeker(int tenthMark, int twelthMark, int ugPer) {
		List<JobSeeker> seeker = repo.findByTenthPerAndTwelthPerAndUgPer(tenthMark, twelthMark, ugPer);
		System.out.println(seeker);
		return seeker;

	}

}
