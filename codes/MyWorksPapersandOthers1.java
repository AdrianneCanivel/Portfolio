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

public class MyWorksPapersandOthers1 extends Start {

	private JPanel contentPane;

	public MyWorksPapersandOthers1() {
		
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
		
		// Redirect to Full Paper through Desktop Browser
		JLabel GoToLink1 = new JLabel("");
		GoToLink1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/11qBB2bJxSdPxQv3Ni6Iyjx8-cYEFCveS/view?usp=sharing").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		GoToLink1.setBounds(468, 248, 350, 89);
		contentPane.add(GoToLink1);
		
		// Redirect to Full Paper through Desktop Browser
		JLabel GoToLink2 = new JLabel("");
		GoToLink2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/11qBB2bJxSdPxQv3Ni6Iyjx8-cYEFCveS/view?usp=sharing").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		GoToLink2.setBounds(92, 174, 333, 265);
		contentPane.add(GoToLink2);
		
		// lblBack go to MyWorks
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorks Works = new MyWorks();
                Works.setVisible(true);
                dispose();
			}
		});
		lblBack.setBounds(468, 341, 34, 19);
		contentPane.add(lblBack);
		
		// lblNext go to MyWorksPapersandOthers2
		JLabel lblNext = new JLabel("");
		lblNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksPapersandOthers2 PO2 = new MyWorksPapersandOthers2();
				PO2.setVisible(true);
	            dispose();
			}
		});
		lblNext.setBounds(515, 341, 34, 19);
		contentPane.add(lblNext);
		
		// Sets the background picture of the whole frame
		JLabel imgGraphicDesign2 = new JLabel("");
		imgGraphicDesign2.setIcon(new ImageIcon(MyWorksPapersandOthers1.class.getResource("/Imgs/P&O1.png")));
		imgGraphicDesign2.setBounds(0, 0, 912, 513);
		contentPane.add(imgGraphicDesign2);
	}

}
