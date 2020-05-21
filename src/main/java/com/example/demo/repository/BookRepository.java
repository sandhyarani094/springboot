package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Bookmaster;
import com.example.demo.model.User;
//why we write Integer inside the CrudRepository <>.Bookmaster=the model class name 
//and Integer is the datatype of primary  key or @id field in the model class.
public interface BookRepository extends CrudRepository<Bookmaster, Integer>  {
	@Query(value=" select * from bookmaster where agegroup=?1",nativeQuery = true)
	public Iterable<Bookmaster> getAllBookByAgegroup(String agegroup);
	
	@Query(value=" select * from bookmaster where booktype=?",nativeQuery = true)
	public Iterable<Bookmaster>getAllBookByBooktype( String booktype);
		

}

