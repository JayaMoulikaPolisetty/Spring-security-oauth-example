package com.jaya.security.springsecurityauthserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaya.security.springsecurityauthserver.model.Users;

@Repository
public interface UsersRespository extends JpaRepository<Users, Integer> {

	Optional<Users> findByName(String username);
	
	

}
