package com.iconicsbooking.service;

import java.util.List;

import com.iconicsbooking.model.Availability;
import com.iconicsbooking.model.Workers;

public interface IWorkerService {

	Workers addWorker(Workers worker);
	String updateWorker(Workers worker);
	Workers getByWorkerId(int workerId);
	List<Workers> getAllWorkers();
	String deleteWorker(int workerId);
	List<Workers> getByWorkerStatus(Availability status);
	List<Workers> getByJobType(String jobType);
	String assignTaskToResource(int taskId, int workerId);
	String changeStatus(int workerId);
	String freeResource(int workerId);
	
}
