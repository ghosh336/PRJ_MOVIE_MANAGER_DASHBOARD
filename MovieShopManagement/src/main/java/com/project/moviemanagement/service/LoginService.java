package com.project.moviemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.moviemanagement.model.Movie;
import com.project.moviemanagement.model.User;
import com.project.moviemanagement.model.UserRole;
import com.project.moviemanagement.testdata.GenerateTestData;
import com.project.moviemanagement.validator.LoginDataValidator;

@Service
public class LoginService {

	@Autowired
	private GenerateTestData testdata;
	
	public User validateLogin(LoginDataValidator logindata) {
		
		/**
		 * This is for testing purpose, Later we need to get these details from external API or DB
		 */
		List<User> users= testdata.getAllUsers();
		
		System.out.println("User : " + logindata);
		System.out.println(users.get(0).getUserPwd());
		
		
		
		User loggedInUser = users.stream()
		.filter(usr -> (logindata.getUserId().equalsIgnoreCase(usr.getUserId()) 
				&& logindata.getUserPwd().equalsIgnoreCase(usr.getUserPwd())))
		.findFirst()
		.orElse(null);                   
		
		return loggedInUser;
	}
	
	public List<Movie> getAllMovies() {
		return testdata.getAllMovies();
	}
}
