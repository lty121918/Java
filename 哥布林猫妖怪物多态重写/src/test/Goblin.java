package test;

public  class Goblin extends Monster {
     public int crazy;
	public Goblin(String name, int hp, int attack, int defense,int crazy) {
		super(name, hp, attack, defense);
		this.crazy=crazy;
	}

	@Override
	public void show() {
		System.out.println("��������:"+name);
	    System.out.println("Ѫ��:"+hp);
		System.out.println("������:"+attack);
		System.out.println("������:"+defense);
		System.out.println("�񱬶�:"+crazy);
	}
	@Override
	public void attack() {
		System.out.println("��ʯͷ���й���");
	}
	@Override
	public void mobile() {
		System.out.println("�����ƶ�");
	}
	public void crazy(){
		System.out.println("�񱩿�ʼ");
	}

}
