import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Start extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {

		Start frame = new Start();
		frame.setVisible(true);

	}

	public Start() {
		
		// Current Frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Will go to Login Frame when clicked
		JLabel imgStart = new JLabel("");
		imgStart.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				Login login = new Login();
                login.setVisible(true);
                dispose();
				
			}
		});
		// Sets the background picture of the whole frame
		imgStart.setIcon(new ImageIcon(Start.class.getResource("/Imgs/Intro.png")));
		imgStart.setBounds(0, 0, 912, 513);
		contentPane.add(imgStart);
	}
}
