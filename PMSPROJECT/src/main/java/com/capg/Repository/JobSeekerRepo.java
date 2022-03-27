package com.capg.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.Model.JobSeeker;

@Repository
public interface JobSeekerRepo extends JpaRepository<JobSeeker, Integer> {

	/*
	 * Eligibility findByeligibleCandt(int tenthPer, int twelthPer, int ugPer);
	 * Eligibility findByTenthPer(int tenthPer);
	 */

	// List<JobSeeker> findByTenthPerAndTwelthPerAndUgPer(int tenthMark, int
	// twelthMark, int UG);

	@Query(value = "select j.jobseekerId,j.jobseekerName from JobSeeker j where j.tenthPer>tenthPer and j.twelthPer >twelthPer and ugPer>ugPer")
	List<JobSeeker> findByTenthPerAndTwelthPerAndUgPer(@Param("tenthMark") int tenthMark,
			@Param("twelthMark") int twelthMark, @Param("ugPer") int ugPer);

}
