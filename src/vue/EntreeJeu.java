package vue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private JPanel contentPane;
	private JTextField txtIP;
	
	/**
	 * Clic sur le bouton start
	 */
	private void btnStart_clic() {
		(new Arene()).setVisible(true);
		this.dispose();
	}
	
	/**
	 * Clic sur le bouton connect
	 */
	private void btnConnect_clic() {
		(new ChoixJoueur()).setVisible(true);
		this.dispose();
	}
	
	/**
	 *  Clic sur le bouton exit
	 */
	private void btnExit_clic() {
		System.exit(0);
	}


	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStaer = new JLabel("Start a server :");
		lblStaer.setBounds(10, 11, 85, 14);
		contentPane.add(lblStaer);
		
		JLabel lblConnect = new JLabel("Connect an existing server :");
		lblConnect.setBounds(10, 36, 136, 14);
		contentPane.add(lblConnect);
		
		JLabel lblIP = new JLabel("IP server :");
		lblIP.setBounds(10, 61, 51, 14);
		contentPane.add(lblIP);
		
		txtIP = new JTextField();
		lblIP.setLabelFor(txtIP);
		txtIP.setText("127.0.0.1");
		txtIP.setBounds(71, 58, 75, 20);
		contentPane.add(txtIP);
		txtIP.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart_clic();
			}
		});
		btnStart.setBounds(182, 7, 89, 23);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConnect_clic();
			}
		});
		btnConnect.setBounds(182, 57, 89, 23);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_clic();
			}
		});
		btnExit.setBounds(182, 89, 89, 23);
		contentPane.add(btnExit);
	}
}
	

