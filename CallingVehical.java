package com.interfacequestion;
/*3.Create a program using an interface Vehicle with a method startEngine(). 
 * Implement it in classes Car, Bike, and Truck.*/
public class CallingVehical {
	public static void main (String args[]) {
 Car c= new Car();
 c.startEngine();
 
 Truck t = new Truck ();
 t.startEngine();
 
 Bike b = new Bike();
 b.startEngine();
 
 }
	
}
