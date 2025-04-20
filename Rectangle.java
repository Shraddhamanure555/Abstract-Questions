package com.interfacequestion;
/*1.Define an interface Shape with a method area(). Create two classes Rectangle 
and Circle that implement this interface and calculate the area accordingly.*/
public class Rectangle implements Shape {
	int leng = 4;
	int width = 2;
	
	public void area(){
		int area=leng * width;
		System.out.println("Area of Rectangle : "+area);
	}

//@Override
//public void area() {
//	// TODO Auto-generated method stub
//	
//}


}
