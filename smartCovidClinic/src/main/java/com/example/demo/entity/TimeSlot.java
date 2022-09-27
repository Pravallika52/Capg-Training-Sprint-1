package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
public class TimeSlot {
	
	@Id
	@GeneratedValue
	private int slotId;
	
	private String slot;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat( pattern = "yyyy-MM-dd")
	private LocalDate slotDate;
	

	
	

}
