package org.springframework.samples.petclinic.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface LoginService {
	
	public UserDetails loadUserByUsername(String username);
	public Collection<GrantedAuthority> getAuthorities(Integer access);


}
