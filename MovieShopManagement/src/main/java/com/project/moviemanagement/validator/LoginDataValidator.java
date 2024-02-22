package com.project.moviemanagement.validator;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDataValidator {
	
	@NotBlank(message = "UserId cannot be blank.")
	private String userId;
	
	@NotBlank(message = "Password cannot be blank.")
	private String userPwd;

	public LoginDataValidator(@NotBlank(message = "UserId cannot be blank") String userId,
			@NotBlank(message = "Password cannot be blank") String userPwd) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
	}

	public LoginDataValidator() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoginDataValidator [userId=" + userId + ", userPwd=" + userPwd + "]";
	}
	
	
}
