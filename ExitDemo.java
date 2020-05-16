import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
class ExitDemo extends Frame implements ActionListener
{
 Button b1,b2;
 public ExitDemo()
{
  setLayout(null);
  b1=new Button();
  b2=new Button();
  b1.setLabel("RED");
  b2.setLabel("EXIT");
  Font f=new Font("arial",Font.BOLD+Font.ITALIC,18);
  b1.setFont(f);
  b2.setFont(f);
  b1.setBounds(170,120,90,30);
  b2.setBounds(170,170,90,30);
  add(b1);
  add(b2);
  b1.addActionListener(this);
  b2.addActionListener(this);
}
 public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b1)
{
 String str = b1.getActionCommand();
 if(str.equalsIgnoreCase("red"))
{
 this.setBackground(Color.red);
  b1.setLabel("BLUE");
}
 else if(str.equalsIgnoreCase("blue"))
{
 this.setBackground(Color.blue);
  b1.setLabel("GREEN");
}
 else
{
 this.setBackground(Color.green);
  b1.setLabel("RED");
}
}
else
 System.exit(0);
}
public static void main(String arg[])
{
 ExitDemo e=new ExitDemo();
 e.setSize(400,300);
 e.setVisible(true);
 e.setTitle("ExitDemo");
}
}
