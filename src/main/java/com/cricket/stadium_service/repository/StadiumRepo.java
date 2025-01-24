package com.cricket.stadium_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.stadium_service.entity.Stadium;

public interface StadiumRepo extends JpaRepository<Stadium,Integer>{

}
