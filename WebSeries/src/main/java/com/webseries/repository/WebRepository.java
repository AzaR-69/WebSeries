package com.webseries.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webseries.model.WebModel;

public interface WebRepository extends JpaRepository<WebModel,Integer>{
	WebModel findByName(String name);
}
