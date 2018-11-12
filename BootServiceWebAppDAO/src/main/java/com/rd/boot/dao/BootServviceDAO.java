package com.rd.boot.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rd.boot.dto.StudentDTO;

@Repository
public interface BootServviceDAO extends CrudRepository<StudentDTO, Serializable> {

	StudentDTO findBySname(String sname);
}
