package login;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Login_S {

	private JFrame frame;
	private JTextField txtUsername;
	private final JPasswordField txtPassword = new JPasswordField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.setBounds(300,300, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								SpringLayout springLayout = new SpringLayout();
								springLayout.putConstraint(SpringLayout.EAST, txtPassword, -133, SpringLayout.EAST, frame.getContentPane());
								frame.getContentPane().setLayout(springLayout);

								JLabel LoginSystem = new JLabel("Login Systems");
								springLayout.putConstraint(SpringLayout.NORTH, LoginSystem, 10, SpringLayout.NORTH, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.WEST, LoginSystem, 200, SpringLayout.WEST, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.EAST, LoginSystem, 399, SpringLayout.WEST, frame.getContentPane());
								LoginSystem.setFont(new Font("Tahoma", Font.BOLD, 23));
								frame.getContentPane().add(LoginSystem);

								JLabel lblUsername = new JLabel("Username");
								springLayout.putConstraint(SpringLayout.WEST, lblUsername, 62, SpringLayout.WEST, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.EAST, lblUsername, -376, SpringLayout.EAST, frame.getContentPane());
								lblUsername.setFont(new Font("Tahoma", Font.BOLD, 23));
								springLayout.putConstraint(SpringLayout.NORTH, lblUsername, 89, SpringLayout.NORTH, frame.getContentPane());
								frame.getContentPane().add(lblUsername);

								JLabel lblPassword = new JLabel("Password");
								springLayout.putConstraint(SpringLayout.WEST, txtPassword, 6, SpringLayout.EAST, lblPassword);
								springLayout.putConstraint(SpringLayout.SOUTH, txtPassword, 0, SpringLayout.SOUTH, lblPassword);
								springLayout.putConstraint(SpringLayout.EAST, lblPassword, 232, SpringLayout.WEST, frame.getContentPane());
								lblPassword.setFont(new Font("Tahoma", Font.BOLD, 23));
								springLayout.putConstraint(SpringLayout.NORTH, lblPassword, 150, SpringLayout.NORTH, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.WEST, lblPassword, 62, SpringLayout.WEST, frame.getContentPane());
								frame.getContentPane().add(lblPassword);

								txtUsername = new JTextField();
								springLayout.putConstraint(SpringLayout.NORTH, txtUsername, 0, SpringLayout.NORTH, lblUsername);
								springLayout.putConstraint(SpringLayout.WEST, txtUsername, 0, SpringLayout.WEST, txtPassword);
								springLayout.putConstraint(SpringLayout.EAST, txtUsername, -133, SpringLayout.EAST, frame.getContentPane());
								txtUsername.setFont(new Font("Tahoma", Font.BOLD, 23));
								frame.getContentPane().add(txtUsername);
								txtUsername.setColumns(10);
								txtPassword.setFont(new Font("Tahoma", Font.BOLD, 23));
								frame.getContentPane().add(txtPassword);

								JButton btnLogin = new JButton("Login");
								springLayout.putConstraint(SpringLayout.WEST, btnLogin, 16, SpringLayout.WEST, frame.getContentPane());
								btnLogin.setFont(new Font("Tahoma", Font.BOLD, 23));
								springLayout.putConstraint(SpringLayout.NORTH, btnLogin, 246, SpringLayout.NORTH, frame.getContentPane());
								btnLogin.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {


										String password = txtPassword.getText();
									   String username =txtUsername.getText();
									 if (password.contains ("king")&& username.contains ("one")) {
										 txtPassword.setText(null);
										 txtUsername.setText(null);

									 }
									 else
									 {
										 JOptionPane.showMessageDialog(null,"Invalid Login Detail","Login Error",
										 JOptionPane.ERROR_MESSAGE);
										 txtPassword.setText(null);
										 txtUsername.setText(null);
									 }
									 }
									});
								frame.getContentPane().add(btnLogin);

								JButton btnReset = new JButton("Reset");
								springLayout.putConstraint(SpringLayout.EAST, btnLogin, -44, SpringLayout.WEST, btnReset);
								springLayout.putConstraint(SpringLayout.EAST, btnReset, 349, SpringLayout.WEST, frame.getContentPane());
								btnReset.setFont(new Font("Tahoma", Font.BOLD, 23));
								springLayout.putConstraint(SpringLayout.NORTH, btnReset, 246, SpringLayout.NORTH, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.WEST, btnReset, 189, SpringLayout.WEST, frame.getContentPane());
								btnReset.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										txtUsername.setText(null);
										txtPassword.setText(null);

									}
								});
								frame.getContentPane().add(btnReset);

								JButton btnExit = new JButton("Exit");
								springLayout.putConstraint(SpringLayout.NORTH, btnExit, 0, SpringLayout.NORTH, btnLogin);
								springLayout.putConstraint(SpringLayout.WEST, btnExit, 50, SpringLayout.EAST, btnReset);
								springLayout.putConstraint(SpringLayout.EAST, btnExit, -60, SpringLayout.EAST, frame.getContentPane());
								btnExit.setFont(new Font("Tahoma", Font.BOLD, 23));
								btnExit.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										JFrame frmLoginSystem = new JFrame("Exit");
										if(JOptionPane.showConfirmDialog(frmLoginSystem,"Comfirm if you want to exit",
										"Login Systems",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
									System.exit(0);
								}

									}
								});
								frame.getContentPane().add(btnExit);

								JSeparator separator = new JSeparator();
								springLayout.putConstraint(SpringLayout.NORTH, separator, 228, SpringLayout.NORTH, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.WEST, separator, 546, SpringLayout.WEST, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.SOUTH, separator, 218, SpringLayout.NORTH, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.EAST, separator, 54, SpringLayout.WEST, frame.getContentPane());
								frame.getContentPane().add(separator);

								JSeparator separator_1 = new JSeparator();
								springLayout.putConstraint(SpringLayout.NORTH, separator_1, 216, SpringLayout.NORTH, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.WEST, separator_1, 15, SpringLayout.WEST, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.EAST, separator_1, 563, SpringLayout.WEST, frame.getContentPane());
								frame.getContentPane().add(separator_1);

								JSeparator separator_2 = new JSeparator();
								springLayout.putConstraint(SpringLayout.NORTH, separator_2, 52, SpringLayout.NORTH, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.WEST, separator_2, 15, SpringLayout.WEST, frame.getContentPane());
								springLayout.putConstraint(SpringLayout.EAST, separator_2, 552, SpringLayout.WEST, frame.getContentPane());
								frame.getContentPane().add(separator_2);
	}
}
