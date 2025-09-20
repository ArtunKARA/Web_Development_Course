package com.ferkan.dto;

import java.util.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	
	//blank String firstName;
	//null String firstName = null;
	//empty String firstName = "";
	
	@NotEmpty(message = "FirstName Alanı Boş Bırakılamaz")
	@Min(value = 3 , message = "FirstName 3 karakter ve uzun olmalı")
	@Max(value = 10, message = "FirstName 10 karakterden uzun olmaz")
	private String firstName;

	@Size(min = 2, max = 25)
	private String lastName;
	
	private Date birthOfDate;
}
