package com.ferkan.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudent {
	
	private String firstName;

	private String lastName;
	
	private List<DtoCourse> dtoCourses = new ArrayList<>();
}
