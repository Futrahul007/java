import java.awt.Frame;
import java.awt.Button;
//import java.awt.CheckBox;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Electricitybill extends Frame implements ActionListener
{
	Button b1;
	Label l1,l2,l3,l4;
	TextField txt1,txt2,txt3,txt4;
        //CheckBox chk1,chk2;
        public void Electricity()
     {
        setLayout(null);
        b1=new Button(); 
        l1=new Label("Previous Unit");
	l2=new Label("Current Unit");
	l3=new Label("Total Unit Consumed");  
        l4=new Label("Bill Amount");
        txt1=new TextField();
	txt2=new TextField();
	txt3=new TextField();
        txt4=new TextField();
        //chk1=new CheckBox();
        //chk2=new CheckBox();
	//txt1.requestFocus();
        b1.setLabel("CALCULATE");
        b1.setBounds(60,300,90,50);
		l1.setBounds(60,90,120,35);
		l2.setBounds(60,180,120,35);
		l3.setBounds(175,400,100,35);
                l4.setBounds(195,400,100,35);
		txt1.setBounds(335,90,150,50);
		txt2.setBounds(335,180,150,50);
		txt3.setBounds(300,480,120,40);
                txt4.setBounds(320,400,120,40);
                //chk1.setBounds(335,90,150,50);
		//chk2.setBounds(335,180,150,50);
		b1.setFont(fnt);
		txt1.setFont(fnt);
		txt2.setFont(fnt);
		txt3.setFont(fnt);
                txt4.setFont(fnt);
		add(b1);
		add(l1);
		add(l2);
                add(l3);
                add(l4);
		add(txt1);
		add(txt2);
		add(txt3);
                add(txt4);
                //add(chk1);
                //add(chk2);
		b1.addActionListener(this);
	        txt3.setEditable(false);
		txt4.setEditable(false);
	}
	public void actionPerformed(ActionEvent a)
	{
	}
          public static void main(String arg[])
	{
		Electricitybill f=new Electricitybill();
		f.setVisible(true);
		f.setSize(600,500);
		f.setTitle("Electricity Bill");
	}
 }