import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MyWorksGraphicDesign8_2 extends Start {

	private JPanel contentPane;

	public MyWorksGraphicDesign8_2() {
		
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
		
		// Click lbl1 to MyWorksGraphicDesign8_1
		JLabel lbl1 = new JLabel("");
		lbl1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign8_1 GD8_1 = new MyWorksGraphicDesign8_1();
				GD8_1.setVisible(true);
	            dispose();
			}
		});
		lbl1.setBounds(433, 425, 19, 27);
		contentPane.add(lbl1);
		
		// Click lbl2 to MyWorksGraphicDesign8_2
		JLabel lbl2 = new JLabel("");
		lbl2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign8_2 GD8_2 = new MyWorksGraphicDesign8_2();
				GD8_2.setVisible(true);
	            dispose();
			}
		});
		lbl2.setBounds(458, 425, 19, 27);
		contentPane.add(lbl2);
		
		// Click backToMainGD to go back to MyGraphicDesign8
		JLabel backToMainGD = new JLabel("");
		backToMainGD.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign8 GD8 = new MyWorksGraphicDesign8();
				GD8.setVisible(true);
	            dispose();
			}
		});
		backToMainGD.setBounds(837, 464, 65, 38);
		contentPane.add(backToMainGD);
		
		// Sets the background picture of the whole frame
		JLabel imgGraphicDesign2 = new JLabel("");
		imgGraphicDesign2.setIcon(new ImageIcon(MyWorksGraphicDesign8_2.class.getResource("/newnew/08_2GD.png")));
		imgGraphicDesign2.setBounds(0, 0, 912, 513);
		contentPane.add(imgGraphicDesign2);
	}

}
