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
			label.setFont(new Font("����", Font.PLAIN, 30));
			label.setBounds(126, 27, 245, 64);
			contentPane.add(label);
			
			JLabel lblNewLabel = new JLabel("�� ¼ ��");
			lblNewLabel.setFont(new Font("����", Font.PLAIN, 16));
			lblNewLabel.setBounds(60, 117, 72, 27);
			contentPane.add(lblNewLabel);
			
			lname = new JTextField();
			lname.setBounds(143, 119, 245, 24);
			contentPane.add(lname);
			lname.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("��    ��");
			lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(59, 167, 72, 18);
			contentPane.add(lblNewLabel_1);
			
			lpwd = new JPasswordField();
			lpwd.setBounds(143, 162, 245, 24);
			contentPane.add(lpwd);
			lpwd.setColumns(10);
			
			lblNewLabel_2 = new JLabel("ȷ������");
			lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 16));
			lblNewLabel_2.setBounds(58, 210, 72, 18);
			contentPane.add(lblNewLabel_2);
			
			checkpwd = new JPasswordField();
			checkpwd.setBounds(144, 204, 244, 24);
			contentPane.add(checkpwd);
			checkpwd.setColumns(10);
			
			 bg=new ButtonGroup();
			
			JButton btnNewButton = new JButton("\u6CE8\u518C");
			btnNewButton.setFont(new Font("��Բ", Font.PLAIN, 16));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	
					
					
	            //��֤�û��� �������ʽ�Ƿ���ȷ
					String name=lname.getText();
					String pwd=new String(lpwd.getPassword());
				if(name==null||pwd==null||name.equals("")||pwd.equals("")) {
					JOptionPane.showMessageDialog(null, "�û����������벻��Ϊ��");
					return;
				}else if(name.length()<3||pwd.length()<3) {
					JOptionPane.showMessageDialog(null, "�û����������벻��С��3λ");
					return;
				}
				
				//��֤�û����Ƿ��Ѿ���ע��
				UserDao dao2=new UserDaoImpl();
				if(dao2.queryByLname(name)) {
					JOptionPane.showMessageDialog(null, "��ǰ��¼���Ѵ��ڣ�����ע�ᣡ");	
					return;
				}
				
					
				//ȷ������������Ƿ�һ��
				String cpwd=new String(checkpwd.getPassword());
				if(!cpwd.equals(pwd)) {
					JOptionPane.showMessageDialog(null, "����ǰ��һ�£�");
					return;
				}
					
		
				
			
				//��ע���������ӵ����ݿ���
				UserDao dao=new UserDaoImpl();
				User user=new User();
				user.setUser_lname(name);
				user.setUser_lpwd(pwd);

				if(dao.addUser(user)) {
					JOptionPane.showMessageDialog(null, "ע��ɹ�");
					//���ص�¼ҳ���¼
					Login login=new Login();
					login.setVisible(true);
					login.setLocationRelativeTo(null);
					//�رյ�ǰע��ҳ��
					UserRegister.this.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "ע��ʧ��");
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
					//�رյ�ǰע��ҳ��
					UserRegister.this.dispose();
				}
			});
			btnNewButton_1.setFont(new Font("��Բ", Font.PLAIN, 16));
			btnNewButton_1.setBounds(251, 259, 113, 27);
			contentPane.add(btnNewButton_1);
		}
	}


