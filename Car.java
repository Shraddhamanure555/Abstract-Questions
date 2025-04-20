package com.interfacequestion;
/*3.Create a program using an interface Vehicle with a method startEngine(). 
 * Implement it in classes Car, Bike, and Truck.*/
public class Car implements Vehical {
	@Override
public void startEngine() {
	System.out.println("This is the Car engine");
}
}
