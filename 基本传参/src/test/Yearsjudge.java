package test;

public class Yearsjudge {
public static void main(String[] args) {
	int years;
	int num=0;
	for(years=1000;years<=3000;years++){
	if(years%4==0&&years%100!=0||years%400==0){
		num=num+1;	
	}
	}
		System.out.println(num);	
}

	
}
