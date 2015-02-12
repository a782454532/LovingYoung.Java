package lovingyoung;

import java.util.*;

public class IteratorTest{
	public static void main(String[] args){
		Collection persons=new HashSet();
		persons.add(new Person("张三",19,true));
		persons.add(new Person("李四",20,true));
		persons.add(new Person("张全蛋",21,true));
		persons.add(new Person("韩梅梅",22,false));
		System.out.println(persons);
		Iterator it=persons.iterator();
		while(it.hasNext()){
			Person temp=(Person)it.next();
			temp.set("王五",23,true);
			System.out.println(temp);
			System.out.println(persons);
		}
		persons.remove(new Person("王五",23,true));
		System.out.println(persons);
	}
}

class Person{
	private String name;
	private int age;
	private boolean male;
	public Person(String name,int age,boolean male){
		this.name=name;
		this.age=age;
		this.male=male;
	}
	public void set(String name,int age,boolean male){
		this.name=name;
		this.age=age;
		this.male=male;
	}
	public String toString(){
		String s=new String("");
		s=s+"(name:"+name+",age:"+age+",male:"+male+")";
		return s;
	}
}
