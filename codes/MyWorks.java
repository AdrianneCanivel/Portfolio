import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWorks extends Start {

	private JPanel contentPane;
	
	public MyWorks () {
		
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
		
		// Click this to go to MyWorksVideoEdits1
		JLabel lblVideoEdits = new JLabel("");
		lblVideoEdits.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksVideoEdits1 VE1 = new MyWorksVideoEdits1();
				VE1.setVisible(true);
	            dispose();
			}
		});
		lblVideoEdits.setBounds(89, 234, 213, 233);
		contentPane.add(lblVideoEdits);
		
		// Click this to go to MyWorksGraphicDesign1
		JLabel lblGraphicDesign = new JLabel("");
		lblGraphicDesign.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign1 GD1 = new MyWorksGraphicDesign1();
				GD1.setVisible(true);
	            dispose();
			}
		});
		lblGraphicDesign.setBounds(352, 234, 213, 233);
		contentPane.add(lblGraphicDesign);
		
		// Click this to go to MyWorksPapersandOthers1
		JLabel lblPapersWritten = new JLabel("");
		lblPapersWritten.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksPapersandOthers1 PO1 = new MyWorksPapersandOthers1();
				PO1.setVisible(true);
	            dispose();
			}
		});
		lblPapersWritten.setBounds(612, 234, 213, 233);
		contentPane.add(lblPapersWritten);
		
		// Sets the background picture of the whole frame
		JLabel imgMyWorks = new JLabel("");
		imgMyWorks.setIcon(new ImageIcon(MyWorks.class.getResource("/ab/MyWorksNew.png")));
		imgMyWorks.setBounds(0, 0, 912, 513);
		contentPane.add(imgMyWorks);
	}

}
