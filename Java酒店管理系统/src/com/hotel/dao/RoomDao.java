/**
 * 
 */
package com.hotel.dao;


import com.hotel.entity.Room;

/**  
 * @ClassName: RoomDao 
 * @Description:Room�ӿڳ�����
 * @author: ����ң
 * @date 2020��6��12�� ����6:16:57 
 * @version V1.0
 */
public interface RoomDao {

	public Room open(String number);
	public Room date(String startdate,String enddate);
	
}
