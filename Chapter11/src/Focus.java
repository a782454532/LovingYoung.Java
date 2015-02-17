package lovingyoung;

import java.awt.*;
import java.awt.event.*;

public class Focus{
	private Frame f=new Frame("测试窗口");
	private Panel p=new Panel();
	private TextField tf1=new TextField("未获得焦点1");
	private TextField tf2=new TextField("未获得焦点2");
	public void init(){
		tf1.addFocusListener(new FListener());
		tf2.addFocusListener(new FListener());
		p.add(tf1);
		p.add(tf2);
		f.add(p);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new Focus().init();
	}
	class FListener implements FocusListener{
		public void focusGained(FocusEvent e){
			tf1.setText("已获得焦点1");
			tf2.setText("已获得焦点2");
		}
		public void focusLost(FocusEvent e){
			tf1.setText("未获得焦点1");
			tf2.setText("未获得焦点2");
		}
	}
}
