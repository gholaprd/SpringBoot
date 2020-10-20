package com.coforge.jay;

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
	}
}
