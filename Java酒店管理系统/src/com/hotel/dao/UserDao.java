/**
 * 
 */
package com.hotel.dao;

import com.hotel.entity.User;

/**  
 * @ClassName: UserDao 
 * @Description:
 * @author: 李天遥
 * @date 2020年6月17日 上午8:19:04 
 * @version V1.0
 */
public interface UserDao {
	public User login(String name,String pwd);
	public boolean queryByLname(String lname);
	public boolean addUser(User user);
}
