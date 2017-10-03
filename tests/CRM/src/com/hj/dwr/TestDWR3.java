package com.hj.dwr;
public class TestDWR3 {

	public Person[] getPersons(){
		Person[] persons=new Person[3];
		persons[0]=new Person("zhangsan",20,true);
		persons[1]=new Person("zhangyi",22,false);
		persons[2]=new Person("zhangshu",21,true);
		return persons;
	}
}
