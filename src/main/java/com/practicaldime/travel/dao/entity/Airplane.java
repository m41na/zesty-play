package com.practicaldime.travel.dao.entity;

public class Airplane {

	public String make;
	public String model;
	public String name;
	
	public Airplane() {
		super();
	}

	public Airplane(String make, String model, String name) {
		super();
		this.make = make;
		this.model = model;
		this.name = name;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getName() {
		return name;
	}
}
