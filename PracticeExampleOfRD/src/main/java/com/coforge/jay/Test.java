package com.coforge.jay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static class Parent{
		public String  val="P";
		public String getVal() {
			return val;
		}
	}
	public static class Child extends Parent{
		public String  val="C";
		public String getVal() {
			return val;
		}
	}
	public static void main(String[] args) {
		Parent p =new Child();
		System.out.println(p.val + p.getVal());
		
		ArrayList al=new ArrayList();
		al.add("ad");
		al.add(2);
		Map<String,String> map=new HashMap<>();
		map.put("1", "2");
		map.get("1");
		String str= new String("str");
		System.out.println(str.hashCode());
		String str2="str";
		String concat = str.concat("");
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str)+"  "+System.identityHashCode(str.intern()));
		System.out.println(System.identityHashCode(str2)+"  "+System.identityHashCode(str2.intern())); 
		System.out.println(System.identityHashCode(concat)+"  "+System.identityHashCode(concat.intern())); 
		
	}
}
