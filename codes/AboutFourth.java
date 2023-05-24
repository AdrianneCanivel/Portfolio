import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AboutFourth extends Start {

	private JPanel contentPane;

	public AboutFourth() {
		
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
		lblHome.setBounds(21, 28, 46, 20);
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
		lblWork.setBounds(77, 28, 56, 20);
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
		lblAbout.setBounds(143, 28, 46, 20);
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
		lblContact.setBounds(205, 28, 56, 20);
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
		
		// Click1 to AboutFirst
		JLabel lbl1 = new JLabel("");
		lbl1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AboutFirst About1st = new AboutFirst();
				About1st.setVisible(true);
	            dispose();
			}
		});
		lbl1.setBounds(385, 466, 23, 20);
		contentPane.add(lbl1);
		
		// Click2 to AboutSecond
		JLabel lbl_2 = new JLabel("");
		lbl_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AboutSecond About2nd = new AboutSecond();
				About2nd.setVisible(true);
	            dispose();
			}
		});
		lbl_2.setBounds(415, 466, 23, 20);
		contentPane.add(lbl_2);
		
		// Click3 to AboutThird
		JLabel lbl_3 = new JLabel("");
		lbl_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AboutThird About3rd = new AboutThird();
				About3rd.setVisible(true);
	            dispose();
			}
		});
		lbl_3.setBounds(448, 466, 23, 20);
		contentPane.add(lbl_3);
		
		// Click4 to AboutFourth
		JLabel lbl_4 = new JLabel("");
		lbl_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AboutFourth About4th = new AboutFourth();
				About4th.setVisible(true);
	            dispose();
			}
		});
		lbl_4.setBounds(473, 466, 23, 20);
		contentPane.add(lbl_4);
		
		// Click5 to AboutFifth
		JLabel lbl_5 = new JLabel("");
		lbl_5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AboutFifth About5th = new AboutFifth();
				About5th.setVisible(true);
	            dispose();
			}
		});
		lbl_5.setBounds(505, 466, 23, 20);
		contentPane.add(lbl_5);
		
		// Sets the background picture of the whole frame
		JLabel imgAboutSecond = new JLabel("");
		imgAboutSecond.setIcon(new ImageIcon(AboutFourth.class.getResource("/ab/4AB.png")));
		imgAboutSecond.setBounds(0, 0, 912, 513);
		contentPane.add(imgAboutSecond);
	}
}
