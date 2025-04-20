package com.interfacequestion;
/*.4 Create a Notification interface with a method notifyUser().
 *  Implement it in classes EmailNotification, SMSNotification, and PushNotification.*/
public class PushNotification implements Notification {
@Override
public void notifyUser() {
	System.out.println("Do not display the notification on screen");
}
}
