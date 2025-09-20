package com.ferkan.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataSource {

	private String url;
	
	private String userName;
	
	private String passworld;
}
