package com.interfacequestion;
/*1.Define an interface Shape with a method area(). Create two classes Rectangle and
Circle that implement this interface and calculate the area accordingly.*/
public class ShapeCalling {
public static void main(String args[]) {
	Circle sc = new Circle();
	sc.area();
	Rectangle r = new Rectangle();
	r.area();
}
}
