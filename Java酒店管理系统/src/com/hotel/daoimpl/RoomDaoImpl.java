/**
 * 
 */
package com.hotel.daoimpl;

import com.hotel.util.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hotel.dao.RoomDao;
import com.hotel.entity.Customer;
import com.hotel.entity.Room;

/**
 * @ClassName: RoomDaoImpl
 * @Description:�������ʵ��
 * @author: ����ң
 * @date 2020��6��12�� ����6:23:30
 * @version V1.0
 */

public class RoomDaoImpl implements RoomDao {
	private JDBCUtil jdbc = new JDBCUtil();

	@Override
	public Room open(String number) {

		ResultSet rs = jdbc.query("select * from room where room_id=? ", number);// ��ѯ�����
		// TODO Auto-generated method stub
		Room room = null;

		try {
			if (rs != null && rs.next()) {
				room = new Room();
				room.setRoom_id(rs.getInt("room_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			jdbc.closeAll();
		}

		return room;

	}

	@Override
	public Room date(String startdate, String enddate) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
