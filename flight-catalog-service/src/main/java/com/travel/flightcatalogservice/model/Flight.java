package com.travel.flightcatalogservice.model;

public class Flight {

	String flightNo;
	String source;
	String destination;

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Flight(String flightNo, String source, String destination) {
		super();
		this.flightNo = flightNo;
		this.source = source;
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", source=" + source + ", destination=" + destination + "]";
	}

}
