package vue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Arene extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Arene() {
		setTitle("Arena");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFondArene = new JLabel("");
		lblFondArene.setIcon(new ImageIcon(Arene.class.getResource("/fonds/fondarene.jpg")));
		lblFondArene.setBounds(0, 0, 800, 631);
		contentPane.add(lblFondArene);
	}

}
