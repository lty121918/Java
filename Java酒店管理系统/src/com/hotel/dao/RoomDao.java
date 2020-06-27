/**
 * 
 */
package com.hotel.dao;


import com.hotel.entity.Room;

/**  
 * @ClassName: RoomDao 
 * @Description:Room接口抽象类
 * @author: 李天遥
 * @date 2020年6月12日 下午6:16:57 
 * @version V1.0
 */
public interface RoomDao {

	public Room open(String number);
	public Room date(String startdate,String enddate);
	
}
