package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobPositionService;
import kodlama.io.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping(("/api/jobposition/"))
public class JobPositionContoller {
	
	private JobPositionService jobPositionService;
@Autowired
	public JobPositionContoller(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	@GetMapping("getAll")
	List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
		
	}
	
	@PostMapping("add")
	public void add(@RequestBody JobPosition jobPosition) {
		
		this.jobPositionService.add(jobPosition);
	}
	
	

}
