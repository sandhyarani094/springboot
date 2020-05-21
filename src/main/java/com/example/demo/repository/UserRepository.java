package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	@Query(value="SELECT * FROM USERMASTER WHERE MAILID=?1 AND PASSWORD=?2",nativeQuery = true)
	public User login(String mailid,String pw);
		
	

}
