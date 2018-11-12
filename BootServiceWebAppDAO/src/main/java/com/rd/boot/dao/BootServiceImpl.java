package com.rd.boot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rd.boot.dto.StudentDTO;

@Service
public class BootServiceImpl implements BootService {

	@Autowired
	private BootServviceDAO dao;
	@Override
	public String add(StudentDTO dto) {
		dao.save(dto);
		return "saved";
	}
	@Override
	public StudentDTO findSpecificStudentDataByName(String sname) {
		
		return dao.findBySname(sname);
	}
	@Override
	public List<StudentDTO> findAll() {
		// TODO Auto-generated method stub
		return (List<StudentDTO>) dao.findAll();
	}

}
