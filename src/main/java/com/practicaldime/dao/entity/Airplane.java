package com.practicaldime.dao.entity;

public class Airplane {

	public String name;
	public String priCode;
	public String secCode;
	public String dst;
	
	public Airplane() {
		super();
	}

	public Airplane(String name, String priCode, String secCode, String dst) {
		super();
		this.name = name;
		this.priCode = priCode;
		this.secCode = secCode;
		this.dst = dst;
	}
}
