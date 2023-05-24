import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;

public class Contact1 extends Start {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtContactNumber;
	private JTextField txtMessage;

	public Contact1() {
		
		// Current Frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Home button, goes to Home Frame
		JLabel lblHome = new JLabel("");
		lblHome.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.setVisible(true);
	            dispose();
			}
		});
		lblHome.setBounds(21, 31, 46, 20);
		contentPane.add(lblHome);
		
		// MyWorks button, goes to MyWorks Frame
		JLabel lblWork = new JLabel("");
		lblWork.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorks Works = new MyWorks();
                Works.setVisible(true);
                dispose();
			}
		});
		lblWork.setBounds(77, 31, 56, 20);
		contentPane.add(lblWork);

		// About button, goes to AboutFirst Frame
		JLabel lblAbout = new JLabel("");
		lblAbout.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AboutFirst About = new AboutFirst();
				About.setVisible(true);
	            dispose();
			}
		});
		lblAbout.setBounds(143, 31, 46, 20);
		contentPane.add(lblAbout);
		
		// Contact button, goes to Contact1 Frame
		JLabel lblContact = new JLabel("");
		lblContact.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Contact1 Contact = new Contact1();
				Contact.setVisible(true);
	            dispose();
			}
		});
		lblContact.setBounds(205, 31, 56, 20);
		contentPane.add(lblContact);
		
		// Adrianne button, goes to Contact3 Frame
		JLabel lblAdrianne = new JLabel("");
		lblAdrianne.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Contact3 ContactThree = new Contact3();
				ContactThree.setVisible(true);
	            dispose();
			}
		});
		lblAdrianne.setBounds(796, 11, 106, 48);
		contentPane.add(lblAdrianne);
	    
		// Name Text Field
		txtName = new JTextField();
		txtName.setBounds(492, 151, 369, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		// Email Text Field
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(492, 214, 369, 20);
		contentPane.add(txtEmail);
		
		// Contact Number Text Field
		txtContactNumber = new JTextField();
		txtContactNumber.setColumns(10);
		txtContactNumber.setBounds(492, 277, 369, 20);
		contentPane.add(txtContactNumber);
		
		// Message Text Field
		txtMessage = new JTextField();
		txtMessage.setColumns(10);
		txtMessage.setBounds(492, 340, 369, 102);
		contentPane.add(txtMessage);
		
		// Submit Button, will direct to Contact2 Frame if clicked
		JLabel lblSubmit = new JLabel("");
		lblSubmit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Contact2 ContactTwo = new Contact2();
				ContactTwo.setVisible(true);
	            dispose();
			}
		});
		lblSubmit.setBounds(649, 453, 74, 25);
		contentPane.add(lblSubmit);
		
		// Sets the background picture of the whole frame
		JLabel imgGraphicDesign2 = new JLabel("");
		imgGraphicDesign2.setIcon(new ImageIcon(Contact1.class.getResource("/Imgs/Contact1.png")));
		imgGraphicDesign2.setBounds(0, 0, 912, 513);
		contentPane.add(imgGraphicDesign2);
	}
}
