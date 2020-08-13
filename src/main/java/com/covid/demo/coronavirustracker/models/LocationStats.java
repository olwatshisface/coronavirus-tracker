package com.covid.demo.coronavirustracker.models;

public class LocationStats {
	private String county;
	private String state;
	private int latestTotalCases;
	private int differenceFromPreviousDate;
	
	public LocationStats() {
		
	}
	
	public LocationStats(String city, String state,  int latestTotalCases) {
		super();
		this.state = state;
		this.county = city;
		this.latestTotalCases = latestTotalCases;
	}
	
	@Override
	public String toString() {
		return "LocationStats [city=" + county + ", state=" + state + ", latestTotalCases=" + latestTotalCases + "]";
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String city) {
		this.county = city;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}

	public int getDifferenceFromPreviousDate() {
		return differenceFromPreviousDate;
	}

	public void setDifferenceFromPreviousDate(int differenceFromPreviousDate) {
		this.differenceFromPreviousDate = differenceFromPreviousDate;
	}
	
}
