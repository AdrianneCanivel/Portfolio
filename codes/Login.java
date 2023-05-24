import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends Start {
	
	// Private instance variables
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtEmail;
	private JPasswordField passwordField;

	public Login() {
		
		// Current Frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Name Text Field
		txtName = new JTextField();
		txtName.setBounds(459, 175, 371, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		// Email Text Field
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(459, 238, 371, 20);
		contentPane.add(txtEmail);
		
		// Password Field
		passwordField = new JPasswordField();
		passwordField.setBounds(459, 302, 371, 20);
		contentPane.add(passwordField);
	
		
		// Submit button, declares the if else condition
		JLabel lblSubmit = new JLabel("");
		lblSubmit.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {
		        String name = txtName.getText();
		        String email = txtEmail.getText();
		        String password = new String(passwordField.getPassword());
		        if(name.equals("Adrianne Bleu") && email.equals("adrianne.canivel@gmail.com") && password.equals("1234")) {
		            Welcome welcome = new Welcome();
		            welcome.setVisible(true);
		            dispose();
		        } else {
		            InvalidInput invalid = new InvalidInput();
		            invalid.setVisible(true);
		            dispose();
		        }
		    }
		});
		lblSubmit.setBounds(770, 344, 76, 20);
		contentPane.add(lblSubmit);
		
		// Sets the background picture of the whole frame
		JLabel imgLogin = new JLabel("");
		imgLogin.setIcon(new ImageIcon(Login.class.getResource("/Imgs/Login.png")));
		imgLogin.setBounds(0, 0, 912, 513);
		contentPane.add(imgLogin);
	}
}
