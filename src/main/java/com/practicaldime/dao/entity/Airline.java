package com.practicaldime.dao.entity;

public class Airline {

	public Long id;
	public String airline;
	public String alias;
	public String iata;
	public String icao;
	public String service;
	public String country;
	public String active;
	
	public Airline() {
		super();
	}

	public Airline(Long id, String airline, String alias, String iata, String icao, String service, String country,
			String active) {
		super();
		this.id = id;
		this.airline = airline;
		this.alias = alias;
		this.iata = iata;
		this.icao = icao;
		this.service = service;
		this.country = country;
		this.active = active;
	}
}
