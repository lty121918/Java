package test;

public  class Goblin extends Monster {
     public int crazy;
	public Goblin(String name, int hp, int attack, int defense,int crazy) {
		super(name, hp, attack, defense);
		this.crazy=crazy;
	}

	@Override
	public void show() {
		System.out.println("怪物名称:"+name);
	    System.out.println("血量:"+hp);
		System.out.println("攻击力:"+attack);
		System.out.println("防御力:"+defense);
		System.out.println("狂爆度:"+crazy);
	}
	@Override
	public void attack() {
		System.out.println("用石头进行攻击");
	}
	@Override
	public void mobile() {
		System.out.println("缓慢移动");
	}
	public void crazy(){
		System.out.println("狂暴开始");
	}

}
