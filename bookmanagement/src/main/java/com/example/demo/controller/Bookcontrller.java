package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bookentity;
import com.example.demo.repository.Bookrepository;

@RestController
@CrossOrigin(origins="*")

public class Bookcontrller {

	@Autowired
	public Bookrepository brepo;
	
	@PostMapping("/addbook")
	public Bookentity addbook(@RequestBody Bookentity book) {
		try {
			brepo.save(book);
			return book;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PutMapping("/updatebook/{bookId}")
	public Bookentity updatebook(@PathVariable int bookId,@RequestBody Bookentity book) {
		try {
			Bookentity ubook = brepo.findById(bookId).orElseThrow(()->new RuntimeException("Book not found with id " + bookId));
			BeanUtils.copyProperties(book, ubook, "bookId");
			return brepo.save(ubook); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/getbook")
	public List<Bookentity> getbook() {
		try {
			return brepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/getbook/{Id}")
	public Bookentity getbook(@PathVariable int Id) {
		try {
			return brepo.findById(Id).orElseThrow(()->new RuntimeException("Book not found with id " + Id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@DeleteMapping("/deletebook/{bookId}")
	public String deletebook(@PathVariable int bookId) {
		try {
			Bookentity book=brepo.getOne(bookId);
			brepo.delete(book);
			return "book deleted "+bookId;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
