package com.hotel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	//�����������
	private static final String DRIVER="com.mysql.jdbc.Driver";
	//�������ݿ��ַ�����ݿ�����
	private static final String PATH="jdbc:mysql://localhost:3306/hotel_sql?useUnicode=true&characterEncoding=UTF-8";
	//���ݿ��û���
	private static final String NAME="root";
	//���ݿ�����
	private static final String PWD="root";
	
	//���ݿ����Ӷ���
	private Connection con;
	//���ݿ�������
	private PreparedStatement ps;
	//���������
	private ResultSet rs;
	

	/**
	 * ��ȡ���ݿ������
	 * @return
	 */
	public Connection getCon() {	
		try {
			Class.forName(DRIVER);
			con=DriverManager.getConnection(PATH, NAME, PWD);
		} catch (Exception e) {
		    System.out.println("���ݿ�����ʧ��");
		    e.printStackTrace();
		}
		return con;
	}
	
	
	/**
	 * �ر����ݿ����ӵķ���
	 */
	public void  closeAll() {	
		try {
			if(rs!=null) {
				rs.close();
			}
			if(ps!=null) {
				ps.close();
			}
			if(con!=null) {
				con.close();
			}
		} catch (Exception e) {
			System.out.println("�ر����ݿ����ӷ����쳣");
			e.printStackTrace();
		}	
	}
	
	/**
	 * 
	 * @param sql    ��ɾ��sql���
	 * @param obj    ��̬����
	 * @return       ��Ӱ������     һ����˵��ɾ�ĳɹ� ��Ӱ������>0  ������ɾ��ʧ��
	 */
	public int update(String sql,Object...obj) {
		int  result=0;
		//��ȡ���Ӷ���
		con=getCon();
		//��ȡ������
		try {
			ps=con.prepareStatement(sql);
			//���ö�̬����
			if(obj!=null) {
				for(int i=0;i<obj.length;i++) {
					ps.setObject(i+1, obj[i]);	
				}	
			}	
			//ִ��sql���
			result=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//�ر����ݿ�
			closeAll();
		}
		return result;
	}
	
	
	/**
	 * 
	 * @param sql    ��ѯ��sql
	 * @param obj    ��̬����
	 * @return       �����
	 */
	public ResultSet query(String sql,Object...obj) {
		//��ȡ���Ӷ���
		con=getCon();
		//��ȡ������
		try {
			ps=con.prepareStatement(sql);
			//���ö�̬����
			if(obj!=null) {
				for(int i=0;i<obj.length;i++) {
					ps.setObject(i+1, obj[i]);	
				}	
			}	
			//ִ��sql���
			rs=ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//��������ڻ�û�б�������������ݣ����ܹرա���Ҫ�ڸ÷��������겢���������������йر�
		return rs;
	}
	
	
}
