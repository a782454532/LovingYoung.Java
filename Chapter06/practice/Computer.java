package lovingyoung;
public class Computer{
	private Output out;
	public Computer(Output out){
		this.out=out;
	}
	public void keyIn(String Msg){
		out.getData(Msg);
	}
	public void print(){
		out.out();
	}
}
