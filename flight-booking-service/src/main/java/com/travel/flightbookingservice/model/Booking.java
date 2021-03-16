package com.travel.flightbookingservice.model;

public class Booking {
	String pnr;
	String userID;
	String flightNo;
	String travelDate;

	public Booking(String pnr, String userID, String flightNo, String travelDate) {
		super();
		this.pnr = pnr;
		this.userID = userID;
		this.flightNo = flightNo;
		this.travelDate = travelDate;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	@Override
	public String toString() {
		return "Booking [pnr=" + pnr + ", userID=" + userID + ", flightNo=" + flightNo + ", travelDate=" + travelDate
				+ "]";
	}

}
