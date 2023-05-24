import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class MyWorksVideoEditsLast extends Start {

	private JPanel contentPane;

	public MyWorksVideoEditsLast() {
		
		// Current Frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel GoToLink1 = new JLabel("");
		GoToLink1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://bit.ly/MyWorks-VideoEdits").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		GoToLink1.setBounds(673, 433, 182, 41);
		contentPane.add(GoToLink1);
		
		// Sets the background picture of the whole frame
		// Will go to MyWorks if clicked
		JLabel lblBGPic = new JLabel("");
		lblBGPic.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				MyWorks Works = new MyWorks();
				Works.setVisible(true);
				dispose();
	            
			}
		});
		lblBGPic.setIcon(new ImageIcon(MyWorksVideoEditsLast.class.getResource("/ab/MyVideoEdits.png")));
		lblBGPic.setBounds(0, 0, 912, 513);
		contentPane.add(lblBGPic);
	}

}
