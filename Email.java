package com.interfacequestion;
/*.4 Create a Notification interface with a method notifyUser().
 *  Implement it in classes EmailNotification, SMSNotification, and PushNotification.*/
public class Email implements Notification {
	public void notifyUser() {
		System.out.println("Notification goes on user Email");
	}
}
