package com.iconicsbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iconicsbooking.model.Availability;
import com.iconicsbooking.model.Workers;

@Repository
public interface IWorkersRepository extends JpaRepository<Workers, Integer> {

	List<Workers> findByWorkerStatus(Availability status);
	List<Workers> findByJobType(String jobType);
	@Modifying
	@Query(value="update workers set task_id=?1 where worker_id=?2",nativeQuery=true)
	int assignTask(int taskId, int workerId);
	
	@Modifying
	@Query(value="update workers set worker_status=?1 where worker_id=?2",nativeQuery=true)
	int changeStatus(String availabilty, int workerId);
	
}
