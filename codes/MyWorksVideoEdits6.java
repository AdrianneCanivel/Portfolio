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

public class MyWorksVideoEdits6 extends Start {

	private JPanel contentPane;

	public MyWorksVideoEdits6() {
		
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
					Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1RzTC1fElPmFoD_Bby3U4n4R0To6kZKxQ/view?usp=share_link").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		GoToLink1.setBounds(494, 255, 330, 33);
		contentPane.add(GoToLink1);

		// Redirect to Video through Desktop Browser
		JLabel GoToLink2 = new JLabel("");
		GoToLink2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1RzTC1fElPmFoD_Bby3U4n4R0To6kZKxQ/view?usp=share_link").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		GoToLink2.setBounds(83, 179, 388, 220);
		contentPane.add(GoToLink2);
		
		// lblBack go to MyWorksVideoEdits5
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksVideoEdits5 VE5 = new MyWorksVideoEdits5();
				VE5.setVisible(true);
	            dispose();
			}
		});
		lblBack.setBounds(494, 299, 38, 19);
		contentPane.add(lblBack);
		
		// lblNext go to MyWorksVideoEdits7
		JLabel lblNext = new JLabel("");
		lblNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksVideoEdits7 VE7 = new MyWorksVideoEdits7();
				VE7.setVisible(true);
	            dispose();
			}
		});
		lblNext.setBounds(542, 299, 34, 19);
		contentPane.add(lblNext);
		
		// Sets the background picture of the whole frame
		JLabel imgGraphicDesign2 = new JLabel("");
		imgGraphicDesign2.setIcon(new ImageIcon(MyWorksVideoEdits6.class.getResource("/Imgs/VE6.png")));
		imgGraphicDesign2.setBounds(0, 0, 912, 513);
		contentPane.add(imgGraphicDesign2);
	}

}
