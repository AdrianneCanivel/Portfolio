import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MyWorksGraphicDesign14 extends Start {

	private JPanel contentPane;

	public MyWorksGraphicDesign14() {

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
		
		// lblViewGD will go to MyWorksGraphicDesign14_1
		JLabel lblViewGD = new JLabel("");
		lblViewGD.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign14_1 GD14_1 = new MyWorksGraphicDesign14_1();
				GD14_1.setVisible(true);
	            dispose();
			}
		});
		lblViewGD.setBounds(68, 138, 544, 307);
		contentPane.add(lblViewGD);
		
		// lblBack go to MyWorksGraphicDesign13
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign13 GD13 = new MyWorksGraphicDesign13();
				GD13.setVisible(true);
	            dispose();
			}
		});
		lblBack.setBounds(790, 463, 34, 27);
		contentPane.add(lblBack);
		
		// lblNext go to MyWorksGraphicDesign15
		JLabel lblNext = new JLabel("");
		lblNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign15 GD15 = new MyWorksGraphicDesign15();
				GD15.setVisible(true);
	            dispose();
			}
		});
		lblNext.setBounds(834, 463, 34, 27);
		contentPane.add(lblNext);
		
		// Sets the background picture of the whole frame
		JLabel imgGraphicDesign2 = new JLabel("");
		imgGraphicDesign2.setIcon(new ImageIcon(MyWorksGraphicDesign14.class.getResource("/newnew/14GD.png")));
		imgGraphicDesign2.setBounds(0, 0, 912, 513);
		contentPane.add(imgGraphicDesign2);
	}

}
