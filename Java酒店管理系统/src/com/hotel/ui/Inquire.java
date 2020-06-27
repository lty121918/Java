/**
 * 
 */
package com.hotel.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.hotel.dao.CustomerDao;
import com.hotel.dao.RoomDao;
import com.hotel.daoimpl.CustomerDaoImpl;
import com.hotel.daoimpl.RoomDaoImpl;
import com.hotel.entity.Customer;
import com.hotel.entity.Room;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * @ClassName: Inquire
 * @Description:
 * @author: 李天遥
 * @date 2020年6月13日 下午5:25:14
 * @version V1.0
 */
public class Inquire extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inquire frame = new Inquire();
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
	public Inquire() {
		String number = null;
		CustomerDao dao = new CustomerDaoImpl();
		Customer c = dao.queryId(number);
		setTitle("\u623F\u95F4\u67E5\u8BE2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 String  number=textField.getText();
                 if (number == null || number.equals("")) {
 					JOptionPane.showMessageDialog(null, "房间号不能为空");
 					return;
 				} else {
 					RoomDao dao3 = new RoomDaoImpl();
 					Room room = dao3.open(number);
 					if (room == null) {
 						JOptionPane.showMessageDialog(null, "房间号输入错误");}else {
                 Customer c = dao.queryId(number);
			      if (c == null) {
						JOptionPane.showMessageDialog(null, "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场"+ "\n" + "日常用品齐全");

					} else {
						JOptionPane.showMessageDialog(null,
								"已有住户" + c.getCustomer_name() + "\n" + "该房型不可加床 " + "\n" + "免费停车场"+ "\n" + "日常用品齐全");
						
					}
 						}
 					}
                 }

		});

		btnNewButton.setBounds(336, 69, 77, 27);
		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(54, 69, 268, 26);
		contentPane.add(textField);
	     

		
		
		textField.setColumns(10);
		JButton a101 = new JButton("101");
		a101.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// String number = null;
//				Customer c=dao.queryId(number);
				if (c == null) {
					JOptionPane.showMessageDialog(null, "101号大床房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场"+ "\n" + "日常用品齐全");

				} else {
					JOptionPane.showMessageDialog(null,
							"101号大床房 " + "\n" + "已有住户" + c.getCustomer_name() + "\n" + "该房型不可加床 " + "\n" + "免费停车场"+ "\n" + "日常用品齐全");

				}

			}
		});
		a101.setBounds(36, 122, 118, 46);
		contentPane.add(a101);

		JButton 大床房102 = new JButton("102");
		大床房102.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int num = 201;
				String number = String.valueOf(num);
				if (dao.queryId(number) == null) {
					JOptionPane.showMessageDialog(null, "102号大床房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场"+ "\n" + "日常用品齐全");

				} else {
					JOptionPane.showMessageDialog(null, "102号大床房 " + "\n" + "已有住户："
							+ dao.queryId(number).getCustomer_name() + "\n" + "该房型不可加床 " + "\n" + "免费停车场"+ "\n" + "日常用品齐全");

				}
			}
		});
		大床房102.setBounds(156, 122, 118, 46);
		contentPane.add(大床房102);

		JButton btnNewButton_1_2 = new JButton("103");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int num = 103;
				String number = String.valueOf(num);
				if (dao.queryId(number) == null) {
					JOptionPane.showMessageDialog(null,
							"大床房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全");

				} else {
					JOptionPane.showMessageDialog(null, "大床房 " + "\n" + "已有住户：" + dao.queryId(number).getCustomer_name()
							+ "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全");

				}
			}
		});
		btnNewButton_1_2.setBounds(275, 122, 118, 46);
		contentPane.add(btnNewButton_1_2);

		JButton btnNewButton_1_3 = new JButton("104");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int num = 104;
				String number = String.valueOf(num);
				if (dao.queryId(number) == null) {
					JOptionPane.showMessageDialog(null,
							"大床房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全");

				} else {
					JOptionPane.showMessageDialog(null, "大床房 " + "\n" + "已有住户：" + dao.queryId(number).getCustomer_name()
							+ "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全");

				}
			}
		});
		btnNewButton_1_3.setBounds(395, 122, 118, 46);
		contentPane.add(btnNewButton_1_3);

		JButton btnNewButton_1_4 = new JButton("201");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int num = 201;
				String number = String.valueOf(num);
				if (dao.queryId(number) == null) {
					JOptionPane.showMessageDialog(null, "双床房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场"
							+ "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				} else {
					JOptionPane.showMessageDialog(null, "双床房 " + "\n" + "已有住户：" + dao.queryId(number).getCustomer_name()
							+ "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全" + "\n" + "\n" + "十二点前退房");
					
				}
			}
		});
		btnNewButton_1_4.setBounds(36, 169, 118, 46);
		contentPane.add(btnNewButton_1_4);

		JButton btnNewButton_1_5 = new JButton("202");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerDao dao = new CustomerDaoImpl();
				int num = 202;
				String number = String.valueOf(num);
				if (dao.queryId(number) == null) {
					JOptionPane.showMessageDialog(null, "双床房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场"
							+ "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				} else {
					JOptionPane.showMessageDialog(null, "双床房 " + "\n" + "已有住户：" + dao.queryId(number).getCustomer_name()
							+ "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全" + "\n" + "\n" + "十二点前退房");

				}

			}
		});
		btnNewButton_1_5.setBounds(156, 169, 118, 46);
		contentPane.add(btnNewButton_1_5);

		JButton btnNewButton_1_6 = new JButton("203");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = 203;
				String number = String.valueOf(num);
				if (dao.queryId(number) == null) {
					JOptionPane.showMessageDialog(null, "双床房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场"
							+ "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				} else {
					JOptionPane.showMessageDialog(null, "双床房 " + "\n" + "已有住户：" + dao.queryId(number).getCustomer_name()
							+ "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全" + "\n" + "\n" + "十二点前退房");

				}
			}
		});
		btnNewButton_1_6.setBounds(275, 169, 118, 46);
		contentPane.add(btnNewButton_1_6);

		JButton btnNewButton_1_6_1 = new JButton("204");
		btnNewButton_1_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = 204;
				String number = String.valueOf(num);
				if (dao.queryId(number) == null) {
					JOptionPane.showMessageDialog(null, "双床房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场"
							+ "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				} else {
					JOptionPane.showMessageDialog(null, "双床房 " + "\n" + "已有住户：" + dao.queryId(number).getCustomer_name()
							+ "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				}
			}
		});
		btnNewButton_1_6_1.setBounds(395, 169, 118, 46);
		contentPane.add(btnNewButton_1_6_1);

		JButton btnNewButton_1_6_2 = new JButton("301");
		btnNewButton_1_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CustomerDao dao = new CustomerDaoImpl();
				int num = 301;
				String number = String.valueOf(num);
				if (dao.queryId(number) == null) {
					JOptionPane.showMessageDialog(null, "钟点房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场"
							+ "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				} else {
					JOptionPane.showMessageDialog(null, "钟点房 " + "\n" + "已有住户： " + dao.queryId(number).getCustomer_name()
							+ "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				}
			}
		});
		btnNewButton_1_6_2.setBounds(36, 217, 118, 46);
		contentPane.add(btnNewButton_1_6_2);

		JButton btnNewButton_1_6_3 = new JButton("302");
		btnNewButton_1_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerDao dao = new CustomerDaoImpl();
				int num = 302;
				String number = String.valueOf(num);
				if (dao.queryId(number) == null) {
					JOptionPane.showMessageDialog(null, "钟点房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场"
							+ "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				} else {
					JOptionPane.showMessageDialog(null, "钟点房 " + "\n" + "已有住户：" + dao.queryId(number).getCustomer_name()
							+ "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				}
			}
		});
		btnNewButton_1_6_3.setBounds(156, 217, 118, 46);
		contentPane.add(btnNewButton_1_6_3);

		JButton btnNewButton_1_6_4 = new JButton("303");
		btnNewButton_1_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerDao dao = new CustomerDaoImpl();
				int num = 303;
				String number = String.valueOf(num);
				if (dao.queryId(number) == null) {
					JOptionPane.showMessageDialog(null, "钟点房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场"
							+ "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				} else {
					JOptionPane.showMessageDialog(null, "钟点房 " + "\n" + "已有住户：" + dao.queryId(number).getCustomer_name()
							+ "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				}
			}
		});
		btnNewButton_1_6_4.setBounds(275, 217, 118, 46);
		contentPane.add(btnNewButton_1_6_4);

		JButton btnNewButton_1_6_5 = new JButton("304");
		btnNewButton_1_6_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerDao dao = new CustomerDaoImpl();
				int num = 304;
				String number = String.valueOf(num);
				if (dao.queryId(number) == null) {
					JOptionPane.showMessageDialog(null, "钟点房 " + "\n" + "未入住" + "\n" + "该房型不可加床 " + "\n" + "免费停车场"
							+ "\n" + "日常用品齐全" + "\n" + "十二点前退房");

				} else {
					JOptionPane.showMessageDialog(null, "钟点房 " + "\n" + "已有住户：" + dao.queryId(number).getCustomer_name()
							+ "\n" + "该房型不可加床 " + "\n" + "免费停车场" + "\n" + "日常用品齐全" + "\n" + "十二点前退房");
					
				}
			}
		});
		btnNewButton_1_6_5.setBounds(395, 217, 118, 46);
		contentPane.add(btnNewButton_1_6_5);
		
		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.setFont(new Font("幼圆", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
				// 将当前的登录窗口关闭
				Inquire.this.dispose();

				
				
				
			}
		});
		btnNewButton_1.setBounds(424, 69, 77, 27);
		contentPane.add(btnNewButton_1);

	}

}
