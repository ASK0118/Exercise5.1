import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Exercise5p1 {

	private JFrame frame;
	private JTextField IntTextField;
	private JTextField InttextField;
	private JTextField AnswertextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5p1 window = new Exercise5p1();
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
	public Exercise5p1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 545, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddition = new JButton("Add");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,answer;
				try {
					  num1 = Integer.parseInt(IntTextField.getText());
					  num2 = Integer.parseInt(InttextField.getText());
					  
					  answer = num1+num2;
					  AnswertextField.setText(Integer.toString(answer));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the integer correctly");
				}
			}
		});
		btnAddition.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAddition.setBounds(101, 113, 135, 35);
		frame.getContentPane().add(btnAddition);
		
		JButton btnMinus = new JButton("Minus");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,answer;
				try {
					  num1 = Integer.parseInt(IntTextField.getText());
					  num2 = Integer.parseInt(InttextField.getText());
					  
					  answer = num1-num2;
					  AnswertextField.setText(Integer.toString(answer));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the integer correctly");
				}
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMinus.setBounds(326, 113, 135, 35);
		frame.getContentPane().add(btnMinus);
		
		IntTextField = new JTextField();
		IntTextField.setBounds(101, 65, 135, 35);
		frame.getContentPane().add(IntTextField);
		IntTextField.setColumns(10);
		
		InttextField = new JTextField();
		InttextField.setColumns(10);
		InttextField.setBounds(326, 65, 135, 35);
		frame.getContentPane().add(InttextField);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblAnswer.setBounds(145, 212, 91, 35);
		frame.getContentPane().add(lblAnswer);
		
		AnswertextField = new JTextField();
		AnswertextField.setColumns(10);
		AnswertextField.setBounds(283, 216, 135, 35);
		frame.getContentPane().add(AnswertextField);
	}
}
