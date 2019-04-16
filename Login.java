package lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
  
class Login extends JFrame implements ActionListener
 {
	String s;
	String[] words;
	private static final long serialVersionUID = 1L;
  JButton SUBMIT,sb2;
  JPanel panel,p2;
  JLabel label1,label2,l3,l4;
   JTextField  text1,text2,t3,t4;
   Login()
   {
   label1 = new JLabel();
   label1.setText("Username:");
   text1 = new JTextField(15);
 
   label2 = new JLabel();
   label2.setText("Password:");
   text2 = new JPasswordField(15);
  
   SUBMIT=new JButton("SUBMIT");
   
   panel=new JPanel(new GridLayout(3,1));
   panel.add(label1);
   panel.add(text1);
   panel.add(label2);
   panel.add(text2);
   panel.add(SUBMIT);
   add(panel,BorderLayout.CENTER);
   SUBMIT.addActionListener(this);
   setTitle("LOGIN for getting certificate");
   }
  public void actionPerformed(ActionEvent ae)
   {
   String value1=text1.getText();
   String value2=text2.getText();
   
   Student s1=new Student("Mehedi","Mr","Mrs","909","2016-415-038",3.50,"iit123");
   Student s2=new Student("Fahim","MDF","MrsF","932","2016-429-075",3.45,"iit12345");
   
   Account a1=new Account(98776,"Mehedi",455677,5000.00,"iit123");
   
   
   FileOutputStream fout;
try {
	fout = new FileOutputStream("C:\\Users\\MD Mehedi Hasan\\Desktop\\lab\\src\\lab\\Personal.txt");
	 ObjectOutputStream out=new ObjectOutputStream(fout);
	 out.writeObject(s1);
	 out.writeObject(s2);
	 
	 out.close();
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}  
   
   String name=s1.getName();
   String pass=s1.getPassword();
   
   if (value1.equals(name) && value2.equals(pass)) {
   NextPage page=new NextPage();
   page.setVisible(true);
   JLabel label = new JLabel("Welcome:"+value1);
   page.getContentPane().add(label);
   
   
   
   
   
   }
   
   }
   
 }
  


  
