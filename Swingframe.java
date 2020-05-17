import javax.swing.JFrame;
import javax.swing.*;
public class SwingFrame
{
  JButton b1,b2;
 public SwingFrame()
{
  b1.new JButton("RED");
  b2.new JButton();
  b2.setText("BLUE");
  add(b1);
  add(b2);
}
public static void main(String arg[])
{
JFrame f1=new JFrame("swing");
f1.setSize(400,300);
f1.setVisible(true);
f1.getContentPane();
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
