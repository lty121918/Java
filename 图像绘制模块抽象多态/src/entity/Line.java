package entity;


public class Line extends Shape{
  private int xx;
  private int yy;
  
	public int getXx() {
	return xx;
}

public void setXx(int xx) {
	this.xx = xx;
System.out.println("终点x轴坐标为"+xx);
}

public int getYy() {
	return yy;
}

public void setYy(int yy) {
	this.yy = yy;
	System.out.println("终点y轴坐标为"+yy);
}

	@Override
	public void draw() {
	System.out.println("线段用尺子画直线");
	}
	}

	

	

	

