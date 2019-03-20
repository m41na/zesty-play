package com.practicaldime.travel.dao.entity;

public class Airline {

	public Long id;
	public String name;
	public String alias;
	public String iata;
	public String icao;
	public String service;
	public String country;
	public String active;
	
	public Airline() {
		super();
	}

	public Airline(Long id, String name, String alias, String iata, String icao, String service, String country,
			String active) {
		super();
		this.id = id;
		this.name = name;
		this.alias = alias;
		this.iata = iata;
		this.icao = icao;
		this.service = service;
		this.country = country;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAlias() {
		return alias;
	}

	public String getIata() {
		return iata;
	}

	public String getIcao() {
		return icao;
	}

	public String getService() {
		return service;
	}

	public String getCountry() {
		return country;
	}

	public String getActive() {
		return active;
	}
}
