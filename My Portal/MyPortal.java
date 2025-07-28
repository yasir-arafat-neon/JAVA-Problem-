import java.lang.*;
import javax.swing.*;
public class MyPortal
{
	private JFrame f;
	private JButton b1,b2;
	private JTextField t1;
	private JLabel l1,l2;
	private JPasswordField t2;
	private ImageIcon i;
	private JLabel background;
	private JPanel boarder;
	public MyPortal()
	{
		
         
         
        
		f  = new JFrame("My Portal");
		b1 = new JButton("Login");
        b2 = new JButton("Registration");
        l1 = new JLabel("User Name:");
		l2 = new JLabel("Password:");
		t1 = new JTextField();
		t2 = new JPasswordField();
		i  = new ImageIcon("BG.jpg");
		background = new JLabel();
		background.setIcon(i);
		
		
		b1.setBounds(250,250,110,30);
		b2.setBounds(400,250,110,30);
		l1.setBounds(250,100,95,30);
		l2.setBounds(250,150,95,30);
		t1.setBounds(350,100,95,30);
		t2.setBounds(350,150,95,30);
		background.setBounds(0,0,800,500);
		
		
		
		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.add(background);
		
		f.setSize(800,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}