package com.sapient.startwarsmovieapp.model;

public class MovieSerach {
	
	

	private Integer count;
	private String type;

	private MovieType[] results;
	
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public MovieType[] getResults() {
		return results;
	}

	public void setResults(MovieType[] swPlanets) {
		this.results = swPlanets;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
