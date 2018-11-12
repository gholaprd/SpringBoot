package com.rd.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rd.boot.dao.BootService;
import com.rd.boot.dao.BootServiceImpl;
import com.rd.boot.dao.BootServviceDAO;
import com.rd.boot.dao.CategoriesDaoImpl;
import com.rd.boot.dto.StudentDTO;

@SpringBootApplication
public class BootServiceWebAppDaoApplication {

	public static void main(String[] args) {
		ApplicationContext context=null;
		context=SpringApplication.run(BootServiceWebAppDaoApplication.class, args);
		//BootService bootService=context.getBean(BootServiceImpl.class);
		/*BootServviceDAO dao=context.getBean(BootServviceDAO.class);
		StudentDTO dto=new StudentDTO();
		dto.setSid(0000);
		dto.setSname("RRRxxx");
		dto.setCourse("XXXXrrrrX");
		StudentDTO msg=dao.save(dto);
		System.out.println(msg);*/
		
		CategoriesDaoImpl categories = context.getBean("categories",CategoriesDaoImpl.class);
		categories.fetchAll();
	}
}
