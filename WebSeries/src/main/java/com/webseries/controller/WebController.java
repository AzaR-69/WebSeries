package com.webseries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webseries.model.WebModel;
import com.webseries.service.WebService;

@RestController
public class WebController {
	@Autowired
	WebService webService;
	
	@RequestMapping("/")
	public String home() {
		return "working";
	}
	
	@PostMapping("/addSeries")
	public String addSeries(@RequestBody WebModel series) {
		webService.addSeries(series);
		return "Inserted Successfully";
	}
	
	@PutMapping("/update")
	public String updateSeries(@RequestBody WebModel series) {
		webService.updateData(series);
		return "Updated Successfully";
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id ) {
		webService.deleteSeries(id);
		return "Series Removed ! {"+id+"}";
	}
}
