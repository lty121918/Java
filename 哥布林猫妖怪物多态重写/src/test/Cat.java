package test;

public class Cat extends Monster{

	public Cat(String name, int hp, int attack, int defense) {
		super(name, hp, attack, defense);
	}
	@Override
	public void attack() {
		System.out.println("��צ�ӹ���");
	}

	@Override
	public void mobile() {
		System.out.println("�����ƶ�");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("��������:"+name);
	    System.out.println("Ѫ��:"+hp);
		System.out.println("������:"+attack);
		System.out.println("������:"+defense);
		// TODO Auto-generated method stub
		
	}


	

}
	
	

