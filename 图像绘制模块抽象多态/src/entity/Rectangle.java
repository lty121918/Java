package entity;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("矩形用三角板画");
	}
	private int length ;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
		System.out.println("长度是"+length);
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
		System.out.println("宽度是"+width);
	}
}
