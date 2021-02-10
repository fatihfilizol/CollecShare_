package com.fatih.backend.CollecShare.Repository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {
	  UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
