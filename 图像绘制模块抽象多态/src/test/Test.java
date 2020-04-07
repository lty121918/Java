package test;

import entity.Circle;
import entity.Line;
import entity.Rectangle;
import entity.Shape;

public class Test {
	public void test(Shape sh){
	sh.draw();
	if(sh instanceof Line) { 
	Line sh1=(Line) sh;
    System.out.println(sh1.getXx());
    System.out.println(sh1.getYy());
	}
	if(sh instanceof Circle) { 
		Circle sh2=(Circle) sh;
	    System.out.println(sh2.getLength());
	    System.out.println(sh2.getWidth());
		}
	if(sh instanceof Rectangle) { 
		Rectangle sh3=(Rectangle) sh;
	    System.out.println(sh3.getLength());
	    System.out.println(sh3.getWidth());
		}
	
}
public static void main(String[] args) {
	Line lin =new Line();
	   lin.draw();
	   lin.setxAxis(20);
	   lin.setyAxis(20);
	   lin.setXx(100);
	   lin.setYy(500);
	   Circle cir=new Circle();
	   cir.draw();
	   cir.setLength(1000);
	   cir.setWidth(50);
	   cir.setxAxis(20);
	   Rectangle rec=new Rectangle();
	   rec.draw();
	   rec.setWidth(2200);
	   rec.setColor("бли╚");
	   
}


	

	

	
	
	
	
}
