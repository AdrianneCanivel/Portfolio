import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MyWorksGraphicDesign16 extends Start {

	private JPanel contentPane;

	public MyWorksGraphicDesign16() {
		
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
		
		// lblViewGD will go to MyWorksGraphicDesign16_1
		JLabel lblViewGD = new JLabel("");
		lblViewGD.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign16_1 GD16_1 = new MyWorksGraphicDesign16_1();
				GD16_1.setVisible(true);
	            dispose();
			}
		});
		lblViewGD.setBounds(211, 132, 234, 321);
		contentPane.add(lblViewGD);
		
		// lblBack go to MyWorksGraphicDesign15
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign15 GD15 = new MyWorksGraphicDesign15();
				GD15.setVisible(true);
	            dispose();
			}
		});
		lblBack.setBounds(793, 462, 34, 27);
		contentPane.add(lblBack);
		
		// lblNext go to MyWorksGraphicDesign17
		JLabel lblNext = new JLabel("");
		lblNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign17 GD17 = new MyWorksGraphicDesign17();
				GD17.setVisible(true);
	            dispose();
			}
		});
		lblNext.setBounds(837, 462, 34, 27);
		contentPane.add(lblNext);
		
		// Sets the background picture of the whole frame
		JLabel imgGraphicDesign2 = new JLabel("");
		imgGraphicDesign2.setIcon(new ImageIcon(MyWorksGraphicDesign16.class.getResource("/newnew/16GD.jpg")));
		imgGraphicDesign2.setBounds(0, 0, 912, 513);
		contentPane.add(imgGraphicDesign2);
	}

}
