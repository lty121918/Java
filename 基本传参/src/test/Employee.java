package test;

public class Employee{
	   String name;
	   int age;
	   String designation;
	   double salary;
	   // Employee ��Ĺ�����
	   public Employee(String name){
	      this.name = name;
	   }
	   // ����age��ֵ
	   public void empAge(int empAge){
		      age = empAge;
		   }
	   /* ����designation��ֵ*/
	   public void empDesignation(String empDesig){
	      designation = empDesig;
	   }
	   /* ����salary��ֵ*/
	   public void empSalary(double empSalary){
	      salary = empSalary;
	   }
	   /* ��ӡ��Ϣ */
	   public  void printEmployee(){
	      System.out.println("����:"+ name );
	      System.out.println("����:" + age );
	      System.out.println("ְλ:" + designation );
	      System.out.println("нˮ:" + salary);
	   }
	  public static void main(String[] args) {
		  /* ʹ�ù����������������� */
	      Employee empOne = new Employee("RUNOOB1");
	      Employee empTwo = new Employee("RUNOOB2");
	 
	      // ��������������ĳ�Ա����
	      empOne.empAge(26);
	      empOne.empDesignation("�߼�����Ա");
	      empOne.empSalary(1000);
	      empOne.printEmployee();
	 
	      empTwo.empAge(21);
	      empTwo.empDesignation("�������Ա");
	      empTwo.empSalary(500);
	      empTwo.printEmployee();
	   }
	}
	
