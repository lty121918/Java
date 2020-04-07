package test;

public class Goblin {
  private int level;
  private int attract;
  private int define;
  private String name;
  public int getLevel() {
	return level;
}
public void setName(String name) {
		this.name = name;
		System.out.println(getName());
	}
public String getName() {
		return name;
	}
public void setLevel(int level) {
	if(level>99||level<0){
		System.out.println("等级设置有误");
	}else{
	this.level = level;
	System.out.println("等级为"+level);
}
	}
public int getAttract() {
	return attract;
}
public void setAttract(int attract) {
	this.attract = attract;
	if(attract>999||attract<0)
	System.out.println("攻击力设置有误");
	else
	System.out.println("攻击力为"+attract);
}
public int getDefine() {
	return define;
}
public void setDefine(int define) {
	this.define = define;
	if(define>999||define<0)
		System.out.println("防御力设置有误");
		else
		System.out.println("防御力为"+define);
}
public int getHp() {
	return hp;
}
public void setHp(int hp) {
	this.hp =hp;
	if(hp>999||hp<0)
		System.out.println("hp设置有误");
		else
		System.out.println("hp为"+hp);
}
private int hp;
public void crazy(){
	if(attract>999||attract<0||define>999||define<0){
		System.out.println("无法释放狂怒");
	 
	}else{
		System.out.println("狂怒后攻击力为"+(attract+0.1*attract)+"防御力为"+(define+0.1*define));
  }
	}
  public static void main(String[] args) {
	Goblin s=new Goblin();
	s.setName("烈焰哥布林");
	s.setLevel(800);
	s.setHp(50);
	s.setDefine(500);
	s.setAttract(1000);
	s.crazy();
	
}
}
