import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class End extends Start {

	private JPanel contentPane;

	public End() {
		
		// Current Frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Frame will close if this is clicked
		JLabel lblBGPic = new JLabel("");
		lblBGPic.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

	            dispose();
		
			}
		});
		
		// Sets the background picture of the whole frame
		lblBGPic.setIcon(new ImageIcon(End.class.getResource("/ab/tnx.png")));
		lblBGPic.setBounds(0, 0, 912, 513);
		contentPane.add(lblBGPic);
	}

}
