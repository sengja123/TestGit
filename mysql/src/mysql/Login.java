package mysql;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	//protected static final String JOptionPane = null;
	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblLoginPage.setBounds(154, 16, 194, 20);
		contentPane.add(lblLoginPage);

		JLabel lblUserName = new JLabel("UserName");
		lblUserName.setBounds(15, 57, 202, 20);
		contentPane.add(lblUserName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(15, 121, 155, 20);
		contentPane.add(lblPassword);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//i put code from here
				
//				
//				try {
//					
//					Class.forName("com.mysql.jdbc.Driver");
//					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
//					Statement stmt= con.createStatement();
//					String sql = ""
//				}
//				catch {}
	      try {
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	    	  Statement stmt= con.createStatement();
	    	  String sql ="Select* from tbLogin where UserName='"+user.getText()+"' and Password= '"+pass.getText().toString()+"'";
	    	  ResultSet rs= stmt.executeQuery(sql);
	    	  if (rs.next()) {
	    		 JOptionPane.showMessageDialog (null, "login successfully...");
	    	  }
	    	  else {
	    		 JOptionPane.showMessageDialog (null,"incorrect username and password...");
	    	  }
	    	 con.close();


	      }catch(Exception e1) {System.out.println(e1);}

			}
		});
		btnLogin.setBounds(164, 199, 115, 29);
		contentPane.add(btnLogin);

		user = new JTextField();
		user.setBounds(15, 79, 250, 26);
		contentPane.add(user);
		user.setColumns(10);

		pass = new JPasswordField();
		pass.setBounds(15, 142, 250, 26);
		contentPane.add(pass);
	}
}
