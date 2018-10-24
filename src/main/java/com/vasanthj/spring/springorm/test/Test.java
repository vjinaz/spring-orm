package com.vasanthj.spring.springorm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vasanthj.spring.springorm.entity.Product;
import com.vasanthj.spring.springorm.product.dao.ProductDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vasanthj/spring/springorm/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDaoImpl");
		Product product = new Product();
		product.setId(1);
		product.setName("iPhone");
		product.setDesc("nice phone");
		product.setPrice(700);
		productDao.create(product);
	}

}
