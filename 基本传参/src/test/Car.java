package test;

public class Car {
	private int age;
	private int miles;
	private String color;
	private String name;	
	public String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("��������Ϊ"+brand);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>20||age<0){
			System.out.println("������������Ĭ�ϳ���Ϊ0");
			this.age=0;
	}else{
		this.age=age;
		System.out.println("����Ϊ"+age);
	}
		}
	public int getMiles() {
		return miles;
		
	}
	public void setMiles(int miles) {
		if(miles>100000||miles<0){
			System.out.println("�������������Ĭ��Ϊ0");
		    this.miles=0;
		}else{
		this.miles = miles;
		System.out.println("�����Ϊ"+miles);
		}
		}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		System.out.println("������ɫΪ"+color);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("��������Ϊ"+name);
	}
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.setBrand("����");
		car1.setName("����QQ");
		car1.setColor("yellow");
		car1.setAge(5);
		car1.setMiles(100);
		car1.getAge();
		car1.getBrand();
		car1.getName();
		car1.getColor();
		car1.getMiles();
	}
	
	
	}


