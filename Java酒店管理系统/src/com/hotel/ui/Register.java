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
import com.hotel.daoimpl.CustomerDaoImpl;
import com.hotel.entity.Customer;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @ClassName: Register
 * @Description:�Ǽ�ҳ��
 * @author: ����ң
 * @date 2020��6��12�� ����3:06:49
 * @version V1.0
 */
public class Register extends JFrame {
	private ButtonGroup bg;
	private JRadioButton man, woman;
	private JPanel contentPane;
	private JTextField tel;
	private JTextField IDnumber;
	private JTextField name;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Register() {
		setTitle("\u7528\u6237\u4FE1\u606F\u767B\u8BB0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u4FE1\u606F\u767B\u8BB0");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 23));
		lblNewLabel.setBounds(179, 23, 197, 59);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u59D3\u540D");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(73, 98, 72, 18);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\u7801");
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(73, 144, 83, 18);
		contentPane.add(lblNewLabel_2);

		bg = new ButtonGroup();

		man = new JRadioButton("��");
		man.setFont(new Font("����", Font.PLAIN, 16));
		// ��ѡ��ťĬ��ѡ��
		man.setSelected(true);
		man.setBounds(159, 195, 72, 27);
		contentPane.add(man);

		woman = new JRadioButton("Ů");
		woman.setFont(new Font("����", Font.PLAIN, 16));
		woman.setBounds(276, 195, 157, 27);
		contentPane.add(woman);
		// ��������ѡ��ť����һ��buttongroup��
		bg.add(man);
		bg.add(woman);

		JLabel lblNewLabel_3 = new JLabel("\u6027\u522B");
		lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(73, 199, 72, 18);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\u8054\u7CFB\u65B9\u5F0F");
		lblNewLabel_4.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(73, 255, 72, 18);
		contentPane.add(lblNewLabel_4);

		tel = new JTextField();
		tel.setBounds(159, 252, 217, 24);
		contentPane.add(tel);
		tel.setColumns(10);

		IDnumber = new JTextField();
		IDnumber.setBounds(159, 141, 217, 24);
		contentPane.add(IDnumber);
		IDnumber.setColumns(10);

		name = new JTextField();
		name.setBounds(159, 95, 217, 24);
		contentPane.add(name);
		name.setColumns(10);

		JButton btnNewButton = new JButton("\u7ED3\u675F\u767B\u8BB0");// �����Ǽ�
		btnNewButton.setFont(new Font("��Բ", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main ma = new Main();
				ma.setVisible(true);
				ma.setLocationRelativeTo(null);// ����
				// �رյ�ǰע��ҳ��
				Register.this.dispose();
			}
		});
		btnNewButton.setBounds(249, 345, 113, 27);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u4FDD\u5B58"); // ���水ť
		btnNewButton_1.setFont(new Font("��Բ", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/// ��֤���֤�������ϵ�绰Ϊ����
//				try{
//					   
//					   Integer.parseInt(IDnumber.getText());
//					   
//					  }catch(NumberFormatException e1)
//				  {
//						  JOptionPane.showMessageDialog(null, "���֤������д����");
//					
//					  }
//				try{
//					   Integer.parseInt(tel.getText());
//					 
//					   
//					  }catch(NumberFormatException e1)
//				  {
//						  JOptionPane.showMessageDialog(null, "��ϵ�绰��д����");
//					
//					  }
				// ����Ϣд�����ݿ���
				CustomerDao dao = new CustomerDaoImpl();
				Customer cust = new Customer();// ʵ����һ����cust�Ķ���
				OpenRoom open = new OpenRoom();

				OpenRoom openRoom = new OpenRoom(open.getNumber(), open.getStartmonth(), open.getEndmonth(),
						open.getStartday(), open.getEndday());

				cust.setCustomer_room(openRoom.getNumber());// �ѷ�����뵽���ݿ���

				cust.setCustomer_startDate("2020-" + openRoom.getStartmonth() + "-" + openRoom.getStartday());

				cust.setCustomer_endDate("2020-" + openRoom.getEndmonth() + "-" + openRoom.getEndday());

				// System.out.println("2020-" + openRoom.getEndmonth() + "-" +
				// openRoom.getEndday());

				cust.setCustomer_IDnumber(IDnumber.getText());
				cust.setCustomer_name(name.getText());
				cust.setCustomer_tel(tel.getText());
				// ���Ա�������ݿ���
				String sex = "";
				if (man.isSelected()) {
					sex = "��";
				} else {
					sex = "Ů";
				}
				cust.setCustomer_sex(sex);

				if (dao.addCustomer(cust)) {
					JOptionPane.showMessageDialog(null, "����ɹ�");
					// ���ص�¼ҳ���¼
					Register reg = new Register();
					reg.setVisible(true);
					reg.setLocationRelativeTo(null);
					// �رյ�ǰע��ҳ��
					Register.this.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "ע��ʧ��");
				}
			}
		});
		btnNewButton_1.setBounds(96, 345, 113, 27);
		contentPane.add(btnNewButton_1);
//		//����ͼƬ
//				JLabel image = new JLabel("");
//				image.setBounds(0,0,800,800);
//				image.setIcon(new ImageIcon("image/qqq.jpg"));//ǳ������
//				contentPane.add(image);
	}
}
