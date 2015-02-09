import java.util.Scanner;

public class Input{
	private int A;
	private long B;
	private short C;
	private char D;
	private boolean E;
	private String F;
	public Input(){
		A=0;
		B=0;
		C=0;
		D='0';
		E=false;
		F="";
	}
	public void out(){
		System.out.println(A+"\n"+B+"\n"+C+"\n"+D+"\n"+E+"\n"+F+"\n");
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Input in=new Input();
		System.out.print("Int:");
		in.A=sc.nextInt();
		System.out.print("Long:");
		in.B=sc.nextLong();
		System.out.print("Short;");
		in.C=sc.nextShort();
		System.out.print("Char:");
		in.D=(sc.next()).charAt(0);
		System.out.print("Boolean");
		in.E=sc.nextBoolean();
		System.out.print("String:");
		in.F=sc.next();
		in.out();
	}
}
