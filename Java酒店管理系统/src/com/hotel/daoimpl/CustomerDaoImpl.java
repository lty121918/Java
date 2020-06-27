/**
 * 
 */
package com.hotel.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.hotel.dao.CustomerDao;
import com.hotel.entity.Customer;
import com.hotel.util.JDBCUtil;

/**  
 * @ClassName: CustomerDaoImpl 
 * @Description:
 * @author: 李天遥
 * @date 2020年6月13日 上午9:59:31 
 * @version V1.0
 */
public class CustomerDaoImpl implements CustomerDao{
	private JDBCUtil jdbc = new JDBCUtil();
	@Override 
	//增加一行数据
	public boolean addCustomer(Customer cust) {
		int i=jdbc.update("insert into customer(customer_room,customer_name,customer_sex,customer_IDnumber,customer_tel,customer_startDate,customer_endDate)values(?,?,?,?,?,?,?)",
				cust.getCustomer_room(),cust.getCustomer_name(),cust.getCustomer_sex(),cust.getCustomer_IDnumber(),cust.getCustomer_tel(),cust.getCustomer_startDate(),cust.getCustomer_endDate());
			
		if(i>0) {
			return true;
		}else {	
		return false;}
		
	}
	@Override
	public Customer queryId(String customer_room) {
		ResultSet rs= jdbc.query("select * from customer where customer_room=?", customer_room);
		Customer cust=null;
		try {
			if(rs.next()) {
				cust=new Customer();
				cust.setCustomer_room(customer_room);
				cust.setCustomer_name(rs.getString("customer_name"));
				//下面这些写法都是错误的
				cust.setCustomer_IDnumber("customer_IDnumber");
				cust.setCustomer_sex("customer_sex");
				cust.setCustomer_tel("customer_tel");
				cust.setCustomer_startDate("customer_startDate");
				cust.setCustomer_endDate("customer_endDate ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			jdbc.closeAll();
		}
		return cust; 
	}
	@Override
	public List<Customer> queryAll() {
		
		

		
	List<Customer> list=new ArrayList<Customer>();
		
		ResultSet rs=jdbc.query("select * from customer");	
		try {
			while(rs.next()) {
				Customer cust=new Customer();
				cust.setCustomer_room(rs.getString("customer_room"));
				cust.setCustomer_name(rs.getString("customer_name"));
				cust.setCustomer_sex(rs.getString("customer_sex"));
				cust.setCustomer_IDnumber(rs.getString("customer_IDnumber"));
				cust.setCustomer_tel(rs.getString("customer_tel"));
				cust.setCustomer_startDate(rs.getString("customer_startDate"));
				cust.setCustomer_endDate(rs.getString("customer_endDate"));
				list.add(cust);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			jdbc.closeAll();
		}	
		return list;
	
		
		
	}
	@Override
	public List<Customer> queryAllForPart() {
List<Customer> list=new ArrayList<Customer>();
		
		ResultSet rs=jdbc.query("select * from customer");
		
		try {
			while(rs.next()) {
				Customer cust=new Customer();
				cust.setCustomer_room(rs.getString("customer_room"));
				cust.setCustomer_name(rs.getString("customer_name"));
				cust.setCustomer_sex(rs.getString("customer_sex"));
				cust.setCustomer_IDnumber(rs.getString("customer_IDnumber"));
				cust.setCustomer_tel(rs.getString("customer_tel"));
				cust.setCustomer_startDate(rs.getString("customer_startDate"));
				cust.setCustomer_endDate(rs.getString("customer_endDate"));
				list.add(cust);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			jdbc.closeAll();
		}
		
		
		return list;
	}
	
	@Override
	public List<Customer> queryByKey(String key) {
    List<Customer> list=new ArrayList<Customer>();
		
		ResultSet rs=jdbc.query("select * from customer where customer_room like ? or customer_name like ? or customer_sex like ? or customer_tel like ? or customer_startDate like ? or customer_endDate like ?"
				,"%"+key+"%","%"+key+"%","%"+key+"%","%"+key+"%","%"+key+"%","%"+key+"%");
		
		try {
			while(rs.next()) {
				Customer cust=new Customer();
				cust.setCustomer_room(rs.getString("customer_room"));
				cust.setCustomer_name(rs.getString("customer_name"));
				cust.setCustomer_sex(rs.getString("customer_sex"));
				cust.setCustomer_IDnumber(rs.getString("customer_IDnumber"));
				cust.setCustomer_tel(rs.getString("customer_tel"));
				cust.setCustomer_startDate(rs.getString("customer_startDate"));
				cust.setCustomer_endDate(rs.getString("customer_endDate"));
				list.add(cust);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			jdbc.closeAll();
		}
		return list;
	
	}
	@Override
//	String customer_room
		public boolean delete(Customer cust) {
			
				int i=jdbc.update("delete from customer where customer_room=?", cust.getCustomer_room());
			//int i= jdbc.update("delete from customer(customer_room,customer_name,customer_sex,customer_IDnumber,customer_tel,customer_startDate,customer_endDate)values(?,?,?,?,?,?,?)",
//					cust.getCustomer_room(),cust.getCustomer_name(),cust.getCustomer_sex(),cust.getCustomer_IDnumber(),cust.getCustomer_tel(),cust.getCustomer_startDate(),cust.getCustomer_endDate());
			
			if(i>0) {
				return true;
			}else {	
			return false;}
	
		
	}
	@Override
	public boolean updateUserById(String room, String name) {
	
		
		int i=jdbc.update("update customer set customer_room=?where customer_name=?",room,name);
		if(i>0) {
			return true;
		}else {	
		return false;}
	
	}
	

}
