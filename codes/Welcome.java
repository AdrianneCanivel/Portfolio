import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Welcome extends Start {

	private JPanel contentPane;

	public Welcome() {
		
		// Current Frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Will redirect to Home Frame when clicked
		JLabel lblNext = new JLabel("");
		lblNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.setVisible(true);
	            dispose();
			}
		});
		lblNext.setBounds(823, 430, 60, 44);
		contentPane.add(lblNext);
		
		// Sets the background picture of the whole frame
		JLabel imgWelcome = new JLabel("");
		imgWelcome.setIcon(new ImageIcon(Welcome.class.getResource("/Imgs/Welcome.png")));
		imgWelcome.setBounds(0, 0, 912, 513);
		contentPane.add(imgWelcome);
	}

}
