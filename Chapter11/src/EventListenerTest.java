package lovingyoung;

import java.awt.*;
import java.awt.event.*;

public class EventListenerTest{
	 private Frame f=new Frame("测试窗口");
	 private Button bn=new Button("Click on me");
	 private TextField tv=new TextField("初始值");
	 public void init(){
		 bn.addActionListener(new bnListener());
		 f.setLayout(new FlowLayout());
		 f.add(tv);
		 f.add(bn);
		 f.pack();
		 f.setVisible(true);
	 }
	 class bnListener implements ActionListener{
		 public void actionPerformed(ActionEvent e){
			 tv.setText("OK");
		 }
	 }
	 public static void main(String[] args){
		 new EventListenerTest().init();
	 }
 }
