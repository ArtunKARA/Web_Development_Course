package com.ferkan.handler;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class  Exception<E> {

	private String hostName;
	
	private String path;
	
	private Date createDate;
	
	private E message;
	
}
