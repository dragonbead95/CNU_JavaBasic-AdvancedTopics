import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorTest extends JFrame{
	private JTextField jt1;
	private JButton jb_on,jb_off;
	private JButton[] jb_key;
	private StringBuffer buf = new StringBuffer();
	private double op1=0;
	private String exp=null;
	
	public CalculatorTest()
	{
		setTitle("°è»ê±â");
		
		setLayout(new BorderLayout(10,10));
		showNorth();
		showCenter();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,300);
		setVisible(true);
	}
	
	private void showNorth()
	{
		JPanel p1 = new JPanel();
		jt1 = new JTextField(15);
		
		p1.add(jt1);
		add(p1,BorderLayout.NORTH);
	}
	
	private void showCenter()
	{
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel panel = new JPanel();
		
		jb_on = new JButton("on");
		jb_off = new JButton("off");
		jb_key = new JButton[16];
		String[] list = new String[] {"7","8","9","+",
										"4","5","6","-",
										"1","2","3","*",
										"0",".","=","/"};
		
		p2.setLayout(new GridLayout(4,4,10,10));
		
		for(int i=0;i<jb_key.length;i++)
		{
			p2.add(jb_key[i] = new JButton(list[i]));
		}
		
		ActionListener listener1 = e->{
			if(e.getSource()==jb_on)
				set_on();
			else if(e.getSource()==jb_off)
				set_off();
		};
		
		ActionListener listener2 = e->{
			for(int i=0;i<jb_key.length;i++)
			{
				if(e.getSource()==jb_key[i])
				{
					if(jb_key[i].getText()=="0") {
						showNumber("0");
					}else if(jb_key[i].getText()=="1") {
						showNumber("1");
					}else if(jb_key[i].getText()=="2") {
						showNumber("2");
					}else if(jb_key[i].getText()=="3") {
						showNumber("3");
					}else if(jb_key[i].getText()=="4") {
						showNumber("4");
					}else if(jb_key[i].getText()=="5") {
						showNumber("5");
					}else if(jb_key[i].getText()=="6") {
						showNumber("6");
					}else if(jb_key[i].getText()=="7") {
						showNumber("7");
					}else if(jb_key[i].getText()=="8") {
						showNumber("8");
					}else if(jb_key[i].getText()=="9") {
						showNumber("9");
					}else if(jb_key[i].getText()==".") {
						showNumber(".");
					}
					else {
						if(jb_key[i].getText()=="+") {
							double temp = Double.parseDouble(jt1.getText());
							cal(temp,"+");
						}
						else if(jb_key[i].getText()=="-") {
							double temp = Double.parseDouble(jt1.getText());
							cal(temp,"-");
						}
						else if(jb_key[i].getText()=="*") {
							double temp = Double.parseDouble(jt1.getText());
							cal(temp,"*");
						}
						else if(jb_key[i].getText()=="/") {
							double temp = Double.parseDouble(jt1.getText());
							cal(temp,"/");
						}
						else if(jb_key[i].getText()=="=") {
							double temp = Double.parseDouble(jt1.getText());
							cal(temp,exp);
							DecimalFormat format = new DecimalFormat(".#");
							String result = format.format(op1);
							jt1.setText("result : " + result);
							op1 = 0;
							exp = null;
						}
					}
				}
			}
		};
		jb_on.addActionListener(listener1);
		jb_off.addActionListener(listener1);
		for(int i=0;i<jb_key.length;i++) {
			jb_key[i].addActionListener(listener2);
		}
		
		p1.add(jb_on);
		p1.add(jb_off);
		panel.add(p1);
		panel.add(p2);
		add(panel,BorderLayout.CENTER);
	}
	
	void showNumber(String number)
	{
		buf.append(number);
		jt1.setText(buf.toString());
	}
	
	void cal(double temp, String exp)
	{
		if(this.exp!=null)
		{
			if(this.exp.equals("+"))
				op1 = op1 + temp;
			else if(this.exp.equals("-"))
				op1 = op1 - temp;
			else if(this.exp.equals("*"))
				op1 = op1 * temp;
			else if(this.exp.equals("/"))
				op1 = op1 / temp;
			
			jt1.setText(op1+"");
			this.exp = exp;
			buf.setLength(0);
		}else {
			this.op1 = temp;
			this.exp = exp;
			buf.setLength(0);
		}
		
	}
	
	void set_on()
	{
		jt1.setText("0");
		exp = null;
		op1 = 0;
		buf.setLength(0);
	}
	
	void set_off()
	{
		jt1.setText("");
		exp = null;
		op1 = 0;
		buf.setLength(0);
	}
}
