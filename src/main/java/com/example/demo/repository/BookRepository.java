package com.example.demo.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Bookmaster;
//why we write Integer inside the CrudRepository <>.Bookmaster=the model class name 
//and Integer is the datatype of primary  key or @id field in the model class.
public interface BookRepository extends CrudRepository<Bookmaster, Integer>  {
	@Query(value=" select * from bookmaster where agegroup=?1",nativeQuery = true)
	public Iterable<Bookmaster> getAllBookByAgegroup(String agegroup);
	
	@Query(value=" select * from bookmaster where booktype=?",nativeQuery = true)
	public Iterable<Bookmaster>getAllBookByBooktype( String booktype);
	
	@Query(value=" select qty from bookmaster  where id=?",nativeQuery = true)
	   public Integer getBookQtyById(Integer bookid);
	@Transactional
	@Modifying
	@Query(value="update bookmaster set qty=?2 where id=?1",nativeQuery = true)
	   public void setBookQtyById(Integer bookid,Integer qty);
}

