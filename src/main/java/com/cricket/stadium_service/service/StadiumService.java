package com.cricket.stadium_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cricket.stadium_service.entity.Stadium;
import com.cricket.stadium_service.repository.StadiumRepo;


@Service
public class StadiumService {
	 @Autowired
	    StadiumRepo stadiumRepo;
	    
	    public List<Stadium> getAllStadiums(){
	    	return stadiumRepo.findAll();
	    }
	    
	    
	    	public Optional<Stadium> getStadium(int stadiumId){
	    		return stadiumRepo.findById(stadiumId);
	    	}
	    
	    public Stadium addStadium(@RequestBody Stadium newDepartment) {
	    	return stadiumRepo.saveAndFlush(newDepartment);
	    }
	    
	    public Stadium updateStadium(@RequestBody Stadium setStadium) {
	    	return stadiumRepo.save(setStadium);
	    }
	    
	    public void deleteStadium(@PathVariable int id) {
	    	stadiumRepo.deleteById(id);
	    	
	    }

}
