import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	
	double intI;
	double intII;
	double total;
	
	String action;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 0, 0));
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 15));
		textField.setBounds(10, 11, 364, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnx2 = new JButton("x^2");
		btnx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double d=Double.parseDouble(textField.getText());
				textField.setText(d+"^2="+d*d);
			}
		});
		btnx2.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 8));
		btnx2.setBounds(10, 79, 51, 47);
		frame.getContentPane().add(btnx2);
		
		JButton btnsqrt = new JButton("√x");
		btnsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double d=Double.parseDouble(textField.getText());
				textField.setText("√"+d+"="+Math.sqrt(d));
			}
		});
		btnsqrt.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnsqrt.setBounds(10, 195, 51, 47);
		frame.getContentPane().add(btnsqrt);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				action="x^y";
				intI=Double.parseDouble(textField.getText());
				textField.setText("enter y and press \"=\" :");
			}
		});
		btnXy.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 8));
		btnXy.setBounds(10, 253, 51, 47);
		frame.getContentPane().add(btnXy);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(""+Math.log(Double.parseDouble(textField.getText())));
			}
		});
		btnLog.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnLog.setBounds(10, 311, 51, 47);
		frame.getContentPane().add(btnLog);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btn1.setBounds(71, 79, 51, 47);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btn2.setBounds(71, 137, 51, 47);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btn3.setBounds(71, 195, 51, 47);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btn4.setBounds(132, 79, 51, 47);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btn5.setBounds(132, 137, 51, 47);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btn6.setBounds(132, 195, 51, 47);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btn7.setBounds(193, 79, 51, 47);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btn8.setBounds(193, 137, 51, 47);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btn9.setBounds(193, 195, 51, 47);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 15));
		btn0.setBounds(71, 253, 112, 47);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 18));
		btndot.setBounds(193, 253, 51, 47);
		frame.getContentPane().add(btndot);
		
		JButton btnX3 = new JButton("x^3");
		btnX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double d=Double.parseDouble(textField.getText());
				textField.setText(d+"^3="+(d*d)*d);
			}
		});
		btnX3.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 8));
		btnX3.setBounds(10, 137, 51, 47);
		frame.getContentPane().add(btnX3);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI=Double.parseDouble(textField.getText());
				textField.setText("");
				action="+";
			}
		});
		btnAdd.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnAdd.setBounds(254, 79, 51, 47);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI=Double.parseDouble(textField.getText());
				textField.setText("");
				action="-";
			}
		});
		btnSub.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnSub.setBounds(254, 137, 51, 47);
		frame.getContentPane().add(btnSub);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI=Double.parseDouble(textField.getText());
				textField.setText("");
				action="/";
			}
		});
		btnDiv.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnDiv.setBounds(254, 195, 51, 47);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI=Double.parseDouble(textField.getText());
				textField.setText("");
				action="*";
			}
		});
		btnMul.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnMul.setBounds(254, 253, 51, 47);
		frame.getContentPane().add(btnMul);
		
		JButton btnAns = new JButton("=");
		btnAns.setForeground(new Color(255, 255, 255));
		btnAns.setBackground(new Color(0, 0, 0));
		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(action.equals("x^y")) {
					String s=textField.getText();
					s=s.substring(23);
					intII=Double.parseDouble(s);
					Double d=intI;
					Double d1=intII;
					while(intII>1) {
						intI*=d;
						intII--;
					}
					textField.setText(d+"^"+d1+"="+intI);
				}
				if(action.equals("Sin")) {
					String s=textField.getText();
					textField.setText("");
					s=s.substring(9);
					Double d=Double.parseDouble(s);
					textField.setText("Sin("+d+") = "+Math.sin(d));
				}
				else if(action.equals("Cos")) {
					String s=textField.getText();
					textField.setText("");
					s=s.substring(9);
					Double d=Double.parseDouble(s);
					textField.setText("Cos("+d+") = "+Math.cos(d));
				}
				else if(action.equals("Tan")) {
					String s=textField.getText();
					textField.setText("");
					s=s.substring(9);
					Double d=Double.parseDouble(s);
					textField.setText("Tan("+d+") = "+Math.tan(d));
				}
				else {
					intII=Double.parseDouble(textField.getText());
					if(action.equals("+")) {
						total=intI+intII;
						answer=String.format("%.1f + %.1f = %.2f", intI,intII,total);
						textField.setText(answer);
					}
					else if(action.equals("-")) {
						total=intI-intII;
						answer=String.format("%.1f - %.1f = %.2f", intI,intII,total);
						textField.setText(answer);
					}
					else if(action.equals("*")) {
						total=intI*intII;
						answer=String.format("%.1f * %.1f = %.2f", intI,intII,total);
						textField.setText(answer);
					}
					else if(action.equals("/")) {
						total=intI/intII;
						answer=String.format("%.1f / %.1f = %.2f", intI,intII,total);
						textField.setText(answer);
					}
					else if(action.equals("%")) {
						total=intI%intII;
						answer=String.format("%.1f mod %.1f = %.2f", intI,intII,total);
						textField.setText(answer);
					}
				}
			}
		});
		btnAns.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 15));
		btnAns.setBounds(132, 311, 112, 47);
		frame.getContentPane().add(btnAns);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI=Double.parseDouble(textField.getText());
				textField.setText("");
				action="%";
			}
		});
		btnMod.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnMod.setBounds(254, 311, 51, 47);
		frame.getContentPane().add(btnMod);
		
		JButton btnFact = new JButton("x!");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double d=Double.parseDouble(textField.getText());
				if(d==0 || d==1) {
					textField.setText(d+"!=1");
				}
				else {
					Double a=d;
					double x=d-1;
					while(x>1) {
						d*=x;
						x--;
					}
					textField.setText(a+"!="+d);
				}
			}
		});
		btnFact.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnFact.setBounds(71, 311, 51, 47);
		frame.getContentPane().add(btnFact);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnC.setBounds(315, 79, 59, 47);
		frame.getContentPane().add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bck=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bck=str.toString();
					textField.setText(bck);
				}
			}
		});
		btnB.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnB.setBounds(315, 137, 59, 47);
		frame.getContentPane().add(btnB);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action="Sin";
				textField.setText("Sin(x),x=");
			}
		});
		btnSin.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnSin.setBounds(315, 195, 59, 47);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("Cos(x),x=");
				action="Cos";
			}
		});
		btnCos.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnCos.setBounds(315, 253, 59, 47);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("Tan(x),x=");
				action="Tan";
			}
		});
		btnTan.setFont(new Font("Segoe UI Variable", Font.BOLD | Font.ITALIC, 10));
		btnTan.setBounds(315, 311, 59, 47);
		frame.getContentPane().add(btnTan);
	}
}
