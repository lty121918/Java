package entity;

public abstract class Shape{
    private int xAxis;
    private int yAxis;
    private String color;
	public abstract void draw();
	public int getxAxis() {
		return xAxis;
	}
	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
		System.out.println("x轴坐标是"+xAxis);
	}
	public int getyAxis() {
		return yAxis;
	}
	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
		System.out.println("y轴坐标是"+yAxis);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		System.out.println("颜色是"+color);
	}
	
}
