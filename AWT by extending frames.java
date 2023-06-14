package arpita;
import java.awt.*;
public class AWTEx extends Frame  {
	AWTEx(){
		Button b = new Button("Click Me!!!!");
		b.setBounds(30,100,80,30);
		add(b);
		setSize(300,300);
		setTitle("This is my first AWT page.....");
		setVisible(true);
		setLayout(null);
	}
	public static void main(String args[]) {
		AWTEx f = new AWTEx();
	}
