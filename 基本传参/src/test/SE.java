package test;

public class SE {
 private int id;
 private String name;
 private String gender;
 private int salary;
 private int hot;
 public int pay;
 public String getName() {
		return name;
	}
public void setName(String name) {
		this.name = name;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getHot() {
	return hot;
}
public void setHot(int hot) {
	this.hot = hot;
}
public SE(int id,String name,String gender,int salary,int hot){
	this.name=name;
	this.id=id;
	this.gender=gender;
	this.salary=salary;
	this.hot=hot;
}
public SE(){
	
}
public SE(int pay){
	this.pay=pay;
}
 public void show(){
	System.out.println("Ա�����"+id); 
	 System.out.println("����"+name);
	 System.out.println("�Ա�"+gender);
	 System.out.println("нˮ"+salary);
	 System.out.println("��ע��"+hot);
 }
public void showpay(){
	 System.out.println("����"+pay);
}
}
