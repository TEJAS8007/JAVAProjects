package Painter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PainterApp extends JFrame implements MouseMotionListener {

	JLabel l;
	
	PainterApp() {
		l=new JLabel();
		l.setBounds(20,40,100,20);
		add(l);
	    addWindowListener(new WindowAdapter() {
		public void windowCLosing(WindowEvent e)
		{
			dispose();
		}
	 });
	    addMouseMotionListener(this);
	    setSize(400,400);
	    setLayout(null);
	    setVisible(true);
	}
	
	public void mouseDragged(MouseEvent e) {
		l.setText("X="+e.getX()+" , Y="+e.getY());
		Graphics g=getGraphics();
		g.setColor(Color.BLACK);
		g.fillOval(e.getX(), e.getY(), 15, 15);
	}

	public void mouseMoved(MouseEvent e) {
		l.setText("X="+e.getX()+" , Y="+e.getY());
		Graphics g=getGraphics();
		g.setColor(Color.BLACK);
		g.fillOval(e.getX(), e.getY(), 15, 15);
	}
	
	
	public static void main(String[] args) {
	     new PainterApp();	
	}
}
