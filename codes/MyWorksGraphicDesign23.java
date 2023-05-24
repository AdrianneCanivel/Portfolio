import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MyWorksGraphicDesign23 extends Start {

	private JPanel contentPane;

	public MyWorksGraphicDesign23() {
		
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
		
		// lblViewFull will go to MyWorksGraphicDesign23_1
		JLabel lblViewFull = new JLabel("");
		lblViewFull.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				MyWorksGraphicDesign23_1 GD23 = new MyWorksGraphicDesign23_1();
				GD23.setVisible(true);
	            dispose();
                
			}
		});
		lblViewFull.setBounds(172, 139, 255, 322);
		contentPane.add(lblViewFull);
		
		// lblBack go to MyWorksGraphicDesign22
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign22 GD22 = new MyWorksGraphicDesign22();
				GD22.setVisible(true);
	            dispose();
			}
		});
		lblBack.setBounds(793, 461, 34, 27);
		contentPane.add(lblBack);
		
		// lblNext go to MyWorks
		JLabel lblNext = new JLabel("");
		lblNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorks Works = new MyWorks();
				Works.setVisible(true);
	            dispose();
			}
		});
		lblNext.setBounds(837, 461, 34, 27);
		contentPane.add(lblNext);
		
		// Sets the background picture of the whole frame
		JLabel imgGraphicDesign2 = new JLabel("");
		imgGraphicDesign2.setIcon(new ImageIcon(MyWorksGraphicDesign23.class.getResource("/newnew/23GD.png")));
		imgGraphicDesign2.setBounds(0, 0, 912, 513);
		contentPane.add(imgGraphicDesign2);
	}

}
