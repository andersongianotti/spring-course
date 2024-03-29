package com.springcourse.domain;

import java.util.ArrayList;
import java.util.List;

import com.springcourse.domain.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter	@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private Role role;
	
	private String password;
	
	private List<Request> requests = new ArrayList<Request>();
	
}
