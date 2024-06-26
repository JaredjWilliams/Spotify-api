package com.spotify.api.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NotAuthorizedException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7060821209401112517L;
	private String message;
}
