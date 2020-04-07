package test;

public class Cat extends Monster{

	public Cat(String name, int hp, int attack, int defense) {
		super(name, hp, attack, defense);
	}
	@Override
	public void attack() {
		System.out.println("用爪子攻击");
	}

	@Override
	public void mobile() {
		System.out.println("跳着移动");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("怪物名称:"+name);
	    System.out.println("血量:"+hp);
		System.out.println("攻击力:"+attack);
		System.out.println("防御力:"+defense);
		// TODO Auto-generated method stub
		
	}


	

}
	
	

