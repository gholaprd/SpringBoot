package com.rd.boot.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rd.boot.dto.Categories_Details;
import com.rd.boot.dto.StudentDTO;

@Repository
public interface CategoriesDAO  extends CrudRepository<Categories_Details, Long>{
	

}
