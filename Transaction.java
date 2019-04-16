package lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Transaction extends JFrame implements ActionListener{

	String s;
	String[] words;
	private static final long serialVersionUID = 1L;
  JButton SUBMIT,sb2;
  JPanel panel,p2;
  JLabel label1,label2,l3,l4;
   JTextField  text1,text2,t3,t4;
   {
   label1 = new JLabel();
   label1.setText("Username:");
   text1 = new JTextField(60);
   
   l3 = new JLabel();
   l3.setText("Account Number:");
   t3 = new JTextField(60);
 
   label2 = new JLabel();
   label2.setText("Password:");
   text2 = new JPasswordField(60);
   
  
   SUBMIT=new JButton("SUBMIT");
   
   panel=new JPanel(new GridLayout(6,2));
   panel.add(label1);
   panel.add(text1);
   panel.add(label2);
   panel.add(text2);
   panel.add(SUBMIT);
   add(panel,BorderLayout.CENTER);
   SUBMIT.addActionListener(this);
   setTitle("LOGIN for banking transaction");
   }
  public void actionPerformed(ActionEvent ae)
   {
   String value1=text1.getText();
   String value2=text2.getText();
   
   Account a1=new Account(98776,"Mehedi",455677,5000.00,"iit123");
   Account a2=new Account(99876,"Sudip",454677,7000.00,"iit12345");
   
   
   FileOutputStream fout;
try {
	fout = new FileOutputStream("C:\\Users\\MD Mehedi Hasan\\Desktop\\lab\\src\\lab\\BankingAccount.txt");
	 ObjectOutputStream out=new ObjectOutputStream(fout);
	 out.writeObject(a1);
	 out.writeObject(a2);
	 
	 out.close();
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}  
    
   
   String n=a1.getName();
   String p=a1.getPassword();
   
   if (value1.equals(n) && value2.equals(p)) {
   NextPage page=new NextPage();
   page.setVisible(true);
   JLabel label = new JLabel("Welcome:"+value1);
   page.getContentPane().add(label);
   
   
   
   
   
   }
   
   }
	
}
