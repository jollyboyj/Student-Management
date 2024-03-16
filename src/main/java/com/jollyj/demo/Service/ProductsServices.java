package com.jollyj.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jollyj.demo.Dao.ProductsDao;
import com.jollyj.demo.Pojo.products;

@Service

public class ProductsServices {
	
	@Autowired
	ProductsDao productsdao;

	public List<products> getAllproduct() {
		return productsdao.findAll();
	}

	public List<products> getproduct(String city) {
		return productsdao.findBycity(city);
	}

	
	public String addmember(products product) {
		productsdao.save(product);
		return "Success";
	}
	
	public String updatemember(products product) {
		productsdao.save(product);
		return "Success";
	}

	public String deletemember(int id) {
		productsdao.deleteById(id);
		return "Member removed!";
	}

}
