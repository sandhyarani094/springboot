package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bookmaster;
import com.example.demo.model.Bookstock;
import com.example.demo.model.Resp;
import com.example.demo.repository.BookRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class BookmasterController {
	@Autowired
	BookRepository bookrepo;
	
	@GetMapping("/getAllBook")
	public Iterable<Bookmaster> getAllBook() {
		return bookrepo.findAll();
	}
	@PostMapping("/getAllBookByAgegroup")
	public Iterable<Bookmaster> getAllBookByAgegroup(@RequestBody String agegroup) {
		return bookrepo.getAllBookByAgegroup(agegroup);
	}
	@PostMapping("/getAllBookByBooktype")
	public Iterable<Bookmaster>getAllBookByBooktype(@RequestBody String booktype) {
		return bookrepo.getAllBookByBooktype(booktype);
	}
	
	@PostMapping("/saveBook")
	public Resp saveBook(@RequestBody Bookmaster book) {
		bookrepo.save(book);
		Resp resp=new Resp();
		
		resp.setResponseValue("book added successfully");
		return resp;
		
	}
	@PostMapping("/findBook")
	public Optional<Bookmaster> findBook(@RequestBody Integer book) {
		
		return bookrepo.findById(book);
	}
	
	@PostMapping("/deleteBook")
	public Resp deleteBook(@RequestBody Integer book) {
		
		bookrepo.deleteById(book);
		Resp resp=new Resp();

		resp.setResponseValue("book deleted successfully");
		return resp;
		

	}
	
	@PutMapping("/saveBook")
	public String saveBookByPut(@RequestBody Bookmaster book) {
		bookrepo.save(book);
		
		return "Book added successfully";
	}
	 
	@PostMapping("/addStock")
	public Resp addStock(@RequestBody Bookstock book) {
		//bookrepo.save(book);
	Integer previousstock=bookrepo.getBookQtyById(book.getBookid());
	System.out.println(previousstock);
	Integer newstock=previousstock + book.getBookqty();
    	System.out.println(book.getBookid()+ " "+newstock);
	bookrepo.setBookQtyById(book.getBookid(), newstock);
    Resp resp=new Resp();
    resp.setResponseValue("Book Added To Stock");
    return resp;
		
		
	
	}	
	
	@PostMapping("/removeStock")
	public Resp removeStock(@RequestBody Bookstock book) {
		//bookrepo.save(book);
	Integer previousstock=bookrepo.getBookQtyById(book.getBookid());
	System.out.println(previousstock);
	 Resp resp=new Resp();
	if(previousstock>=book.getBookqty())
	{
		
	
	Integer newstock=previousstock - book.getBookqty();
    	System.out.println(book.getBookid()+ " "+newstock);
	bookrepo.setBookQtyById(book.getBookid(), newstock);
   
    resp.setResponseValue("success");
   
	}
	else {
		resp.setResponseValue("error");
	    
		
	}
	return resp;
		
		
	
	}	


}
