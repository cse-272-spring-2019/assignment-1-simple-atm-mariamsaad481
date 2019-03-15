//correct card number is 4503
package atm;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Second_Frame extends JFrame {
	private JPanel contentPane;
	private JTextField txtCancel;
	public static String[]  history=new String[50] ;
	public static int i=0;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second_Frame frame = new Second_Frame(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param var 
	 */
	public Second_Frame(Atmclass var) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText(txtCancel.getText()+ "7");
			}
		});
		btnNewButton.setBounds(20, 60, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText(txtCancel.getText()+"8");
			}
		});
		btnNewButton_1.setBounds(119, 60, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText(txtCancel.getText()+"9");
			}
		});
		btnNewButton_2.setBounds(218, 60, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText(txtCancel.getText()+"4");
			}
		});
		button.setBounds(20, 94, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("5");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText(txtCancel.getText()+"5");
			}
		});
		button_1.setBounds(119, 94, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("6");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText(txtCancel.getText()+"6");
			}
		});
		button_2.setBounds(218, 94, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("1");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText(txtCancel.getText()+"1");
			}
		});
		button_3.setBounds(20, 132, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText(txtCancel.getText()+"2");
			}
		});
		button_4.setBounds(119, 132, 89, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("3");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText(txtCancel.getText()+"3");
			}
		});
		button_5.setBounds(218, 132, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("0");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText(txtCancel.getText()+"0");
			}
		});
		button_6.setBounds(119, 169, 89, 23);
		contentPane.add(button_6);
		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input=txtCancel.getText();	
				double d=Double.parseDouble(input);
				
				{
					//to check that deposit button was hit
				if(Atm_system.c==0)
				{
				var.deposit(d);
				history[i++] = "deposit is  "+d; 
				
				}   
				else
				{
					double m =Double.parseDouble(var.getbalance());
					if(d>m)
					{
						JOptionPane.showMessageDialog(null,"Withdraw amount is greater than balance!");
					}
					 
					else
					{
						var.withdraw(d); 
				history[i++] = "Withdraw is  "+d; 
					}
				}
				}
	
				setVisible(false);
				dispose();
			}
			  
		});
		btnEnter.setBounds(320, 60, 89, 23);
		contentPane.add(btnEnter);
		
		JButton btnDelete = new JButton(".");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText(txtCancel.getText()+".");
			}
		});
		btnDelete.setBounds(320, 132, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCancel.setText("");
			}
		});
		btnCancel.setBounds(317, 94, 89, 23);
		contentPane.add(btnCancel);
		
		txtCancel = new JTextField();
		txtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		txtCancel.setBounds(219, 11, 187, 38);
		contentPane.add(txtCancel);
		txtCancel.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Withdraw/Deposit amount");
		lblNewLabel.setBounds(20, 11, 188, 38);
		contentPane.add(lblNewLabel);
	}
}
