import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class InvalidInput extends Start {

	private JPanel contentPane;

	public InvalidInput() {
		
		// Current Frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Retry Login Button, will direct you to Login frame again
		JLabel lblRetryLogin = new JLabel("");
		lblRetryLogin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Login login = new Login();
                login.setVisible(true);
                dispose();
			}
		});
		lblRetryLogin.setBounds(800, 467, 102, 35);
		contentPane.add(lblRetryLogin);
		
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
		lblFB.setBounds(294, 256, 185, 35);
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
		lblIG.setBounds(294, 298, 202, 35);
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
		lblTwt.setBounds(279, 341, 202, 35);
		contentPane.add(lblTwt);
		
		// Sets the background picture of the whole frame
		JLabel imgStart = new JLabel("");
		imgStart.setIcon(new ImageIcon(InvalidInput.class.getResource("/Imgs/Invalid Input.png")));
		imgStart.setBounds(0, 0, 912, 513);
		contentPane.add(imgStart);
	}

}
