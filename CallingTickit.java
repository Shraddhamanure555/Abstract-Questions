package com.interfacequestion;
/*5. Design an interface Transport with method bookTicket().
 *  Implement it in Bus, Train, and Flight. Show runtime polymorphism.*/
public class CallingTickit {
	public static void main(String args[]) {
Bus Bus = new Bus();
Bus.booktickits();
Flight f = new Flight ();
f.booktickits();

Train t =new Train ();
t.booktickits();

	}
}
