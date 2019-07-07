package com.sapient.startwarsmovieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.sapient.startwarsmovieapp.Exception.NoSuchMovieInException;
import com.sapient.startwarsmovieapp.model.Planet;
import com.sapient.startwarsmovieapp.service.StarWarsService;

@RestController
@RequestMapping()
public class StarWarsMovieController {
	
	@Autowired
	private StarWarsService starWarsService;

	
	@RequestMapping (method = RequestMethod.GET, value = "planets/{id}") 
	Planet findById(@PathVariable String id) throws RestClientException, NoSuchMovieInException {
		return starWarsService.getSwapiPlanetById(id);
	}
	
	@RequestMapping (method = RequestMethod.GET, path="starwars") 
	Object findByTypeAndName(@RequestParam(name="type", required=true) String type,
			@RequestParam(name="name",required=true) String name) throws RestClientException,NoSuchMovieInException {
		return starWarsService.findByTypeAndName(type, name);
	}
	

}
