package com.cricket.stadium_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="stadium_details")
public class Stadium {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="stadium_id")
  private int stadiumId;
  
  @Column(name="stadium_name")
  private String stadiumName;
  
  @Column(name="stadium_location")
  private String stadiumLocation;
  
  @Column(name="stadium_capacity")
  private int stadiumCapacity;
  
}
