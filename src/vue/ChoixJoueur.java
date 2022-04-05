package vue;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.awt.Dimension;


public class ChoixJoueur extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Evenement sur le clic flèche précédente
	 */
	private void lblPrevious_clic() {
		System.out.println("Clic sur precedent");
	}
	
	/**
	 * Evenement sur le clic flèche suivante
	 */
	private void lblNext_clic() {
		System.out.println("Clic sur suivant");
	}

	/**
	 * Evénement sur le clic sur go
	 */
	private void lblGo_clic() {
		(new Arene()).setVisible(true);
		this.dispose();
	}
	
	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
	    this.pack();
		this.setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrevious = new JLabel("");
		lblPrevious.setBounds(64, 131, 37, 57);
		contentPane.add(lblPrevious);
		lblPrevious.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblPrevious_clic();
			}
		});

		
		
		JLabel lblNext = new JLabel("");
		lblNext.setBounds(298, 131, 25, 57);
		contentPane.add(lblNext);
		lblNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNext_clic();
			}
		});
		
		JLabel lblGo = new JLabel("");
		lblGo.setBounds(315, 192, 55, 60);
		contentPane.add(lblGo);
		lblGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblGo_clic();
			}
		});
		
		JLabel lblFondChoix = new JLabel("");
		lblFondChoix.setIcon(new ImageIcon(ChoixJoueur.class.getResource("/fonds/fondchoix.jpg")));
		lblFondChoix.setBounds(0, 0, 400, 261);
		contentPane.add(lblFondChoix);
	}
}
