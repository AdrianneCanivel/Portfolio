import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends Start {

	protected JPanel contentPane;
	
	public Home () {

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
		JLabel lbladrianne = new JLabel("");
		lbladrianne.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Contact3 c3 = new Contact3();
				c3.setVisible(true);
                dispose();
			}
		});
		lbladrianne.setBounds(796, 11, 106, 48);
		contentPane.add(lbladrianne);
		
		// Arrow button, goes to MyWorks Frame (Next Frame after Home)
		JLabel lblArrow = new JLabel("");
		lblArrow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorks Works = new MyWorks();
                Works.setVisible(true);
                dispose();
			}
		});
		lblArrow.setBounds(439, 454, 40, 48);
		contentPane.add(lblArrow);
		
		// Sets the background picture of the whole frame
		JLabel imgHome = new JLabel("");
		imgHome.setIcon(new ImageIcon(Home.class.getResource("/ab/HomeNew.png")));
		imgHome.setBounds(0, 0, 912, 513);
		contentPane.add(imgHome);
		
	}

}

	
	
