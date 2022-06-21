package com.freshfood.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.freshfood.dao.impl.ProductDao;
import com.freshfood.model.web.Product;
import com.freshfood.service.IProductService;

public class ProductService implements IProductService {

	@Inject
	private ProductDao productDao; // instance of product dao

	/*
	 * get list products from database
	 * input: none
	 * return a list product
	 */
	@Override
	public List<Product> getProducts() {
		return productDao.getProducts();
	}

}
