package com.practicaldime.dao.entity;

public class Country {

	public String name;
	public String priCode;
	public String secCode;
	public String dst;
	
	public Country() {
		super();
	}

	public Country(String name, String priCode, String secCode, String dst) {
		super();
		this.name = name;
		this.priCode = priCode;
		this.secCode = secCode;
		this.dst = dst;
	}
}
