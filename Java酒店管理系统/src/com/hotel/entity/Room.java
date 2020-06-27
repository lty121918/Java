/**
 * 
 */
package com.hotel.entity;

/**  
 * @ClassName: Room 
 * @Description:酒店房间实体类
 * @author: 李天遥
 * @date 2020年6月12日 上午9:38:38 
 * @version V1.0
 */
public class Room {
private int room_id;
private String room_type;	
private int room_price;
private int room_status;
public int getRoom_id() {
	return room_id;
}
public void setRoom_id(int room_id) {
	this.room_id = room_id;
}
public String getRoom_type() {
	return room_type;
}
public void setRoom_type(String room_type) {
	this.room_type = room_type;
}
public int getRoom_price() {
	return room_price;
}
public void setRoom_price(int room_price) {
	this.room_price = room_price;
}
public int getRoom_status() {
	return room_status;
}
public void setRoom_status(int room_status) {
	this.room_status = room_status;
}
	


	
}
