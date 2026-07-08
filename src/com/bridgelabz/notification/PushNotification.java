package com.bridgelabz.notification;

/*
 * Push Notification implementation.
 */

public class PushNotification implements Notification {

	@Override
	public void sendNotification(String message) {

		System.out.println("Push Notification : " + message);
	}
}