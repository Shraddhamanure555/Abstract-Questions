package com.interfacequestion;

/*1.Define an interface Shape with a method area(). Create two classes Rectangle 
and Circle that implement this interface and calculate the area accordingly.*/
 class Circle implements Shape{
	static double pay = 3.14f;
	static double radius= 3;
	 
	public void area(){
	 double reuslt = pay*radius*radius;
	 System.out.println("Area of circle: " + reuslt);
 }	
}
