package lovingyoung;

import java.util.TreeSet;
import java.util.SortedSet;

public class TreeSetTest{
	public static void main(String[] args){
		TreeSet p=new TreeSet();
		p.add(new Person("张三",19,true));
		p.add(new Person("李小花",20,false));
		p.add(new Person("赵铁柱",13,true));
		p.add(new Person("王尼玛",99,false));
		System.out.println(p);
	}
}

class Person implements Comparable<Person>{
	private String name;
	private int age;
	private boolean male;
	public Person(String name,int age,boolean male){
		this.name=name;
		this.age=age;
		this.male=male;
	}
	public int getAge(){
		return this.age;
	}
	public int compareTo(Person other){
		if(this.age>other.age) return 1;
		if(this.age<other.age) return -1;
		return 0;
	}
	public String toString(){
		StringBuilder s=new StringBuilder("");
		s.append("(name:").append(this.name).append(",age:").append(this.age).append(",male:").append(this.male).append(")");
		return new String(s);
	}
}
