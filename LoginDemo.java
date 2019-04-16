package lab;

import javax.swing.JOptionPane;

class LoginDemo
{
  public static void main(String arg[])
  {
  try
  {
  Login frame=new Login();
  frame.setSize(300,100);
  frame.setVisible(true);
  
  Transaction frame2=new Transaction();
  frame2.setSize(300,200);
  frame2.setVisible(true);
  }
  catch(Exception e)
  {JOptionPane.showMessageDialog(null, e.getMessage());}
  }
}