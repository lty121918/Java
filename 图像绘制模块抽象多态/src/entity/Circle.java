package entity;

public class Circle extends Shape{

	@Override
	public void draw() {
    System.out.println("Բ����Բ�滭");
		
	}
	private int length ;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
		System.out.println("������"+length);
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
		System.out.println("�����"+width);
	}

}
