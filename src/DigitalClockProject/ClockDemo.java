package DigitalClockProject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Timer;

public class ClockDemo extends JFrame{

	JTextField timefield;
	
	ClockDemo()
	{
		super("Digitsl Clock");
		timefield=new JTextField();
		timefield.setEditable(false);
		timefield.setFont(new Font("Tahoma",Font.PLAIN,40));
		add(timefield);
		
		Timer t=new Timer(1000,new ClockListner());
		t.start();
	}
	
	class ClockListner  implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			Calendar cd=Calendar.getInstance();
			int h=cd.get(Calendar.HOUR);
			int m=cd.get(Calendar.MINUTE);
			int s=cd.get(Calendar.SECOND);
			
			timefield.setText(""+h+":"+m+":"+s);
		}
		
	}
	
	public static void main(String[] args) {
		ClockDemo clock=new ClockDemo();
		clock.setSize(500,500);
		clock.setVisible(true);
	}
}
