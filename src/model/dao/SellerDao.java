package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void upDate(Seller obj);
	void delete(Integer Id);
	Seller findById(Integer Id);
	List<Seller>findAll();
}
