package com.scrapper.web.sample.rest.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class SampleVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6094966641341173448L;
	
	private String name;
	private Date creaatedDate;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@JsonSerialize(using=DateSerializer.class)
	public Date getCreaatedDate() {
		return creaatedDate;
	}
	
	public void setCreaatedDate(Date creaatedDate) {
		this.creaatedDate = creaatedDate;
	}
	
}
