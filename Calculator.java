import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Calculator extends Frame implements ActionListener{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,addition,subtract,divide,multiply,equall,clear;
	JTextField tf1;
	int flag=0,a=0,b=0,ans=0;
	char res;
	Calculator(String s){
		super(s);
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		clear=new JButton("AC");
		addition=new JButton("+");
		subtract=new JButton("-");
		multiply=new JButton("*");
		divide=new JButton("/");
		equall=new JButton("=");
		tf1=new JTextField();
		tf1.setBounds(30,40,300,40);
		b0.setBounds(50,120,50,20);
		b1.setBounds(150,120,50,20);
		b2.setBounds(250,120,50,20);
		b3.setBounds(50,180,50,20);
		b4.setBounds(150,180,50,20);
		b5.setBounds(250,180,50,20);
		b6.setBounds(50,240,50,20);
		b7.setBounds(150,240,50,20);
		b8.setBounds(250,240,50,20);
		b9.setBounds(50,300,50,20);
		addition.setBounds(150,300,50,20);
		subtract.setBounds(250,300,50,20);
		multiply.setBounds(50,360,50,20);
		divide.setBounds(150,360,50,20);
		equall.setBounds(250,360,50,20);
		clear.setBounds(50,420,50,20);
		add(b0);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(tf1);add(addition);
		add(subtract);add(multiply);add(divide);add(equall);add(clear);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		addition.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		equall.addActionListener(this);
		clear.addActionListener(this);
		setLayout(null);
		setVisible(true);
		setSize(400,550);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		try{
			if(e.getSource()==b0){
				String s=tf1.getText();
				s=s+"0";
				if(flag==1)
					b=Integer.parseInt(s);
				else
					a=Integer.parseInt(s);
				tf1.setText(s);
			}
			else if(e.getSource()==b1){
				String s=tf1.getText();
				s=s+"1";
				if(flag==1)
					b=Integer.parseInt(s);
				else
					a=Integer.parseInt(s);
				tf1.setText(s);
			}
			else if(e.getSource()==b2){
				String s=tf1.getText();
				s=s+"2";
				if(flag==1)
					b=Integer.parseInt(s);
				else
					a=Integer.parseInt(s);
				tf1.setText(s);
			}
			else if(e.getSource()==b3){
				String s=tf1.getText();
				s=s+"3";
				if(flag==1)
					b=Integer.parseInt(s);
				else
					a=Integer.parseInt(s);
				tf1.setText(s);
			}
			else if(e.getSource()==b4){
				String s=tf1.getText();
				s=s+"4";
				if(flag==1)
					b=Integer.parseInt(s);
				else
					a=Integer.parseInt(s);
				tf1.setText(s);
			}
			else if(e.getSource()==b5){
				String s=tf1.getText();
				s=s+"5";
				if(flag==1)
					b=Integer.parseInt(s);
				else
					a=Integer.parseInt(s);
				tf1.setText(s);
			}
			else if(e.getSource()==b6){
				String s=tf1.getText();
				s=s+"6";
				if(flag==1)
					b=Integer.parseInt(s);
				else
					a=Integer.parseInt(s);
				tf1.setText(s);
			}
			if(e.getSource()==b7){
				String s=tf1.getText();
				s=s+"8";
				if(flag==1)
					b=Integer.parseInt(s);
				else
					a=Integer.parseInt(s);
				tf1.setText(s);
			}
			else if(e.getSource()==b8){
				String s=tf1.getText();
				s=s+"9";
				if(flag==1)
					b=Integer.parseInt(s);
				else
					a=Integer.parseInt(s);
				tf1.setText(s);
			}
			else if(e.getSource()==b9){
				String s=tf1.getText();
				s=s+"9";
				if(flag==1)
					b=Integer.parseInt(s);
				else
					a=Integer.parseInt(s);
				tf1.setText(s);
			}
			else if(e.getSource()==addition){
				flag=1;
				res='+';
				tf1.setText("");
			}
			else if(e.getSource()==subtract){
				flag=1;
				res='-';
				tf1.setText("");
			}
			else if(e.getSource()==multiply){
				flag=1;
				res='*';
				tf1.setText("");
			}
			else if(e.getSource()==divide){
				flag=1;
				res='/';
				tf1.setText("");
			}
			else if(e.getSource()==equall){
				try{
					if(res=='+')
						ans=a+b;
					if(res=='-')
						ans=a-b;
					if(res=='*')
						ans=(a*b);
					if(res=='/')
						ans=a/b;
					String s=String.valueOf(ans);
					tf1.setText(a + "  " + b+ "  " + ans);
				}
				catch(Exception n){
					tf1.setText("divide by zero error");
				}
			}
			else if(e.getSource()==clear)
			{
				tf1.setText("");
				a=0;
				b=0;
				ans=0;
				flag=0;
			}
		}
		catch(Exception z){
			//JOptionPane.showMessage("exception Occured");
			System.out.println("error occured");
		}
	}
	public static void main(String [] args){
		new Calculator("My Calculator");
	}
}
