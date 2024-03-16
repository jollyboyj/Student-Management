package com.jollyj.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jollyj.demo.Pojo.products;

@Repository

public interface ProductsDao extends JpaRepository<products,Integer>{
	
	public List<products> findBycity(String city);

}
