package com.jollyj.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jollyj.demo.Pojo.products;
import com.jollyj.demo.Service.ProductsServices;

@RestController
@RequestMapping("Strawhats")
public class Controller2 {
	
	@Autowired
	ProductsServices service ;
	
	@GetMapping("AllMembers")
	public List<products> getProducts()
	{
		return service.getAllproduct();
	}
	
	@GetMapping("City/{city}")
	public List<products> getproduct(@PathVariable String city)
	{
		return service.getproduct(city);
	}
	
	@PostMapping("AddMember")
	public String addMember(@RequestBody products product)
	{
		System.out.println("hello");
		return service.addmember(product);
	}
	
	@PutMapping("UpdateMember")
	public String updateMember(@RequestBody products product)
	{
		return service.updatemember(product);
	}
	
	@DeleteMapping("DeleteMember/{id}")
	public String deleteMember(@PathVariable("id") int id)
	{
		return service.deletemember(id);
	}
}