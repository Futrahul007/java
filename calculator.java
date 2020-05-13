import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame
{
 JLabel l1,l2,l3;
 JTextField t1,t2,t3;
 JButton b1,b2,b3,b4;
 public Calculator(){} 
 public Calculator(String s)
 {super (s);}
public void setComponents()
{
 l1=new JLabel("FIRST NUMBER");
 l2=new JLabel("SECOND NUMBER");
 l3=new JLabel("RESULT");
 t1=new JTextField();
 t2=new JTextField();
 b1=new JButton("ADD");
 b2=new JButton("SUB");
 b3=new JButton("MUL");
 b4=new JButton("DIV");
 setLayout(null);
 l1.setBounds(60,90,120,35);
 l2.setBounds(60,180,120,35);
 t1.setBounds(335,90,150,50);
 t2.setBounds(335,180,150,50);
 b1.setBounds(60,300,90,50);
 b2.setBounds(175,300,90,50);
 b3.setBounds(290,300,90,50);
 b4.setBounds(405,300,90,50);
 l3.setBounds(175,400,100,35);
 t3.setBounds(300,400,120,40);
 b1.addActionListener(new Handler());
 add(l1);
 add(l2);
 add(t1);
 add(l3);
 add(t2);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 add(l3);
} 
  class Handler implements ActionListener{
 public void actionPerformed(ActionEvent e){
 	int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		if(e.getSource()==b1)
			t3.setText(""+(a+b));
		else if(e.getSource()==b2)
			t3.setText(""+(a-b));
		else if(e.getSource ()==b3)
			t3.setText(""+a*b);
		else
			t3.setText(""+a/b);
}
}
 public static void main(String arg[])
{
 Calculator c1 = new Calculator("swing Calculator");
 c1.setComponents();
 c1.setSize(600,400);
 c1.setVisible(true);
}
}
 