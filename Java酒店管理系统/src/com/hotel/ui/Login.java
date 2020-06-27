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

		// �Դ��ڽ�������
		// JFrame.setDefaultLookAndFeelDecorated(true);
		// JDialog.setDefaultLookAndFeelDecorated(true);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// ����Ƥ��
					// SubstanceLookAndFeel.setSkin(new BusinessBlackSteelSkin());
					// ����һ�����ڶ���
					Login frame = new Login();
					// ���ô��ڿɼ�
					frame.setVisible(true);
					// ���ô�����ʾĬ�Ͼ���
					frame.setLocationRelativeTo(null);
					frame.setTitle("�Ƶ����ϵͳ��¼����");
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
		// ���ô��ڵ�λ�úͿ��
		setBounds(100, 100, 500, 500);
		// Ϊ��������һ��������Ϊ������������̵�
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// contentPane.setBackground(Color.BLUE);

		JLabel label = new JLabel("�û���");
		label.setFont(new Font("����", Font.PLAIN, 16));
		label.setBounds(85, 154, 72, 18);
		contentPane.add(label);

		loginname = new JTextField();
		loginname.setBounds(127, 151, 252, 24);
		contentPane.add(loginname);
		loginname.setColumns(10);

		JLabel label_1 = new JLabel("���룺");
		label_1.setFont(new Font("����", Font.PLAIN, 16));
		label_1.setBounds(84, 208, 72, 18);
		contentPane.add(label_1);

		loginpwd = new JPasswordField();
		loginpwd.setBounds(126, 207, 252, 24);
		contentPane.add(loginpwd);

		JLabel label_2 = new JLabel("\u767B\u5F55");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("����", Font.PLAIN, 30));
		label_2.setBounds(209, 62, 104, 46);
		contentPane.add(label_2);

		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setFont(new Font("��Բ", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 1 ��ȡ�û�������û���������
				String name = loginname.getText();
				String pwd = new String(loginpwd.getPassword());
				if (name == null || pwd == null || name.equals("") || pwd.equals("")) {
					JOptionPane.showMessageDialog(null, "�û����������벻��Ϊ��");
					return;
				} else if (name.length() < 3 || pwd.length() < 3) {
					JOptionPane.showMessageDialog(null, "�û����������벻��С��3λ");
					return;
				} else {
					// ���û��������뷢�͵����ݿ���в�ѯ
					UserDao dao = new UserDaoImpl();

					User user = dao.login(name, pwd);

					if (user == null) {
						JOptionPane.showMessageDialog(null, "�û��������������");
					} else {

						Main main = new Main();

						// ���ô��ڿɼ�
						main.setVisible(true);
						// ���ô�����ʾĬ�Ͼ���
						main.setLocationRelativeTo(null);
						// ����ǰ�ĵ�¼���ڹر�
						Login.this.dispose();

					}

				}

			}

		});
		btnNewButton.setBounds(122, 276, 113, 27);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u6CE8\u518C");
		btnNewButton_1.setFont(new Font("��Բ", Font.PLAIN, 16));
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
