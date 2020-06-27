/**
 * 
 */
package com.hotel.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.hotel.dao.CustomerDao;
import com.hotel.dao.RoomDao;
import com.hotel.daoimpl.CustomerDaoImpl;
import com.hotel.daoimpl.RoomDaoImpl;
import com.hotel.entity.Customer;
import com.hotel.entity.Room;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @ClassName: Delete
 * @Description:
 * @author: ����ң
 * @date 2020��6��16�� ����8:41:26
 * @version V1.0
 */
public class Delete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
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
	public Delete() {
		setTitle("\u9000\u623F\u7CFB\u7EDF\u754C\u9762");
		setFont(new Font("����", Font.PLAIN, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RoomDao dao = new RoomDaoImpl();
				String number = textField.getText();// ��ȡ��������ݣ�����ţ�
				Room room = dao.open(number);
				if (room == null) {
					JOptionPane.showMessageDialog(null, "����д��ȷ�ķ����");
				} else {
					CustomerDao dao2 = new CustomerDaoImpl();

					// �����cust��new�����ģ�����ʲôֵҲû��
					Customer cust = new Customer();
					System.out.println(number);
					// Ȼ����ѷ����������name��ߣ�����������������Ӧ�������ٷ������������𣿣���������
					cust.setCustomer_room(number);

					System.out.println(number);
					// ����� Ҫ�ж�һ�°�
					boolean b = dao2.delete(cust);
					if (b) {
						JOptionPane.showMessageDialog(null, "�˷��ɹ�");
						Delete.this.dispose();
						Main main = new Main();
						main.setVisible(true);
						main.setLocationRelativeTo(null);
					} else {
						JOptionPane.showMessageDialog(null, "�˷�ʧ��");
					}

				}
			}

		});
		btnNewButton.setBounds(69, 143, 102, 27);
		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(69, 89, 229, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u8981\u9000\u623F\u7684\u623F\u95F4\uFF1A");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel.setBounds(69, 56, 187, 20);
		contentPane.add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
				// ����ǰ�ĵ�¼���ڹر�
				Delete.this.dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(185, 143, 113, 27);
		contentPane.add(btnNewButton_1);
	}
}
