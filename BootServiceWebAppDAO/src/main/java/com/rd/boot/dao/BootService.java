package com.rd.boot.dao;

import java.util.List;

import com.rd.boot.dto.StudentDTO;

public interface BootService {

	String add(StudentDTO dto);
	StudentDTO findSpecificStudentDataByName(String sname);
	
	//getting all list of student dto
	List<StudentDTO> findAll();
	
}
