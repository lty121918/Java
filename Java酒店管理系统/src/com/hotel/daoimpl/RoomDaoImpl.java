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
 * @Description:抽象类的实现
 * @author: 李天遥
 * @date 2020年6月12日 下午6:23:30
 * @version V1.0
 */

public class RoomDaoImpl implements RoomDao {
	private JDBCUtil jdbc = new JDBCUtil();

	@Override
	public Room open(String number) {

		ResultSet rs = jdbc.query("select * from room where room_id=? ", number);// 查询房间号
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
