import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MyWorksGraphicDesign4 extends Start {

	private JPanel contentPane;

	public MyWorksGraphicDesign4() {
		
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
		
		// lblBack go to MyWorksGraphicDesign3
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign3 GD3 = new MyWorksGraphicDesign3();
				GD3.setVisible(true);
	            dispose();
			}
		});
		lblBack.setBounds(798, 461, 34, 27);
		contentPane.add(lblBack);
		
		// lblNext go to MyWorksGraphicDesign5
		JLabel lblNext = new JLabel("");
		lblNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign5 GD5 = new MyWorksGraphicDesign5();
				GD5.setVisible(true);
	            dispose();
			}
		});
		lblNext.setBounds(842, 461, 45, 27);
		contentPane.add(lblNext);
		
		// lblViewGD will go to MyWorksGraphicDesign4_1
		JLabel lblViewGD = new JLabel("");
		lblViewGD.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorksGraphicDesign4_1 GD4_1 = new MyWorksGraphicDesign4_1();
				GD4_1.setVisible(true);
	            dispose();
			}
		});
		lblViewGD.setBounds(298, 142, 315, 314);
		contentPane.add(lblViewGD);
		
		// Sets the background picture of the whole frame
		JLabel imgGraphicDesign2 = new JLabel("");
		imgGraphicDesign2.setIcon(new ImageIcon(MyWorksGraphicDesign4.class.getResource("/newimgs/04GraphicDesign.png")));
		imgGraphicDesign2.setBounds(0, 0, 912, 513);
		contentPane.add(imgGraphicDesign2);
	}

}
