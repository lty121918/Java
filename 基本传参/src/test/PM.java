package test;

public class PM {
	 private int id;
	 private String name;
	 private String gender;
	 private int salary;
	 private int exp;
	 private int bonus;
	 public int pay;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
    public PM(int id,String name,String gender,int salary,int exp,int bonus){
    	this.name=name;
    	this.id=id;
    	this.gender=gender;
    	this.salary=salary;
    	this.exp=exp;
    	this.bonus=bonus;
	}
	public PM(){
		
	}
	public PM(int pay){
		this.pay=pay;
	}
	 public void show(){
		 System.out.println("Ա�����"+id); 
		 System.out.println("����"+name);
		 System.out.println("�Ա�"+gender);
		 System.out.println("нˮ"+salary);
		 System.out.println("����"+exp);
		 System.out.println("�ֺ�"+bonus);
	 }
	
	public void showpay(){
		 System.out.println("����"+pay);
	}
	
}
