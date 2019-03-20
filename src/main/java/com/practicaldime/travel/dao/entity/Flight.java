package com.practicaldime.travel.dao.entity;

public class Flight {

	public String origin;
	public String originCode;
	public String originAirport;
	public String destCode;
	public String destAirport;
	public String flightCode;
	public String flightFlag;
	public String connect;
	public String coordinates;
	
	public Flight() {
		super();
	}

	public Flight(String origin, String originCode, String originAirport, String destCode, String destAirport,
			String flightCode, String flightFlag, String connect, String coordinates) {
		super();
		this.origin = origin;
		this.originCode = originCode;
		this.originAirport = originAirport;
		this.destCode = destCode;
		this.destAirport = destAirport;
		this.flightCode = flightCode;
		this.flightFlag = flightFlag;
		this.connect = connect;
		this.coordinates = coordinates;
	}

	public String getOrigin() {
		return origin;
	}

	public String getOriginCode() {
		return originCode;
	}

	public String getOriginAirport() {
		return originAirport;
	}

	public String getDestCode() {
		return destCode;
	}

	public String getDestAirport() {
		return destAirport;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public String getFlightFlag() {
		return flightFlag;
	}

	public String getConnect() {
		return connect;
	}

	public String getCoordinates() {
		return coordinates;
	}
}
