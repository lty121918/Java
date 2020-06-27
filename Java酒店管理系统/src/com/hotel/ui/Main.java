/**
 * 
 */
package com.hotel.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.etc.emp.ui.Login;
//import com.etc.emp.ui.Manager;
import com.hotel.entity.Room;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

/**
 * @ClassName: Main
 * @Description:酒店管理系统主界面
 * @author: 李天遥
 * @date 2020年6月12日 上午9:58:33
 * @version V1.0
 */
public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setLocationRelativeTo(null);
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
	public Main() {

		setFont(new Font("宋体", Font.PLAIN, 12));
		setTitle("\u9152\u5E97\u7BA1\u7406\u7CFB\u7EDF\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("\u5F00\u623F\u767B\u8BB0");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OpenRoom ro = new OpenRoom();
				ro.setVisible(true);
				ro.setLocationRelativeTo(null);
				// 将当前的登录窗口关闭
				Main.this.dispose();
			}
		});
		btnNewButton.setBounds(130, 155, 132, 50);
		// 设置按钮背景透明
		btnNewButton.setContentAreaFilled(false);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u9000\u623F\u7ED3\u7B97");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete del = new Delete();
				del.setVisible(true);
				del.setLocationRelativeTo(null);
				// 将当前的登录窗口关闭
				Main.this.dispose();

			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_1.setBounds(130, 304, 132, 50);

		// 设置按钮无边框 btnNewButton_1.setBorderPainted(false);

		// 设置按钮背景透明
		btnNewButton_1.setContentAreaFilled(false);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\u623F\u95F4\u67E5\u8BE2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Inquire inq = new Inquire();
				inq.setVisible(true);
				inq.setLocationRelativeTo(null);
				// 将当前的登录窗口关闭
				Main.this.dispose();

			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_2.setBounds(336, 155, 132, 50);
		// 设置按钮背景透明
		btnNewButton_2.setContentAreaFilled(false);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\u66F4\u6362\u623F\u95F4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Replace rep = new Replace();
				rep.setVisible(true);
				rep.setLocationRelativeTo(null);
				// 将当前的登录窗口关闭
				Main.this.dispose();

			}
		});
		btnNewButton_3.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_3.setBounds(130, 228, 132, 50);
		// 设置按钮背景透明
		btnNewButton_3.setContentAreaFilled(false);
		contentPane.add(btnNewButton_3);

		JLabel lblNewLabel = new JLabel("\u9152\u5E97\u7BA1\u7406\u7CFB\u7EDF");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 26));
		lblNewLabel.setBounds(198, 63, 225, 63);
		contentPane.add(lblNewLabel);

		JButton btnNewButton_2_1 = new JButton("\u987E\u5BA2\u67E5\u8BE2");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InquireCustomer inq = new InquireCustomer();
				inq.setVisible(true);
				inq.setLocationRelativeTo(null);
				Main.this.dispose();

			}
		});
		btnNewButton_2_1.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_2_1.setContentAreaFilled(false);
		btnNewButton_2_1.setBounds(336, 228, 132, 50);
		btnNewButton_2_1.setContentAreaFilled(false);
		contentPane.add(btnNewButton_2_1);

		JButton btnNewButton_1_1 = new JButton("\u6CE8\u9500\u7528\u6237");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log = new Login();
				log.setVisible(true);
				log.setLocationRelativeTo(null);
				Main.this.dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBounds(336, 304, 132, 50);
		btnNewButton_1_1.setContentAreaFilled(false);
		contentPane.add(btnNewButton_1_1);

	}
}
