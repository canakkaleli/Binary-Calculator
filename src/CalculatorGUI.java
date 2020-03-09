
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorGUI {
  private String[] buttonList = { "C","+", "-" , "*", "/", "%", "fac", "="};
  private JButton[] buttons = new JButton[8];
  private Boolean add = false, sub = false, mul = false, div = false, mod = false;
  
  private void create() {
	  JFrame frame = new JFrame("Calculator");
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  Calculator c = new Calculator();
	  JPanel panelText = new JPanel(new GridLayout());
	  JTextField entry = new JTextField();
	  panelText.add(entry);
	  JPanel panel = new JPanel(new GridLayout(3,3));
	  
	  String s = "";
	  
	  for(int i = 0; i < buttonList.length; i++) {
		 s = buttonList[i];
		 buttons[i] = new JButton(s);
	  }
	  
	  int count = 0;
	  for(int i = 0; i < 3; i++) {
		 for(int j = 0; j < 3; j++) {
			if(count < buttons.length) {
			  panel.add(buttons[count]);
			  count++;
			}
		 } 
	  }
	  // Clear
	  buttons[0].addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  entry.setText("");
			  c.setResult(0);
			  c.setNumber(0);
			  add = false;
		  }
	  });
	  
	  //Addition
	  buttons[1].addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  String number = entry.getText();
			  c.setNumber(Integer.parseInt(number));
			  c.addition();
			  if(add == true) {
				 entry.setText(""+c.getResult());
				 add = false;
			  }else {
			    entry.setText("");
			    add = true;
			  }  
		  }
	  });
	  
	  //Subtraction
	  buttons[2].addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			 String number = entry.getText();
			 c.setNumber(Integer.parseInt(number));
			 c.subtraction();
			 if(sub == true) {
			   entry.setText(""+c.getResult());
			   sub = false;
			 }else {
			    entry.setText("");
			    sub = true;
			 }   
		  }
	  });
	  
	  //Multiplication
	  buttons[3].addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 String number = entry.getText();
			 c.setNumber(Integer.parseInt(number));
			 c.multiplication();
			 if(mul == true) {
			    entry.setText(""+c.getResult());
			    mul = false;
			 }else {
				entry.setText("");
			 	mul = true;
			 }	
		 }
	  });
	  
	  //Division
	  buttons[4].addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
		     String number = entry.getText();
		     c.setNumber(Integer.parseInt(number));
			 c.division();
			 if(div == true) {
			    entry.setText(""+c.getResult());
				div = false;
			  }else{
				entry.setText("");
				div = true;
			   } 
		  }
	  });
	  
	  //Modulo
	  buttons[5].addActionListener(new ActionListener() {
	     public void actionPerformed(ActionEvent e) {
			 String number = entry.getText();
			 c.setNumber(Integer.parseInt(number));
			 c.modulo();;
			 if(mod == true) {
			    entry.setText(""+c.getResult());
			    mod = false;
			 }else {
				entry.setText("");
			 	mod = true;
			 } 
	     }
	  });
	  
	  //Factorial
	  buttons[6].addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  String number = entry .getText();
			  entry.setText(""+c.fac(Integer.parseInt(number)));
		  }
	  });
	  
	  //Returns result
	  buttons[7].addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  String number = entry.getText();
			  c.setNumber(Integer.parseInt(number));
			  if(add == true) {
				 c.addition();
				 add = false;
				 entry.setText(""+c.getResult());
			  }
			  else if(sub == true) {
				 c.subtraction();
				 sub = false;
				 entry.setText(""+c.getResult());
			  }
			  else if(mul == true) {
				  c.multiplication();
				  mul = false;
				  entry.setText(""+c.getResult());
			  }
			  else if(div == true) {
				  c.division();
				  div = false;
				  entry.setText(""+c.getResult());
			  }
			  else if(mod == true) {
				  c.modulo();
				  mod = false;
				  entry.setText(""+c.getResult());
			  }
		  }
	  });
	  
	  frame.add(panelText, BorderLayout.PAGE_START);
	  frame.add(panel);
	  frame.pack();
	  frame.setSize(400,400);
	  frame.setVisible(true);
  }
  
  public static void main(String [] args) {
	  CalculatorGUI c = new CalculatorGUI();
	  c.create();
  }
}
