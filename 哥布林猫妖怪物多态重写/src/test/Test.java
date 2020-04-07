package test;

public class Test {
	public  void testMonster(Monster mon){
		mon.show();
		mon.attack();
		mon.mobile();
	}
	public static void main(String[] args){
		Goblin g=new Goblin("ÆÕÍ¨¸ç²¼ÁÖ",200, 2020, 2000,60);
	    Test test=new Test();
		Monster c=new Cat("Ã¨Ñı",522,1000,1330);
		test.testMonster(g);
		System.out.println("\n");
		test.testMonster(c);
	}
}
