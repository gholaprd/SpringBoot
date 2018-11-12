package com.rd.boot.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.rd.boot.dto.Categories_Details;
import com.rd.boot.dto.StudentDTO;


@Service("categories")
public class CategoriesDaoImpl  {

	@Autowired
	private CategoriesDAO categoriesDAO;
	

	public List<Categories_Details> fetchAll(){
		List<Categories_Details> list=(List<Categories_Details>) categoriesDAO.findAll();
		System.out.println(list);
		return list;
	}

}
