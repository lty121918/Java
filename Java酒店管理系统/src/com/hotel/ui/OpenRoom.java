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
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * @ClassName: Open
 * @Description:�����Ǽ�ҳ��
 * @author: ����ң
 * @date 2020��6��12�� ����11:12:40
 * @version V1.0
 */
public class OpenRoom extends JFrame {

	private JPanel contentPane;
	private JTextField hotel_number;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox month;
	private JTextField textField_5;
	private JLabel label;
	private JLabel lblNewLabel_3;
	private JComboBox month_2;
	private JLabel label_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_4;
	private JTextField startDay;
	private JTextField endDay;
	private JLabel lblNewLabel_5;

	private static String startmonth;
	private static String endday;
	private static String startday;
	private static String endmonth;

	private static String number;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public OpenRoom() {
		setTitle("\u5F00\u623F\u767B\u8BB0\u9875\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		hotel_number = new JTextField();
		hotel_number.setBounds(73, 89, 272, 30);
		contentPane.add(hotel_number);
		hotel_number.setColumns(10);

		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.setFont(new Font("����", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {// ȷ�ϰ�ť����ת���Ǽǽ���

				number = hotel_number.getText();// ��ȡ���뷿�����Ϣ
				startday = startDay.getText();
				endday = endDay.getText();
				startmonth = month.getSelectedItem().toString();
				endmonth = month_2.getSelectedItem().toString();
				try{
					   Integer.parseInt(endday);
					   Integer.parseInt(startday);
					   
					  }catch(NumberFormatException e1)
				  {
						  JOptionPane.showMessageDialog(null, "������д����");
					
					  }
				int end = Integer.parseInt(endmonth+endday);
				int start = Integer.parseInt(startmonth+startday);
				
				if (number == null || number.equals("")) {
					JOptionPane.showMessageDialog(null, "����Ų���Ϊ��");
					return;
				} else {
					RoomDao dao = new RoomDaoImpl();
					Room room = dao.open(number);
					if (room == null) {
						JOptionPane.showMessageDialog(null, "������������");
					} else if(end<=start){
						JOptionPane.showMessageDialog(null, "������д����");
						
					}else {
						
						// ˵���в�ѯ�������
						Register reg = new Register();
						reg.setVisible(true);
						reg.setLocationRelativeTo(null);
						// ����ǰ�ĵ�¼���ڹر�
						OpenRoom.this.dispose();
						

					}

				}

			}

		});
		btnNewButton.setBounds(72, 264, 113, 27);
		contentPane.add(btnNewButton);

		lblNewLabel = new JLabel("\u8BF7\u9009\u62E9\u8981\u5165\u4F4F\u7684\u623F\u95F4");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 17));
		lblNewLabel.setBounds(73, 37, 340, 63);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("\u5165\u4F4F\u65E5\u671F");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(73, 146, 72, 18);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("\u79BB\u5E97\u65E5\u671F");
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(73, 201, 72, 18);
		contentPane.add(lblNewLabel_2);
		btnNewButton.setBounds(73, 255, 113, 27);
		contentPane.add(btnNewButton);

		month = new JComboBox();
		month.setBounds(203, 143, 58, 24);
		contentPane.add(month);
		month_2 = new JComboBox();
		month_2.setBounds(203, 198, 58, 24);
		contentPane.add(month_2);

		// ����µ�����
		Vector<Integer> v2 = new Vector<Integer>();
		for (int i = 1; i <= 12; i++) {
			v2.add(i);
		}
		ComboBoxModel cbm2 = new DefaultComboBoxModel(v2);
		month.setModel(cbm2);
		ComboBoxModel cbm1 = new DefaultComboBoxModel(v2);
		month_2.setModel(cbm1);
		/////////////////

		JLabel lblNewLabel_6 = new JLabel("\u6708");
		lblNewLabel_6.setBounds(263, 201, 27, 18);
		contentPane.add(lblNewLabel_6);

		label = new JLabel("2020\u5E74");
		label.setFont(new Font("����", Font.PLAIN, 16));
		label.setBounds(143, 146, 76, 18);
		contentPane.add(label);

		lblNewLabel_3 = new JLabel("\u6708");
		lblNewLabel_3.setBounds(263, 146, 27, 18);
		contentPane.add(lblNewLabel_3);

		label_1 = new JLabel("2020\u5E74");
		label_1.setFont(new Font("����", Font.PLAIN, 16));
		label_1.setBounds(143, 201, 87, 18);
		contentPane.add(label_1);

		lblNewLabel_4 = new JLabel("\u65E5");
		lblNewLabel_4.setBounds(328, 146, 27, 18);
		contentPane.add(lblNewLabel_4);

		startDay = new JTextField();
		startDay.setBounds(291, 143, 34, 24);
		contentPane.add(startDay);
		startDay.setColumns(10);

		endDay = new JTextField();
		endDay.setColumns(10);
		endDay.setBounds(291, 198, 34, 24);
		contentPane.add(endDay);

		lblNewLabel_5 = new JLabel("\u65E5");
		lblNewLabel_5.setBounds(328, 201, 27, 18);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("\u8FD4\u56DE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main main = new Main();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
				// ����ǰ�ĵ�¼���ڹر�
				OpenRoom.this.dispose();
				
				
			}
		});
		btnNewButton_3.setFont(new Font("����", Font.PLAIN, 16));
		btnNewButton_3.setBounds(232, 256, 113, 27);
		contentPane.add(btnNewButton_3);
//		//����ͼƬ
//		JLabel image = new JLabel("");
//		image.setBounds(0,0,800,800);
//		image.setIcon(new ImageIcon("image/΢��ͼƬ_20200618075958.jpg"));//ǳ������
//		contentPane.add(image);
	}

	public String getStartmonth() {
		return startmonth;
	}

	public void setStartmonth(String startmonth) {
		this.startmonth = startmonth;
	}

	public String getEndday() {
		return endday;
	}

	public void setEndday(String endday) {
		this.endday = endday;
	}

	public String getStartday() {
		return startday;
	}

	public void setStartday(String startday) {
		this.startday = startday;
	}

	public String getEndmonth() {
		return endmonth;
	}

	public void setEndmonth(String endmonth) {
		this.endmonth = endmonth;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public OpenRoom(String number, String startmonth, String endmonth, String startday, String endday) {

		this.number = number;
		this.startmonth = startmonth;
		this.endmonth = endmonth;
		this.startday = startday;
		this.endday = endday;
		return;
	}
}
