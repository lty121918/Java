/**
 * 
 */
package com.hotel.dao;

import java.util.List;


import com.hotel.entity.Customer;
import com.hotel.entity.Room;

/**  
 * @ClassName: CustomerDao 
 * @Description:
 * @author: ����ң
 * @date 2020��6��12�� ����6:20:52 
 * @version V1.0
 */
public interface CustomerDao {
	public boolean addCustomer(Customer cust);
	public boolean delete(Customer cust);
	public Customer queryId(String customer_room);
	public List<Customer> queryAll();
	public List<Customer> queryAllForPart();
	public List<Customer> queryByKey(String key);
	public boolean updateUserById(String room,String name);
	//public Customer open(String number);
}
