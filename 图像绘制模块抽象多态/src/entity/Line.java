package entity;


public class Line extends Shape{
  private int xx;
  private int yy;
  
	public int getXx() {
	return xx;
}

public void setXx(int xx) {
	this.xx = xx;
System.out.println("�յ�x������Ϊ"+xx);
}

public int getYy() {
	return yy;
}

public void setYy(int yy) {
	this.yy = yy;
	System.out.println("�յ�y������Ϊ"+yy);
}

	@Override
	public void draw() {
	System.out.println("�߶��ó��ӻ�ֱ��");
	}
	}

	

	

	

