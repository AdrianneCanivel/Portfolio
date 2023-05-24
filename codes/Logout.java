import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Logout extends Start {

	private JPanel contentPane;
	private JTextField textName;

	public Logout() {
		
		// Current Frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Name Text Field
		textName = new JTextField();
		textName.setBounds(478, 396, 372, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		// Back Button, will redirect to Contact3 Frame if clicked
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
						
				Contact3 contact3 = new Contact3();
				contact3.setVisible(true);
			    dispose();
			            
			}
		});
		lblBack.setBounds(465, 429, 54, 31);
		contentPane.add(lblBack);
		
		// Submit Button, will redirect to End Frame if clicked
		JLabel lblSubmit = new JLabel("");
		lblSubmit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				End end = new End();
				end.setVisible(true);
	            dispose();
	            
			}
		});
		lblSubmit.setBounds(796, 429, 54, 31);
		contentPane.add(lblSubmit);
		
		// Sets the background picture of the whole frame
		JLabel lblBGPic = new JLabel("");
		lblBGPic.setIcon(new ImageIcon(Logout.class.getResource("/ab/Logout.png")));
		lblBGPic.setBounds(0, 0, 912, 513);
		contentPane.add(lblBGPic);
	}
}
