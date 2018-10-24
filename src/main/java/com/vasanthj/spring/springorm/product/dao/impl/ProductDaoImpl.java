package com.vasanthj.spring.springorm.product.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.vasanthj.spring.springorm.entity.Product;
import com.vasanthj.spring.springorm.product.dao.ProductDao;

@Component
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional 
	public int create(Product product) {
		return (int) hibernateTemplate.save(product);
	}

}
