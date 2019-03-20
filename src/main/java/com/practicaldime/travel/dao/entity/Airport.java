package com.practicaldime.travel.dao.entity;

public class Airport {

	public Long id;
	public String name;
	public String city;
	public String country;
	public String iata;
	public String icao;
	public Float latitude;
	public Float longitude;
	public Float altitude;
	public String timezone;
	public String dst;
	public String dbtz;
	public String type;
	public String source;
	
	public Airport() {
		super();
	}

	public Airport(Long id, String name, String city, String country, String iata, String icao, Float latitude,
			Float longitude, Float altitude, String timezone, String dst, String dbtz, String type, String source) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.country = country;
		this.iata = iata;
		this.icao = icao;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.timezone = timezone;
		this.dst = dst;
		this.dbtz = dbtz;
		this.type = type;
		this.source = source;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getIata() {
		return iata;
	}

	public String getIcao() {
		return icao;
	}

	public Float getLatitude() {
		return latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public Float getAltitude() {
		return altitude;
	}

	public String getTimezone() {
		return timezone;
	}

	public String getDst() {
		return dst;
	}

	public String getDbtz() {
		return dbtz;
	}

	public String getType() {
		return type;
	}

	public String getSource() {
		return source;
	}
}
