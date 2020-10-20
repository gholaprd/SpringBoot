package com.coforge.jay;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class MapListInJava8 {

	public static void main(String[] args) {
		
	List<Employees> empList = new ArrayList<>();
	Employees emp1=new Employees();
	emp1.setId(101);
	emp1.setName("Rameshwar");
	emp1.setSalary(200000.0);
	emp1.setAge(12);
	Employees emp2=new Employees();
	emp2.setId(102);
	emp2.setName("gholap");
	emp2.setSalary(2000.0);
	emp2.setAge(43);
	Employees emp3=new Employees();
	emp3.setId(103);
	emp3.setAge(33);
	emp3.setName("Ramesh");
	emp3.setSalary(2000.0);
	empList.add(emp1);
	empList.add(emp2);
	empList.add(emp3);
	//getting List of emp whose sal >30000
	List<Employees> collect = empList.stream().filter(emp->emp.getSalary()>30000).collect(Collectors.toList());
	System.out.println(collect);
	//converting employee into map
	Map<Integer, Employees> collect2 = collect.stream().collect(Collectors.toMap(Employees::getId, emp->emp));
	System.out.println(collect2);
	//	ArrayList<Entry<Integer,String>> collect3 = collect2.entrySet().stream().collect(Collectors.toCollection(ArrayList::new));
	//System.out.println(collect3);
	
	//List<Integer> collect4 = collect2.entrySet().stream().map(x->x.getKey()).collect(Collectors.toList());
	List<Employees> collect5 = collect2.entrySet().stream().map( e -> new Employees()).collect(Collectors.toList());
	System.out.println(collect5);
	List<Integer> l=new ArrayList<>();
	l.add(2);
	l.add(3);
	l.add(2);
	//removing duplicates from list
	Set<Integer> set=new HashSet<>(l);
	System.out.println(set);
	
	List<Employees> sortedEmployees = empList.stream().sorted(Comparator.comparing(Employees::getName))
			.collect(Collectors.toList());
	System.out.println(sortedEmployees);
	Map<Integer, String> map = empList.stream().collect(
			Collectors.toMap(Employees::getId, Employees::getName, (x, y) -> x + ", " + y, LinkedHashMap::new));
	empList.sort((Employees s1, Employees s2) -> s1.getAge() - s2.getAge());
	//System.out.println(map);
	//System.out.println(empList);
	
}


}
class Employees {
//@NotEmpty
private Integer id;
@NotNull(message = "name should not null")
private String name;
//@NotEmpty
private String email;
/**
 * @return the email
 */
public String getEmail() {
	return email;
}


/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}


private Double salary;
private int age;


/**
 * @return the id
 */
public Integer getId() {
	return id;
}


/**
 * @param id the id to set
 */
public void setId(Integer id) {
	this.id = id;
}


/**
 * @return the name
 */
public String getName() {
	return name;
}


/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}


/**
 * @return the salary
 */
public Double getSalary() {
	return salary;
}


/**
 * @param salary the salary to set
 */
public void setSalary(Double salary) {
	this.salary = salary;
}


/**
 * @return the age
 */
public int getAge() {
	return age;
}


/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}


@Override
public String toString() {
	return "Employees [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", age=" + age + "]";
}


}
