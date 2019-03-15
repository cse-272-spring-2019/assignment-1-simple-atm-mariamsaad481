//correct card number is 4503
package atm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Atm_system {

    private JFrame frame;
	private JLabel lblMessage;
	private JTextField textField;
	private JButton btnBalance;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnWithdraw;
	private JButton btnDeposit;
	//C is a just a variable to check which button was pressed.
	public static int c;
;
	
    /**
	 * Launch the application.
	 */
Atmclass var = new Atmclass("10.5");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atm_system window = new Atm_system();
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
	public Atm_system() {
		initialize();
		btnBalance.setEnabled(false);
		btnNewButton_1.setEnabled(false);
		btnNewButton_2.setEnabled(false);
		btnWithdraw.setEnabled(false);
		btnDeposit.setEnabled(false);
		
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 290);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(52, 11, 130, 128);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnBalance = new JButton("Balance");
		btnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMessage.setText(var.getbalance());
			}
		});
		btnBalance.setBounds(10, 11, 109, 29);
		panel.add(btnBalance);
		btnNewButton_1 = new JButton("Previous");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Second_Frame.i--;
	            lblMessage.setText(Second_Frame.history[(Second_Frame.i)]);
			}
		});
		btnNewButton_1.setBounds(10, 51, 109, 29);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Next");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Second_Frame.i++;
				  lblMessage.setText(Second_Frame.history[(Second_Frame.i)]);
			}
		});
		btnNewButton_2.setBounds(10, 88, 109, 29);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(214, 11, 248, 128);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblMessage = new JLabel("Current Balance ");
		lblMessage.setBounds(10, 11, 177, 34);
		panel_1.add(lblMessage);		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMessage.setText("Current Balance");
			}
		});
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(53, 36, 134, 50);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterCardNumber = new JLabel("Card Number");
		lblEnterCardNumber.setBounds(85, 84, 86, 20);
		panel_1.add(lblEnterCardNumber);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(494, 11, 130, 128);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		 btnDeposit = new JButton("Deposit");
		 btnDeposit.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		c=0;
		 		Second_Frame secfram=new Second_Frame(var);
		 		secfram.setVisible(true);	
		 		
		 	}
		 });
		btnDeposit.setBounds(10, 11, 109, 46);
		panel_2.add(btnDeposit);
		
		btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setBounds(10, 68, 109, 49);
		panel_2.add(btnWithdraw);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num;
				try {
					num=Integer.parseInt(textField.getText());
					if (num==4503)
					{
						btnBalance.setEnabled(true);
						btnNewButton_1.setEnabled(true);
						btnNewButton_2.setEnabled(true);
						btnWithdraw.setEnabled(true);
						btnDeposit.setEnabled(true);
						
					}
					else 
					{
				    textField.setText("Invalid Number!");
					btnBalance.setEnabled(false);
					btnNewButton_1.setEnabled(false);
					btnNewButton_2.setEnabled(false);
					btnWithdraw.setEnabled(false);
					btnDeposit.setEnabled(false);
					}
					
					 
			}
				catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null,"Pleae Enter A Valid Number!");
					
				}
			}
				
		});
		btnEnter.setBounds(282, 164, 116, 48);
		frame.getContentPane().add(btnEnter);
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=1;
				Second_Frame secfram=new Second_Frame(var);
		 		secfram.setVisible(true);
		 		
			}
		});
	}
}
