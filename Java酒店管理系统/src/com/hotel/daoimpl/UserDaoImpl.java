/**
 * 
 */
package com.hotel.daoimpl;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.hotel.dao.UserDao;
import com.hotel.entity.User;
import com.hotel.util.JDBCUtil;

/**  
 * @ClassName: UserDaoImpl 
 * @Description:
 * @author: 李天遥
 * @date 2020年6月17日 上午8:19:25 
 * @version V1.0
 */
public class UserDaoImpl implements UserDao {
private JDBCUtil jdbc=new JDBCUtil();
	@Override
	public User login(String name, String pwd) {
		ResultSet rs=jdbc.query("select * from t_user where user_lname=? and user_lpwd=?", name,pwd);
	    User user=null;
	    
		try {
			if(rs!=null&&rs.next()) {
				user=new User();
		
				
				user.setUser_lname(rs.getString("user_lname"));
				user.setUser_lpwd(rs.getString("user_lpwd"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			jdbc.closeAll();
		}
		
		return user;
		
	}
	@Override
	public boolean queryByLname(String lname) {
		ResultSet rs=jdbc.query("select * from t_user where user_lname=?", lname);
		try {
			if(rs.next()) {
			return true;	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			jdbc.closeAll();
		}
		
		return false;
	}
	@Override
	public boolean addUser(User user) {
		int i=jdbc.update("insert into t_user(user_lname,user_lpwd) values(?,?)", 
				user.getUser_lname(),user.getUser_lpwd()
			);
		
		if(i>0) {
			return true;
		}else {	
		return false;}
	
	}

}
