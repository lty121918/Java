package com.hotel.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.hotel.dao.UserDao;
import com.hotel.daoimpl.UserDaoImpl;
import com.hotel.entity.User;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField loginname;
	private JPasswordField loginpwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// 对窗口进行美化
		// JFrame.setDefaultLookAndFeelDecorated(true);
		// JDialog.setDefaultLookAndFeelDecorated(true);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// 设置皮肤
					// SubstanceLookAndFeel.setSkin(new BusinessBlackSteelSkin());
					// 构造一个窗口对象
					Login frame = new Login();
					// 设置窗口可见
					frame.setVisible(true);
					// 设置窗口显示默认居中
					frame.setLocationRelativeTo(null);
					frame.setTitle("酒店管理系统登录界面");
					frame.setResizable(false);
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
		setTitle("\u767B\u9646\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口的位置和宽高
		setBounds(100, 100, 500, 500);
		// 为窗口设置一个容器，为后续的组件做铺垫
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// contentPane.setBackground(Color.BLUE);

		JLabel label = new JLabel("用户：");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(85, 154, 72, 18);
		contentPane.add(label);

		loginname = new JTextField();
		loginname.setBounds(127, 151, 252, 24);
		contentPane.add(loginname);
		loginname.setColumns(10);

		JLabel label_1 = new JLabel("密码：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(84, 208, 72, 18);
		contentPane.add(label_1);

		loginpwd = new JPasswordField();
		loginpwd.setBounds(126, 207, 252, 24);
		contentPane.add(loginpwd);

		JLabel label_2 = new JLabel("\u767B\u5F55");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("宋体", Font.PLAIN, 30));
		label_2.setBounds(209, 62, 104, 46);
		contentPane.add(label_2);

		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 1 获取用户输入的用户名和密码
				String name = loginname.getText();
				String pwd = new String(loginpwd.getPassword());
				if (name == null || pwd == null || name.equals("") || pwd.equals("")) {
					JOptionPane.showMessageDialog(null, "用户名或者密码不能为空");
					return;
				} else if (name.length() < 3 || pwd.length() < 3) {
					JOptionPane.showMessageDialog(null, "用户名或者密码不能小于3位");
					return;
				} else {
					// 将用户名和密码发送到数据库进行查询
					UserDao dao = new UserDaoImpl();

					User user = dao.login(name, pwd);

					if (user == null) {
						JOptionPane.showMessageDialog(null, "用户名或者密码错误");
					} else {

						Main main = new Main();

						// 设置窗口可见
						main.setVisible(true);
						// 设置窗口显示默认居中
						main.setLocationRelativeTo(null);
						// 将当前的登录窗口关闭
						Login.this.dispose();

					}

				}

			}

		});
		btnNewButton.setBounds(122, 276, 113, 27);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u6CE8\u518C");
		btnNewButton_1.setFont(new Font("幼圆", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserRegister r = new UserRegister();
				r.setVisible(true);
				r.setLocationRelativeTo(null);
				Login.this.dispose();

			}
		});
		btnNewButton_1.setBounds(266, 276, 113, 27);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 482, 453);
		lblNewLabel.setIcon(new ImageIcon("image/test.png"));
		contentPane.add(lblNewLabel);
	}
}
