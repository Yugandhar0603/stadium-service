package com.cricket.stadium_service.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.stadium_service.entity.Stadium;
import com.cricket.stadium_service.service.StadiumService;


@RestController
@RequestMapping("/api")
public class StadiumController {
	@Autowired
	StadiumService stadiumService;
	
	@GetMapping("/stadiums")
	 public ResponseEntity<List<Stadium>> getAllStadiums(){
   	 return new ResponseEntity<List<Stadium>>(stadiumService.getAllStadiums(),HttpStatus.OK);
    }
    
	
	 @GetMapping("/stadiums/{stadiumId}")
    public ResponseEntity<Optional<Stadium>> getStadium(@PathVariable int stadiumId) {
         Optional<Stadium> stadium=stadiumService.getStadium(stadiumId);
         if(stadium.isPresent()) {
   	          return new ResponseEntity<Optional<Stadium>>(stadium,HttpStatus.OK);
         }
         else {
        	 return new ResponseEntity<Optional<Stadium>>(HttpStatus.NO_CONTENT);
         }
    }
    
	
	 @PostMapping("/stadiums")
    public ResponseEntity<Stadium> addStadium(@RequestBody Stadium newStadium) {
   	 return new ResponseEntity<Stadium>(stadiumService.addStadium(newStadium),HttpStatus.OK);
    }
    
	 @PutMapping("/stadiums")
    public ResponseEntity<Stadium> updateStadium(@RequestBody Stadium editStadium) {
   	 return new ResponseEntity<Stadium>(stadiumService.updateStadium(editStadium),HttpStatus.OK);
    }
	 

	 @DeleteMapping("/stadiums/{stadiumId}")
    public ResponseEntity<Void> deleteStadium(@PathVariable int stadiumId) {
		 stadiumService.deleteStadium(stadiumId);
   	 return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
