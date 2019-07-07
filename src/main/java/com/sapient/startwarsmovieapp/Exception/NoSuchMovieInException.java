package com.sapient.startwarsmovieapp.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)

public class NoSuchMovieInException extends Exception {
	public NoSuchMovieInException (String msg) {
		super(msg);
	}


}
