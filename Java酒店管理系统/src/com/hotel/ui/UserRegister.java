/**
 * 
 */
package com.hotel.ui;



	//private JPanel contentPane;


	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.AbstractButton;
	import javax.swing.ButtonGroup;
	import javax.swing.ComboBoxModel;
	import javax.swing.DefaultComboBoxModel;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JPasswordField;
	import javax.swing.border.EmptyBorder;
	import javax.swing.text.SimpleAttributeSet;

import com.hotel.dao.UserDao;
import com.hotel.daoimpl.UserDaoImpl;
import com.hotel.entity.User;

import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	import java.awt.Font;
	import javax.swing.JTextField;
	import javax.swing.JRadioButton;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ItemEvent;
	import java.awt.event.ItemListener;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Enumeration;
	import java.util.Vector;
	import java.awt.event.ActionEvent;
	import javax.swing.JComboBox;

	public class UserRegister extends JFrame {

		private JPanel contentPane;
		private JTextField lname;
		private JPasswordField lpwd,checkpwd;
		private JLabel lblNewLabel_2;
	    private ButtonGroup bg;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Register frame = new Register();
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
		public UserRegister() {
			setTitle("\u7BA1\u7406\u4EBA\u5458\u6CE8\u518C");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 471, 403);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel label = new JLabel("\u9152\u5E97\u7BA1\u7406\u5458\u6CE8\u518C");
			label.setFont(new Font("宋体", Font.PLAIN, 30));
			label.setBounds(126, 27, 245, 64);
			contentPane.add(label);
			
			JLabel lblNewLabel = new JLabel("登 录 名");
			lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
			lblNewLabel.setBounds(60, 117, 72, 27);
			contentPane.add(lblNewLabel);
			
			lname = new JTextField();
			lname.setBounds(143, 119, 245, 24);
			contentPane.add(lname);
			lname.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("密    码");
			lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(59, 167, 72, 18);
			contentPane.add(lblNewLabel_1);
			
			lpwd = new JPasswordField();
			lpwd.setBounds(143, 162, 245, 24);
			contentPane.add(lpwd);
			lpwd.setColumns(10);
			
			lblNewLabel_2 = new JLabel("确认密码");
			lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 16));
			lblNewLabel_2.setBounds(58, 210, 72, 18);
			contentPane.add(lblNewLabel_2);
			
			checkpwd = new JPasswordField();
			checkpwd.setBounds(144, 204, 244, 24);
			contentPane.add(checkpwd);
			checkpwd.setColumns(10);
			
			 bg=new ButtonGroup();
			
			JButton btnNewButton = new JButton("\u6CE8\u518C");
			btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 16));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	
					
					
	            //验证用户名 ，密码格式是否正确
					String name=lname.getText();
					String pwd=new String(lpwd.getPassword());
				if(name==null||pwd==null||name.equals("")||pwd.equals("")) {
					JOptionPane.showMessageDialog(null, "用户名或者密码不能为空");
					return;
				}else if(name.length()<3||pwd.length()<3) {
					JOptionPane.showMessageDialog(null, "用户名或者密码不能小于3位");
					return;
				}
				
				//验证用户名是否已经被注册
				UserDao dao2=new UserDaoImpl();
				if(dao2.queryByLname(name)) {
					JOptionPane.showMessageDialog(null, "当前登录名已存在，不能注册！");	
					return;
				}
				
					
				//确认密码和密码是否一致
				String cpwd=new String(checkpwd.getPassword());
				if(!cpwd.equals(pwd)) {
					JOptionPane.showMessageDialog(null, "密码前后不一致！");
					return;
				}
					
		
				
			
				//将注册的数据添加到数据库中
				UserDao dao=new UserDaoImpl();
				User user=new User();
				user.setUser_lname(name);
				user.setUser_lpwd(pwd);

				if(dao.addUser(user)) {
					JOptionPane.showMessageDialog(null, "注册成功");
					//返回登录页面登录
					Login login=new Login();
					login.setVisible(true);
					login.setLocationRelativeTo(null);
					//关闭当前注册页面
					UserRegister.this.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "注册失败");
				}
				
				
				}
			});
			btnNewButton.setBounds(95, 258, 113, 27);
			contentPane.add(btnNewButton);
			

			JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					Login login=new Login();
					login.setVisible(true);
					login.setLocationRelativeTo(null);
					//关闭当前注册页面
					UserRegister.this.dispose();
				}
			});
			btnNewButton_1.setFont(new Font("幼圆", Font.PLAIN, 16));
			btnNewButton_1.setBounds(251, 259, 113, 27);
			contentPane.add(btnNewButton_1);
		}
	}


