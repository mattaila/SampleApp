package com.example.demo.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "accounts")
@Data
public class Account {
    
	@Id
	private String username;
	private String password;
	private String role;
	private boolean enabled;
	private LocalDate invalidDate;

	public boolean isExpired() {
		boolean isExpired = false;

		LocalDate currentDate = LocalDate.now();
		
		if(currentDate.isAfter(invalidDate)) {
			isExpired = true;
		}

		return isExpired;
	}


}
