package lovingyoung;
public class Printer implements Output{
	public Printer(){
		count=0;
		msg=new String[MAX_CACHE];
	}
	private int count;
	private String[] msg;
	public void getData(String Msg){
		if(count>=MAX_CACHE){
			System.out.println("栈已满");
		}
		else{
			msg[count]=Msg;
			count++;
		}
	}
	public void out(){
		while(count>=0){
			System.out.println(msg[count]);
			count--;
		}
	}
}
