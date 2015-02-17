package lovingyoung;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetTest2{
	public static void main(String[] args){
		Compare co=new Compare();
		TreeSet ts=new TreeSet(co);
		ts.add(new Person("张三",19,true));
		ts.add(new Person("李四",14,true));
		ts.add(new Person("李小花",25,false));
		ts.add(new Person("赵铁柱",13,true));
		System.out.println(ts);
	}
}

class Person implements Comparable{
	private String name;
	private int age;
	private boolean male;
	public int getAge(){
		return this.age;
	}
	public Person(String name,int age,boolean male){
		this.name=name;
		this.age=age;
		this.male=male;
	}
	public String toString(){
		StringBuilder sb=new StringBuilder("");
		sb.append("(name:").append(name).append(",age:").append(age).append(",male:").append(male).append(")");
		String s=new String(sb);
		return s;
	}
	public boolean equals(Object o){
		Person p=(Person)o;
		if(this.getAge()==p.getAge()) return true;
		return false;
	}
	public int compareTo(Object o){
		Person p=(Person)o;
		if(this.getAge()>p.getAge()) return 1;
		if(this.getAge()<p.getAge()) return -1;
		return 0;
	}
}

class Compare implements Comparator{
	public int compare(Object o1,Object o2){
		Person p1=(Person)o1;
		Person p2=(Person)o2;
		if(p1.getAge()<p2.getAge()) return 1;
		if(p1.getAge()>p2.getAge()) return -1;
		return 0;
	}
	public boolean equals(){
		return true;
	}
}
