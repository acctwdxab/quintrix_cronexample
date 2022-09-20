package com.quintrix.cronexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quintrix.cronexample.ServiceImpl.ScheduleImpl;

@RequestMapping("/Admin")
@CrossOrigin(origins = "*")

public class AdminController {
	@Autowired
	ScheduleImpl scheduleImpl;
	
//	@Autowired
//	OrderRepository orderRepo;
//	
//	@GetMapping("/activeClaim")
//	public List<Claim> getAllActiveClaims(@RequestHeader(value="status") String status){
//		return orderRepo.findAllByStatus(status);
//	}
//	
//	@CrossOrigin(origins="http://localhost:4000/")
//	@PutMapping("/{order_id}/saveClaim")
//	public Claim updateSaveClaim(@PathVariable int order_id, @RequestBody Claim clm) {
//		orderRepo.save(clm);
//		return clm;
//	}
	
	public void Schedule2() {
		
		scheduleImpl.display1();
	}

	public String Schedule() {
		scheduleImpl.display();
		return "SUCCESS";

	}

}
