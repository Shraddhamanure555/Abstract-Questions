package com.interfacequestion;
/*Create an interface Animal with a method sound(). 
* Implement this interface in classes Dog, Cat, and Cow, each printing its own sound.*/
public class Cat implements Animal{
	@Override
 public void sound() {
	 System.out.println("Cat Sounding Meow");
 }


}
