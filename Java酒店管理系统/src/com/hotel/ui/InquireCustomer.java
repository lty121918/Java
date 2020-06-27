package com.hotel.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.hotel.dao.CustomerDao;
import com.hotel.daoimpl.CustomerDaoImpl;
import com.hotel.entity.Customer;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class InquireCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					InquireCustomer frame = new InquireCustomer();
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
	public InquireCustomer() {
		setTitle("\u987E\u5BA2\u4FE1\u606F\u67E5\u8BE2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u5173\u952E\u5B57\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 17));
		label.setBounds(52, 35, 68, 18);
		contentPane.add(label);

		textField = new JTextField();
		textField.setBounds(118, 33, 238, 24);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton button = new JButton("\u641C\u7D22");
		button.setFont(new Font("宋体", Font.PLAIN, 16));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 获取输入框中的关键字
				String key = textField.getText();
				CustomerDao dao2 = new CustomerDaoImpl();
				List<Customer> list2 = dao2.queryByKey(key);

				// 定义列名字
				String[] columns = { "顾客姓名", "房间号", "性别", "电话", "入住时间", "离店时间" };

				// 构造二维数组
				String[][] data = new String[list2.size()][columns.length];
				for (int i = 0; i < list2.size(); i++) {
					for (int j = 0; j < columns.length; j++) {
						if (j == 0) {
							data[i][j] = list2.get(i).getCustomer_name();
						}
						if (j == 1) {
							data[i][j] = list2.get(i).getCustomer_room();
						}
						if (j == 2) {
							data[i][j] = list2.get(i).getCustomer_sex();
						}
						if (j == 3) {
							data[i][j] = list2.get(i).getCustomer_tel();
						}
						if (j == 4) {
							data[i][j] = list2.get(i).getCustomer_startDate();
						}
						if (j == 5) {
							data[i][j] = list2.get(i).getCustomer_endDate();
						}

					}
				}

				// 1 获取table的数据容器
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				// 2 将数据重新装配到容器中
				dtm.setDataVector(data, columns);

			}
		});
		button.setBounds(370, 32, 77, 27);
		contentPane.add(button);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 84, 485, 247);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setEnabled(false);

		btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Main main = new Main();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
				// 将当前的登录窗口关闭
				InquireCustomer.this.dispose();

			}

		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 16));
		btnNewButton.setBounds(460, 32, 77, 27);
		contentPane.add(btnNewButton);

		// 查询所有的用户，返回这些用户的部分信息
		CustomerDao dao = new CustomerDaoImpl();
		List<Customer> list = dao.queryAllForPart();

		// 定义列名字
		String[] columns = { "顾客姓名", "房间号", "性别", "电话", "入住时间", "离店时间" };

		// 构造二维数组
		String[][] data = new String[list.size()][columns.length];
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < columns.length; j++) {
				if (j == 0) {
					data[i][j] = list.get(i).getCustomer_name();
				}
				if (j == 1) {
					data[i][j] = list.get(i).getCustomer_room();
				}
				if (j == 2) {
					data[i][j] = list.get(i).getCustomer_sex();
				}
				if (j == 3) {
					data[i][j] = list.get(i).getCustomer_tel();
				}
				if (j == 4) {
					data[i][j] = list.get(i).getCustomer_startDate();
				}
				if (j == 5) {
					data[i][j] = list.get(i).getCustomer_endDate();
				}

			}
		}

		// 1 获取table的数据容器
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		dtm.setDataVector(data, columns);

	}
}
