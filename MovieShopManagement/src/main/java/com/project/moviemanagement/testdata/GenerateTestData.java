package com.project.moviemanagement.testdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.moviemanagement.model.Movie;
import com.project.moviemanagement.model.User;
import com.project.moviemanagement.model.UserRole;

@Service
public class GenerateTestData {

	private static List<User> users = null;
	private static List<Movie> movies = null;
	static {
		users = new ArrayList<>();
		
		//====== Users Starts ======
		User u1 = new User("bry001", "Bryan Adams", "myschool123", UserRole.ADMIN);
		User u2 = new User("crys336", "Chrystopher John", "apple@221", UserRole.COMMON_VIEWER);
		User u3 = new User("sys1912", "MS Dhoni", "msbhai@jul7", UserRole.COMMON_VIEWER);
		User u4 = new User("nkn112", "Neil James", "nljms!!asdf", UserRole.COMMON_VIEWER);
		users.addAll(List.of(u1, u2, u3, u4));
		//====== Users Ends ========
		
		//====== Movie Starts ======
		movies = new ArrayList<>();
		Movie m1 = new Movie("mov001", "Narnia", "Entertainment", 12.25, 7.2f, new Date(2000, 12, 18));
		Movie m2 = new Movie("mov002", "BayMax", "Sience Fiction", 20.22, 9.5f, new Date(2014, 8, 25));
		Movie m3 = new Movie("mov003", "Exorcist", "Thriller", 18.22, 8.1f, new Date(2009, 11, 5));
		Movie m4 = new Movie("mov004", "Gadar2", "Romance", 15.22, 9.2f, new Date(2023, 8, 15));
		Movie m5 = new Movie("mov005", "Who Killed Jessica", "Suspense", 10.22, 6.1f, new Date(2016, 8, 11));
		movies.addAll(List.of(m1, m2, m3, m4, m5));
		//====== Movie Ends ======
		
		System.out.println("Test data for dummy Users and Movies got created");
	}
	
	public static List<User> getAllUsers() {
		return users;
	}
	
	public static List<Movie> getAllMovies() {
		return movies;
	}
}
