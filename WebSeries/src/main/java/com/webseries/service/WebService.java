package com.webseries.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webseries.model.WebModel;
import com.webseries.repository.WebRepository;
@Service
public class WebService {
	@Autowired
	WebRepository webRepository;
	
	@Transactional
	public void addSeries(WebModel series) {
		webRepository.save(series);
	}
	
	@Transactional
	public List<WebModel> getAllSeries(){
		return webRepository.findAll();
	}
	@Transactional
	public Optional<WebModel> getSeriesById(int id){
		return webRepository.findById(id);
	}
	@Transactional
	public WebModel getSeriesByName(String name) {
		return webRepository.findByName(name);
	}
	
	public void updateData(WebModel series) {
		webRepository.save(series);
	}
	
	public void deleteSeries(int id) {
		webRepository.deleteById(id);
	}
}
