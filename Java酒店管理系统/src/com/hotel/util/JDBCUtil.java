package com.hotel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	//驱动类的名称
	private static final String DRIVER="com.mysql.jdbc.Driver";
	//连接数据库地址和数据库名称
	private static final String PATH="jdbc:mysql://localhost:3306/hotel_sql?useUnicode=true&characterEncoding=UTF-8";
	//数据库用户名
	private static final String NAME="root";
	//数据库密码
	private static final String PWD="root";
	
	//数据库连接对象
	private Connection con;
	//数据库语句对象
	private PreparedStatement ps;
	//结果集对象
	private ResultSet rs;
	

	/**
	 * 获取数据库的连接
	 * @return
	 */
	public Connection getCon() {	
		try {
			Class.forName(DRIVER);
			con=DriverManager.getConnection(PATH, NAME, PWD);
		} catch (Exception e) {
		    System.out.println("数据库连接失败");
		    e.printStackTrace();
		}
		return con;
	}
	
	
	/**
	 * 关闭数据库连接的方法
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
			System.out.println("关闭数据库连接发生异常");
			e.printStackTrace();
		}	
	}
	
	/**
	 * 
	 * @param sql    增删改sql语句
	 * @param obj    动态参数
	 * @return       受影响行数     一般来说增删改成功 受影响行数>0  否则增删改失败
	 */
	public int update(String sql,Object...obj) {
		int  result=0;
		//获取连接对象
		con=getCon();
		//获取语句对象
		try {
			ps=con.prepareStatement(sql);
			//设置动态参数
			if(obj!=null) {
				for(int i=0;i<obj.length;i++) {
					ps.setObject(i+1, obj[i]);	
				}	
			}	
			//执行sql语句
			result=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭数据库
			closeAll();
		}
		return result;
	}
	
	
	/**
	 * 
	 * @param sql    查询的sql
	 * @param obj    动态参数
	 * @return       结果集
	 */
	public ResultSet query(String sql,Object...obj) {
		//获取连接对象
		con=getCon();
		//获取语句对象
		try {
			ps=con.prepareStatement(sql);
			//设置动态参数
			if(obj!=null) {
				for(int i=0;i<obj.length;i++) {
					ps.setObject(i+1, obj[i]);	
				}	
			}	
			//执行sql语句
			rs=ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//结果集由于还没有遍历出里面的数据，不能关闭。需要在该方法调用完并操作完结果集后，自行关闭
		return rs;
	}
	
	
}
