package com.project.moviemanagement.model;

import java.util.Arrays;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class User {

	private String userId;
	
	private String userName;
	
	/**
	 * For Testing purpose, password attribute needs to be removed later and need to use spring security.
	 */
	private String userPwd;
	
	private UserRole userRole;
	
	private Movie[] purchasedMovies;
	
	private Movie[] pendingVerificationMovies;
	
	private Movie[] rejectedVerificationMovies;

	public User(String userId, String userName, String userPwd, UserRole userRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userRole = userRole;
	}
		
}
