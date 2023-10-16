import java.util.*;

class Shape{
	
	public static void main(String[] args){
		square s1 = new square(4);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		
		rectangle s2 = new rectangle(4,2);
		System.out.println(s2.getArea());
		System.out.println(s2.getPerimeter());
		
		circle s3 = new circle(3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
	}

}

abstract class shape2{
	abstract int getArea();
	abstract int getPerimeter();
}

class square extends shape2{
	int l;
	square(int l){
		this.l = l;
	}
	int getArea(){
		return l*l;
	}
	int getPerimeter(){
		return 4*l;
	}
}

class rectangle extends shape2{
	int l,b;
	rectangle(int l,int b){
		this.l = l;
		this.b = b;
	}
	int getArea(){
		return l*b;
	}
	int getPerimeter(){
		return 2*(l+b);
	}
}


class circle extends shape2{
	int r;
	circle(int r){
		this.r = r;
	}
	int getArea(){
		return (int)(3.14*r*r);
	}
	int getPerimeter(){
		return (int)(2*3.14*r);
	}
}






