package com.interfacequestion;
/*.4 Create a Notification interface with a method notifyUser().
 *  Implement it in classes EmailNotification, SMSNotification, and PushNotification.*/
public class NotificationCalling {
public static void main(String args[]) {
	Email e = new Email();
	e.notifyUser();
	
	SMSNotification sm = new SMSNotification();
	sm.notifyUser();
	
	PushNotification pn = new PushNotification();
	pn.notifyUser();
	
}
}
