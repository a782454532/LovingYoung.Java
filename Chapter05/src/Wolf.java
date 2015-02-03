class Creature{
	public Creature(){
		System.out.println("无参构造器");
	}
}
class Animal extends Creature{
	public Animal(String name){
		System.out.println("一个参数的构造器");
	}
	public Animal(String name,int age){
		this(name);
		System.out.println("两个参数的构造器");
	}
}
public class Wolf extends Animal{
	public Wolf(){
		super("1",2);
		System.out.println("Wolf构造器");
	}
	public static void main(String[] args){
		new Wolf();
	}
}
