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

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**  
 * @ClassName: Replace 
 * @Description:
 * @author: ����ң
 * @date 2020��6��17�� ����11:11:27 
 * @version V1.0
 */
public class Replace extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private static String newroom;
	private static String name;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Replace frame = new Replace();
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
	public Replace() {
		
		
		setTitle("\u66F4\u6362\u623F\u95F4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(223, 49, 159, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(220, 104, 162, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u66F4\u6362\u623F\u95F4\u7684\u987E\u5BA2\u540D");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel.setBounds(35, 50, 176, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BF7\u8F93\u5165\u65B0\u623F\u95F4\u7684\u623F\u95F4\u53F7");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(35, 109, 181, 18);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		JButton btnNewButton = new JButton("\u786E\u5B9A\u66F4\u6362");
		btnNewButton.setFont(new Font("������", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
					name = textField.getText();
		//System.out.println(number);
		            newroom=textField_1.getText();
					
				RoomDao dao = new RoomDaoImpl();
			    Room room = dao.open(newroom);
				if (newroom == null || newroom.equals("")) {
					JOptionPane.showMessageDialog(null, "����Ų���Ϊ��");
					return;
			} else {
				
				if (room == null) {
					JOptionPane.showMessageDialog(null, "������������");
					}else {
						CustomerDao dao2=new CustomerDaoImpl();
						boolean bl=dao2.updateUserById(newroom,name);
						if(bl==false) {
							JOptionPane.showMessageDialog(null, "�޸�ʧ��");
						}else {
							JOptionPane.showMessageDialog(null, "�޸ĳɹ�");
					}
						
					}
				
				
				
				
				
				
				}}
			
		});
		btnNewButton.setBounds(70, 172, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE\u83DC\u5355");
		btnNewButton_1.setFont(new Font("������", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
				// ����ǰ�ĵ�¼���ڹر�
				Replace.this.dispose();

			}
		});
		btnNewButton_1.setBounds(225, 172, 113, 27);
		contentPane.add(btnNewButton_1);
	}
}
