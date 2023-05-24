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

public class MyWorksVideoEdits3 extends Start {

	private JPanel contentPane;

	public MyWorksVideoEdits3() {
		
		// Current Frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Back to my Works Button, goes to MyWorks Frame
		JLabel lblBackToMyWorks = new JLabel("");
		lblBackToMyWorks.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorks Works = new MyWorks();
                Works.setVisible(true);
                dispose();
			}
		});
		lblBackToMyWorks.setBounds(25, 22, 115, 27);
		contentPane.add(lblBackToMyWorks);
		
		// Adrianne button, goes to Contact3 Frame
		JLabel lblAdrianne = new JLabel("");
		lblAdrianne.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Contact3 ContactThree = new Contact3();
				ContactThree.setVisible(true);
	            dispose();
			}
		});
		lblAdrianne.setBounds(793, 11, 94, 48);
		contentPane.add(lblAdrianne);
		
		// Redirect to Video through Desktop Browser
		JLabel GoToLink1 = new JLabel("");
		GoToLink1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/16EOrqzEvuFBmUOZzkjg2A2WXRxu1NRc_/view?usp=share_link").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		GoToLink1.setBounds(565, 255, 228, 37);
		contentPane.add(GoToLink1);
		
		// Redirect to Video through Desktop Browser
		JLabel GoToLink2 = new JLabel("");
		GoToLink2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/16EOrqzEvuFBmUOZzkjg2A2WXRxu1NRc_/view?usp=share_link").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		GoToLink2.setBounds(149, 176, 388, 220);
		contentPane.add(GoToLink2);
		
		// lblBack go to MyWorksVideoEdits2
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksVideoEdits2 VE2 = new MyWorksVideoEdits2();
				VE2.setVisible(true);
	            dispose();
			}
		});
		lblBack.setBounds(577, 298, 34, 19);
		contentPane.add(lblBack);
		
		// lblNext go to MyWorksVideoEdits4
		JLabel lblNext = new JLabel("");
		lblNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksVideoEdits4 VE4 = new MyWorksVideoEdits4();
				VE4.setVisible(true);
	            dispose();
			}
		});
		lblNext.setBounds(623, 298, 34, 19);
		contentPane.add(lblNext);
		
		// Sets the background picture of the whole frame
		JLabel imgGraphicDesign2 = new JLabel("");
		imgGraphicDesign2.setIcon(new ImageIcon(MyWorksVideoEdits3.class.getResource("/Imgs/VE3.png")));
		imgGraphicDesign2.setBounds(0, 0, 912, 513);
		contentPane.add(imgGraphicDesign2);
	}

}
