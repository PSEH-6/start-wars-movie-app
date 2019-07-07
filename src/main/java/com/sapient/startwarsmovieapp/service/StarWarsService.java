package com.sapient.startwarsmovieapp.service;

import com.sapient.startwarsmovieapp.Exception.NoSuchMovieInException;
import com.sapient.startwarsmovieapp.model.Planet;

public interface StarWarsService {
	
	public Planet getSwapiPlanetById(String id);
	
	public Object findByTypeAndName(String type, String name) throws NoSuchMovieInException;


}
