package lovingyoung;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
public class FrameTest{
	public static void main(String[] args){
		Frame f=new Frame("测试窗口");
		f.setBounds(30,30,250,200);
		f.setVisible(true);
		Panel p=new Panel();
		p.add(new TextField(20));
		p.add(new Button("Click Me"));
		f.add(p);
		f.setBounds(30,30,250,200);
		f.setVisible(true);
	}
}
