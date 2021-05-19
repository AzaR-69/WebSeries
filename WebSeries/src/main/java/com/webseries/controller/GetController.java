package com.webseries.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webseries.model.WebModel;
import com.webseries.service.WebService;

@RestController
@RequestMapping("/series")
public class GetController {
	
	@Autowired
	WebService webService;
	
	@GetMapping(path="",produces= {"application/json"})
	public List<WebModel> getAll(){
		return webService.getAllSeries();
	}
	
	@GetMapping(path="/id/{id}",produces= {"application/json"})
	public Optional<WebModel> getById(@PathVariable int id) {
		return webService.getSeriesById(id);
	}
	
	@GetMapping(path="/name/{name}",produces= {"application/json"})
	public WebModel getByName(@PathVariable String name) {
		return webService.getSeriesByName(name);
	}
}
