package com.sapient.startwarsmovieapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.sapient.startwarsmovieapp.Exception.NoSuchMovieInException;
import com.sapient.startwarsmovieapp.model.MovieSerach;
import com.sapient.startwarsmovieapp.model.Planet;
import com.sapient.startwarsmovieapp.util.MovieConstants;


@Component
public class StarWarsServiceImpl implements StarWarsService {



	private final Logger log = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private RestTemplate restTemplate;

	//------------------


	public Planet getSwapiPlanetById(String id) throws RestClientException {		

		String swapiUrl = MovieConstants.TYPE_BASE_URL + id;

		log.info("GET " + swapiUrl +"...");

		Planet swapiSearch = restTemplate.getForObject(
				swapiUrl, Planet.class);

		return swapiSearch;
	}

	
	
	@Override
	public Object findByTypeAndName(String type, String name) throws NoSuchMovieInException, RestClientException {

		String swapiUrl = MovieConstants.BASE_URL+type+"?search=" + name;

		log.info("GET " + swapiUrl +"...");

		MovieSerach swapiSearch = restTemplate.getForObject(
				swapiUrl, MovieSerach.class);

		swapiSearch.setType(type);

		if (swapiSearch.getCount() == 0) {
			throw new NoSuchMovieInException("No movie present with name ::"+name);
		}

		return swapiSearch;
	}	



}
