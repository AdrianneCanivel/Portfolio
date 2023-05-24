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

public class MyWorksVideoEdits7 extends Start {

	private JPanel contentPane;

	public MyWorksVideoEdits7() {
		
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
					Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/12QP718wBWeHGRc2AQRcev4qGXiSGFsFQ/view?usp=share_link").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		GoToLink1.setBounds(529, 255, 259, 27);
		contentPane.add(GoToLink1);
		
		// Redirect to Video through Desktop Browser
		JLabel GoToLink2 = new JLabel("");
		GoToLink2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/12QP718wBWeHGRc2AQRcev4qGXiSGFsFQ/view?usp=share_link").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		GoToLink2.setBounds(117, 172, 388, 220);
		contentPane.add(GoToLink2);
		
		// lblBack go to MyWorksVideoEdits6
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksVideoEdits6 VE6 = new MyWorksVideoEdits6();
				VE6.setVisible(true);
	            dispose();
			}
		});
		lblBack.setBounds(528, 293, 38, 19);
		contentPane.add(lblBack);
		
		// lblNext go to MyWorksVideoEdits8
		JLabel lblNext = new JLabel("");
		lblNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksVideoEdits8 VE8 = new MyWorksVideoEdits8();
				VE8.setVisible(true);
	            dispose();
			}
		});
		lblNext.setBounds(576, 293, 34, 19);
		contentPane.add(lblNext);
		
		// Sets the background picture of the whole frame
		JLabel imgGraphicDesign2 = new JLabel("");
		imgGraphicDesign2.setIcon(new ImageIcon(MyWorksVideoEdits7.class.getResource("/Imgs/VE7.png")));
		imgGraphicDesign2.setBounds(0, 0, 912, 513);
		contentPane.add(imgGraphicDesign2);
	}

}
