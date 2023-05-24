import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Contact2 extends Start {

	private JPanel contentPane;

	public Contact2() {
		
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
		
		// Redirect to my FB Account through Desktop Browser
		JLabel lblFB = new JLabel("");
		lblFB.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.facebook.com/profile.php?id=100009184617048&mibextid=LQQJ4d").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		lblFB.setBounds(473, 246, 185, 35);
		contentPane.add(lblFB);
		
		// Redirect to my IG Account through Desktop Browser
		JLabel lblIG = new JLabel("");
		lblIG.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://instagram.com/adrianne_bleu?igshid=NTc4MTIwNjQ2YQ==").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		lblIG.setBounds(469, 292, 202, 35);
		contentPane.add(lblIG);
		
		// Redirect to my Twitter Account through Desktop Browser
		JLabel lblTwt = new JLabel("");
		lblTwt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://twitter.com/eybibleu/").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		lblTwt.setBounds(458, 338, 202, 35);
		contentPane.add(lblTwt);
		
		// Sets the background picture of the whole frame
		JLabel imgGraphicDesign2 = new JLabel("");
		imgGraphicDesign2.setIcon(new ImageIcon(Contact2.class.getResource("/Imgs/Contact2.png")));
		imgGraphicDesign2.setBounds(0, 0, 912, 513);
		contentPane.add(imgGraphicDesign2);
	}

}
