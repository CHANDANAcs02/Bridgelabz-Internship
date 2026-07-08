package com.bridgelabz.notification;

/*
 * SMS Notification implementation.
 */

public class SMSNotification implements Notification {

	@Override
	public void sendNotification(String message) {

		System.out.println("SMS Notification : " + message);
	}
}